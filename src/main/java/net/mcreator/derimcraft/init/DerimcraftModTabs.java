
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.derimcraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DerimcraftModTabs {
	public static CreativeModeTab TAB_DERIM_CRAFTCREATIVETAB;

	public static void load() {
		TAB_DERIM_CRAFTCREATIVETAB = new CreativeModeTab("tabderim_craftcreativetab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.WATER);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
