package com.kyanite.deeperdarker.util.datagen;

import com.kyanite.deeperdarker.DeeperDarker;
import com.kyanite.deeperdarker.content.DDBlocks;
import com.kyanite.deeperdarker.content.DDEnchantments;
import com.kyanite.deeperdarker.content.DDEntities;
import com.kyanite.deeperdarker.content.DDItems;
import com.kyanite.deeperdarker.world.otherside.OthersideBiomes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.Util;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.concurrent.CompletableFuture;

public class DDENLanguageProvider extends FabricLanguageProvider {
    public DDENLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.deeperdarker", "Deeper and Darker");
        translationBuilder.add("item.deeperdarker.smithing_template.warden_upgrade.applies_to", "Netherite Equipment");
        translationBuilder.add("item.deeperdarker.smithing_template.warden_upgrade.ingredients", "Reinforced Echo Shard");
        translationBuilder.add("item.deeperdarker.smithing_template.warden_upgrade.base_slot_description", "Add netherite armor, weapon, or tool");
        translationBuilder.add("item.deeperdarker.smithing_template.warden_upgrade.additions_slot_description", "Add Reinforced Echo Shard");
        translationBuilder.add("upgrade.deeperdarker.warden_upgrade", "Warden Upgrade");
        translationBuilder.add(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE, "Smithing Template");
        translationBuilder.add(DDBlocks.ENRICHED_ECHO_LOG, "Enriched Echo Log");
        translationBuilder.add(DDBlocks.ECHO_LOG, "Echo Log");
        translationBuilder.add(DDBlocks.ECHO_WOOD, "Echo Wood");
        translationBuilder.add(DDBlocks.STRIPPED_ECHO_LOG, "Stripped Echo Log");
        translationBuilder.add(DDBlocks.STRIPPED_ECHO_WOOD, "Stripped Echo Wood");
        translationBuilder.add(DDBlocks.ECHO_LEAVES, "Echo Leaves");
        translationBuilder.add(DDBlocks.ECHO_PLANKS, "Echo Planks");
        translationBuilder.add(DDBlocks.ECHO_STAIRS, "Echo Stairs");
        translationBuilder.add(DDBlocks.ECHO_SLAB, "Echo Slab");
        translationBuilder.add(DDBlocks.ECHO_FENCE, "Echo Fence");
        translationBuilder.add(DDBlocks.ECHO_FENCE_GATE, "Echo Fence Gate");
        translationBuilder.add(DDBlocks.ECHO_DOOR, "Echo Door");
        translationBuilder.add(DDBlocks.ECHO_TRAPDOOR, "Echo Trapdoor");
        translationBuilder.add(DDBlocks.ECHO_PRESSURE_PLATE, "Echo Pressure Plate");
        translationBuilder.add(DDBlocks.ECHO_BUTTON, "Echo Button");
        translationBuilder.add(DDBlocks.ECHO_SIGN, "Echo Sign");
        translationBuilder.add(Util.makeDescriptionId("block", BuiltInRegistries.BLOCK.getKey(DDBlocks.ECHO_WALL_SIGN)), "Echo Wall Sign");
        translationBuilder.add(DDBlocks.ECHO_HANGING_SIGN, "Echo Hanging Sign");
        translationBuilder.add(Util.makeDescriptionId("block", BuiltInRegistries.BLOCK.getKey(DDBlocks.ECHO_WALL_HANGING_SIGN)), "Echo Wall Hanging Sign");
        translationBuilder.add(DDBlocks.ECHO_SAPLING, "Echo Sapling");
        translationBuilder.add(DDBlocks.SCULK_STONE, "Sculk Stone");
        translationBuilder.add(DDBlocks.SCULK_STONE_STAIRS, "Sculk Stone Stairs");
        translationBuilder.add(DDBlocks.SCULK_STONE_SLAB, "Sculk Stone Slab");
        translationBuilder.add(DDBlocks.SCULK_STONE_WALL, "Sculk Stone Wall");
        translationBuilder.add(DDBlocks.COBBLED_SCULK_STONE, "Cobbled Sculk Stone");
        translationBuilder.add(DDBlocks.COBBLED_SCULK_STONE_STAIRS, "Cobbled Sculk Stone Stairs");
        translationBuilder.add(DDBlocks.COBBLED_SCULK_STONE_SLAB, "Cobbled Sculk Stone Slab");
        translationBuilder.add(DDBlocks.COBBLED_SCULK_STONE_WALL, "Cobbled Sculk Stone Wall");
        translationBuilder.add(DDBlocks.POLISHED_SCULK_STONE, "Polished Sculk Stone");
        translationBuilder.add(DDBlocks.POLISHED_SCULK_STONE_STAIRS, "Polished Sculk Stone Stairs");
        translationBuilder.add(DDBlocks.POLISHED_SCULK_STONE_SLAB, "Polished Sculk Stone Slab");
        translationBuilder.add(DDBlocks.POLISHED_SCULK_STONE_WALL, "Polished Sculk Stone Wall");
        translationBuilder.add(DDBlocks.SCULK_STONE_BRICKS, "Sculk Stone Bricks");
        translationBuilder.add(DDBlocks.SCULK_STONE_BRICK_STAIRS, "Sculk Stone Brick Stairs");
        translationBuilder.add(DDBlocks.SCULK_STONE_BRICK_SLAB, "Sculk Stone Brick Slab");
        translationBuilder.add(DDBlocks.SCULK_STONE_BRICK_WALL, "Sculk Stone Brick Wall");
        translationBuilder.add(DDBlocks.SCULK_STONE_TILES, "Sculk Stone Tiles");
        translationBuilder.add(DDBlocks.SCULK_STONE_TILE_STAIRS, "Sculk Stone Tile Stairs");
        translationBuilder.add(DDBlocks.SCULK_STONE_TILE_SLAB, "Sculk Stone Tile Slab");
        translationBuilder.add(DDBlocks.SCULK_STONE_TILE_WALL, "Sculk Stone Tile Wall");
        translationBuilder.add(DDBlocks.SMOOTH_SCULK_STONE, "Smooth Sculk Stone");
        translationBuilder.add(DDBlocks.SMOOTH_SCULK_STONE_STAIRS, "Smooth Sculk Stone Stairs");
        translationBuilder.add(DDBlocks.SMOOTH_SCULK_STONE_SLAB, "Smooth Sculk Stone Slab");
        translationBuilder.add(DDBlocks.SMOOTH_SCULK_STONE_WALL, "Smooth Sculk Stone Wall");
        translationBuilder.add(DDBlocks.CUT_SCULK_STONE, "Cut Sculk Stone");
        translationBuilder.add(DDBlocks.CUT_SCULK_STONE_STAIRS, "Cut Sculk Stone Stairs");
        translationBuilder.add(DDBlocks.CUT_SCULK_STONE_SLAB, "Cut Sculk Stone Slab");
        translationBuilder.add(DDBlocks.CUT_SCULK_STONE_WALL, "Cut Sculk Stone Wall");
        translationBuilder.add(DDBlocks.CHISELED_SCULK_STONE, "Chiseled Sculk Stone");
        translationBuilder.add(DDBlocks.SCULK_GRIME, "Sculk Grime");
        translationBuilder.add(DDBlocks.SCULK_GRIME_BRICKS, "Sculk Grime Bricks");
        translationBuilder.add(DDBlocks.SCULK_GRIME_BRICK_STAIRS, "Sculk Grime Brick Stairs");
        translationBuilder.add(DDBlocks.SCULK_GRIME_BRICK_SLAB, "Sculk Grime Brick Slab");
        translationBuilder.add(DDBlocks.SCULK_GRIME_BRICK_WALL, "Sculk Grime Brick Wall");
        translationBuilder.add(DDBlocks.GLOOMSLATE, "Gloomslate");
        translationBuilder.add(DDBlocks.GLOOMSLATE_STAIRS, "Gloomslate Stairs");
        translationBuilder.add(DDBlocks.GLOOMSLATE_SLAB, "Gloomslate Slab");
        translationBuilder.add(DDBlocks.GLOOMSLATE_WALL, "Gloomslate Wall");
        translationBuilder.add(DDBlocks.COBBLED_GLOOMSLATE, "Cobbled Gloomslate");
        translationBuilder.add(DDBlocks.COBBLED_GLOOMSLATE_STAIRS, "Cobbled Gloomslate Stairs");
        translationBuilder.add(DDBlocks.COBBLED_GLOOMSLATE_SLAB, "Cobbled Gloomslate Slab");
        translationBuilder.add(DDBlocks.COBBLED_GLOOMSLATE_WALL, "Cobbled Gloomslate Wall");
        translationBuilder.add(DDBlocks.POLISHED_GLOOMSLATE, "Polished Gloomslate");
        translationBuilder.add(DDBlocks.POLISHED_GLOOMSLATE_STAIRS, "Polished Gloomslate Stairs");
        translationBuilder.add(DDBlocks.POLISHED_GLOOMSLATE_SLAB, "Polished Gloomslate Slab");
        translationBuilder.add(DDBlocks.POLISHED_GLOOMSLATE_WALL, "Polished Gloomslate Wall");
        translationBuilder.add(DDBlocks.GLOOMSLATE_BRICKS, "Gloomslate Bricks");
        translationBuilder.add(DDBlocks.GLOOMSLATE_BRICK_STAIRS, "Gloomslate Brick Stairs");
        translationBuilder.add(DDBlocks.GLOOMSLATE_BRICK_SLAB, "Gloomslate Brick Slab");
        translationBuilder.add(DDBlocks.GLOOMSLATE_BRICK_WALL, "Gloomslate Brick Wall");
        translationBuilder.add(DDBlocks.GLOOMSLATE_TILES, "Gloomslate Tiles");
        translationBuilder.add(DDBlocks.GLOOMSLATE_TILE_STAIRS, "Gloomslate Tile Stairs");
        translationBuilder.add(DDBlocks.GLOOMSLATE_TILE_SLAB, "Gloomslate Tile Slab");
        translationBuilder.add(DDBlocks.GLOOMSLATE_TILE_WALL, "Gloomslate Tile Wall");
        translationBuilder.add(DDBlocks.SMOOTH_GLOOMSLATE, "Smooth Gloomslate");
        translationBuilder.add(DDBlocks.SMOOTH_GLOOMSLATE_STAIRS, "Smooth Gloomslate Stairs");
        translationBuilder.add(DDBlocks.SMOOTH_GLOOMSLATE_SLAB, "Smooth Gloomslate Slab");
        translationBuilder.add(DDBlocks.SMOOTH_GLOOMSLATE_WALL, "Smooth Gloomslate Wall");
        translationBuilder.add(DDBlocks.CUT_GLOOMSLATE, "Cut Gloomslate");
        translationBuilder.add(DDBlocks.CUT_GLOOMSLATE_STAIRS, "Cut Gloomslate Stairs");
        translationBuilder.add(DDBlocks.CUT_GLOOMSLATE_SLAB, "Cut Gloomslate Slab");
        translationBuilder.add(DDBlocks.CUT_GLOOMSLATE_WALL, "Cut Gloomslate Wall");
        translationBuilder.add(DDBlocks.CHISELED_GLOOMSLATE, "Chiseled Gloomslate");
        translationBuilder.add(DDBlocks.ECHO_SOIL, "Echo Soil");
        translationBuilder.add(DDBlocks.SCULK_GLEAM, "Sculk Gleam");
        translationBuilder.add(DDBlocks.SCULK_JAW, "Sculk Jaw");
        translationBuilder.add(DDBlocks.SCULK_STONE_COAL_ORE, "Sculk Stone Coal Ore");
        translationBuilder.add(DDBlocks.SCULK_STONE_IRON_ORE, "Sculk Stone Iron Ore");
        translationBuilder.add(DDBlocks.SCULK_STONE_COPPER_ORE, "Sculk Stone Copper Ore");
        translationBuilder.add(DDBlocks.SCULK_STONE_GOLD_ORE, "Sculk Stone Gold Ore");
        translationBuilder.add(DDBlocks.SCULK_STONE_REDSTONE_ORE, "Sculk Stone Redstone Ore");
        translationBuilder.add(DDBlocks.SCULK_STONE_EMERALD_ORE, "Sculk Stone Emerald Ore");
        translationBuilder.add(DDBlocks.SCULK_STONE_LAPIS_ORE, "Sculk Stone Lapis Lazuli Ore");
        translationBuilder.add(DDBlocks.SCULK_STONE_DIAMOND_ORE, "Sculk Stone Diamond Ore");
        translationBuilder.add(DDBlocks.GLOOMSLATE_COAL_ORE, "Gloomslate Coal Ore");
        translationBuilder.add(DDBlocks.GLOOMSLATE_IRON_ORE, "Gloomslate Iron Ore");
        translationBuilder.add(DDBlocks.GLOOMSLATE_COPPER_ORE, "Gloomslate Copper Ore");
        translationBuilder.add(DDBlocks.GLOOMSLATE_GOLD_ORE, "Gloomslate Gold Ore");
        translationBuilder.add(DDBlocks.GLOOMSLATE_REDSTONE_ORE, "Gloomslate Redstone Ore");
        translationBuilder.add(DDBlocks.GLOOMSLATE_EMERALD_ORE, "Gloomslate Emerald Ore");
        translationBuilder.add(DDBlocks.GLOOMSLATE_LAPIS_ORE, "Gloomslate Lapis Lazuli Ore");
        translationBuilder.add(DDBlocks.GLOOMSLATE_DIAMOND_ORE, "Gloomslate Diamond Ore");
        translationBuilder.add(DDBlocks.SCULK_TENDRILS_PLANT, "Sculk Tendrils Plant");
        translationBuilder.add(DDBlocks.SCULK_TENDRILS, "Sculk Tendrils");
        translationBuilder.add(DDBlocks.SCULK_VINES_PLANT, "Sculk Vines Plant");
        translationBuilder.add(DDBlocks.SCULK_VINES, "Sculk Vines");
        translationBuilder.add(DDBlocks.GLOWING_ROOTS_PLANT, "Glowing Roots Plant");
        translationBuilder.add(DDBlocks.GLOWING_ROOTS, "Glowing Roots");
        translationBuilder.add(DDBlocks.GLOWING_VINES_PLANT, "Glowing Vines Plant");
        translationBuilder.add(DDBlocks.GLOWING_VINES, "Glowing Vines");
        translationBuilder.add(DDBlocks.GLOOMY_CACTUS, "Gloomy Cactus");
        translationBuilder.add(DDBlocks.GLOOMY_GRASS, "Gloomy Grass");
        translationBuilder.add(DDBlocks.GLOOMY_SCULK, "Gloomy Sculk");
        translationBuilder.add(DDBlocks.GLOOMY_GEYSER, "Gloomy Geyser");
        translationBuilder.add(DDBlocks.POTTED_ECHO_SAPLING, "Potted Echo Sapling");
        translationBuilder.add(DDBlocks.POTTED_BLOOMING_STEM, "Potted Blooming Stem");
        translationBuilder.add(DDBlocks.ANCIENT_VASE, "Ancient Vase");
        translationBuilder.add(DDBlocks.CRYSTALLIZED_AMBER, "Crystallized Amber");
        translationBuilder.add(DDBlocks.INFESTED_SCULK, "Infested Sculk");
        translationBuilder.add(DDBlocks.BLOOMING_SCULK_STONE, "Blooming Sculk Stone");
        translationBuilder.add(DDBlocks.BLOOMING_MOSS_BLOCK, "Blooming Moss Block");
        translationBuilder.add(DDBlocks.GLOWING_FLOWERS, "Glowing Flowers");
        translationBuilder.add(DDBlocks.GLOWING_GRASS, "Glowing Grass");
        translationBuilder.add(DDBlocks.BLOOMING_STEM, "Blooming Stem");
        translationBuilder.add(DDBlocks.STRIPPED_BLOOMING_STEM, "Stripped Blooming Stem");
        translationBuilder.add(DDBlocks.BLOOM_PLANKS, "Bloom Planks");
        translationBuilder.add(DDBlocks.BLOOM_STAIRS, "Bloom Stairs");
        translationBuilder.add(DDBlocks.BLOOM_SLAB, "Bloom Slab");
        translationBuilder.add(DDBlocks.BLOOM_FENCE, "Bloom Fence");
        translationBuilder.add(DDBlocks.BLOOM_FENCE_GATE, "Bloom Fence Gate");
        translationBuilder.add(DDBlocks.BLOOM_DOOR, "Bloom Door");
        translationBuilder.add(DDBlocks.BLOOM_TRAPDOOR, "Bloom Trapdoor");
        translationBuilder.add(DDBlocks.BLOOM_PRESSURE_PLATE, "Bloom Pressure Plate");
        translationBuilder.add(DDBlocks.BLOOM_BUTTON, "Bloom Button");
        translationBuilder.add(DDItems.BLOOM_BOAT, "Bloom Boat");
        translationBuilder.add(DDItems.BLOOM_CHEST_BOAT, "Bloom Boat with Chest");
        translationBuilder.add(DDBlocks.BLOOM_SIGN, "Bloom Sign");
        translationBuilder.add(Util.makeDescriptionId("block", BuiltInRegistries.BLOCK.getKey(DDBlocks.BLOOM_WALL_SIGN)), "Bloom Wall Sign");
        translationBuilder.add(DDBlocks.BLOOM_HANGING_SIGN, "Bloom Hanging Sign");
        translationBuilder.add(Util.makeDescriptionId("block", BuiltInRegistries.BLOCK.getKey(DDBlocks.BLOOM_WALL_HANGING_SIGN)), "Bloom Wall Hanging Sign");
        translationBuilder.add(DDBlocks.SOUNDPROOF_GLASS, "Soundproof Glass");
        translationBuilder.add(DDBlocks.OTHERSIDE_PORTAL, "Otherside Portal");
        translationBuilder.add(DDBlocks.ICE_LILY, "Ice Lily");
        translationBuilder.add(Util.makeDescriptionId("tooltips", BuiltInRegistries.BLOCK.getKey(DDBlocks.ICE_LILY)) + ".flowerless", "Flowerless");
        translationBuilder.add(DDBlocks.LILY_FLOWER, "Lily Flower");
        translationBuilder.add(DDItems.LILY_FLOWER, "Lily Flower");

