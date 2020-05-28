package nl.thecheerfuldev.mymod.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import nl.thecheerfuldev.mymod.util.helpers.KeyboardHelper;

public class RubyWrench extends ItemBase {

    public static final String NAME = "ruby_wrench";

    public RubyWrench() {
        super(NAME);
    }

    @Override
    public ActionResultType onItemUse(final ItemUseContext context) {
        final BlockPos pos = context.getPos();
        final BlockState blockState = context.getWorld().getBlockState(pos);
        final BlockState rotatedBlockState;
        if (KeyboardHelper.isHoldingShift()) {
            rotatedBlockState = blockState.getBlock().rotate(blockState, Rotation.COUNTERCLOCKWISE_90);
        } else {
            rotatedBlockState = blockState.getBlock().rotate(blockState, Rotation.CLOCKWISE_90);
        }
        context.getWorld().setBlockState(pos, rotatedBlockState);
        return super.onItemUse(context);
    }
}
