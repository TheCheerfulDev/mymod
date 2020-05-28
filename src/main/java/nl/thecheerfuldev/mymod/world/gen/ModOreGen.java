package nl.thecheerfuldev.mymod.world.gen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import nl.thecheerfuldev.mymod.init.BlockInit;

public class ModOreGen {

    public static void generateOre() {
        for (final Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                            BlockInit.ruby_ore.getDefaultState(), 10)).withPlacement(createConfiguredPlacement(5,50,5,25)));
        }
    }

    private static ConfiguredPlacement<CountRangeConfig> createConfiguredPlacement(final int count, final int bottomOffset, final int topOffset, final int maximum) {
        return Placement.COUNT_RANGE
                .configure(new CountRangeConfig(count, bottomOffset, topOffset, maximum));
    }

}