        translationBuilder.add(DDItems.RESONARIUM, "Resonarium");
        translationBuilder.add(DDItems.RESONARIUM_HELMET, "Resonarium Helmet");
        translationBuilder.add(DDItems.RESONARIUM_CHESTPLATE, "Resonarium Chestplate");
        translationBuilder.add(DDItems.RESONARIUM_LEGGINGS, "Resonarium Leggings");
        translationBuilder.add(DDItems.RESONARIUM_BOOTS, "Resonarium Boots");
        translationBuilder.add(DDItems.RESONARIUM_SWORD, "Resonarium Sword");
        translationBuilder.add(DDItems.RESONARIUM_PICKAXE, "Resonarium Pickaxe");
        translationBuilder.add(DDItems.RESONARIUM_AXE, "Resonarium Axe");
        translationBuilder.add(DDItems.RESONARIUM_SHOVEL, "Resonarium Shovel");
        translationBuilder.add(DDItems.RESONARIUM_HOE, "Resonarium Hoe");
        translationBuilder.add(DDItems.WARDEN_HELMET, "Warden Helmet");
        translationBuilder.add(DDItems.WARDEN_CHESTPLATE, "Warden Chestplate");
        translationBuilder.add(DDItems.WARDEN_LEGGINGS, "Warden Leggings");
        translationBuilder.add(DDItems.WARDEN_BOOTS, "Warden Boots");
        translationBuilder.add(DDItems.WARDEN_SWORD, "Warden Sword");
        translationBuilder.add(DDItems.WARDEN_PICKAXE, "Warden Pickaxe");
        translationBuilder.add(DDItems.WARDEN_AXE, "Warden Axe");
        translationBuilder.add(DDItems.WARDEN_SHOVEL, "Warden Shovel");
        translationBuilder.add(DDItems.WARDEN_HOE, "Warden Hoe");
        translationBuilder.add("item." + DeeperDarker.MOD_ID + ".perks.immunity", "Immunity to:");
        translationBuilder.add("item." + DeeperDarker.MOD_ID + ".perks.dampens_vibrations", "Dampens vibrations");
        translationBuilder.add(DDItems.REINFORCED_ECHO_SHARD, "Reinforced Echo Shard");
        translationBuilder.add(DDItems.WARDEN_CARAPACE, "Warden Carapace");
        translationBuilder.add(DDItems.HEART_OF_THE_DEEP, "Heart of the Deep");
        translationBuilder.add(DDItems.SOUL_CRYSTAL, "Soul Crystal");
        translationBuilder.add(DDItems.SOUL_DUST, "Soul Dust");
        translationBuilder.add(DDItems.SCULK_BONE, "Sculk Bone");
        translationBuilder.add(DDItems.GRIME_BALL, "Grime Ball");
        translationBuilder.add(DDItems.GRIME_BRICK, "Grime Brick");
        translationBuilder.add(DDItems.ECHO_BOAT, "Echo Boat");
        translationBuilder.add(DDItems.ECHO_CHEST_BOAT, "Echo Boat with Chest");
        translationBuilder.add(DDItems.SCULK_TRANSMITTER, "Sculk Transmitter");
        translationBuilder.add(DDItems.ANGLER_FISH_SPAWN_EGG, "Angler Fish Spawn Egg");
        translationBuilder.add(DDItems.SCULK_SNAPPER_SPAWN_EGG, "Sculk Snapper Spawn Egg");
        translationBuilder.add(DDItems.SHATTERED_SPAWN_EGG, "Shattered Spawn Egg");
        translationBuilder.add(DDItems.SCULK_LEECH_SPAWN_EGG, "Sculk Leech Spawn Egg");
        translationBuilder.add(DDItems.SHRIEK_WORM_SPAWN_EGG, "Shriek Worm Spawn Egg");
        translationBuilder.add(DDItems.STALKER_SPAWN_EGG, "Stalker Spawn Egg");
        translationBuilder.add(DDItems.SCULK_CENTIPEDE_SPAWN_EGG, "Sculk Centipede Spawn Egg");
        translationBuilder.add(DDItems.SOUL_ELYTRA, "Soul Elytra");
        translationBuilder.add(DDItems.SOUL_ELYTRA.getDescriptionId() + ".boost", "Press %s to Boost");
        translationBuilder.add(DDItems.SOUL_ELYTRA.getDescriptionId() + ".boost_disabled", "Boost disabled");
        translationBuilder.add(DDItems.SONOROUS_STAFF, "Sonorous Staff");
        translationBuilder.add(DDItems.BLOOM_BERRIES, "Bloom Berries");

