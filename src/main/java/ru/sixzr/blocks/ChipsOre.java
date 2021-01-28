package ru.sixzr.blocks;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.common.Mod;
import ru.sixzr.init.RegisterBlocks;
import ru.sixzr.init.RegisterItem;
import java.util.List;
import java.util.Random;

@Mod.EventBusSubscriber
public class ChipsOre extends OreBlock {
    
    private static final Random random = new Random();

    public ChipsOre() {
        super(Properties.create(Material.ROCK)
        .hardnessAndResistance(10,10)
        .harvestTool(ToolType.PICKAXE));
    }

    @Override
    protected int getExperience(Random rand) {
        return super.getExperience(rand);
    }


    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        return ImmutableList.of(new ItemStack(RegisterItem.CHIPS.get(), getRandom()));
    }

    public static void addChipsOre(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegisterBlocks.CHIPS_BLOCK.get().getDefaultState(), 17))
                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(1000, 0, 80, 128))));
    }

    private static int getRandom(){
        int rand;
        rand = 1 + random.nextInt(5);
        return rand;
    }

}
