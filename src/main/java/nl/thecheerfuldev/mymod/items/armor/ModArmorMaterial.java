package nl.thecheerfuldev.mymod.items.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import nl.thecheerfuldev.mymod.init.ItemInit;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
    RUBY(new int[]{250, 500, 375, 250}, new int[]{7, 9, 11, 7}, 420, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, "ruby", 5F, () -> {
        return Ingredient.fromItems(ItemInit.ruby);
    });

    private final int[] durability;
    private final int[] damageReduction;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final LazyValue<Ingredient> repairMaterial;
    private final String name;
    private final float toughness;

    ModArmorMaterial(final int[] durability, final int[] damageReduction, final int enchantability, final SoundEvent soundEvent, final String name, final float toughness, final Supplier<Ingredient> repairMaterial) {
        this.durability = durability;
        this.damageReduction = damageReduction;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.repairMaterial = new LazyValue<>(repairMaterial);
        this.name = name;
        this.toughness = toughness;
    }

    @Override
    public int getDurability(final EquipmentSlotType slotIn) {
        return this.durability[slotIn.getIndex()];
    }

    @Override
    public int getDamageReductionAmount(final EquipmentSlotType slotIn) {
        return this.damageReduction[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
