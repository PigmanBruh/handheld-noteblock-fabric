package net.pigmanbruh.hhnb;

import net.fabricmc.api.ClientModInitializer;

public class MainClient implements ClientModInitializer {

    private static KeyBinding keyBinding;
        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
           "key.hhnb.change.note",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_Z,
            "category.hhnb"
        ));

    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (keyBinding.wasPressed()) {
                client.player.sendMessage(Text.literal("Key Z was pressed!"), false);
            }
        });
    }
}