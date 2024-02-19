package com.kyanite.deeperdarker.content.items;

import com.kyanite.deeperdarker.DeeperDarker;
import com.kyanite.deeperdarker.content.DDSounds;
import com.kyanite.deeperdarker.util.DDTags;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.gameevent.GameEvent;

import java.util.List;

@SuppressWarnings("NullableProblems")
public class SculkTransmitterItem extends Item {
    public SculkTransmitterItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (pContext.getPlayer() == null) return InteractionResult.FAIL;
        if(pContext.getItemInHand().hasTag() && pContext.getItemInHand().getTag().getBoolean("linked")) {
            return transmit(pContext.getLevel(), pContext.getPlayer(), pContext.getHand(), pContext.getClickedPos());
        }

        if(!canConnect(pContext.getLevel(), pContext.getClickedPos())) {
            actionBarMessage(pContext.getLevel(), pContext.getPlayer(), "not_transmittable", DDSounds.TRANSMITTER_ERROR);
            return InteractionResult.FAIL;
        }

        actionBarMessage(pContext.getLevel(), pContext.getPlayer(), "linked", DDSounds.TRANSMITTER_LINK);
        formConnection(pContext.getLevel(), pContext.getItemInHand(), pContext.getClickedPos());
        return InteractionResult.SUCCESS;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if(pPlayer.getMainHandItem().hasTag() && pPlayer.getMainHandItem().getTag().getBoolean("linked")) {
            transmit(pLevel, pPlayer, pUsedHand, null);
        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public void appendHoverText(ItemStack pStack, Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(pStack.hasTag() && pStack.getTag().getBoolean("linked")) {
            int[] pos = pStack.getTag().getIntArray("blockPos");
            String name = pStack.getTag().getString("linkedName");
            pTooltipComponents.add(Component.translatable("tooltips." + DeeperDarker.MOD_ID + ".sculk_transmitter.linked", Component.translatable(name)).withStyle(ChatFormatting.GRAY));
            pTooltipComponents.add(Component.translatable("tooltips." + DeeperDarker.MOD_ID + ".sculk_transmitter.location", pos[0], pos[1], pos[2]).withStyle(ChatFormatting.GRAY));
        }
        else pTooltipComponents.add(Component.translatable("tooltips." + DeeperDarker.MOD_ID + ".sculk_transmitter.not_linked").withStyle(ChatFormatting.GRAY));

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    private InteractionResult transmit(Level level, Player player, InteractionHand hand, BlockPos clickedPos) {
        int[] pos = player.getMainHandItem().getTag().getIntArray("blockPos");
        BlockPos linkedBlockPos = new BlockPos(pos[0], pos[1], pos[2]);
        ItemStack transmitter = player.getItemInHand(hand);

        if(player.isCrouching()) {
            if(clickedPos != null && canConnect(level, clickedPos)) {
                actionBarMessage(level, player, "linked", DDSounds.TRANSMITTER_LINK);
                formConnection(level, transmitter, clickedPos);
                return InteractionResult.SUCCESS;
            }

            actionBarMessage(level, player, "unlinked", DDSounds.TRANSMITTER_UNLINK);
            formConnection(level, transmitter, null);
            return InteractionResult.FAIL;
        }

        if(!canConnect(level, linkedBlockPos)) {
            actionBarMessage(level, player, "not_found", DDSounds.TRANSMITTER_ERROR);
            //formConnection(transmitter, null);
            return InteractionResult.FAIL;
        }

        level.gameEvent(GameEvent.ENTITY_INTERACT, player.blockPosition(), GameEvent.Context.of(player));

        MenuProvider menu = level.getBlockState(linkedBlockPos).getMenuProvider(level, linkedBlockPos);
        if(menu != null) {
            if(level.isClientSide())
                player.playNotifySound(DDSounds.TRANSMITTER_OPEN, SoundSource.PLAYERS, 1.0f, 1.0f);
            player.openMenu(menu);
            if(level.getBlockEntity(linkedBlockPos) instanceof ChestBlockEntity chestBlockEntity) chestBlockEntity.startOpen(player);
        }

        return InteractionResult.SUCCESS;
    }

    private void formConnection(Level pLevel, ItemStack stack, BlockPos pos) {
        CompoundTag tag = stack.hasTag() ? stack.getTag() : new CompoundTag();
        if(pos == null) {
            stack.removeTagKey("linkedName");
            stack.removeTagKey("blockPos");
            stack.removeTagKey("linked");
            return;
        }
        String name = pLevel.getBlockState(pos).getBlock().getDescriptionId();
        tag.putString("linkedName", name);
        tag.putBoolean("linked", true);
        tag.putIntArray("blockPos", List.of(pos.getX(), pos.getY(), pos.getZ()));
        stack.setTag(tag);
    }

    private boolean canConnect(Level level, BlockPos target) {
        return level.isLoaded(target) && level.getBlockState(target).is(DDTags.Blocks.TRANSMITTABLE);
    }

    private void actionBarMessage(Level level, Player player, String key, SoundEvent sound) {
        if(level.isClientSide()) return;
        player.displayClientMessage(Component.translatable("block." + DeeperDarker.MOD_ID + "." + key), true);
        player.playNotifySound(sound, SoundSource.PLAYERS, 1.0f, 1.0f);
    }
}
