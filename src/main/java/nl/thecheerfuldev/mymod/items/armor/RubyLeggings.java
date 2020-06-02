package nl.thecheerfuldev.mymod.items.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import nl.thecheerfuldev.mymod.items.MyModItemGroup;

public class RubyLeggings extends ArmorItem {

    public static final String NAME = "ruby_leggings";

    public RubyLeggings() {
        super(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Properties().group(MyModItemGroup.instance));
        this.setRegistryName(RubyLeggings.NAME);
    }
}
