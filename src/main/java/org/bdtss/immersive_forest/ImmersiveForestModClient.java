package org.bdtss.immersive_forest;

import net.fabricmc.api.ClientModInitializer;
import org.bdtss.immersive_forest.block.ModBlocks;
import org.bdtss.immersive_forest.item.ModItems;
import org.bdtss.immersive_forest.item.ModItemsGroups;

public class ImmersiveForestModClient implements ClientModInitializer {

  @Override
  public void onInitializeClient() {
    // This entrypoint is suitable for setting up client-specific logic, such as rendering
    ModItemsGroups.register();
    ModBlocks.register();
		ModItems.register();
		ImmersiveForestMod.LOGGER.info("Initialization finished: " + ImmersiveForestMod.MODID);
  }
}