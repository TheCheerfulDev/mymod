package nl.thecheerfuldev.mymod.util.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import nl.thecheerfuldev.mymod.tileentity.QuarryTileEntity;

public class NBTHelper {

    public static CompoundNBT toNBT(final Object o) {
        if (o instanceof ItemStack) {
            return writeItemStack((ItemStack) o);
        }
        if (o instanceof QuarryTileEntity) {
            return writeQuarry((QuarryTileEntity) o);
        }
        return null;
    }

    private static CompoundNBT writeQuarry(final QuarryTileEntity o) {
        final CompoundNBT compound = new CompoundNBT();
        compound.putInt("x", o.x);
        compound.putInt("y", o.y);
        compound.putInt("z", o.z);
        return compound;
    }

    private static CompoundNBT writeItemStack(final ItemStack o) {
        final CompoundNBT compound = new CompoundNBT();
        compound.putInt("count", o.getCount());
        compound.putString("item", o.getItem().getRegistryName().toString());
        compound.putByte("type", (byte)0);
        return compound;
    }

    public static Object fromNBT(final CompoundNBT compound) {
        switch (compound.getByte("type")) {
            case 0:
                return readItemStack(compound);
            default:
                return null;
        }
    }

    private static ItemStack readItemStack(final CompoundNBT compound) {
        final Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(compound.getString("item")));
        final int count = compound.getInt("count");
        return new ItemStack(item, count);
    }

}
