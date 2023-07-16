package org.bdtss.immersive_forest;

import net.fabricmc.api.ModInitializer;

import org.bdtss.immersive_forest.block.ModBlocks;
import org.bdtss.immersive_forest.item.ModItems;
import org.bdtss.immersive_forest.item.ModItemsGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImmersiveForestMod implements ModInitializer {

  public static final String MODID = "immersive_forest";
  public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

  @Override
  public void onInitialize() {
    // This code runs as soon as Minecraft is in a mod-load-ready state.
    // However, some things (like resources) may still be uninitialized.
    // Proceed with mild caution.
    ModBlocks.register();
    ModItems.register();
    LOGGER.info("Initialization finished: " + MODID);
  }
}