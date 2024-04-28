package com.hyerodrimm.wolfarmorstandmod.item.custom;

import com.hyerodrimm.wolfarmorstandmod.entity.ModEntities;
import com.hyerodrimm.wolfarmorstandmod.entity.custom.WolfArmorStandEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.function.Consumer;

public class WolfArmorStandItem extends Item {
    public WolfArmorStandItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        Direction direction = context.getSide();
        if (direction == Direction.DOWN) {
            return ActionResult.FAIL;
        }
        World world = context.getWorld();
        ItemPlacementContext itemPlacementContext = new ItemPlacementContext(context);
        BlockPos blockPos = itemPlacementContext.getBlockPos();
        ItemStack itemStack = context.getStack();
        Vec3d vec3d = Vec3d.ofBottomCenter(blockPos);
        Box box = ModEntities.WOLF_ARMOR_STAND.getDimensions().getBoxAt(vec3d.getX(), vec3d.getY(), vec3d.getZ());
        if (!world.isSpaceEmpty(null, box) || !world.getOtherEntities(null, box).isEmpty()) {
            return ActionResult.FAIL;
        }
        if (world instanceof ServerWorld) {
            ServerWorld serverWorld = (ServerWorld)world;
            Consumer<WolfArmorStandEntity> consumer = EntityType.copier(serverWorld, itemStack, context.getPlayer());
            WolfArmorStandEntity wolfArmorStandEntity = ModEntities.WOLF_ARMOR_STAND.create(serverWorld, consumer, blockPos, SpawnReason.SPAWN_EGG, true, true);
            if (wolfArmorStandEntity == null) {
                return ActionResult.FAIL;
            }
            float f = (float) MathHelper.floor((MathHelper.wrapDegrees(context.getPlayerYaw() - 180.0f) + 22.5f) / 45.0f) * 45.0f;
            wolfArmorStandEntity.refreshPositionAndAngles(wolfArmorStandEntity.getX(), wolfArmorStandEntity.getY(), wolfArmorStandEntity.getZ(), f, 0.0f);
            serverWorld.spawnEntityAndPassengers(wolfArmorStandEntity);
            world.playSound(null, wolfArmorStandEntity.getX(), wolfArmorStandEntity.getY(), wolfArmorStandEntity.getZ(), SoundEvents.ENTITY_ARMOR_STAND_PLACE, SoundCategory.BLOCKS, 0.75f, 0.8f);
            wolfArmorStandEntity.emitGameEvent(GameEvent.ENTITY_PLACE, context.getPlayer());
        }
        itemStack.decrement(1);
        return ActionResult.success(world.isClient);
    }
}
