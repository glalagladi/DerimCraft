
package net.mcreator.derimcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.derimcraft.init.DerimcraftModTabs;

public class FakeDiamondItem extends Item {
	public FakeDiamondItem() {
		super(new Item.Properties().tab(DerimcraftModTabs.TAB_DERIM_CRAFTCREATIVETAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
