package org.bdtss.immersive_forest.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.bdtss.immersive_forest.ImmersiveForestMod;
import org.bdtss.immersive_forest.item.ModItems;

public class ModBlocks {

  public static Block registerBlock(String id, Block block) {
    ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()));
    return Registry.register(Registries.BLOCK, new Identifier(ImmersiveForestMod.MODID, id), block);
  }

  public static Block registerBlock(String id, Block block,
      RegistryKey<ItemGroup> blockGroupRegistryKey) {
    ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()),
        blockGroupRegistryKey);
    return Registry.register(Registries.BLOCK, new Identifier(ImmersiveForestMod.MODID, id), block);

  }

  public static void register() {
    ImmersiveForestMod.LOGGER.debug("Registering blocks for: " + ImmersiveForestMod.MODID);
  }
}