        translationBuilder.addEnchantment(DDEnchantments.CATALYSIS, "Catalysis");
        translationBuilder.add(Util.makeDescriptionId("enchantment", DDEnchantments.CATALYSIS.location()) + ".desc", "Spreads sculk when mobs are killed.");
        translationBuilder.addEnchantment(DDEnchantments.SCULK_SMITE, "Sculk Smite");
        translationBuilder.add(Util.makeDescriptionId("enchantment", DDEnchantments.SCULK_SMITE.location()) + ".desc", "Increases damage against sculk mobs such as Shattered and the Warden.");

        translationBuilder.add("block." + DeeperDarker.MOD_ID + ".linked", "Linked transmitter");
        translationBuilder.add("block." + DeeperDarker.MOD_ID + ".unlinked", "Unlinked transmitter");
        translationBuilder.add("block." + DeeperDarker.MOD_ID + ".not_transmittable", "Cannot link to block");
        translationBuilder.add("block." + DeeperDarker.MOD_ID + ".not_found", "The linked block is missing or unloaded");
        translationBuilder.add("tooltips." + DeeperDarker.MOD_ID + ".sculk_transmitter.linked", "Linked to %1$s");
        translationBuilder.add("tooltips." + DeeperDarker.MOD_ID + ".sculk_transmitter.location", "Located at %1$s, %2$s, %3$s");
        translationBuilder.add("tooltips." + DeeperDarker.MOD_ID + ".sculk_transmitter.not_linked", "Unlinked");

