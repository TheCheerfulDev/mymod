package nl.thecheerfuldev.mymod.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import nl.thecheerfuldev.mymod.MyMod;
import nl.thecheerfuldev.mymod.items.ModItemTier;

public class RubyPickaxe extends PickaxeItem {
    public static final String NAME = "ruby_pickaxe";

    public RubyPickaxe() {
        super(ModItemTier.RUBY, 5, 3F, new Item.Properties().group(MyMod.MyModItemGroup.instance));
        this.setRegistryName(NAME);
    }
}
