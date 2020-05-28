package nl.thecheerfuldev.mymod.items.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import nl.thecheerfuldev.mymod.MyMod;

public class RubyBoots extends ArmorItem {

    public static final String NAME = "ruby_boots";

    public RubyBoots() {
        super(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Properties().group(MyMod.MyModItemGroup.instance));
        this.setRegistryName(RubyBoots.NAME);
    }
}
