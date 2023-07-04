package com.kyanite.deeperdarker.registries.entities;

import com.kyanite.deeperdarker.registries.DDBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class DDSignBlockEntity extends SignBlockEntity {
    public DDSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
    }

    @Override
    public @NotNull BlockEntityType<?> getType() {
        return DDBlockEntities.DEEPER_DARKER_SIGNS.get();
    }
}
