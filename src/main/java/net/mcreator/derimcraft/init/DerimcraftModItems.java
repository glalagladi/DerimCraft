
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.derimcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.derimcraft.item.FakediamondswordItem;
import net.mcreator.derimcraft.item.FakediamondAxeItem;
import net.mcreator.derimcraft.item.FakeDiamondPickaxeItem;
import net.mcreator.derimcraft.item.FakeDiamondItem;
import net.mcreator.derimcraft.DerimcraftMod;

public class DerimcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DerimcraftMod.MODID);
	public static final RegistryObject<Item> FAKE_DIAMOND = REGISTRY.register("fake_diamond", () -> new FakeDiamondItem());
	public static final RegistryObject<Item> FAKE_DIAMOND_PICKAXE = REGISTRY.register("fake_diamond_pickaxe", () -> new FakeDiamondPickaxeItem());
	public static final RegistryObject<Item> FAKEDIAMONDSWORD = REGISTRY.register("fakediamondsword", () -> new FakediamondswordItem());
	public static final RegistryObject<Item> FAKEDIAMOND_AXE = REGISTRY.register("fakediamond_axe", () -> new FakediamondAxeItem());
}
