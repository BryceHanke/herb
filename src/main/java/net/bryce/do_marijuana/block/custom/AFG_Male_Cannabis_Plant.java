package net.bryce.do_marijuana.block.custom;

import net.bryce.do_marijuana.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class AFG_Male_Cannabis_Plant extends Male_Cannabis_Plant {
    public AFG_Male_Cannabis_Plant(Settings settings) {super(settings);}

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        float f = getAvailableMoisture(this, world, pos);

        if (random.nextInt((int)(25.0F / f)+1) == 0)
        {
            if(world.getBlockState(pos.west(1)).isOf(ModBlocks.OG_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.west(1), ModBlocks.OG_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.west(1)).isOf(ModBlocks.GDP_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.west(1), ModBlocks.GDP_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.west(1)).isOf(ModBlocks.RP_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.west(1), ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.west(1)).isOf(ModBlocks.S1_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.west(1), ModBlocks.SS_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.east(1)).isOf(ModBlocks.OG_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.east(1), ModBlocks.OG_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.east(1)).isOf(ModBlocks.GDP_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.east(1), ModBlocks.GDP_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.east(1)).isOf(ModBlocks.RP_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.east(1), ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.east(1)).isOf(ModBlocks.S1_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.east(1), ModBlocks.SS_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.north(1)).isOf(ModBlocks.OG_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.north(1), ModBlocks.OG_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.north(1)).isOf(ModBlocks.GDP_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.north(1), ModBlocks.GDP_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.north(1)).isOf(ModBlocks.RP_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.north(1), ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.north(1)).isOf(ModBlocks.S1_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.north(1), ModBlocks.SS_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.south(1)).isOf(ModBlocks.OG_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.south(1), ModBlocks.OG_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.south(1)).isOf(ModBlocks.GDP_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.south(1), ModBlocks.GDP_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.south(1)).isOf(ModBlocks.RP_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.south(1), ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }

            if(world.getBlockState(pos.south(1)).isOf(ModBlocks.S1_FEMALE_CANNABIS_PLANT))
            {
                world.setBlockState(pos.south(1), ModBlocks.SS_MALE_CANNABIS_PLANT.getDefaultState(), 2);
            }
        }
        super.randomTick(state, world, pos, random);
    }
}
