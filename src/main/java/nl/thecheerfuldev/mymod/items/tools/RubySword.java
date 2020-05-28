package nl.thecheerfuldev.mymod.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import nl.thecheerfuldev.mymod.MyMod;
import nl.thecheerfuldev.mymod.items.ModItemTier;

public class RubySword extends SwordItem {
    public static final String NAME = "ruby_sword";

    public RubySword() {
        super(ModItemTier.RUBY, 7, 5F, new Item.Properties().group(MyMod.MyModItemGroup.instance));
        this.setRegistryName(NAME);
    }
}
