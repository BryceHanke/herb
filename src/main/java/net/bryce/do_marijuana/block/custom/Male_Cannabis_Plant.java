package net.bryce.do_marijuana.block.custom;

import net.bryce.do_marijuana.block.ModBlocks;
import net.bryce.do_marijuana.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class Male_Cannabis_Plant extends CropBlock {
    public static final int MAX_AGE = 2;
    public static final IntProperty AGE = IntProperty.of("age", 0, 2);

    public Male_Cannabis_Plant(Settings settings) {
        super(settings);
    }


    private static final VoxelShape[] AGE_TO_SHAPE =  new VoxelShape[]
            {
                    Block.createCuboidShape(0, 0, 0, 16, 4.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 8.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 16.0, 16)
            };

    @Override
    protected ItemConvertible getSeedsItem()
    {
        if (this == ModBlocks.OG_MALE_CANNABIS_PLANT)
        {
            return ModItems.OG_CANNABIS_SEEDS;
        }

        if (this == ModBlocks.GDP_MALE_CANNABIS_PLANT)
        {
            return ModItems.GDP_CANNABIS_SEEDS;
        }

        if (this == ModBlocks.RP_MALE_CANNABIS_PLANT)
        {
            return ModItems.RP_CANNABIS_SEEDS;
        }

        return ModItems.OG_CANNABIS_SEEDS;
    }

    @Override
    public IntProperty getAgeProperty()
    {
        return AGE;
    }

    @Override
    public int getMaxAge()
    {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(AGE);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[state.get(AGE)];
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos)
    {
        return (world.getBaseLightLevel(pos, 0) >= 8 || world.isSkyVisible(pos)) && super.canPlaceAt(state, world, pos);
    }

    @Override
    public void applyGrowth(World world, BlockPos pos, BlockState state) {
        int nextAge = this.getAge(state) + this.getGrowthAmount(world);
        int maxAge = this.getMaxAge();
        if (nextAge > maxAge)
        {
            nextAge = maxAge;
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random)
    {

        float f = getAvailableMoisture(this, world, pos);

        if (world.getBaseLightLevel(pos, 0) >= 9)
        {
            int i = this.getAge(state);
            if (random.nextInt((int)(25.0F / f)+1) == 0)
            {
                if (i < this.getMaxAge())
                {
                    world.setBlockState(pos, this.withAge(i + 1), Block.NOTIFY_LISTENERS);
                }
        }
    }
}
}
