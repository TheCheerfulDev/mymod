package nl.thecheerfuldev.mymod.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import nl.thecheerfuldev.mymod.blocks.SpecalBlock;
import nl.thecheerfuldev.mymod.items.MyModItemGroup;

public class SpecalBlockItem extends BlockItem {
    public SpecalBlockItem(final Block blockIn) {
        super(blockIn, new Properties().group(MyModItemGroup.instance));
        this.setRegistryName(SpecalBlock.NAME);
    }
}
