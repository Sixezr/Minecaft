package ru.sixzr.items;

import javafx.scene.effect.Effect;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import ru.sixzr.init.RegisterItem;

public class ChipsItem extends Item {

    public ChipsItem() {
        super(new Properties()
                .rarity(RegisterItem.EPIC)
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                .hunger(0)
                .saturation(0)
                .fastToEat()
                .setAlwaysEdible()
                .effect(() -> new EffectInstance(Effects.ABSORPTION, 6000, 10), 10)
                .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 10), 10)
                .effect(() -> new EffectInstance(Effects.NIGHT_VISION, 6000, 10), 10)
                .effect(() -> new EffectInstance(Effects.STRENGTH, 6000, 10), 10)
                .effect(() -> new EffectInstance(Effects.HASTE, 6000, 10), 10)
                .build()
                )
        );


    }
}
