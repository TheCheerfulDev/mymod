package nl.thecheerfuldev.mymod.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import nl.thecheerfuldev.mymod.items.ModItemTier;
import nl.thecheerfuldev.mymod.items.MyModItemGroup;

public class RubyPickaxe extends PickaxeItem {
    public static final String NAME = "ruby_pickaxe";

    public RubyPickaxe() {
        super(ModItemTier.RUBY, 5, 3F, new Item.Properties().group(MyModItemGroup.instance));
        this.setRegistryName(NAME);
    }
}
