package nl.thecheerfuldev.mymod.items;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Rotation;
import nl.thecheerfuldev.mymod.util.helpers.KeyboardHelper;

@MethodsReturnNonnullByDefault
public class RubyWrench extends ItemBase {

    public static final String NAME = "ruby_wrench";

    public RubyWrench() {
        super(NAME);
    }

    @Override
    public ActionResultType onItemUse(final ItemUseContext context) {
        final BlockState blockState = context.getWorld().getBlockState(context.getPos());
        if (KeyboardHelper.isHoldingShift()) {
            blockState.getBlock().rotate(blockState,context.getWorld(), context.getPos(), Rotation.COUNTERCLOCKWISE_90);
        } else {
            blockState.getBlock().rotate(blockState,context.getWorld(), context.getPos(), Rotation.CLOCKWISE_90);
        }
        return ActionResultType.PASS;
    }
}
