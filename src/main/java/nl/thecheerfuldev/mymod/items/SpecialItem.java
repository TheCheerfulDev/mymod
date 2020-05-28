package nl.thecheerfuldev.mymod.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import nl.thecheerfuldev.mymod.util.helpers.KeyboardHelper;

import javax.annotation.Nullable;
import java.util.List;

public class SpecialItem extends ItemBase {

    public static final String NAME = "special_item";

    public SpecialItem() {
        super(NAME);
    }

    @Override
    public boolean hasEffect(final ItemStack stack) {
        return true;
    }

    @Override
    public void addInformation(final ItemStack stack, @Nullable final World worldIn, final List<ITextComponent> tooltip, final ITooltipFlag flagIn) {
        if (KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("Test Information"));
        } else {
            tooltip.add(new StringTextComponent("Hold shift for more info..."));
        }
    }
}
