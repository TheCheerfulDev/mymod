package nl.thecheerfuldev.mymod.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import nl.thecheerfuldev.mymod.items.ModItemTier;
import nl.thecheerfuldev.mymod.items.MyModItemGroup;

public class RubySword extends SwordItem {
    public static final String NAME = "ruby_sword";

    public RubySword() {
        super(ModItemTier.RUBY, 7, 5F, new Item.Properties().group(MyModItemGroup.instance));
        this.setRegistryName(NAME);
    }
}
