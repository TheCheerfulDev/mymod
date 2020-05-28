package nl.thecheerfuldev.mymod.items;

import net.minecraft.item.Item;
import nl.thecheerfuldev.mymod.MyMod;

public class ItemBase extends Item {
    public ItemBase(final String registryName) {
        super(new Item.Properties().group(MyMod.MyModItemGroup.instance));
        this.setRegistryName(registryName);
    }
}
