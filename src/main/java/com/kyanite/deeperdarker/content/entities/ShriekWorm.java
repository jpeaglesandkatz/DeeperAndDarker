package com.kyanite.deeperdarker.content.entities;

import com.kyanite.deeperdarker.content.DDSounds;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.fluids.FluidType;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation, NullableProblems")
public class ShriekWorm extends Monster {
    public final AnimationState idleState = new AnimationState();
    public final AnimationState attackState = new AnimationState();
    public final AnimationState asleepState = new AnimationState();
    public final AnimationState emergeState = new AnimationState();
    public final AnimationState descendState = new AnimationState();
    private int emergingTime;
    private int idleTime;
    private boolean asleep;

    public ShriekWorm(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new MeleeAttackGoal(this, 0, true));
        this.targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }

    public static AttributeSupplier createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.MAX_HEALTH, 100).add(Attributes.ATTACK_DAMAGE, 7).add(Attributes.MOVEMENT_SPEED, 0).add(Attributes.ATTACK_KNOCKBACK, 0).add(Attributes.KNOCKBACK_RESISTANCE, 1).build();
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return DDSounds.SHRIEK_WORM_AMBIENT.get();
    }

    @Override
    protected SoundEvent getDeathSound() {
        return DDSounds.SHRIEK_WORM_DEATH.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return DDSounds.SHRIEK_WORM_HURT.get();
    }

    @Override
    public boolean doHurtTarget(Entity entity) {
        this.level().broadcastEntityEvent(this, (byte) 4);
        return super.doHurtTarget(entity);
    }

    @Override
    public void tick() {
        super.tick();

        if(this.getPose() == Pose.EMERGING && ++emergingTime > 80) this.setPose(Pose.STANDING);

        if(this.getPose() == Pose.STANDING && !this.asleep) {
            this.idleTime++;
            if(this.idleTime > 200) {
                this.idleTime = 0;
                this.asleep = true;
            }
        }

        Player player = level().getNearestPlayer(this, 5);
        if(player != null && !player.isDeadOrDying() && !player.isCreative()) {
            this.asleep = false;
        } else {
            if(this.attackState.isStarted() && !this.idleState.isStarted()) {
                this.attackState.stop();
                this.idleState.start(this.tickCount);
            }
        }

        if(level().isClientSide()) {
            if(this.asleep && !this.asleepState.isStarted()) {
                this.idleState.stop();
                this.asleepState.start(this.tickCount);
            }
            if(!this.asleep && !this.idleState.isStarted() && !this.emergeState.isStarted() && !this.descendState.isStarted()) {
                this.asleepState.stop();
                this.idleState.start(this.tickCount);
            }

            if(this.getPose() == Pose.EMERGING) {
                double sX = this.random.nextGaussian() * 0.02;
                double sY = this.random.nextGaussian() * 0.02;
                double sZ = this.random.nextGaussian() * 0.02;
                level().addParticle(new BlockParticleOption(ParticleTypes.BLOCK, this.getBlockStateOn()), getRandomX(1), getY() + 1, getRandomZ(1), sX, sY, sZ);
            }
        }

        if(asleep) setBoundingBox(new AABB(this.position().x - 0.5, this.position().y, this.position().z - 0.5, this.position().x + 0.5, this.position().y + 1.6, this.position().z + 0.5));
        else setBoundingBox(new AABB(this.position().x - 0.5, this.position().y, this.position().z - 0.5, this.position().x + 0.5, this.position().y + 5.7, this.position().z + 0.5));

        /*if(this.descendState.isStarted()) {
            this.entityData.set(IDLE_TIMER, this.entityData.get(IDLE_TIMER) - 1);
            if(this.entityData.get(IDLE_TIMER) <= -90) {
                level().setBlock(this.getOnPos(), DDBlocks.INFESTED_SCULK.get().defaultBlockState(), 3);
                // TODO: kill does not work... make it work (change descent chance once fixed)
                this.kill();
                this.remove(RemovalReason.KILLED);
            }
        }*/
    }

    @Override
    public void handleEntityEvent(byte id) {
        if(id == 4) {
            this.idleState.stop();
            this.asleepState.stop();
            this.attackState.start(this.tickCount);
        } else {
            super.handleEntityEvent(id);
        }
    }

    @Override
    public boolean isWithinMeleeAttackRange(LivingEntity entity) {
        return getAttackBoundingBox().inflate(6, 0, 6).intersects(entity.getBoundingBox());
    }

    @Override
    public void onSyncedDataUpdated(EntityDataAccessor<?> key) {
        if(key.equals(DATA_POSE)) {
            if(this.getPose() == Pose.EMERGING) this.emergeState.start(this.tickCount);
            if(this.getPose() == Pose.STANDING) this.emergeState.stop();
        }

        super.onSyncedDataUpdated(key);
    }

    @Nullable
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType spawnType, SpawnGroupData spawnGroupData) {
        if(spawnType == MobSpawnType.TRIGGERED) this.setPose(Pose.EMERGING);
        return super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData);
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    public boolean isPushedByFluid(FluidType type) {
        return false;
    }

    @Override
    public void knockback(double pStrength, double pX, double pZ) {
        this.setDeltaMovement(Vec3.ZERO);
    }
}
