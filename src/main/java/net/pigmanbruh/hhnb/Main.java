package net.pigmanbruh.hhnb;

import net.pigmanbruh.hhnb.item.ModItem;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
    public static final String Mod_ID = "hhnb";
    public static final Logger LOGGER = LoggerFactory.getLogger(Mod_ID);

    @Override
    public void onInitialize() {
        ModItem.registerItem();
    }
}
