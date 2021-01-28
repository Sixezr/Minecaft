package ru.sixzr.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ru.sixzr.TestMod;
import ru.sixzr.init.RegisterItem;
import ru.sixzr.utils.ArmorTier;

public class ChipsArmor extends ArmorItem {

    public ChipsArmor(EquipmentSlotType slot) {
        super(ArmorTier.CHIPS, slot, new Properties()
                .maxStackSize(1)
                .group(ItemGroup.COMBAT)
                .rarity(RegisterItem.LEGENDARY));
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, EquipmentSlotType slot, String layer)
    {
        if (slot == EquipmentSlotType.LEGS)
        {
            return TestMod.MOD_ID + ":textures/armor/chips_2.png";
        }
        else
        {
            return TestMod.MOD_ID + ":textures/armor/chips_1.png";
        }
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if (player.inventory.armorInventory.get(0).getItem() instanceof ChipsArmor
                && player.inventory.armorInventory.get(1).getItem() instanceof ChipsArmor
                && player.inventory.armorInventory.get(2).getItem() instanceof ChipsArmor
                && player.inventory.armorInventory.get(3).getItem() instanceof ChipsArmor) {
            player.abilities.allowFlying = true;
        }
        else {
            player.fallDistance = 0.0F;
            player.abilities.allowFlying = false;
        }
    }
}
