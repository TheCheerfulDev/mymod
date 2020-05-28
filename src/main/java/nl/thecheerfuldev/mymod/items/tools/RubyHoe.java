package nl.thecheerfuldev.mymod.items.tools;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ShovelItem;
import nl.thecheerfuldev.mymod.MyMod;
import nl.thecheerfuldev.mymod.items.ModItemTier;

public class RubyHoe extends HoeItem {
    public static final String NAME = "ruby_hoe";

    public RubyHoe() {
        super(ModItemTier.RUBY, 5, new Properties().group(MyMod.MyModItemGroup.instance));
        this.setRegistryName(NAME);
    }
}