        translationBuilder.add("subtitles.ambience.otherside_portal.groan", "The Otherside forebodes");
        translationBuilder.add("subtitles.entity.sculk_snapper.ambient", "Sculk Snapper breathes");
        translationBuilder.add("subtitles.entity.sculk_snapper.bite", "Sculk Snapper bites");
        translationBuilder.add("subtitles.entity.sculk_snapper.hurt", "Sculk Snapper hurts");
        translationBuilder.add("subtitles.entity.sculk_snapper.sniff", "Sculk Snapper sniffs");
        translationBuilder.add("subtitles.item.transmitter.error", "Transmitter fails");
        translationBuilder.add("subtitles.item.transmitter.link", "Transmitter links");
        translationBuilder.add("subtitles.item.transmitter.open", "Transmitter transmits");
        translationBuilder.add("subtitles.item.transmitter.unlink", "Transmitter unlinks");

        translationBuilder.add(DDEntities.BOAT, "Boat");
        translationBuilder.add(DDEntities.CHEST_BOAT, "Boat with Chest");
        translationBuilder.add(DDEntities.ANGLER_FISH, "Angler Fish");
        translationBuilder.add(DDEntities.SCULK_SNAPPER, "Sculk Snapper");
        translationBuilder.add(DDEntities.SHATTERED, "Shattered");
        translationBuilder.add(DDEntities.SCULK_LEECH, "Sculk Leech");
        translationBuilder.add(DDEntities.SHRIEK_WORM, "Shriek Worm");
        translationBuilder.add(DDEntities.STALKER, "Stalker");
        translationBuilder.add(DDEntities.SCULK_CENTIPEDE, "Sculk Centipede");

