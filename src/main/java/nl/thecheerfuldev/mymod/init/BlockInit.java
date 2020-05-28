package nl.thecheerfuldev.mymod.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import nl.thecheerfuldev.mymod.MyMod;
import nl.thecheerfuldev.mymod.blockitems.RubyBlockItem;
import nl.thecheerfuldev.mymod.blockitems.RubyOreItem;
import nl.thecheerfuldev.mymod.blockitems.SpecalBlockItem;
import nl.thecheerfuldev.mymod.blocks.RubyBlock;
import nl.thecheerfuldev.mymod.blocks.RubyOre;
import nl.thecheerfuldev.mymod.blocks.SpecalBlock;

@ObjectHolder(MyMod.MOD_ID)
@Mod.EventBusSubscriber(modid = MyMod.MOD_ID, bus = Bus.MOD)
public class BlockInit {

    public static final Block ruby_block = null;
    public static final Block ruby_ore = null;
    public static final Block specal_block = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new RubyBlock());
        event.getRegistry().register(new RubyOre());
        event.getRegistry().register(new SpecalBlock());
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new RubyBlockItem(ruby_block));
        event.getRegistry().register(new RubyOreItem(ruby_ore));
        event.getRegistry().register(new SpecalBlockItem(specal_block));
    }

}
