package org.bdtss.immersive_forest.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.bdtss.immersive_forest.ImmersiveForestMod;

public class ModItems {
  public static Item registerItem(String id, Item item){
    return Registry.register(Registries.ITEM,new Identifier(ImmersiveForestMod.MODID,id),item);
  }

  public static Item registerItem(String id, Item item, RegistryKey<ItemGroup> itemGroupRegistryKey){
    Item returnItem = Registry.register(Registries.ITEM,new Identifier(ImmersiveForestMod.MODID,id),item);
    ItemGroupEvents.modifyEntriesEvent(itemGroupRegistryKey).register(entries -> entries.add(returnItem));
    return returnItem;
  }
  public static void register(){
    ImmersiveForestMod.LOGGER.debug("Registering items for: "+ImmersiveForestMod.MODID);
  }
}
