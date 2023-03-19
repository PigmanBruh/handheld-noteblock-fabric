package net.pigmanbruh.hhnb.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;

public class ItemFunction extends Item {
    public ItemFunction(Settings settings) {
        super(settings);
    }

    private static final float PITCH = 1.0F;

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient) {
            user.playSound(SoundEvents.BLOCK_NOTE_BLOCK_HARP, SoundCategory.RECORDS, 1.0F, PITCH);
            user.getItemCooldownManager().set(this, 1);
        }
        return super.use(world, user, hand);
    }
}
