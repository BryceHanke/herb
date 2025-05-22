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

import java.util.Objects;

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
            if (String.valueOf(this).contains(String.valueOf(id.getPath())))
            {
                strain = new Identifier("herb",String.valueOf(id.getPath()));
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

            setStrain();

            for (BlockPos positions : position)
            {
                if (world.getBlockState(positions).getBlock() instanceof _Female_Cannabis_Plant fem_plant)
                {
                    fem_plant.setStrain();

                    if(check_Cross(fem_plant, this, world, positions, "gdp", "og", "gdk")){}
                    else if(check_Cross(fem_plant, this, world, positions, "gdp", "ww", "rp")){}
                    else if(check_Cross(fem_plant, this, world, positions, "afg", "hk", "ak")){}
                    else if(check_Cross(fem_plant, this, world, positions, "ag", "cg", "s1")){}
                    else if(check_Cross(fem_plant, this, world, positions, "afg", "s1", "ss")){}
                    else if(check_Cross(fem_plant, this, world, positions, "cd", "hk", "og")){}
                    else if(check_Cross(fem_plant, this, world, positions, "bk", "rp", "bm")){}
                    else if(check_Cross(fem_plant, this, world, positions, "bm", "mk", "bp")){}
                    else if(check_Cross(fem_plant, this, world, positions, "gsc", "bp", "smc")){}
                    else if(check_Cross(fem_plant, this, world, positions, "sfv", "og", "fog")){}
                    else if(check_Cross(fem_plant, this, world, positions, "f1", "og", "gsc")){}
                    else if(check_Cross(fem_plant, this, world, positions, "gsc", "fog", "ac")){}
                    else if(check_Cross(fem_plant, this, world, positions, "gsc", "smc", "am")){}
                    else if(check_Cross(fem_plant, this, world, positions, "tk", "am", "wc")){}
                    else if(check_Cross(fem_plant, this, world, positions, "mp", "s1", "gdp")){}
                    else {fem_plant.getPollinated(world, positions, Registries.BLOCK.get(new Identifier(fem_plant.strain + "_male_cannabis_plant")).getDefaultState());}
                }
            }
        }
    }
    public static boolean check_Cross(_Female_Cannabis_Plant femaleCannabisPlant, _Male_Cannabis_Plant maleCannabisPlant, World world, BlockPos position, String first_strain,  String second_strain, String new_strain)
    {
        if (Objects.equals(femaleCannabisPlant.strain, new Identifier("herb", second_strain)) || (Objects.equals(maleCannabisPlant.strain, new Identifier("herb", second_strain))) || (Objects.equals(maleCannabisPlant.strain, new Identifier("herb", new_strain))))
        {
            if (Objects.equals(femaleCannabisPlant.strain, new Identifier("herb", first_strain)) || (Objects.equals(maleCannabisPlant.strain, new Identifier("herb", first_strain))))
            {
                femaleCannabisPlant.getPollinated(world, position, Registries.BLOCK.get(new Identifier("herb",new_strain + "_male_cannabis_plant")).getDefaultState());
                return true;
            }
        }
        return false;
    }
}


