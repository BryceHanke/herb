package net.bryce.do_marijuana.block.custom;

import net.bryce.do_marijuana.Lets_do_marijuana;
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

public class _Male_Cannabis_Plant extends CropBlock {
    public static final int MAX_AGE = 3;
    public static final IntProperty AGE = IntProperty.of("age", 0, 3);

    public _Male_Cannabis_Plant(Settings settings) {
        super(settings);
    }


    private static final VoxelShape[] AGE_TO_SHAPE =  new VoxelShape[]
            {
                    Block.createCuboidShape(0, 0, 0, 16, 4.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 8.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 16.0, 16),
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

        if (this == ModBlocks.CP_MALE_CANNABIS_PLANT)
        {
            return ModItems.CP_CANNABIS_SEEDS;
        }

        if (this == ModBlocks.GDK_MALE_CANNABIS_PLANT)
        {
            return ModItems.GDK_CANNABIS_SEEDS;
        }

        if (this == ModBlocks.AFG_MALE_CANNABIS_PLANT)
        {
            return ModItems.AFG_CANNABIS_SEEDS;
        }

        if (this == ModBlocks.HK_MALE_CANNABIS_PLANT)
        {
            return ModItems.HK_CANNABIS_SEEDS;
        }

        if (this == ModBlocks.AK_MALE_CANNABIS_PLANT)
        {
            return ModItems.AK_CANNABIS_SEEDS;
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
                if (i < this.getMaxAge()) {
                    world.setBlockState(pos, this.withAge(i + 1), Block.NOTIFY_LISTENERS);
                }
            }
        }

