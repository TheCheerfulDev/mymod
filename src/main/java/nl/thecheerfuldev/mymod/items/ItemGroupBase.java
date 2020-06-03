package nl.thecheerfuldev.mymod.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ItemGroupBase extends ItemGroup {

    private final Supplier<ItemStack> iconSupplier;

    public ItemGroupBase(final String label, final Block block) {
        this(label, Item.getItemFromBlock(block));
    }

    public ItemGroupBase(final String label, final Item item) {
        this(label, () -> new ItemStack(item));
    }

    public ItemGroupBase(final String label, final Supplier<ItemStack> iconSupplier) {
        super(label);
        this.iconSupplier = iconSupplier;
    }

    @Override
    public ItemStack createIcon() {
        return this.iconSupplier.get();
    }
}