package com.kyanite.deeperdarker.datagen.assets;

import com.kyanite.deeperdarker.DeeperDarker;
import com.kyanite.deeperdarker.content.DDBlocks;
import com.kyanite.deeperdarker.content.DDItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;

public class DDItemModelProvider extends ItemModelProvider {
    private final ModelFile GENERATED = getExistingFile(mcLoc("item/generated"));
    private final ModelFile HANDHELD = getExistingFile(mcLoc("item/handheld"));

    public DDItemModelProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DeeperDarker.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerModels() {
        blockModel(DDBlocks.ECHO_LOG);
        blockModel(DDBlocks.ECHO_WOOD);
        blockModel(DDBlocks.STRIPPED_ECHO_LOG);
        blockModel(DDBlocks.STRIPPED_ECHO_WOOD);
        blockModel(DDBlocks.ECHO_PLANKS);
        blockModel(DDBlocks.ECHO_STAIRS);
        blockModel(DDBlocks.ECHO_SLAB);
        blockModel(DDBlocks.ECHO_FENCE, "inventory");
        blockModel(DDBlocks.ECHO_FENCE_GATE);
        itemModel(DDBlocks.ECHO_DOOR, GENERATED).renderType("translucent");
        blockModel(DDBlocks.ECHO_TRAPDOOR, "bottom");
        blockModel(DDBlocks.ECHO_PRESSURE_PLATE);
        blockModel(DDBlocks.ECHO_BUTTON, "inventory");
        blockModel(DDBlocks.ECHO_LEAVES);
        blockItemModel(DDBlocks.ECHO_SAPLING, DDBlocks.ECHO_SAPLING, GENERATED);

        blockModel(DDBlocks.BLOOMING_STEM, "inventory");
        blockModel(DDBlocks.STRIPPED_BLOOMING_STEM, "inventory");
        blockModel(DDBlocks.BLOOM_PLANKS);
        blockModel(DDBlocks.BLOOM_STAIRS);
        blockModel(DDBlocks.BLOOM_SLAB);
        blockModel(DDBlocks.BLOOM_FENCE, "inventory");
        blockModel(DDBlocks.BLOOM_FENCE_GATE);
        itemModel(DDBlocks.BLOOM_DOOR, GENERATED).renderType("translucent");
        blockModel(DDBlocks.BLOOM_TRAPDOOR, "bottom");
        blockModel(DDBlocks.BLOOM_PRESSURE_PLATE);
        blockModel(DDBlocks.BLOOM_BUTTON, "inventory");

        blockModel(DDBlocks.SCULK_STONE);
        blockModel(DDBlocks.SCULK_STONE_STAIRS);
        blockModel(DDBlocks.SCULK_STONE_SLAB);
        blockModel(DDBlocks.SCULK_STONE_WALL, "inventory");
        blockModel(DDBlocks.COBBLED_SCULK_STONE);
        blockModel(DDBlocks.COBBLED_SCULK_STONE_STAIRS);
        blockModel(DDBlocks.COBBLED_SCULK_STONE_SLAB);
        blockModel(DDBlocks.COBBLED_SCULK_STONE_WALL, "inventory");
        blockModel(DDBlocks.POLISHED_SCULK_STONE);
        blockModel(DDBlocks.POLISHED_SCULK_STONE_STAIRS);
        blockModel(DDBlocks.POLISHED_SCULK_STONE_SLAB);
        blockModel(DDBlocks.POLISHED_SCULK_STONE_WALL, "inventory");
        blockModel(DDBlocks.SCULK_STONE_BRICKS);
        blockModel(DDBlocks.SCULK_STONE_BRICK_STAIRS);
        blockModel(DDBlocks.SCULK_STONE_BRICK_SLAB);
        blockModel(DDBlocks.SCULK_STONE_BRICK_WALL, "inventory");
        blockModel(DDBlocks.SCULK_STONE_TILES);
        blockModel(DDBlocks.SCULK_STONE_TILE_STAIRS);
        blockModel(DDBlocks.SCULK_STONE_TILE_SLAB);
        blockModel(DDBlocks.SCULK_STONE_TILE_WALL, "inventory");
        blockModel(DDBlocks.SMOOTH_SCULK_STONE);
        blockModel(DDBlocks.SMOOTH_SCULK_STONE_STAIRS);
        blockModel(DDBlocks.SMOOTH_SCULK_STONE_SLAB);
        blockModel(DDBlocks.SMOOTH_SCULK_STONE_WALL, "inventory");
        blockModel(DDBlocks.CUT_SCULK_STONE);
        blockModel(DDBlocks.CUT_SCULK_STONE_STAIRS);
        blockModel(DDBlocks.CUT_SCULK_STONE_SLAB);
        blockModel(DDBlocks.CUT_SCULK_STONE_WALL, "inventory");
        blockModel(DDBlocks.CHISELED_SCULK_STONE);

        blockModel(DDBlocks.BLOOMING_SCULK_STONE);
        blockModel(DDBlocks.BLOOMING_MOSS_BLOCK);

        blockModel(DDBlocks.GLOOMSLATE);
        blockModel(DDBlocks.GLOOMSLATE_STAIRS);
        blockModel(DDBlocks.GLOOMSLATE_SLAB);
        blockModel(DDBlocks.GLOOMSLATE_WALL, "inventory");
        blockModel(DDBlocks.COBBLED_GLOOMSLATE);
        blockModel(DDBlocks.COBBLED_GLOOMSLATE_STAIRS);
        blockModel(DDBlocks.COBBLED_GLOOMSLATE_SLAB);
        blockModel(DDBlocks.COBBLED_GLOOMSLATE_WALL, "inventory");
        blockModel(DDBlocks.POLISHED_GLOOMSLATE);
        blockModel(DDBlocks.POLISHED_GLOOMSLATE_STAIRS);
        blockModel(DDBlocks.POLISHED_GLOOMSLATE_SLAB);
        blockModel(DDBlocks.POLISHED_GLOOMSLATE_WALL, "inventory");
        blockModel(DDBlocks.GLOOMSLATE_BRICKS);
        blockModel(DDBlocks.GLOOMSLATE_BRICK_STAIRS);
        blockModel(DDBlocks.GLOOMSLATE_BRICK_SLAB);
        blockModel(DDBlocks.GLOOMSLATE_BRICK_WALL, "inventory");
        blockModel(DDBlocks.GLOOMSLATE_TILES);
        blockModel(DDBlocks.GLOOMSLATE_TILE_STAIRS);
        blockModel(DDBlocks.GLOOMSLATE_TILE_SLAB);
        blockModel(DDBlocks.GLOOMSLATE_TILE_WALL, "inventory");
        blockModel(DDBlocks.SMOOTH_GLOOMSLATE);
        blockModel(DDBlocks.SMOOTH_GLOOMSLATE_STAIRS);
        blockModel(DDBlocks.SMOOTH_GLOOMSLATE_SLAB);
        blockModel(DDBlocks.SMOOTH_GLOOMSLATE_WALL, "inventory");
        blockModel(DDBlocks.CUT_GLOOMSLATE);
        blockModel(DDBlocks.CUT_GLOOMSLATE_STAIRS);
        blockModel(DDBlocks.CUT_GLOOMSLATE_SLAB);
        blockModel(DDBlocks.CUT_GLOOMSLATE_WALL, "inventory");
        blockModel(DDBlocks.CHISELED_GLOOMSLATE);

        blockModel(DDBlocks.SCULK_GRIME);
        blockModel(DDBlocks.SCULK_GRIME_BRICKS);
        blockModel(DDBlocks.SCULK_GRIME_BRICK_STAIRS);
        blockModel(DDBlocks.SCULK_GRIME_BRICK_SLAB);
        blockModel(DDBlocks.SCULK_GRIME_BRICK_WALL, "inventory");

        blockModel(DDBlocks.ECHO_SOIL);
        blockModel(DDBlocks.GLOOMY_SCULK);
        blockModel(DDBlocks.GLOOMY_GEYSER);
        blockModel(DDBlocks.CRYSTALLIZED_AMBER);
        blockModel(DDBlocks.SCULK_GLEAM);
        blockModel(DDBlocks.SOUNDPROOF_GLASS);

        blockModel(DDBlocks.SCULK_STONE_COAL_ORE);
        blockModel(DDBlocks.SCULK_STONE_IRON_ORE);
        blockModel(DDBlocks.SCULK_STONE_COPPER_ORE);
        blockModel(DDBlocks.SCULK_STONE_GOLD_ORE);
        blockModel(DDBlocks.SCULK_STONE_REDSTONE_ORE);
        blockModel(DDBlocks.SCULK_STONE_EMERALD_ORE);
        blockModel(DDBlocks.SCULK_STONE_LAPIS_ORE);
        blockModel(DDBlocks.SCULK_STONE_DIAMOND_ORE);
        blockModel(DDBlocks.GLOOMSLATE_COAL_ORE);
        blockModel(DDBlocks.GLOOMSLATE_IRON_ORE);
        blockModel(DDBlocks.GLOOMSLATE_COPPER_ORE);
        blockModel(DDBlocks.GLOOMSLATE_GOLD_ORE);
        blockModel(DDBlocks.GLOOMSLATE_REDSTONE_ORE);
        blockModel(DDBlocks.GLOOMSLATE_EMERALD_ORE);
        blockModel(DDBlocks.GLOOMSLATE_LAPIS_ORE);
        blockModel(DDBlocks.GLOOMSLATE_DIAMOND_ORE);

        itemModel(DDBlocks.GLOWING_FLOWERS, GENERATED).renderType("cutout");
        blockItemModel(DDBlocks.GLOWING_GRASS, DDBlocks.GLOWING_GRASS, GENERATED);
        blockItemModel(DDBlocks.GLOOMY_GRASS, DDBlocks.GLOOMY_GRASS, GENERATED);
        blockModel(DDBlocks.GLOOMY_CACTUS);
        blockItemModel(DDBlocks.SCULK_TENDRILS, DDBlocks.SCULK_TENDRILS_PLANT, GENERATED);
        blockItemModel(DDBlocks.SCULK_VINES, DDBlocks.SCULK_VINES_PLANT, GENERATED);
        blockItemModel(DDBlocks.GLOWING_ROOTS, DDBlocks.GLOWING_ROOTS_PLANT, GENERATED);
        blockItemModel(DDBlocks.ICE_LILY, DDBlocks.ICE_LILY, GENERATED);
        blockItemModel(DDBlocks.LILY_FLOWER, DDBlocks.LILY_FLOWER, GENERATED);

        blockModel(DDBlocks.ANCIENT_VASE);
        withExistingParent(DDBlocks.INFESTED_SCULK.getId().getPath(), mcLoc("block/sculk"));
        blockModel(DDBlocks.SCULK_JAW);

        itemModelWithSuffix(DDItems.SOUL_ELYTRA, GENERATED, "broken");
        itemModel(DDItems.SOUL_ELYTRA, GENERATED).override().model(getModel(DDItems.SOUL_ELYTRA, "broken")).predicate(new ResourceLocation("broken"), 1).end();
        itemModel(DDItems.ECHO_SIGN, GENERATED);
        itemModel(DDItems.ECHO_HANGING_SIGN, GENERATED);
        itemModel(DDItems.BLOOM_SIGN, GENERATED);
        itemModel(DDItems.BLOOM_HANGING_SIGN, GENERATED);
        itemModel(DDItems.ECHO_BOAT, GENERATED);
        itemModel(DDItems.ECHO_CHEST_BOAT, GENERATED);
        itemModel(DDItems.BLOOM_BOAT, GENERATED);
        itemModel(DDItems.BLOOM_CHEST_BOAT, GENERATED);

        itemModel(DDItems.BLOOM_BERRIES, GENERATED);

        itemModel(DDItems.GRIME_BALL, GENERATED);
        itemModel(DDItems.GRIME_BRICK, GENERATED);

        itemModel(DDItems.RESONARIUM_SHOVEL, HANDHELD);
        itemModel(DDItems.RESONARIUM_PICKAXE, HANDHELD);
        itemModel(DDItems.RESONARIUM_AXE, HANDHELD);
        itemModel(DDItems.RESONARIUM_HOE, HANDHELD);
        itemModel(DDItems.RESONARIUM_SWORD, HANDHELD);
        armorItemModel(DDItems.RESONARIUM_HELMET);
        armorItemModel(DDItems.RESONARIUM_CHESTPLATE);
        armorItemModel(DDItems.RESONARIUM_LEGGINGS);
        armorItemModel(DDItems.RESONARIUM_BOOTS);

        itemModel(DDItems.WARDEN_SHOVEL, HANDHELD);
        itemModel(DDItems.WARDEN_PICKAXE, HANDHELD);
        itemModel(DDItems.WARDEN_AXE, HANDHELD);
        itemModel(DDItems.WARDEN_HOE, HANDHELD);
        itemModel(DDItems.WARDEN_SWORD, HANDHELD);
        armorItemModel(DDItems.WARDEN_HELMET);
        armorItemModel(DDItems.WARDEN_CHESTPLATE);
        armorItemModel(DDItems.WARDEN_LEGGINGS);
        armorItemModel(DDItems.WARDEN_BOOTS);

        itemModel(DDItems.SCULK_BONE, GENERATED);
        itemModel(DDItems.SOUL_DUST, GENERATED);
        itemModel(DDItems.SOUL_CRYSTAL, GENERATED);
        itemModel(DDItems.RESONARIUM, GENERATED);
        itemModel(DDItems.HEART_OF_THE_DEEP, GENERATED);
        itemModel(DDItems.WARDEN_CARAPACE, GENERATED);
        itemModel(DDItems.REINFORCED_ECHO_SHARD, GENERATED);

        itemModelWithSuffix(DDItems.SCULK_TRANSMITTER, GENERATED, "on");
        itemModel(DDItems.SCULK_TRANSMITTER, GENERATED).override().model(getModel(DDItems.SCULK_TRANSMITTER, "on")).predicate(DeeperDarker.rl("linked"), 1).end();
        itemModelWithSuffix(DDItems.SONOROUS_STAFF, HANDHELD, "charged");
        itemModelWithSuffix(DDItems.SONOROUS_STAFF, HANDHELD, "charging");
        itemModel(DDItems.SONOROUS_STAFF, HANDHELD).override().model(getModel(DDItems.SONOROUS_STAFF, "charging")).predicate(DeeperDarker.rl("charge"), 0.001f).end().override().model(getModel(DDItems.SONOROUS_STAFF, "charged")).predicate(DeeperDarker.rl("charge"), 1).end();
        itemModel(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE, GENERATED);

        spawnEggModel(DDItems.ANGLER_FISH_SPAWN_EGG);
        spawnEggModel(DDItems.SCULK_CENTIPEDE_SPAWN_EGG);
        spawnEggModel(DDItems.SCULK_LEECH_SPAWN_EGG);
        spawnEggModel(DDItems.SCULK_SNAPPER_SPAWN_EGG);
        spawnEggModel(DDItems.SHATTERED_SPAWN_EGG);
        spawnEggModel(DDItems.SHRIEK_WORM_SPAWN_EGG);
        spawnEggModel(DDItems.STALKER_SPAWN_EGG);
    }

