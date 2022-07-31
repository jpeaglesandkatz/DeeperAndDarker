package com.kyanite.deeperdarker.client.mixin;

import com.kyanite.deeperdarker.registry.items.DDItems;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.BossEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.Brain;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.warden.AngerLevel;
import net.minecraft.world.entity.monster.warden.AngerManagement;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(Warden.class)
public abstract class WardenMixin extends Entity {
    @Shadow public abstract Brain<Warden> getBrain();

    @Shadow public abstract AngerLevel getAngerLevel();

    @Shadow private AngerManagement angerManagement;

    public WardenMixin(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Inject(method = "getEntityAngryAt", at = @At("HEAD"), cancellable = true)
    public void getEntityAngryAt(CallbackInfoReturnable<Optional<LivingEntity>> cir) {
        if(this.angerManagement.getActiveEntity().isEmpty()) return;

        if (this.angerManagement.getActiveEntity().get() instanceof Player) {
            Player plr = (Player) this.angerManagement.getActiveEntity().get();
            if (plr.getInventory().getArmor(EquipmentSlot.HEAD.getIndex()).is(DDItems.WARDEN_HELMET.get())) {
                cir.setReturnValue(Optional.empty());
            }
        }
    }
    @Inject(method = "setAttackTarget", at = @At("HEAD"), cancellable = true)
    public void setTarget(LivingEntity p_219460_, CallbackInfo ci) {
        if(p_219460_ instanceof Player)
        {
            Player plr = (Player) p_219460_;
            if(plr.getInventory().getArmor(EquipmentSlot.HEAD.getIndex()).is(DDItems.WARDEN_HELMET.get())) {
                this.getBrain().eraseMemory(MemoryModuleType.ROAR_TARGET);
                ci.cancel();
            }
        }
    }
    @Inject(method = "createAttributes", at = @At("RETURN"), cancellable = true)
    private static void createAttributes(CallbackInfoReturnable<AttributeSupplier.Builder> cir) {
        cir.setReturnValue(Monster.createMonsterAttributes().add(Attributes.MAX_HEALTH, 350).add(Attributes.MOVEMENT_SPEED, (double) 0.3F).add(Attributes.KNOCKBACK_RESISTANCE, 1.0D).add(Attributes.ATTACK_KNOCKBACK, 1.5D).add(Attributes.ATTACK_DAMAGE, 15));
    }
}