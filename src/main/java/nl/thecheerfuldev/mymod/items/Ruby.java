package nl.thecheerfuldev.mymod.items;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import nl.thecheerfuldev.mymod.init.BlockInit;

public class Ruby extends ItemBase {
    public static final String NAME = "ruby";

    public Ruby() {
        super(NAME);
    }

    @Override
    public ActionResultType onItemUse(final ItemUseContext context) {
        final BlockPos pos = context.getPos();
        context.getWorld().setBlockState(pos, BlockInit.ruby_block.getDefaultState());
        return super.onItemUse(context);
    }

    @Override
    public int getBurnTime(final ItemStack itemStack) {
        return 600;
    }
}