    public void blockModel(RegistryObject<? extends Block> block) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath()));
    }

    public void blockModel(RegistryObject<? extends Block> block, String suffix) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath() + "_" + suffix));
    }

    public void blockItemModel(RegistryObject<?> block, RegistryObject<?> textureBlock, ModelFile modelFile) {
        getBuilder(block.getId().getPath()).parent(modelFile).texture("layer0", "block/" + textureBlock.getId().getPath());
    }

    public ItemModelBuilder itemModel(RegistryObject<?> item, ModelFile modelFile) {
        return getBuilder(item.getId().getPath()).parent(modelFile).texture("layer0", "item/" + item.getId().getPath());
    }

    public void itemModelWithSuffix(RegistryObject<?> item, ModelFile modelFile, String suffix) {
        getBuilder(item.getId().getPath() + "_" + suffix).parent(modelFile).texture("layer0", "item/" + item.getId().getPath() + "_" + suffix);
    }

    private void armorItemModel(RegistryObject<? extends ArmorItem> item) {
        ItemModelBuilder itemModel = itemModel(item, GENERATED);
        Map<String, Float> trimModels = Map.of("quartz", 0.1F, "iron", 0.2F, "netherite", 0.3F, "redstone", 0.4F, "copper", 0.5F, "gold", 0.6F, "emerald", 0.7F, "diamond", 0.8F, "lapis", 0.9F, "amethyst", 1.0F);

        for(String material : trimModels.keySet()) {
            ResourceLocation trimLayer = new ResourceLocation(mcLoc("trims/items/") + item.get().getType().getName() + "_trim_" + material);
            existingFileHelper.trackGenerated(trimLayer, PackType.CLIENT_RESOURCES, ".png", "textures");
            getBuilder(item.getId().getPath() + "_" + material + "_trim").parent(GENERATED)
                    .texture("layer0", "item/" + item.getId().getPath())
                    .texture("layer1", trimLayer);

            itemModel.override().model(getModel(item, material + "_trim")).predicate(ItemModelGenerators.TRIM_TYPE_PREDICATE_ID, trimModels.get(material)).end();
        }
    }

    private void spawnEggModel(RegistryObject<Item> egg) {
        withExistingParent(egg.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

    private ModelFile.ExistingModelFile getModel(RegistryObject<?> item, String suffix) {
        return new ModelFile.ExistingModelFile(modLoc("item/" + item.getId().getPath() + "_" + suffix), existingFileHelper);
    }
}
