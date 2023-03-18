package net.pigmanbruh.hhnb.item;

import net.pigmanbruh.hhnb.Main;
import net.pigmanbruh.hhnb.item.ItemFunction;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {
    public static final Item HANDHELD_NOTEBLOCK = new ItemFunction(new FabricItemSettings());

    public static void registerItem() {
        Registry.register(Registries.ITEM, new Identifier(Main.Mod_ID, "handheld_noteblock"), HANDHELD_NOTEBLOCK);
    }

    public static void addItemsToItemGroups() {
        addToItemGroup(ItemGroups.REDSTONE, HANDHELD_NOTEBLOCK);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
}
