package net.pigmanbruh.hhnb.keybind;

import net.pigmanbruh.hhnb.Main;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.entity.player.PlayerEntity;

public class Keybind {

    public static KeyBinding changenote;

    public static void registerKeybinds() {
        changenote = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.hhnb.changenote",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_Z,
            "category.hhnb"
        ));
    }

    public void registerKeyInput () {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (changenote.wasPressed()) {
                Main.LOGGER.info("The key is pressed");
            }
        });
    }
}