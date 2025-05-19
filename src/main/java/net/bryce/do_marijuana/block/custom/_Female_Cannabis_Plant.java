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

public class _Female_Cannabis_Plant extends CropBlock {
    public static final int FIRST_MAX_AGE = 3;
    public static final int SECOND_MAX_AGE = 3;
    public static final IntProperty AGE = IntProperty.of("age", 0, 6);

    public _Female_Cannabis_Plant(Settings settings) {
        super(settings);
    }

    private static final VoxelShape[] AGE_TO_SHAPE =  new VoxelShape[]
            {
                    Block.createCuboidShape(0, 0, 0, 16, 4.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 8.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 16.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 16.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 16.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 16.0, 16),
                    Block.createCuboidShape(0, 0, 0, 16, 16.0, 16)
            };

    @Override
    protected ItemConvertible getSeedsItem()
    {
        if (this == ModBlocks.OG_FEMALE_CANNABIS_PLANT)
        {
            return ModItems.OG_CANNABIS_SEEDS;
        }

        if (this == ModBlocks.GDP_FEMALE_CANNABIS_PLANT)
        {
            return ModItems.GDP_CANNABIS_SEEDS;
        }

        if (this == ModBlocks.RP_FEMALE_CANNABIS_PLANT)
        {
            return ModItems.RP_CANNABIS_SEEDS;
        }

        return ModItems.OG_CANNABIS_SEEDS;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[state.get(AGE)];
    }

    @Override
    public int getMaxAge()
    {
        return FIRST_MAX_AGE + SECOND_MAX_AGE;
    }

    @Override
    public IntProperty getAgeProperty()
    {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(AGE);
    }

    @Override
    public void applyGrowth(World world, BlockPos pos, BlockState state) {
        int nextAge = this.getAge(state) + this.getGrowthAmount(world);
        int maxAge = this.getMaxAge();
        if (nextAge > maxAge)
        {
            nextAge = maxAge;
        }

        if(this.getAge(state) == FIRST_MAX_AGE && world.getBlockState(pos.up(1)).isOf(Blocks.AIR))
        {
            world.setBlockState(pos.up(1), this.withAge(0), 2);
        } else
        {
            if (nextAge <= FIRST_MAX_AGE)
            {
                world.setBlockState(pos, this.withAge(nextAge-1), 2);

            }
        }
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos)
    {
        return super.canPlaceAt(state, world, pos) || (world.getBlockState(pos.down(1)).isOf(this) &&
                world.getBlockState(pos.down(1)).get(AGE) == 3);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random)
    {
        if (world.getBaseLightLevel(pos, 0) >= 9)
        {
            int currentAge;
            float f = getAvailableMoisture(this, world, pos);

            currentAge = this.getAge(state);

            if (currentAge < this.getMaxAge())
            {
                if (currentAge == FIRST_MAX_AGE)
                {
                    if (random.nextInt((int)(25.0F / f)+1) == 0)
                    {
                        if(world.getBlockState(pos.up(1)).isOf(Blocks.AIR))
                        {
                            if (!world.getBlockState(pos.down(2)).isOf(this))
                            {
                                world.setBlockState(pos.up(1), this.withAge(currentAge-1), 2);
                            }
                        }
                    }
                }
                else
                {
                    world.setBlockState(pos, this.withAge(currentAge+1), 2);

                    if (random.nextInt((int)(250.0F / f)+1) == 0)
                    {
                        if (this.getDefaultState().isOf(ModBlocks.OG_FEMALE_CANNABIS_PLANT))
                        {
                            world.setBlockState(pos, ModBlocks.OG_MALE_CANNABIS_PLANT.getDefaultState(), 2);
                        }
                        if (this.getDefaultState().isOf(ModBlocks.GDP_FEMALE_CANNABIS_PLANT))
                        {
                            world.setBlockState(pos, ModBlocks.GDP_MALE_CANNABIS_PLANT.getDefaultState(), 2);
                        }
                        if (this.getDefaultState().isOf(ModBlocks.RP_FEMALE_CANNABIS_PLANT))
                        {
                            world.setBlockState(pos, ModBlocks.RP_MALE_CANNABIS_PLANT.getDefaultState(), 2);
                        }
                        if (this.getDefaultState().isOf(ModBlocks.CP_FEMALE_CANNABIS_PLANT))
                        {
                            world.setBlockState(pos, ModBlocks.CP_MALE_CANNABIS_PLANT.getDefaultState(), 2);
                        }
                    }
                }

            }
        }
    }

    public void getPollinated(World world, BlockPos pos, BlockState male_cross)
    {
        world.setBlockState(pos, male_cross, 2);
    }

}
