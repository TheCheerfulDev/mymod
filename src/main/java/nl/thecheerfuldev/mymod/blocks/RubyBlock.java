package nl.thecheerfuldev.mymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import nl.thecheerfuldev.mymod.MyMod;

public class RubyBlock extends Block {

    public static final String NAME = "ruby_block";

    public RubyBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5F, 6F)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE));
        this.setRegistryName(NAME);
    }
}
