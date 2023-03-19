package net.pigmanbruh.hhnb;

import net.pigmanbruh.hhnb.item.Keybind;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.option.KeyBinding;

public class MainClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Keybind.registerKeybinds();
    }
}