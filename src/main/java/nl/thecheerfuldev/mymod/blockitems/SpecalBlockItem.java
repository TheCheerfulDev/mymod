package nl.thecheerfuldev.mymod.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import nl.thecheerfuldev.mymod.MyMod;
import nl.thecheerfuldev.mymod.blocks.RubyBlock;
import nl.thecheerfuldev.mymod.blocks.SpecalBlock;

public class SpecalBlockItem extends BlockItem {
    public SpecalBlockItem(final Block blockIn) {
        super(blockIn, new Properties().group(MyMod.MyModItemGroup.instance));
        this.setRegistryName(SpecalBlock.NAME);
    }


}
