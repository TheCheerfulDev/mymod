package nl.thecheerfuldev.mymod.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import nl.thecheerfuldev.mymod.MyMod;
import nl.thecheerfuldev.mymod.items.Ruby;
import nl.thecheerfuldev.mymod.items.RubyShard;
import nl.thecheerfuldev.mymod.items.RubyWrench;
import nl.thecheerfuldev.mymod.items.SpecialItem;
import nl.thecheerfuldev.mymod.items.armor.RubyBoots;
import nl.thecheerfuldev.mymod.items.armor.RubyChestplate;
import nl.thecheerfuldev.mymod.items.armor.RubyHelmet;
import nl.thecheerfuldev.mymod.items.armor.RubyLeggings;
import nl.thecheerfuldev.mymod.items.tools.RubyAxe;
import nl.thecheerfuldev.mymod.items.tools.RubyHoe;
import nl.thecheerfuldev.mymod.items.tools.RubyPickaxe;
import nl.thecheerfuldev.mymod.items.tools.RubyShovel;
import nl.thecheerfuldev.mymod.items.tools.RubySword;

@ObjectHolder(MyMod.MOD_ID)
@Mod.EventBusSubscriber(modid = MyMod.MOD_ID, bus = Bus.MOD)
public class ItemInit {

    public static final Item ruby = null;
    public static final Item ruby_shard = null;
    public static final Item ruby_sword = null;
    public static final Item ruby_axe = null;
    public static final Item ruby_pickaxe = null;
    public static final Item ruby_shovel = null;
    public static final Item ruby_hoe = null;
    public static final Item ruby_wrench = null;

    public static final Item special_item = null;

    public static final Item ruby_helmet = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Ruby());
        event.getRegistry().register(new RubyShard());
        event.getRegistry().register(new RubySword());
        event.getRegistry().register(new RubyAxe());
        event.getRegistry().register(new RubyPickaxe());
        event.getRegistry().register(new RubyShovel());
        event.getRegistry().register(new RubyHoe());
        event.getRegistry().register(new RubyWrench());

        event.getRegistry().register(new SpecialItem());

        event.getRegistry().register(new RubyHelmet());
        event.getRegistry().register(new RubyChestplate());
        event.getRegistry().register(new RubyLeggings());
        event.getRegistry().register(new RubyBoots());
    }

}
