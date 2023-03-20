package net.pigmanbruh.hhnb.item;

import net.pigmanbruh.hhnb.sounds.Sounds;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.sound.SoundCategory;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.client.item.TooltipContext;

public class ItemFunction extends Item {
    public ItemFunction(Settings settings) {
        super(settings);
    }

    private static int TONE = 0;
    private static float PITCH = 0.5f;

    public static void ChangePitch() {
        ++TONE;
        if (TONE > 24) {
            int TONE = 0;
        }
        if (TONE == 0) {PITCH = 0.5f;}
            else if (TONE == 1) {PITCH = 0.529732f;}
            else if (TONE == 2) {PITCH = 0.561231f;}
            else if (TONE == 3) {PITCH = 0.594604f;}
            else if (TONE == 4) {PITCH = 0.629961f;}
            else if (TONE == 5) {PITCH = 0.667420f;}
            else if (TONE == 6) {PITCH = 0.707107f;}
            else if (TONE == 7) {PITCH = 0.749154f;}
            else if (TONE == 8) {PITCH = 0.793701f;}
            else if (TONE == 9) {PITCH = 0.840896f;}
            else if (TONE == 10) {PITCH = 0.890899f;}
            else if (TONE == 11) {PITCH = 0.943874f;}
            else if (TONE == 12) {PITCH = 1.0f;}
            else if (TONE == 13) {PITCH = 1.059463f;}
            else if (TONE == 14) {PITCH = 1.122462f;}
            else if (TONE == 15) {PITCH = 1.189207f;}
            else if (TONE == 16) {PITCH = 1.259921f;}
            else if (TONE == 17) {PITCH = 1.334840f;}
            else if (TONE == 18) {PITCH = 1.414214f;}
            else if (TONE == 19) {PITCH = 1.498307f;}
            else if (TONE == 20) {PITCH = 1.587401f;}
            else if (TONE == 21) {PITCH = 1.681793f;}
            else if (TONE == 22) {PITCH = 1.781797f;}
            else if (TONE == 23) {PITCH = 1.887749f;}
            else if (TONE == 24) {PITCH = 2.0f;}
    }

    @Override
    public TypedActionResult<ItemStack> () {
        if(PlayerEntity.getStackInHand(Hand).hasNbt()) {
            PlayerEntity.getStackInHand(Hand).setNbt(new NbtCompound());
        }
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return stack.hasNbt();
    }

    @Override
    public void appendTooltip () {
        if(ItemStack.hasNbt()) {
            Int currentNote = ItemStack.getNbt().getInt(hhnb.current_note);
        }
    }

    @Override
    public TypedActionResult<ItemStack> () {
        if(!World.isClient) {
            PlayerEntity.playSound(Sounds.HHNB_HARP_EVENT, SoundCategory.RECORDS, 1.0f, PITCH);
            PlayerEntity.getItemCooldownManager().set(this, 1);
        }
    }
}
