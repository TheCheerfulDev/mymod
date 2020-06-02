package nl.thecheerfuldev.mymod.items.tools;

import net.minecraft.item.AxeItem;
import nl.thecheerfuldev.mymod.items.ModItemTier;
import nl.thecheerfuldev.mymod.items.MyModItemGroup;

public class RubyAxe extends AxeItem {
    public static final String NAME = "ruby_axe";

    public RubyAxe() {
        super(ModItemTier.RUBY, 5, 3F, new Properties().group(MyModItemGroup.instance));
        this.setRegistryName(NAME);
    }
}
