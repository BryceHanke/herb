package net.bryce.herb.block.custom.male;

import net.bryce.herb.Herb;
import net.bryce.herb.strains.Strains;
import net.bryce.herb.block.custom.female._Female_Cannabis_Plant;
import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.Registries;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class _Male_Cannabis_Plant extends CropBlock {
    public _Male_Cannabis_Plant(Settings settings) {
        super(settings);
    }

    public static final int MAX_AGE = 3;
    public static final IntProperty AGE = IntProperty.of("age", 0, 3);

    public Identifier strain = Strains.strains[0];

    public void setStrain()
    {
        for (Identifier id : Strains.strains)
        {
            if (String.valueOf(this).contains(String.valueOf(id)))
            {
                strain = new Identifier("herb",String.valueOf(id));
            }
        }
    }

    private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[]
            {
                    Block.createCuboidShape(0, 0, 0, 16, 4.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 8.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 16.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 16.0, 16)
            };

    @Override
    protected ItemConvertible getSeedsItem()
    {
        setStrain();
        return Registries.ITEM.get(new Identifier(Herb.MOD_ID,"male_"+String.valueOf(strain.getPath())+"_cannabis_seeds"));
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[state.get(AGE)];
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return (world.getBaseLightLevel(pos, 0) >= 8 || world.isSkyVisible(pos)) && super.canPlaceAt(state, world, pos);
    }

    @Override
    public void applyGrowth(World world, BlockPos pos, BlockState state) {
        int nextAge = this.getAge(state) + this.getGrowthAmount(world);
        int maxAge = this.getMaxAge();
        if (nextAge > maxAge) {
            nextAge = maxAge;
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

        float f = getAvailableMoisture(this, world, pos);

        if (world.getBaseLightLevel(pos, 0) >= 9) {
            int i = this.getAge(state);
            if (random.nextInt((int) (25.0F / f) + 1) == 0) {
                if (i < this.getMaxAge()) {
                    world.setBlockState(pos, this.withAge(i + 1), Block.NOTIFY_LISTENERS);
                }
            }
        }

        pollinate(state, world, pos, random, f);
    }

    public void pollinate(BlockState state, ServerWorld world, BlockPos pos, Random random, Float f)
    {
        // Pollination
        if (random.nextInt((int) (25.0F / f) + 1) == 0) {
            BlockPos[] position =
                    {
                            pos.north(1),
                            pos.east(1),
                            pos.south(1),
                            pos.west(1)
                    };

            _Male_Cannabis_Plant male_plant = this;

            for (BlockPos positions : position)
            {
                if (world.getBlockState(positions).getBlock() == Registries.BLOCK.get(new Identifier(strain + "_female_cannabis_plant")))
                {
                    _Female_Cannabis_Plant fem_plant = (_Female_Cannabis_Plant) world.getBlockState(positions).getBlock();
                    fem_plant.getPollinated(world, pos, Registries.BLOCK.get(new Identifier(strain + "_male_cannabis_plant")).getDefaultState());
                }
            }
        }
    }
}