        translationBuilder.add("effect.deeperdarker.sculk_affinity", "Sculk Affinity");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.sculk_affinity", "Arrow of Sculk Affinity");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.long_sculk_affinity", "Arrow of Sculk Affinity");
        translationBuilder.add("item.minecraft.potion.effect.sculk_affinity", "Potion of Sculk Affinity");
        translationBuilder.add("item.minecraft.potion.effect.long_sculk_affinity", "Potion of Sculk Affinity");
        translationBuilder.add("item.minecraft.splash_potion.effect.sculk_affinity", "Splash Potion of Sculk Affinity");
        translationBuilder.add("item.minecraft.splash_potion.effect.long_sculk_affinity", "Splash Potion of Sculk Affinity");
        translationBuilder.add("item.minecraft.lingering_potion.effect.sculk_affinity", "Lingering Potion of Sculk Affinity");
        translationBuilder.add("item.minecraft.lingering_potion.effect.long_sculk_affinity", "Lingering Potion of Sculk Affinity");
        translationBuilder.add("subtitles.ambience.otherside", "Warden dreams");
        translationBuilder.add("subtitles.entity.shattered.ambient", "Shattered growls");
        translationBuilder.add("subtitles.entity.shattered.hurt", "Shattered hurts");
        translationBuilder.add("subtitles.entity.shattered.death", "Shattered dies");
        translationBuilder.add("subtitles.entity.sculk_leech.hurt", "Sculk Leech hurts");
        translationBuilder.add("subtitles.entity.shriek_worm.ambient", "Shriek Worm cries");
        translationBuilder.add("subtitles.entity.shriek_worm.hurt", "Shriek Worm hurts");
        translationBuilder.add("subtitles.entity.shriek_worm.death", "Shriek Worm dies");
        translationBuilder.add("subtitles.entity.stalker.ambient", "Stalker chirps");
        translationBuilder.add("subtitles.entity.stalker.hurt", "Stalker hurts");
        translationBuilder.add("subtitles.entity.stalker.death", "Stalker dies");

        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".root.title", "Sculk Story");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".root.description", "You feel something pulling you towards the source...");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".find_ancient_city.title", "A Metropolis of Restless Souls");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".find_ancient_city.description", "Find an Ancient City");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".kill_warden.title", "Phantom Thief");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".kill_warden.description", "Slay the Warden and take its heart");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".enter_otherside.title", "Below the Bedrock");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".enter_otherside.description", "Deep below the bedrock, the darkness awaits");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".find_ancient_temple.title", "Abyssal Descent");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".find_ancient_temple.description", "Explore the depths for a temple");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".obtain_sculk_transmitter.title", "Remote Storage");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".obtain_sculk_transmitter.description", "Acquire a Sculk Transmitter");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".obtain_sonorous_staff.title", "Noise Complaint");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".obtain_sonorous_staff.description", "Acquire a Sonorous Staff");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".explore_otherside.title", "Echolocation");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".explore_otherside.description", "Explore all Otherside biomes");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".kill_all_sculk_mobs.title", "Sculk Slayer");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".kill_all_sculk_mobs.description", "Kill one of every Sculk monster");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".obtain_reinforced_echo_shard.title", "Sculk Engineer");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".obtain_reinforced_echo_shard.description", "Reinforce an Echo Shard");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".warden_armor.title", "Cover Me with Sculk");
        translationBuilder.add("advancements." + DeeperDarker.MOD_ID + ".warden_armor.description", "Protect yourself with a full set of Warden Armor");

        translationBuilder.add("biome." + OthersideBiomes.DEEPLANDS.location().getNamespace() + "." + OthersideBiomes.DEEPLANDS.location().getPath(), "Deeplands");
        translationBuilder.add("biome." + OthersideBiomes.ECHOING_FOREST.location().getNamespace() + "." + OthersideBiomes.ECHOING_FOREST.location().getPath(), "Echoing Forest");
        translationBuilder.add("biome." + OthersideBiomes.OVERCAST_COLUMNS.location().getNamespace() + "." + OthersideBiomes.OVERCAST_COLUMNS.location().getPath(), "Overcast Columns");
        translationBuilder.add("biome." + OthersideBiomes.BLOOMING_CAVERNS.location().getNamespace() + "." + OthersideBiomes.BLOOMING_CAVERNS.location().getPath(), "Blooming Caverns");

        translationBuilder.add("text.config.deeperdarker.title", "Deeper and Darker");
        translationBuilder.add("text.config.deeperdarker.category.server", "Server");
        translationBuilder.add("text.config.deeperdarker.category.client", "Client");
        translationBuilder.add("text.config.deeperdarker.option.client.wardenHeartPulses", "Heart of the Deep Pulses");
        translationBuilder.add("text.config.deeperdarker.option.client.wardenHeartPulses.tooltip", "Determines if the Heart of the Deep should\nemit a random pulsing sound.");
        translationBuilder.add("text.config.deeperdarker.option.client.renderWardenHelmetHorns", "Render Warden Helmet Horns");
        translationBuilder.add("text.config.deeperdarker.option.client.renderWardenHelmetHorns.tooltip", "Determines if the horns in the Warden\nHelmet should be rendered.");
        translationBuilder.add("text.config.deeperdarker.option.client.changePhantomTextures", "Change Phantom Textures");
        translationBuilder.add("text.config.deeperdarker.option.client.changePhantomTextures.tooltip", "Determines if Phantoms should have a\ndifferent texture in the Deeplands.");
        translationBuilder.add("text.config.deeperdarker.option.client.paintingFix", "Fix Ancient Paintings");
        translationBuilder.add("text.config.deeperdarker.option.client.paintingFix.tooltip", "Fixes desync that happens upon placing ancient\npaintings in places where they do not fit.");
        translationBuilder.add("text.config.deeperdarker.option.server.spawnSomethingFromAncientVaseChance", "Ancient Vase Mob Spawn Chance");
        translationBuilder.add("text.config.deeperdarker.option.server.spawnSomethingFromAncientVaseChance.tooltip", "Defines the chance of a mob (Stalker or\nSculk Leech) spawning from an Ancient Vase.");
        translationBuilder.add("text.config.deeperdarker.option.server.sculkLeechesFromAncientVaseChance", "Sculk Leech Spawn Chance");
        translationBuilder.add("text.config.deeperdarker.option.server.sculkLeechesFromAncientVaseChance.tooltip", "Defines the chance of Sculk Leeches spawning\nfrom an Ancient Vase if the setting above ends up\nbeing true. If a mob should spawn and this\nsetting ends up being false, a Stalker will spawn.");
        translationBuilder.add("text.config.deeperdarker.option.server.geysersApplySlowFalling", "Geysers Apply Slow Falling");
        translationBuilder.add("text.config.deeperdarker.option.server.geysersApplySlowFalling.tooltip", "Determines if stepping on a Gloomy Geyser\ngrants the player Slow Falling.");
        translationBuilder.add("text.config.deeperdarker.option.server.portalMinWidth", "Minimum Portal Width");
        translationBuilder.add("text.config.deeperdarker.option.server.portalMinWidth.tooltip", "Defines the minimum width (not counting the\nframe) for an Otherside portal to be valid.");
        translationBuilder.add("text.config.deeperdarker.option.server.portalMinHeight", "Minimum Portal Height");
        translationBuilder.add("text.config.deeperdarker.option.server.portalMinHeight.tooltip", "Defines the minimum height (not counting the\nframe) for an Otherside portal to be valid.");
        translationBuilder.add("text.config.deeperdarker.option.server.portalMaxWidth", "Maximum Portal Width");
        translationBuilder.add("text.config.deeperdarker.option.server.portalMaxWidth.tooltip", "Defines the maximum width (not counting the\nframe) for an Otherside portal to be valid.");
        translationBuilder.add("text.config.deeperdarker.option.server.portalMaxHeight", "Maximum Portal Height");
        translationBuilder.add("text.config.deeperdarker.option.server.portalMaxHeight.tooltip", "Defines the maximum height (not counting the\nframe) for an Otherside portal to be valid.");
        translationBuilder.add("text.config.deeperdarker.option.server.portalMinSearchHeight", "Minimum Portal Search Height");
        translationBuilder.add("text.config.deeperdarker.option.server.portalMinSearchHeight.tooltip", "Defines the lowest Y coordinate to search to\ngenerate an Otherside portal. We recommend\nthat you set this to a value greater than or\nequal to 0 and less than the maximum portal\nsearch height.");
        translationBuilder.add("text.config.deeperdarker.option.server.portalMaxSearchHeight", "Maximum Portal Search Height");
        translationBuilder.add("text.config.deeperdarker.option.server.portalMaxSearchHeight.tooltip", "Defines the highest Y coordinate to search to\ngenerate an Otherside portal. We recommend\nthat you set this to a value greater than or\nequal to 0 and less than or equal to (126 - the\ngenerated portal's height).");
        translationBuilder.add("text.config.deeperdarker.option.server.generatedPortalWidth", "Generated Portal Width");
        translationBuilder.add("text.config.deeperdarker.option.server.generatedPortalWidth.tooltip", "The width of Otherside portals generated when\ntraveling through dimensions and no portal is\navailable. Making this too large may cause problems.");
        translationBuilder.add("text.config.deeperdarker.option.server.generatedPortalHeight", "Generated Portal Height");
        translationBuilder.add("text.config.deeperdarker.option.server.generatedPortalHeight.tooltip", "The height of Otherside portals generated when\ntraveling through dimensions and no portal is\navailable. Making this too large may cause problems.");
        translationBuilder.add("text.config.deeperdarker.option.server.geyserLaunchVelocity", "Gloomy Geyser Launch Velocity");
        translationBuilder.add("text.config.deeperdarker.option.server.geyserLaunchVelocity.tooltip", "Defines the velocity applied when a player is\nlaunched by a Gloomy Geyser.");
        translationBuilder.add("text.config.deeperdarker.option.server.sonorousStaffDamage", "Sonorous Staff Damage");
        translationBuilder.add("text.config.deeperdarker.option.server.sonorousStaffDamage.tooltip", "Determines the damage of the Sonorous Staff's sonic\nboom.");
        translationBuilder.add("text.config.deeperdarker.option.server.sonorousStaffKnockback", "Sonorous Staff Knockback");
        translationBuilder.add("text.config.deeperdarker.option.server.sonorousStaffKnockback.tooltip", "Determines the knockback of the Sonorous Staff's\nsonic boom applied to living entities.");
        translationBuilder.add("text.config.deeperdarker.option.server.sonorousStaffCooldown", "Sonorous Staff Cooldown");
        translationBuilder.add("text.config.deeperdarker.option.server.sonorousStaffCooldown.tooltip", "Determines the cooldown of the Sonorous Staff\nbefore the player can use it again.");
        translationBuilder.add("text.config.deeperdarker.option.server.soulElytraCooldown", "Soul Elytra Cooldown");
        translationBuilder.add("text.config.deeperdarker.option.server.soulElytraCooldown.tooltip", "Determines the cooldown of the boost provided when\nboosting with Soul Elytra. Set to -1 to disable boost.");
        translationBuilder.add("text.config.deeperdarker.option.server.soulElytraBoostStrength", "Soul Elytra Boost Strength");
        translationBuilder.add("text.config.deeperdarker.option.server.soulElytraBoostStrength.tooltip", "Determines the strength of the boost provided\nwhen boosting with Soul Elytra.");
        translationBuilder.add("text.config.deeperdarker.option.server.snapperDropLimit", "Sculk Snapper Drop Limit");
        translationBuilder.add("text.config.deeperdarker.option.server.snapperDropLimit.tooltip", "Determines the maximum amount of books dropped\nby each Sculk Snapper. Set to -1 for infinite books.");

        translationBuilder.add("death.attack." + DeeperDarker.MOD_ID + ".bite", "%s was devoured");
        translationBuilder.add("death.attack." + DeeperDarker.MOD_ID + ".ring", "%s was given a deadly case of tinnitus by %s");

        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".abstraction.title", "Abstraction");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".abstraction.author", "Pedro Ricardo");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".millipede.title", "Millipede");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".millipede.author", "Pedro Ricardo");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".clouds.title", "Clouds");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".clouds.author", "Pedro Ricardo");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".ooze.title", "Ooze");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".ooze.author", "Pedro Ricardo");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".adventure.title", "Adventure");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".adventure.author", "Pedro Ricardo");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".echoer.title", "Echoer");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".echoer.author", "Pedro Ricardo");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".carrot.title", "Back to Your Roots");
        translationBuilder.add("painting." + DeeperDarker.MOD_ID + ".carrot.author", "Pedro Ricardo");

        translationBuilder.add("key.categories." + DeeperDarker.MOD_ID, "Deeper and Darker");
        translationBuilder.add("key." + DeeperDarker.MOD_ID + ".boost", "Boost Soul Elytra");
        translationBuilder.add("key." + DeeperDarker.MOD_ID + ".transmit", "Use Sculk Transmitter");
    }
}