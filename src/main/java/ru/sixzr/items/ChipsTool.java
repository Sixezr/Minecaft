package ru.sixzr.items;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import ru.sixzr.init.RegisterItem;
import ru.sixzr.utils.PickaxeTier;

public class ChipsTool extends PickaxeItem {

    public ChipsTool() {
        super(PickaxeTier.MAGIC_TIER, 0, 0, new Properties()
        .maxStackSize(1)
        .group(ItemGroup.TOOLS)
        .rarity(RegisterItem.LEGENDARY));
    }

    @Override
    public boolean canHarvestBlock(BlockState blockIn) {
        return true;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return PickaxeTier.MAGIC_TIER.getEfficiency();
    }
}
