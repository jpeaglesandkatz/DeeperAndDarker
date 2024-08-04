package com.kyanite.deeperdarker.datagen.data;

import com.kyanite.deeperdarker.DeeperDarker;
import com.kyanite.deeperdarker.content.DDBlocks;
import com.kyanite.deeperdarker.content.DDItems;
import com.kyanite.deeperdarker.util.DDTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class DDRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public DDRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        addCraftingRecipes(recipeOutput);
        addCookingRecipes(recipeOutput);
        addStonecuttingRecipes(recipeOutput);
        addSmithingRecipes(recipeOutput);
    }

    private void addCraftingRecipes(RecipeOutput output) {
        woodenRecipes(output, DDTags.Items.ECHO_LOGS, DDBlocks.STRIPPED_ECHO_LOG, DDBlocks.ECHO_PLANKS, DDBlocks.ECHO_STAIRS, DDBlocks.ECHO_SLAB, DDBlocks.ECHO_FENCE, DDBlocks.ECHO_FENCE_GATE, DDBlocks.ECHO_DOOR, DDBlocks.ECHO_TRAPDOOR, DDBlocks.ECHO_PRESSURE_PLATE, DDBlocks.ECHO_BUTTON, DDItems.ECHO_SIGN, DDItems.ECHO_HANGING_SIGN, DDItems.ECHO_BOAT, DDItems.ECHO_CHEST_BOAT);
        woodFromLogs(output, DDBlocks.ECHO_WOOD.get(), DDBlocks.ECHO_LOG.get());
        woodFromLogs(output, DDBlocks.STRIPPED_ECHO_WOOD.get(), DDBlocks.STRIPPED_ECHO_LOG.get());
        woodenRecipes(output, DDTags.Items.BLOOM_STEMS, DDBlocks.STRIPPED_BLOOMING_STEM, DDBlocks.BLOOM_PLANKS, DDBlocks.BLOOM_STAIRS, DDBlocks.BLOOM_SLAB, DDBlocks.BLOOM_FENCE, DDBlocks.BLOOM_FENCE_GATE, DDBlocks.BLOOM_DOOR, DDBlocks.BLOOM_TRAPDOOR, DDBlocks.BLOOM_PRESSURE_PLATE, DDBlocks.BLOOM_BUTTON, DDItems.BLOOM_SIGN, DDItems.BLOOM_HANGING_SIGN, DDItems.BLOOM_BOAT, DDItems.BLOOM_CHEST_BOAT);

        stairBuilder(DDBlocks.SCULK_STONE_STAIRS.get(), Ingredient.of(DDBlocks.SCULK_STONE.get())).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_SLAB.get(), DDBlocks.SCULK_STONE.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_WALL.get(), DDBlocks.SCULK_STONE.get());

        stairBuilder(DDBlocks.COBBLED_SCULK_STONE_STAIRS.get(), Ingredient.of(DDBlocks.COBBLED_SCULK_STONE.get())).unlockedBy("has_cobbled_sculk_stone", has(DDBlocks.COBBLED_SCULK_STONE.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_SCULK_STONE_SLAB.get(), DDBlocks.COBBLED_SCULK_STONE.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_SCULK_STONE_WALL.get(), DDBlocks.COBBLED_SCULK_STONE.get());

        polished(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_SCULK_STONE.get(), DDBlocks.COBBLED_SCULK_STONE.get());
        stairBuilder(DDBlocks.POLISHED_SCULK_STONE_STAIRS.get(), Ingredient.of(DDBlocks.POLISHED_SCULK_STONE.get())).unlockedBy("has_polished_sculk_stone", has(DDBlocks.POLISHED_SCULK_STONE.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_SCULK_STONE_SLAB.get(), DDBlocks.POLISHED_SCULK_STONE.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_SCULK_STONE_WALL.get(), DDBlocks.POLISHED_SCULK_STONE.get());

        polished(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_BRICKS.get(), DDBlocks.POLISHED_SCULK_STONE.get());
        stairBuilder(DDBlocks.SCULK_STONE_BRICK_STAIRS.get(), Ingredient.of(DDBlocks.SCULK_STONE_BRICKS.get())).unlockedBy("has_sculk_stone_bricks", has(DDBlocks.SCULK_STONE_BRICKS.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_BRICK_SLAB.get(), DDBlocks.SCULK_STONE_BRICKS.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_BRICK_WALL.get(), DDBlocks.SCULK_STONE_BRICKS.get());

        polished(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_TILES.get(), DDBlocks.SCULK_STONE_BRICKS.get());
        stairBuilder(DDBlocks.SCULK_STONE_TILE_STAIRS.get(), Ingredient.of(DDBlocks.SCULK_STONE_TILES.get())).unlockedBy("has_sculk_stone_tiles", has(DDBlocks.SCULK_STONE_TILES.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_TILE_SLAB.get(), DDBlocks.SCULK_STONE_TILES.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_TILE_WALL.get(), DDBlocks.SCULK_STONE_TILES.get());

        stairBuilder(DDBlocks.SMOOTH_SCULK_STONE_STAIRS.get(), Ingredient.of(DDBlocks.SMOOTH_SCULK_STONE.get())).unlockedBy("has_smooth_sculk_stone", has(DDBlocks.SMOOTH_SCULK_STONE.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_SCULK_STONE_SLAB.get(), DDBlocks.SMOOTH_SCULK_STONE.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_SCULK_STONE_WALL.get(), DDBlocks.SMOOTH_SCULK_STONE.get());

        polished(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_SCULK_STONE.get(), DDBlocks.SMOOTH_SCULK_STONE.get());
        stairBuilder(DDBlocks.CUT_SCULK_STONE_STAIRS.get(), Ingredient.of(DDBlocks.CUT_SCULK_STONE.get())).unlockedBy("has_cut_sculk_stone", has(DDBlocks.CUT_SCULK_STONE.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_SCULK_STONE_SLAB.get(), DDBlocks.CUT_SCULK_STONE.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_SCULK_STONE_WALL.get(), DDBlocks.CUT_SCULK_STONE.get());

        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, DDBlocks.CHISELED_SCULK_STONE.get(), Ingredient.of(DDBlocks.SCULK_STONE_BRICK_SLAB.get())).unlockedBy("has_sculk_stone_slab", has(DDBlocks.SCULK_STONE_BRICK_SLAB.get())).save(output);

        stairBuilder(DDBlocks.GLOOMSLATE_STAIRS.get(), Ingredient.of(DDBlocks.GLOOMSLATE.get())).unlockedBy("has_gloomslate", has(DDBlocks.GLOOMSLATE.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_SLAB.get(), DDBlocks.GLOOMSLATE.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_WALL.get(), DDBlocks.GLOOMSLATE.get());

        stairBuilder(DDBlocks.COBBLED_GLOOMSLATE_STAIRS.get(), Ingredient.of(DDBlocks.COBBLED_GLOOMSLATE.get())).unlockedBy("has_cobbled_gloomslate", has(DDBlocks.COBBLED_GLOOMSLATE.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_GLOOMSLATE_SLAB.get(), DDBlocks.COBBLED_GLOOMSLATE.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_GLOOMSLATE_WALL.get(), DDBlocks.COBBLED_GLOOMSLATE.get());

        polished(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_GLOOMSLATE.get(), DDBlocks.COBBLED_GLOOMSLATE.get());
        stairBuilder(DDBlocks.POLISHED_GLOOMSLATE_STAIRS.get(), Ingredient.of(DDBlocks.POLISHED_GLOOMSLATE.get())).unlockedBy("has_polished_gloomslate", has(DDBlocks.POLISHED_GLOOMSLATE.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_GLOOMSLATE_SLAB.get(), DDBlocks.POLISHED_GLOOMSLATE.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_GLOOMSLATE_WALL.get(), DDBlocks.POLISHED_GLOOMSLATE.get());

        polished(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_BRICKS.get(), DDBlocks.POLISHED_GLOOMSLATE.get());
        stairBuilder(DDBlocks.GLOOMSLATE_BRICK_STAIRS.get(), Ingredient.of(DDBlocks.GLOOMSLATE_BRICKS.get())).unlockedBy("has_gloomslate_bricks", has(DDBlocks.GLOOMSLATE_BRICKS.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_BRICK_SLAB.get(), DDBlocks.GLOOMSLATE_BRICKS.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_BRICK_WALL.get(), DDBlocks.GLOOMSLATE_BRICKS.get());

        polished(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_TILES.get(), DDBlocks.GLOOMSLATE_BRICKS.get());
        stairBuilder(DDBlocks.GLOOMSLATE_TILE_STAIRS.get(), Ingredient.of(DDBlocks.GLOOMSLATE_TILES.get())).unlockedBy("has_gloomslate_tiles", has(DDBlocks.GLOOMSLATE_TILES.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_TILE_SLAB.get(), DDBlocks.GLOOMSLATE_TILES.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_TILE_WALL.get(), DDBlocks.GLOOMSLATE_TILES.get());

        stairBuilder(DDBlocks.SMOOTH_GLOOMSLATE_STAIRS.get(), Ingredient.of(DDBlocks.SMOOTH_GLOOMSLATE.get())).unlockedBy("has_smooth_gloomslate", has(DDBlocks.SMOOTH_GLOOMSLATE.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_GLOOMSLATE_SLAB.get(), DDBlocks.SMOOTH_GLOOMSLATE.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_GLOOMSLATE_WALL.get(), DDBlocks.SMOOTH_GLOOMSLATE.get());

        polished(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_GLOOMSLATE.get(), DDBlocks.SMOOTH_GLOOMSLATE.get());
        stairBuilder(DDBlocks.CUT_GLOOMSLATE_STAIRS.get(), Ingredient.of(DDBlocks.CUT_GLOOMSLATE.get())).unlockedBy("has_cut_gloomslate", has(DDBlocks.CUT_GLOOMSLATE.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_GLOOMSLATE_SLAB.get(), DDBlocks.CUT_GLOOMSLATE.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_GLOOMSLATE_WALL.get(), DDBlocks.CUT_GLOOMSLATE.get());

        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, DDBlocks.CHISELED_GLOOMSLATE.get(), Ingredient.of(DDBlocks.GLOOMSLATE_BRICK_SLAB.get())).unlockedBy("has_gloomslate_slab", has(DDBlocks.GLOOMSLATE_BRICK_SLAB.get())).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_GRIME.get()).define('G', DDItems.GRIME_BALL.get()).pattern("GG").pattern("GG").unlockedBy("has_grime_ball", has(DDItems.GRIME_BALL.get())).save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_GRIME_BRICKS.get()).define('G', DDItems.GRIME_BRICK.get()).pattern("GG").pattern("GG").unlockedBy("has_grime_brick", has(DDItems.GRIME_BRICK.get())).save(output);
        stairBuilder(DDBlocks.SCULK_GRIME_BRICK_STAIRS.get(), Ingredient.of(DDBlocks.SCULK_GRIME_BRICKS.get())).unlockedBy("has_sculk_grime_bricks", has(DDBlocks.SCULK_GRIME_BRICKS.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_GRIME_BRICK_SLAB.get(), DDBlocks.SCULK_GRIME_BRICKS.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_GRIME_BRICK_WALL.get(), DDBlocks.SCULK_GRIME_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, DDItems.SOUL_ELYTRA.get())
                .define('S', DDItems.SOUL_CRYSTAL.get()).define('D', DDItems.SOUL_DUST.get()).define('B', DDItems.SCULK_BONE.get()).define('E', Items.ELYTRA)
                .pattern("BSB").pattern("DED").pattern("B B")
                .unlockedBy("has_elytra", has(Items.ELYTRA)).save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DDItems.REINFORCED_ECHO_SHARD.get())
                .define('P', Items.PHANTOM_MEMBRANE).define('C', DDItems.WARDEN_CARAPACE.get()).define('E', Items.ECHO_SHARD)
                .pattern("PCP").pattern("CEC").pattern("PCP")
                .unlockedBy(getHasName(DDItems.WARDEN_CARAPACE), has(DDItems.WARDEN_CARAPACE.get())).save(output);
        copySmithingTemplate(output, DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE.get(), Blocks.SCULK);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, DDItems.SONOROUS_STAFF)
                .define('B', DDItems.SCULK_BONE).define('H', DDItems.HEART_OF_THE_DEEP).define('R', Items.REDSTONE).define('S', DDItems.REINFORCED_ECHO_SHARD).define('G', Items.GLOWSTONE_DUST)
                .pattern(" RS").pattern(" HG").pattern("B  ")
                .unlockedBy(getHasName(DDItems.SCULK_BONE), has(DDItems.SCULK_BONE))
                .unlockedBy(getHasName(DDItems.REINFORCED_ECHO_SHARD), has(DDItems.REINFORCED_ECHO_SHARD))
                .unlockedBy(getHasName(DDItems.HEART_OF_THE_DEEP), has(DDItems.HEART_OF_THE_DEEP)).save(output);
    }

    private void addCookingRecipes(RecipeOutput output) {
        smelting(DDBlocks.COBBLED_SCULK_STONE.get(), RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE.get(), 0.1f, output);
        smelting(DDBlocks.SCULK_STONE.get(), RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_SCULK_STONE.get(), 0.1f, output);
        smelting(DDBlocks.COBBLED_GLOOMSLATE.get(), RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE.get(), 0.1f, output);
        smelting(DDBlocks.GLOOMSLATE.get(), RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_GLOOMSLATE.get(), 0.1f, output);

        smelting(DDBlocks.GLOOMY_CACTUS.get(), RecipeCategory.MISC, Items.ORANGE_DYE, 1f, output);
        smelting(DDItems.GRIME_BALL.get(), RecipeCategory.MISC, DDItems.GRIME_BRICK.get(), 0.2f, output);

        oreSmelting(DDBlocks.SCULK_STONE_COAL_ORE.get(), RecipeCategory.MISC, Items.COAL, 0.1f, "coal", output);
        oreSmelting(DDBlocks.SCULK_STONE_IRON_ORE.get(), RecipeCategory.MISC, Items.IRON_INGOT, 0.7f, "iron_ingot", output);
        oreSmelting(DDBlocks.SCULK_STONE_COPPER_ORE.get(), RecipeCategory.MISC, Items.COPPER_INGOT, 0.7f, "copper_ingot", output);
        oreSmelting(DDBlocks.SCULK_STONE_GOLD_ORE.get(), RecipeCategory.MISC, Items.GOLD_INGOT, 1, "gold_ingot", output);
        oreSmelting(DDBlocks.SCULK_STONE_REDSTONE_ORE.get(), RecipeCategory.REDSTONE, Items.REDSTONE, 0.7f, "redstone", output);
        oreSmelting(DDBlocks.SCULK_STONE_EMERALD_ORE.get(), RecipeCategory.MISC, Items.EMERALD, 1, "emerald", output);
        oreSmelting(DDBlocks.SCULK_STONE_LAPIS_ORE.get(), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2f, "lapis_lazuli", output);
        oreSmelting(DDBlocks.SCULK_STONE_DIAMOND_ORE.get(), RecipeCategory.MISC, Items.DIAMOND, 1, "diamond", output);
        oreSmelting(DDBlocks.GLOOMSLATE_COAL_ORE.get(), RecipeCategory.MISC, Items.COAL, 0.1f, "coal", output);
        oreSmelting(DDBlocks.GLOOMSLATE_IRON_ORE.get(), RecipeCategory.MISC, Items.IRON_INGOT, 0.7f, "iron_ingot", output);
        oreSmelting(DDBlocks.GLOOMSLATE_COPPER_ORE.get(), RecipeCategory.MISC, Items.COPPER_INGOT, 0.7f, "copper_ingot", output);
        oreSmelting(DDBlocks.GLOOMSLATE_GOLD_ORE.get(), RecipeCategory.MISC, Items.GOLD_INGOT, 1, "gold_ingot", output);
        oreSmelting(DDBlocks.GLOOMSLATE_REDSTONE_ORE.get(), RecipeCategory.REDSTONE, Items.REDSTONE, 0.7f, "redstone", output);
        oreSmelting(DDBlocks.GLOOMSLATE_EMERALD_ORE.get(), RecipeCategory.MISC, Items.EMERALD, 1, "emerald", output);
        oreSmelting(DDBlocks.GLOOMSLATE_LAPIS_ORE.get(), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2f, "lapis_lazuli", output);
        oreSmelting(DDBlocks.GLOOMSLATE_DIAMOND_ORE.get(), RecipeCategory.MISC, Items.DIAMOND, 1, "diamond", output);

        oreBlasting(DDBlocks.SCULK_STONE_COAL_ORE.get(), RecipeCategory.MISC, Items.COAL, 0.1f, "coal", output);
        oreBlasting(DDBlocks.SCULK_STONE_IRON_ORE.get(), RecipeCategory.MISC, Items.IRON_INGOT, 0.7f, "iron_ingot", output);
        oreBlasting(DDBlocks.SCULK_STONE_COPPER_ORE.get(), RecipeCategory.MISC, Items.COPPER_INGOT, 0.7f, "copper_ingot", output);
        oreBlasting(DDBlocks.SCULK_STONE_GOLD_ORE.get(), RecipeCategory.MISC, Items.GOLD_INGOT, 1, "gold_ingot", output);
        oreBlasting(DDBlocks.SCULK_STONE_REDSTONE_ORE.get(), RecipeCategory.REDSTONE, Items.REDSTONE, 0.7f, "redstone", output);
        oreBlasting(DDBlocks.SCULK_STONE_EMERALD_ORE.get(), RecipeCategory.MISC, Items.EMERALD, 1, "emerald", output);
        oreBlasting(DDBlocks.SCULK_STONE_LAPIS_ORE.get(), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2f, "lapis_lazuli", output);
        oreBlasting(DDBlocks.SCULK_STONE_DIAMOND_ORE.get(), RecipeCategory.MISC, Items.DIAMOND, 1, "diamond", output);
        oreBlasting(DDBlocks.GLOOMSLATE_COAL_ORE.get(), RecipeCategory.MISC, Items.COAL, 0.1f, "coal", output);
        oreBlasting(DDBlocks.GLOOMSLATE_IRON_ORE.get(), RecipeCategory.MISC, Items.IRON_INGOT, 0.7f, "iron_ingot", output);
        oreBlasting(DDBlocks.GLOOMSLATE_COPPER_ORE.get(), RecipeCategory.MISC, Items.COPPER_INGOT, 0.7f, "copper_ingot", output);
        oreBlasting(DDBlocks.GLOOMSLATE_GOLD_ORE.get(), RecipeCategory.MISC, Items.GOLD_INGOT, 1, "gold_ingot", output);
        oreBlasting(DDBlocks.GLOOMSLATE_REDSTONE_ORE.get(), RecipeCategory.REDSTONE, Items.REDSTONE, 0.7f, "redstone", output);
        oreBlasting(DDBlocks.GLOOMSLATE_EMERALD_ORE.get(), RecipeCategory.MISC, Items.EMERALD, 1, "emerald", output);
        oreBlasting(DDBlocks.GLOOMSLATE_LAPIS_ORE.get(), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2f, "lapis_lazuli", output);
        oreBlasting(DDBlocks.GLOOMSLATE_DIAMOND_ORE.get(), RecipeCategory.MISC, Items.DIAMOND, 1, "diamond", output);
    }

    private void addStonecuttingRecipes(RecipeOutput output) {
        stonecuttingRecipe(output, DDBlocks.SCULK_STONE.get(), DDBlocks.SCULK_STONE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.SCULK_STONE.get(), DDBlocks.SCULK_STONE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.SCULK_STONE.get(), DDBlocks.SCULK_STONE_WALL.get());

        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.COBBLED_SCULK_STONE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.COBBLED_SCULK_STONE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.COBBLED_SCULK_STONE_WALL.get());

        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.POLISHED_SCULK_STONE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.POLISHED_SCULK_STONE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.POLISHED_SCULK_STONE_WALL.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.POLISHED_SCULK_STONE.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_SCULK_STONE.get(), DDBlocks.POLISHED_SCULK_STONE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_SCULK_STONE.get(), DDBlocks.POLISHED_SCULK_STONE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.POLISHED_SCULK_STONE.get(), DDBlocks.POLISHED_SCULK_STONE_WALL.get());

        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_BRICK_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_BRICK_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_BRICK_WALL.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_BRICKS.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_BRICK_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_BRICK_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.POLISHED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_BRICK_WALL.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_BRICKS.get());
        stonecuttingRecipe(output, DDBlocks.SCULK_STONE_BRICKS.get(), DDBlocks.SCULK_STONE_BRICK_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.SCULK_STONE_BRICKS.get(), DDBlocks.SCULK_STONE_BRICK_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.SCULK_STONE_BRICKS.get(), DDBlocks.SCULK_STONE_BRICK_WALL.get());

        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_TILE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_TILE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_TILE_WALL.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_TILES.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_TILE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_TILE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.POLISHED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_TILE_WALL.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_SCULK_STONE.get(), DDBlocks.SCULK_STONE_TILES.get());
        stonecuttingRecipe(output, DDBlocks.SCULK_STONE_TILES.get(), DDBlocks.SCULK_STONE_TILE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.SCULK_STONE_TILES.get(), DDBlocks.SCULK_STONE_TILE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.SCULK_STONE_TILES.get(), DDBlocks.SCULK_STONE_TILE_WALL.get());

        stonecuttingRecipe(output, DDBlocks.SMOOTH_SCULK_STONE.get(), DDBlocks.SMOOTH_SCULK_STONE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.SMOOTH_SCULK_STONE.get(), DDBlocks.SMOOTH_SCULK_STONE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.SMOOTH_SCULK_STONE.get(), DDBlocks.SMOOTH_SCULK_STONE_WALL.get());

        stonecuttingRecipe(output, DDBlocks.SMOOTH_SCULK_STONE.get(), DDBlocks.CUT_SCULK_STONE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.SMOOTH_SCULK_STONE.get(), DDBlocks.CUT_SCULK_STONE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.SMOOTH_SCULK_STONE.get(), DDBlocks.CUT_SCULK_STONE_WALL.get());
        stonecuttingRecipe(output, DDBlocks.CUT_SCULK_STONE.get(), DDBlocks.CUT_SCULK_STONE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.CUT_SCULK_STONE.get(), DDBlocks.CUT_SCULK_STONE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.CUT_SCULK_STONE.get(), DDBlocks.CUT_SCULK_STONE_WALL.get());

        stonecuttingRecipe(output, DDBlocks.COBBLED_SCULK_STONE.get(), DDBlocks.CHISELED_SCULK_STONE.get());
        stonecuttingRecipe(output, DDBlocks.SCULK_STONE_BRICKS.get(), DDBlocks.CHISELED_SCULK_STONE.get());

        stonecuttingRecipe(output, DDBlocks.GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_WALL.get());

        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.COBBLED_GLOOMSLATE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.COBBLED_GLOOMSLATE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.COBBLED_GLOOMSLATE_WALL.get());

        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.POLISHED_GLOOMSLATE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.POLISHED_GLOOMSLATE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.POLISHED_GLOOMSLATE_WALL.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.POLISHED_GLOOMSLATE.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_GLOOMSLATE.get(), DDBlocks.POLISHED_GLOOMSLATE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_GLOOMSLATE.get(), DDBlocks.POLISHED_GLOOMSLATE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.POLISHED_GLOOMSLATE.get(), DDBlocks.POLISHED_GLOOMSLATE_WALL.get());

        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_BRICK_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_BRICK_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_BRICK_WALL.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_BRICKS.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_BRICK_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_BRICK_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.POLISHED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_BRICK_WALL.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_BRICKS.get());
        stonecuttingRecipe(output, DDBlocks.GLOOMSLATE_BRICKS.get(), DDBlocks.GLOOMSLATE_BRICK_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.GLOOMSLATE_BRICKS.get(), DDBlocks.GLOOMSLATE_BRICK_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.GLOOMSLATE_BRICKS.get(), DDBlocks.GLOOMSLATE_BRICK_WALL.get());

        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_TILE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_TILE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_TILE_WALL.get());
        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_TILES.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_TILE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_TILE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.POLISHED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_TILE_WALL.get());
        stonecuttingRecipe(output, DDBlocks.POLISHED_GLOOMSLATE.get(), DDBlocks.GLOOMSLATE_TILES.get());
        stonecuttingRecipe(output, DDBlocks.GLOOMSLATE_TILES.get(), DDBlocks.GLOOMSLATE_TILE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.GLOOMSLATE_TILES.get(), DDBlocks.GLOOMSLATE_TILE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.GLOOMSLATE_TILES.get(), DDBlocks.GLOOMSLATE_TILE_WALL.get());

        stonecuttingRecipe(output, DDBlocks.SMOOTH_GLOOMSLATE.get(), DDBlocks.SMOOTH_GLOOMSLATE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.SMOOTH_GLOOMSLATE.get(), DDBlocks.SMOOTH_GLOOMSLATE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.SMOOTH_GLOOMSLATE.get(), DDBlocks.SMOOTH_GLOOMSLATE_WALL.get());

        stonecuttingRecipe(output, DDBlocks.SMOOTH_GLOOMSLATE.get(), DDBlocks.CUT_GLOOMSLATE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.SMOOTH_GLOOMSLATE.get(), DDBlocks.CUT_GLOOMSLATE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.SMOOTH_GLOOMSLATE.get(), DDBlocks.CUT_GLOOMSLATE_WALL.get());
        stonecuttingRecipe(output, DDBlocks.CUT_GLOOMSLATE.get(), DDBlocks.CUT_GLOOMSLATE_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.CUT_GLOOMSLATE.get(), DDBlocks.CUT_GLOOMSLATE_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.CUT_GLOOMSLATE.get(), DDBlocks.CUT_GLOOMSLATE_WALL.get());

        stonecuttingRecipe(output, DDBlocks.COBBLED_GLOOMSLATE.get(), DDBlocks.CHISELED_GLOOMSLATE.get());
        stonecuttingRecipe(output, DDBlocks.GLOOMSLATE_BRICKS.get(), DDBlocks.CHISELED_GLOOMSLATE.get());

        stonecuttingRecipe(output, DDBlocks.SCULK_GRIME_BRICKS.get(), DDBlocks.SCULK_GRIME_BRICK_STAIRS.get());
        stonecuttingRecipe(output, DDBlocks.SCULK_GRIME_BRICKS.get(), DDBlocks.SCULK_GRIME_BRICK_SLAB.get(), 2);
        stonecuttingRecipe(output, DDBlocks.SCULK_GRIME_BRICKS.get(), DDBlocks.SCULK_GRIME_BRICK_WALL.get());
    }

    private void addSmithingRecipes(RecipeOutput output) {
        wardenSmithing(output, Items.NETHERITE_SHOVEL, RecipeCategory.TOOLS, DDItems.WARDEN_SHOVEL.get());
        wardenSmithing(output, Items.NETHERITE_PICKAXE, RecipeCategory.TOOLS, DDItems.WARDEN_PICKAXE.get());
        wardenSmithing(output, Items.NETHERITE_AXE, RecipeCategory.TOOLS, DDItems.WARDEN_AXE.get());
        wardenSmithing(output, Items.NETHERITE_HOE, RecipeCategory.TOOLS, DDItems.WARDEN_HOE.get());
        wardenSmithing(output, Items.NETHERITE_SWORD, RecipeCategory.COMBAT, DDItems.WARDEN_SWORD.get());
        wardenSmithing(output, Items.NETHERITE_HELMET, RecipeCategory.COMBAT, DDItems.WARDEN_HELMET.get());
        wardenSmithing(output, Items.NETHERITE_CHESTPLATE, RecipeCategory.COMBAT, DDItems.WARDEN_CHESTPLATE.get());
        wardenSmithing(output, Items.NETHERITE_LEGGINGS, RecipeCategory.COMBAT, DDItems.WARDEN_LEGGINGS.get());
        wardenSmithing(output, Items.NETHERITE_BOOTS, RecipeCategory.COMBAT, DDItems.WARDEN_BOOTS.get());
    }

    private void wardenSmithing(RecipeOutput output, ItemLike ingredient, RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(ingredient), Ingredient.of(DDItems.REINFORCED_ECHO_SHARD.get()), category, result).unlocks("has_reinforced_echo_shard", has(DDItems.REINFORCED_ECHO_SHARD.get())).save(output, DeeperDarker.rl(getItemName(result) + "_smithing"));
    }

    private void woodenRecipes(RecipeOutput output, TagKey<Item> logs, DeferredBlock<? extends Block> strippedLog, DeferredBlock<Block> planks, DeferredBlock<StairBlock> stairs, DeferredBlock<SlabBlock> slabs, DeferredBlock<FenceBlock> fence, DeferredBlock<FenceGateBlock> fenceGate, DeferredBlock<DoorBlock> door, DeferredBlock<TrapDoorBlock> trapDoor, DeferredBlock<PressurePlateBlock> pressurePlate, DeferredBlock<ButtonBlock> button, DeferredItem<Item> sign, DeferredItem<Item> hangingSign, DeferredItem<Item> boat, DeferredItem<Item> chestBoat) {
        planksFromLogs(output, planks.get(), logs, 4);
        stairBuilder(stairs.get(), Ingredient.of(planks.get())).unlockedBy("has_planks", has(planks.get())).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, slabs.get(), planks.get());
        fenceBuilder(fence.get(), Ingredient.of(planks.get())).unlockedBy("has_planks", has(planks.get())).save(output);
        fenceGateBuilder(fenceGate.get(), Ingredient.of(planks.get())).unlockedBy("has_planks", has(planks.get())).save(output);
        doorBuilder(door.get(), Ingredient.of(planks.get())).unlockedBy("has_planks", has(planks.get())).save(output);
        trapdoorBuilder(trapDoor.get(), Ingredient.of(planks.get())).unlockedBy("has_planks", has(planks.get())).save(output);
        pressurePlate(output, pressurePlate.get(), planks.get());
        buttonBuilder(button.get(), Ingredient.of(planks.get())).unlockedBy("has_planks", has(planks.get())).save(output);
        signBuilder(sign.get(), Ingredient.of(planks.get())).unlockedBy("has_planks", has(planks.get())).save(output);
        hangingSign(output, hangingSign.get(), strippedLog.get());
        woodenBoat(output, boat.get(), planks.get());
        chestBoat(output, chestBoat.get(), boat.get());
    }

    private void smelting(ItemLike ingredient, RecipeCategory category, ItemLike result, float experience, RecipeOutput output) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), category, result, experience, 200).unlockedBy(getHasName(ingredient), has(ingredient)).save(output);
    }

    private void oreSmelting(ItemLike ingredient, RecipeCategory category, ItemLike result, float experience, String group, RecipeOutput output) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), category, result, experience, 200).group(group).unlockedBy(getHasName(ingredient), has(ingredient)).save(output, DeeperDarker.rl(getSmeltingRecipeName(result)  + "_" + getItemName(ingredient)));
    }

    private void oreBlasting(ItemLike ingredient, RecipeCategory category, ItemLike result, float experience, String group, RecipeOutput output) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredient), category, result, experience, 100).group(group).unlockedBy(getHasName(ingredient), has(ingredient)).save(output, DeeperDarker.rl(getBlastingRecipeName(result) + "_" + getItemName(ingredient)));
    }

    private void stonecuttingRecipe(RecipeOutput output, ItemLike ingredient, ItemLike result) {
        stonecuttingRecipe(output, ingredient, result, 1);
    }

    private void stonecuttingRecipe(RecipeOutput output, ItemLike ingredient, ItemLike result, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), RecipeCategory.BUILDING_BLOCKS, result, count).unlockedBy(getHasName(ingredient), has(ingredient)).save(output, ResourceLocation.fromNamespaceAndPath(DeeperDarker.MOD_ID,getConversionRecipeName(result, ingredient) + "_stonecutting"));
    }
}
