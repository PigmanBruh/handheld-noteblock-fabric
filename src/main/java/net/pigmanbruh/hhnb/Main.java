
packagepackagpackagepackpackagepackagpackagepacpackagepackagpackagepackpackagepackagpackagepac  net.pigmanbruh.handheldnoteblock;

import net.pigmanbruh.handheldnoteblock.item.ModItem;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
    public static final String Mod_ID = "handheld_noteblock";
    public static final Logger LOGGER = LoggerFactory.getLogger(Mod_ID);

    @Override
    public void onInitialize() {
        ModItem.registerItem();
    }
}
