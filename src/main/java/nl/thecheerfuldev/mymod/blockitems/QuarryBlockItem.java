package nl.thecheerfuldev.mymod.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import nl.thecheerfuldev.mymod.blocks.QuarryBlock;
import nl.thecheerfuldev.mymod.items.MyModItemGroup;

public class QuarryBlockItem extends BlockItem {
    public QuarryBlockItem(final Block blockIn) {
        super(blockIn, new Properties().group(MyModItemGroup.instance));
        this.setRegistryName(QuarryBlock.NAME);
    }
}
