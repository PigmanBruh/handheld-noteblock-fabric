package net.pigmanbruh.hhnb.item;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import net.minecraft.client.network.ClientPlayerEntity;

public class Keybind {

    public static KeyBinding changenote;

    public static void registerKeybinds() {
        changenote = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.hhnb.changenote", // The translation key of the keybinding's name
            InputUtil.Type.KEYSYM, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
            GLFW.GLFW_KEY_Z, // The keycode of the key
            "category.hhnb" // The translation key of the keybinding's category.
        ));
    }

    public static void registerKeyInput() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (changenote.wasPressed()) {
                ClientPlayerEntity.sendMessage(Text.literal("Key Z was pressed!"), false);
            }
        });

    registerKeyInput();

    }
}