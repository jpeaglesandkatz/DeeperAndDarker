package com.kyanite.deeperdarker.util;

import com.kyanite.deeperdarker.DeeperDarker;
import com.kyanite.deeperdarker.content.DDItems;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

@SuppressWarnings("NullableProblems")
public class DDArmorMaterials {
    public static Holder<ArmorMaterial> RESONARIUM = register("resonarium", Map.of(
        ArmorItem.Type.BOOTS, 2,
        ArmorItem.Type.LEGGINGS, 6,
        ArmorItem.Type.CHESTPLATE, 7,
        ArmorItem.Type.HELMET, 3
    ), 10, SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(Items.IRON_INGOT), 1.0f, 0.0f);
    public static Holder<ArmorMaterial> WARDEN = register("warden", Map.of(
        ArmorItem.Type.BOOTS, 4,
        ArmorItem.Type.LEGGINGS, 7,
        ArmorItem.Type.CHESTPLATE, 9,
        ArmorItem.Type.HELMET, 4
    ), 18, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> Ingredient.of(DDItems.REINFORCED_ECHO_SHARD), 4.0f, 0.1f);

    private static Holder<ArmorMaterial> register(String id, Map<ArmorItem.Type, Integer> defense, int enchantmentValue, Holder<SoundEvent> equipSound, Supplier<Ingredient> repairIngredient, float toughness, float knockbackResistance) {
        ArmorMaterial armorMaterial = new ArmorMaterial(defense, enchantmentValue, equipSound, repairIngredient, List.of(new ArmorMaterial.Layer(DeeperDarker.rl(id))), toughness, knockbackResistance);
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, DeeperDarker.rl(id), armorMaterial);
    }

    public static void init() {
        DeeperDarker.LOGGER.debug("Registering armor materials");
    }
}
