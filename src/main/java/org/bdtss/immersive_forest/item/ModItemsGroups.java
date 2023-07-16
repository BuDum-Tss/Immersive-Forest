package org.bdtss.immersive_forest.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroups {

  public static final RegistryKey<ItemGroup> IMMERSIVE_FOREST = ModItemsGroups.register(
      "immersive_forest");

  private static RegistryKey<ItemGroup> register(String id) {
    return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(id));
  }

  public static ItemGroup register() {
    ItemGroup itemGroup = FabricItemGroup.builder().icon(() -> new ItemStack(Items.OAK_SAPLING))
        .displayName(Text.translatable("Immersive forest"))
        .entries((displayContext, entries) -> {
        }).build();
    return Registry.register(Registries.ITEM_GROUP, new Identifier("immersive_forest", "immersive_forest_group"),itemGroup);
  }
}
