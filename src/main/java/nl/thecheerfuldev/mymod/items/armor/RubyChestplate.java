package nl.thecheerfuldev.mymod.items.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import nl.thecheerfuldev.mymod.items.MyModItemGroup;

public class RubyChestplate extends ArmorItem {

    public static final String NAME = "ruby_chestplate";

    public RubyChestplate() {
        super(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Properties().group(MyModItemGroup.instance));
        this.setRegistryName(RubyChestplate.NAME);
    }
}
