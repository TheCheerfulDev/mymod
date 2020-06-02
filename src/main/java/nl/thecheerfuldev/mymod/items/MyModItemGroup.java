package nl.thecheerfuldev.mymod.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import nl.thecheerfuldev.mymod.init.ItemInit;

public class MyModItemGroup extends ItemGroup {

        public static final MyModItemGroup instance = new MyModItemGroup(ItemGroup.GROUPS.length, "mymodtab");

        private MyModItemGroup(final int index, final String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.ruby);
        }
    }