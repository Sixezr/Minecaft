package ru.sixzr.init;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.sixzr.TestMod;
import ru.sixzr.items.ChipsArmor;
import ru.sixzr.items.ChipsItem;
import ru.sixzr.items.ChipsSword;

public class RegisterItem {

    private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    //register items
    public static Rarity LEGENDARY = Rarity.create("legendary", TextFormatting.YELLOW);
    public static Rarity EPIC = Rarity.create("epic", TextFormatting.DARK_PURPLE);
    public static final RegistryObject<Item> CHIPS = ITEMS.register("chips",  ChipsItem::new);
    public static final RegistryObject<Item> CHIPS_SWORD = ITEMS.register("chips_sword",  ChipsSword::new);
    public static final RegistryObject<Item> CHIPS_HELM  = ITEMS.register("chips_helmet", () -> new ChipsArmor(EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> CHIPS_CHEST = ITEMS.register("chips_chest",  () -> new ChipsArmor(EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> CHIPS_LEGS  = ITEMS.register("chips_leggins",() -> new ChipsArmor(EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> CHIPS_FEET  = ITEMS.register("chips_boots",  () -> new ChipsArmor(EquipmentSlotType.FEET));

    public static void register()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
