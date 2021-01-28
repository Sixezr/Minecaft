package ru.sixzr.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import ru.sixzr.init.RegisterItem;
import ru.sixzr.utils.SwordTier;

public class ChipsSword extends SwordItem {

    public ChipsSword() {
        super(SwordTier.MAGIC_TIER, 35, 0.0F, new Properties()
                .maxStackSize(1)
                .group(ItemGroup.COMBAT)
                .rarity(RegisterItem.LEGENDARY));
    }
}