        // Pollination
        if (random.nextInt((int)(10.0F / f)+1) == 0)
        {
            _Male_Cannabis_Plant male_plant = this;

            //east
            if (world.getBlockState(pos.east(1)).getBlock() instanceof _Female_Cannabis_Plant block_to_change)
            {
                // Simple Pollination
                if (block_to_change == ModBlocks.OG_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.OG_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.east(), ModBlocks.OG_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.GDP_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.east(), ModBlocks.GDP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (block_to_change == ModBlocks.RP_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.RP_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.east(), ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (block_to_change == ModBlocks.CP_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.CP_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.east(), ModBlocks.CP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                // Cross Pollination
                if (block_to_change == ModBlocks.AFG_FEMALE_CANNABIS_PLANT || male_plant == ModBlocks.AFG_MALE_CANNABIS_PLANT)
                {
                    if (male_plant == ModBlocks.HK_MALE_CANNABIS_PLANT || block_to_change == ModBlocks.HK_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.east(), ModBlocks.AK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (male_plant == ModBlocks.AK_MALE_CANNABIS_PLANT)
                {
                    if (block_to_change == ModBlocks.AFG_FEMALE_CANNABIS_PLANT || block_to_change == ModBlocks.HK_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.east(), ModBlocks.AK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (block_to_change == ModBlocks.CP_FEMALE_CANNABIS_PLANT || male_plant == ModBlocks.CP_MALE_CANNABIS_PLANT)
                {
                    if (male_plant == ModBlocks.GDP_MALE_CANNABIS_PLANT || block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.east(), ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (male_plant == ModBlocks.RP_MALE_CANNABIS_PLANT)
                {
                    if (block_to_change == ModBlocks.CP_FEMALE_CANNABIS_PLANT || block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.east(), ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT || male_plant == ModBlocks.GDP_MALE_CANNABIS_PLANT)
                {
                    if (male_plant == ModBlocks.OG_MALE_CANNABIS_PLANT || block_to_change == ModBlocks.OG_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.east(), ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (male_plant == ModBlocks.GDK_MALE_CANNABIS_PLANT)
                {
                    if (block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT || block_to_change == ModBlocks.OG_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.east(), ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }
            }

            //west
            if (world.getBlockState(pos.west(1)).getBlock() instanceof _Female_Cannabis_Plant block_to_change)
            {
                // Simple Pollination
                if (block_to_change == ModBlocks.OG_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.OG_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.west(), ModBlocks.OG_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.GDP_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.west(), ModBlocks.GDP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (block_to_change == ModBlocks.RP_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.RP_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.west(), ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (block_to_change == ModBlocks.CP_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.CP_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.west(), ModBlocks.CP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                // Cross Pollination
                if (block_to_change == ModBlocks.AFG_FEMALE_CANNABIS_PLANT || male_plant == ModBlocks.AFG_MALE_CANNABIS_PLANT)
                {
                    if (male_plant == ModBlocks.HK_MALE_CANNABIS_PLANT || block_to_change == ModBlocks.HK_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.west(), ModBlocks.AK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (male_plant == ModBlocks.AK_MALE_CANNABIS_PLANT)
                {
                    if (block_to_change == ModBlocks.AFG_FEMALE_CANNABIS_PLANT || block_to_change == ModBlocks.HK_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.west(), ModBlocks.AK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (block_to_change == ModBlocks.CP_FEMALE_CANNABIS_PLANT || male_plant == ModBlocks.CP_MALE_CANNABIS_PLANT)
                {
                    if (male_plant == ModBlocks.GDP_MALE_CANNABIS_PLANT || block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.west(), ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (male_plant == ModBlocks.RP_MALE_CANNABIS_PLANT)
                {
                    if (block_to_change == ModBlocks.CP_FEMALE_CANNABIS_PLANT || block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.west(), ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT || male_plant == ModBlocks.GDP_MALE_CANNABIS_PLANT)
                {
                    if (male_plant == ModBlocks.OG_MALE_CANNABIS_PLANT || block_to_change == ModBlocks.OG_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.west(), ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (male_plant == ModBlocks.GDK_MALE_CANNABIS_PLANT)
                {
                    if (block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT || block_to_change == ModBlocks.OG_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.west(), ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }
            }

            //north
            if (world.getBlockState(pos.north(1)).getBlock() instanceof _Female_Cannabis_Plant block_to_change)
            {
                // Simple Pollination
                if (block_to_change == ModBlocks.OG_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.OG_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.north(), ModBlocks.OG_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.GDP_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.north(), ModBlocks.GDP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (block_to_change == ModBlocks.RP_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.RP_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.north(), ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (block_to_change == ModBlocks.CP_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.CP_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.north(), ModBlocks.CP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                // Cross Pollination
                if (block_to_change == ModBlocks.AFG_FEMALE_CANNABIS_PLANT || male_plant == ModBlocks.AFG_MALE_CANNABIS_PLANT)
                {
                    if (male_plant == ModBlocks.HK_MALE_CANNABIS_PLANT || block_to_change == ModBlocks.HK_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.north(), ModBlocks.AK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (male_plant == ModBlocks.AK_MALE_CANNABIS_PLANT)
                {
                    if (block_to_change == ModBlocks.AFG_FEMALE_CANNABIS_PLANT || block_to_change == ModBlocks.HK_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.north(), ModBlocks.AK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (block_to_change == ModBlocks.CP_FEMALE_CANNABIS_PLANT || male_plant == ModBlocks.CP_MALE_CANNABIS_PLANT)
                {
                    if (male_plant == ModBlocks.GDP_MALE_CANNABIS_PLANT || block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.north(), ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (male_plant == ModBlocks.RP_MALE_CANNABIS_PLANT)
                {
                    if (block_to_change == ModBlocks.CP_FEMALE_CANNABIS_PLANT || block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.north(), ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT || male_plant == ModBlocks.GDP_MALE_CANNABIS_PLANT)
                {
                    if (male_plant == ModBlocks.OG_MALE_CANNABIS_PLANT || block_to_change == ModBlocks.OG_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.north(), ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (male_plant == ModBlocks.GDK_MALE_CANNABIS_PLANT)
                {
                    if (block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT || block_to_change == ModBlocks.OG_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.north(), ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }
            }

            //south
            if (world.getBlockState(pos.south(1)).getBlock() instanceof _Female_Cannabis_Plant block_to_change)
            {
                // Simple Pollination
                if (block_to_change == ModBlocks.OG_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.OG_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.south(), ModBlocks.OG_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.GDP_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.south(), ModBlocks.GDP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (block_to_change == ModBlocks.RP_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.RP_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.south(), ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (block_to_change == ModBlocks.CP_FEMALE_CANNABIS_PLANT && male_plant == ModBlocks.CP_MALE_CANNABIS_PLANT)
                {
                    block_to_change.getPollinated(world, pos.south(), ModBlocks.CP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                // Cross Pollination
                if (block_to_change == ModBlocks.AFG_FEMALE_CANNABIS_PLANT || male_plant == ModBlocks.AFG_MALE_CANNABIS_PLANT)
                {
                    if (male_plant == ModBlocks.HK_MALE_CANNABIS_PLANT || block_to_change == ModBlocks.HK_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.south(), ModBlocks.AK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (male_plant == ModBlocks.AK_MALE_CANNABIS_PLANT)
                {
                    if (block_to_change == ModBlocks.AFG_FEMALE_CANNABIS_PLANT || block_to_change == ModBlocks.HK_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.south(), ModBlocks.AK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (block_to_change == ModBlocks.CP_FEMALE_CANNABIS_PLANT || male_plant == ModBlocks.CP_MALE_CANNABIS_PLANT)
                {
                    if (male_plant == ModBlocks.GDP_MALE_CANNABIS_PLANT || block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.south(), ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (male_plant == ModBlocks.RP_MALE_CANNABIS_PLANT)
                {
                    if (block_to_change == ModBlocks.CP_FEMALE_CANNABIS_PLANT || block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.south(), ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }


                if (block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT || male_plant == ModBlocks.GDP_MALE_CANNABIS_PLANT)
                {
                    if (male_plant == ModBlocks.OG_MALE_CANNABIS_PLANT || block_to_change == ModBlocks.OG_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.south(), ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }

                if (male_plant == ModBlocks.GDK_MALE_CANNABIS_PLANT)
                {
                    if (block_to_change == ModBlocks.GDP_FEMALE_CANNABIS_PLANT || block_to_change == ModBlocks.OG_FEMALE_CANNABIS_PLANT)
                    {
                        block_to_change.getPollinated(world, pos.south(), ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                    }
                }
            }
        }
    }
}

