package com.hyerodrimm.wolfarmorstandmod.event;

import com.hyerodrimm.wolfarmorstandmod.entity.custom.WolfArmorStandEntity;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class AttackEntityEventHandler implements AttackEntityCallback {

    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, Entity entity, @Nullable EntityHitResult hitResult) {
        if (entity instanceof WolfArmorStandEntity && world.isClient()){
            ((WolfArmorStandEntity)entity).SetPlaySwayAnimation(true);
        }

        return ActionResult.PASS;
    }
}
