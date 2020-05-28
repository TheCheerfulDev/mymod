package nl.thecheerfuldev.mymod.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import nl.thecheerfuldev.mymod.MyMod;
import nl.thecheerfuldev.mymod.blocks.RubyBlock;

public class RubyBlockItem extends BlockItem {
    public RubyBlockItem(final Block blockIn) {
        super(blockIn, new Item.Properties().group(MyMod.MyModItemGroup.instance));
        this.setRegistryName(RubyBlock.NAME);
    }
}
