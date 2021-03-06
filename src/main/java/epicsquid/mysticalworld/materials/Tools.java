package epicsquid.mysticalworld.materials;

import epicsquid.mysticallib.event.RegisterContentEvent;
import epicsquid.mysticallib.item.*;
import epicsquid.mysticalworld.MysticalWorld;

import javax.annotation.Nonnull;

public class Tools {
  public static void registerTools(@Nonnull RegisterContentEvent event) {
    for (Material material : Materials.getMaterials()) {
      event.addItem(new ItemAxeBase(material.getMaterial(), material.name() + "_axe", material.getMaterial().getHarvestLevel(), material.getMaterial().getMaxUses()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
      event.addItem(new ItemHoeBase(material.getMaterial(), material.name() + "_hoe", material.getMaterial().getHarvestLevel(), material.getMaterial().getMaxUses()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
      event.addItem(new ItemPickaxeBase(material.getMaterial(), material.name() + "_pickaxe", material.getMaterial().getHarvestLevel(), material.getMaterial().getMaxUses()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
      event.addItem(new ItemShovelBase(material.getMaterial(), material.name() + "_shovel", material.getMaterial().getHarvestLevel(), material.getMaterial().getMaxUses()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
      event.addItem(new ItemSwordBase(material.getMaterial(), material.name() + "_sword", material.getMaterial().getMaxUses()).setCreativeTab(MysticalWorld.tab).setMaxStackSize(1));
    }
  }
}
