package net.bryce.herb.block.custom.male;

import net.bryce.herb.block.ModBlocks;
import net.bryce.herb.block.custom.female._Female_Cannabis_Plant;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class GDP_Male_Cannabis_Plant extends _Male_Cannabis_Plant {
    public GDP_Male_Cannabis_Plant(Settings settings) {super(settings);}

    @Override
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
                if (world.getBlockState(positions).getBlock() == ModBlocks.CP_FEMALE_CANNABIS_PLANT)
                {
                    _Female_Cannabis_Plant fem_plant = (_Female_Cannabis_Plant) world.getBlockState(positions).getBlock();
                    fem_plant.getPollinated(world, positions, ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState());
                }

                if (world.getBlockState(positions).getBlock() == ModBlocks.OG_FEMALE_CANNABIS_PLANT)
                {
                    _Female_Cannabis_Plant fem_plant = (_Female_Cannabis_Plant) world.getBlockState(positions).getBlock();
                    fem_plant.getPollinated(world, positions, ModBlocks.GDK_MALE_CANNABIS_PLANT.getDefaultState());
                }
            }
        }
    }
}
