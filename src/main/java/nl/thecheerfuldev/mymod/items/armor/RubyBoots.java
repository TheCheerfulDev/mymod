package nl.thecheerfuldev.mymod.items.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import nl.thecheerfuldev.mymod.items.MyModItemGroup;

public class RubyBoots extends ArmorItem {

    public static final String NAME = "ruby_boots";

    public RubyBoots() {
        super(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Properties().group(MyModItemGroup.instance));
        this.setRegistryName(RubyBoots.NAME);
    }
}
