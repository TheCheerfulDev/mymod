package nl.thecheerfuldev.mymod.items.tools;

import net.minecraft.item.ShovelItem;
import nl.thecheerfuldev.mymod.items.ModItemTier;
import nl.thecheerfuldev.mymod.items.MyModItemGroup;

public class RubyShovel extends ShovelItem {
    public static final String NAME = "ruby_shovel";

    public RubyShovel() {
        super(ModItemTier.RUBY, 5, 3F, new Properties().group(MyModItemGroup.instance));
        this.setRegistryName(NAME);
    }
}
