package nl.thecheerfuldev.mymod.items.tools;

import net.minecraft.item.HoeItem;
import nl.thecheerfuldev.mymod.items.ModItemTier;
import nl.thecheerfuldev.mymod.items.MyModItemGroup;

public class RubyHoe extends HoeItem {
    public static final String NAME = "ruby_hoe";

    public RubyHoe() {
        super(ModItemTier.RUBY, 5, new Properties().group(MyModItemGroup.instance));
        this.setRegistryName(NAME);
    }
}
