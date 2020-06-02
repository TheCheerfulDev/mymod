package nl.thecheerfuldev.mymod.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import nl.thecheerfuldev.mymod.blocks.RubyOre;
import nl.thecheerfuldev.mymod.items.MyModItemGroup;

public class RubyOreItem extends BlockItem {
    public RubyOreItem(final Block blockIn) {
        super(blockIn, new Properties().group(MyModItemGroup.instance));
        this.setRegistryName(RubyOre.NAME);
    }
}
