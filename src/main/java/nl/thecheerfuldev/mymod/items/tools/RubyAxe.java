package nl.thecheerfuldev.mymod.items.tools;

import net.minecraft.item.AxeItem;
import nl.thecheerfuldev.mymod.MyMod;
import nl.thecheerfuldev.mymod.items.ModItemTier;

public class RubyAxe extends AxeItem {
    public static final String NAME = "ruby_axe";

    public RubyAxe() {
        super(ModItemTier.RUBY, 5, 3F, new Properties().group(MyMod.MyModItemGroup.instance));
        this.setRegistryName(NAME);
    }
}
