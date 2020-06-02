package nl.thecheerfuldev.mymod.items;

import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(final String registryName) {
        super(new Item.Properties().group(MyModItemGroup.instance));
        this.setRegistryName(registryName);
    }
}
