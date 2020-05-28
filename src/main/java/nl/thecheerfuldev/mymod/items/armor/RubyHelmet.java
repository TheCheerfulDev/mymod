package nl.thecheerfuldev.mymod.items.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import nl.thecheerfuldev.mymod.MyMod;

public class RubyHelmet extends ArmorItem {

    public static final String NAME = "ruby_helmet";

    public RubyHelmet() {
        super(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Properties().group(MyMod.MyModItemGroup.instance));
        this.setRegistryName(RubyHelmet.NAME);
    }
}
