package nl.thecheerfuldev.mymod;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import nl.thecheerfuldev.mymod.world.gen.ModOreGen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mymod")
@Mod.EventBusSubscriber(modid = MyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MyMod {

    public static final String MOD_ID = "mymod";

    public static final String MOD_NAME = "My Mod";

    private static final Logger log = LogManager.getLogger(MOD_NAME);

    public MyMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::oreGeneration);
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    private void oreGeneration(final FMLLoadCompleteEvent event) {
        ModOreGen.generateOre();
    }

    @SubscribeEvent
    public static void addTooltips (final ItemTooltipEvent event) {

        final ItemStack stack = event.getItemStack();

        if (!stack.isEmpty()) {

            final ResourceLocation id = stack.getItem().getRegistryName();

            if (id != null && "mymod".equals(id.getNamespace())) {

                event.getToolTip().add(new TranslationTextComponent("tooltip.mymod." + id.getPath() + ".short").applyTextStyle(TextFormatting.GRAY));
            }
        }
    }

}
