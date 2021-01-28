package ru.sixzr.events;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import ru.sixzr.TestMod;
import ru.sixzr.init.RegisterBlocks;


@Mod.EventBusSubscriber(modid = TestMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OreGenEvent {

    @SubscribeEvent
    public static void initServer(FMLCommonSetupEvent event) {
        setupOreGeneration();
    }

    private static void setupOreGeneration() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                    .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegisterBlocks.CHIPS_BLOCK.get().getDefaultState(), 10))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(5, 0, 0, 128))));
        }
    }

}
