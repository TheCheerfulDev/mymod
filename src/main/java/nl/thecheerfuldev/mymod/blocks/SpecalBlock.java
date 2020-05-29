package nl.thecheerfuldev.mymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class SpecalBlock extends Block {

    public static final String NAME = "specal_block";

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(7, 0, 4, 9, 1, 12),
            Block.makeCuboidShape(6, 1, 2, 10, 2, 14),
            Block.makeCuboidShape(6, 2, 13, 10, 9, 14),
            Block.makeCuboidShape(5, 3, 10, 6, 4, 14),
            Block.makeCuboidShape(10, 3, 10, 11, 4, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(7, 0, 4, 9, 1, 12),
            Block.makeCuboidShape(6, 1, 2, 10, 2, 14),
            Block.makeCuboidShape(6, 2, 13, 10, 9, 14),
            Block.makeCuboidShape(5, 3, 10, 6, 4, 14),
            Block.makeCuboidShape(10, 3, 10, 11, 4, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(4, 0, 7, 12, 1, 9),
            Block.makeCuboidShape(2, 1, 6, 14, 2, 10),
            Block.makeCuboidShape(2, 2, 6, 3, 9, 10),
            Block.makeCuboidShape(2, 3, 5, 6, 4, 6),
            Block.makeCuboidShape(2, 3, 10, 6, 4, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(4, 0, 7, 12, 1, 9),
            Block.makeCuboidShape(2, 1, 6, 14, 2, 10),
            Block.makeCuboidShape(13, 2, 6, 14, 9, 10),
            Block.makeCuboidShape(10, 3, 10, 14, 4, 11),
            Block.makeCuboidShape(10, 3, 5, 14, 4, 6)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public SpecalBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5F, 6F)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE)
                .lightValue(5)
                .slipperiness(1.2f));
        this.setDefaultState(this.getStateContainer().getBaseState().with(FACING, Direction.NORTH));
        this.setRegistryName(SpecalBlock.NAME);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(final BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(final BlockState state, final IWorld world, final BlockPos pos, final Rotation direction) {
        final BlockState newBlockState = state.with(FACING, direction.rotate(state.get(FACING)));
        world.setBlockState(pos, newBlockState, 3);
        return newBlockState;
    }

    @Override
    public BlockState mirror(final BlockState state, final Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(final StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public ActionResultType onBlockActivated(final BlockState state, final World worldIn, final BlockPos pos, final PlayerEntity player, final Hand handIn, final BlockRayTraceResult hit) {
        if (canBlockActivate(worldIn)) {
            final ServerWorld serverWorld = (ServerWorld) worldIn;
            final LightningBoltEntity entity = new LightningBoltEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), false);
            serverWorld.addLightningBolt(entity);
        }
        return ActionResultType.PASS;
    }

    @Override
    public VoxelShape getShape(final BlockState state, final IBlockReader worldIn, final BlockPos pos, final ISelectionContext context) {
        switch (state.get(FACING)) {
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            case NORTH:
            default:
                return SHAPE_N;
        }
    }

    private boolean canBlockActivate(final World world) {
        world.isRemote();
        return false;
    }
}
