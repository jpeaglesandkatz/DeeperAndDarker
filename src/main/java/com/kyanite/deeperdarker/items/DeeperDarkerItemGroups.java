package com.kyanite.deeperdarker.items;

import com.kyanite.deeperdarker.DeeperDarker;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class DeeperDarkerItemGroups {
    public static final ItemGroup DEEPER_AND_DARKER = Registry.register(Registries.ITEM_GROUP, new Identifier(DeeperDarker.MOD_ID, "deeper_and_darker"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.deeperdarker")).icon(() -> new ItemStack(DeeperDarkerItems.WARDEN_SWORD)).entries(((displayContext, entries) -> {
                entries.add(new ItemStack(DeeperDarkerItems.WARDEN_HELMET));
                entries.add(new ItemStack(DeeperDarkerItems.WARDEN_CHESTPLATE));
                entries.add(new ItemStack(DeeperDarkerItems.WARDEN_LEGGINGS));
                entries.add(new ItemStack(DeeperDarkerItems.WARDEN_BOOTS));
                entries.add(new ItemStack(DeeperDarkerItems.WARDEN_SWORD));
                entries.add(new ItemStack(DeeperDarkerItems.WARDEN_PICKAXE));
                entries.add(new ItemStack(DeeperDarkerItems.WARDEN_AXE));
                entries.add(new ItemStack(DeeperDarkerItems.WARDEN_SHOVEL));
                entries.add(new ItemStack(DeeperDarkerItems.WARDEN_HOE));
                entries.add(new ItemStack(DeeperDarkerItems.WARDEN_UPGRADE_SMITHING_TEMPLATE));
                entries.add(new ItemStack(DeeperDarkerItems.REINFORCED_ECHO_SHARD));
                entries.add(new ItemStack(DeeperDarkerItems.WARDEN_CARAPACE));
                entries.add(new ItemStack(DeeperDarkerItems.HEART_OF_THE_DEEP));
                entries.add(new ItemStack(DeeperDarkerItems.SOUL_CRYSTAL));
                entries.add(new ItemStack(DeeperDarkerItems.SOUL_DUST));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_BONE));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_LOG));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_WOOD));
                entries.add(new ItemStack(DeeperDarkerItems.STRIPPED_ECHO_LOG));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_BUTTON));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_DOOR));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_FENCE_GATE));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_FENCE));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_HANGING_SIGN));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_LEAVES));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_PLANKS));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_PRESSURE_PLATE));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_SAPLING));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_SIGN));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_TRAPDOOR));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_BOAT));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_CHEST_BOAT));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.COBBLED_SCULK_STONE));
                entries.add(new ItemStack(DeeperDarkerItems.COBBLED_SCULK_STONE_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.COBBLED_SCULK_STONE_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.COBBLED_SCULK_STONE_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.POLISHED_SCULK_STONE));
                entries.add(new ItemStack(DeeperDarkerItems.POLISHED_SCULK_STONE_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.POLISHED_SCULK_STONE_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.POLISHED_SCULK_STONE_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_BRICKS));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_BRICK_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_BRICK_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_BRICK_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_TILES));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_TILE_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_TILE_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_TILE_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.SMOOTH_SCULK_STONE));
                entries.add(new ItemStack(DeeperDarkerItems.SMOOTH_SCULK_STONE_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.SMOOTH_SCULK_STONE_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.SMOOTH_SCULK_STONE_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.CUT_SCULK_STONE));
                entries.add(new ItemStack(DeeperDarkerItems.CUT_SCULK_STONE_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.CUT_SCULK_STONE_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.CUT_SCULK_STONE_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.CHISELED_SCULK_STONE));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_GRIME));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_GRIME_BRICKS));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_GRIME_BRICK_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_GRIME_BRICK_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_GRIME_BRICK_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMSLATE));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMSLATE_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMSLATE_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMSLATE_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.COBBLED_GLOOMSLATE));
                entries.add(new ItemStack(DeeperDarkerItems.COBBLED_GLOOMSLATE_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.COBBLED_GLOOMSLATE_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.COBBLED_GLOOMSLATE_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.POLISHED_GLOOMSLATE));
                entries.add(new ItemStack(DeeperDarkerItems.POLISHED_GLOOMSLATE_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.POLISHED_GLOOMSLATE_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.POLISHED_GLOOMSLATE_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMSLATE_BRICKS));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMSLATE_BRICK_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMSLATE_BRICK_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMSLATE_BRICK_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMSLATE_TILES));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMSLATE_TILE_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMSLATE_TILE_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMSLATE_TILE_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.SMOOTH_GLOOMSLATE));
                entries.add(new ItemStack(DeeperDarkerItems.SMOOTH_GLOOMSLATE_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.SMOOTH_GLOOMSLATE_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.SMOOTH_GLOOMSLATE_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.CUT_GLOOMSLATE));
                entries.add(new ItemStack(DeeperDarkerItems.CUT_GLOOMSLATE_STAIRS));
                entries.add(new ItemStack(DeeperDarkerItems.CUT_GLOOMSLATE_SLAB));
                entries.add(new ItemStack(DeeperDarkerItems.CUT_GLOOMSLATE_WALL));
                entries.add(new ItemStack(DeeperDarkerItems.CHISELED_GLOOMSLATE));
                entries.add(new ItemStack(DeeperDarkerItems.ECHO_SOIL));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_GLEAM));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_COAL_ORE));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_IRON_ORE));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_COPPER_ORE));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_GOLD_ORE));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_REDSTONE_ORE));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_EMERALD_ORE));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_LAPIS_ORE));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_STONE_DIAMOND_ORE));
                entries.add(new ItemStack(DeeperDarkerItems.GRIME_BALL));
                entries.add(new ItemStack(DeeperDarkerItems.GRIME_BRICK));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_TENDRILS));
                entries.add(new ItemStack(DeeperDarkerItems.SCULK_VINES));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMY_CACTUS));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMY_GRASS));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMY_SCULK));
                entries.add(new ItemStack(DeeperDarkerItems.GLOOMY_GEYSER));
                entries.add(new ItemStack(DeeperDarkerItems.ANCIENT_VASE));
                entries.add(new ItemStack(DeeperDarkerItems.CRYSTALLIZED_AMBER));
            })).build());

    public static void init() {
        DeeperDarker.LOGGER.debug("Registering Deeper and Darker item groups");
    }
}