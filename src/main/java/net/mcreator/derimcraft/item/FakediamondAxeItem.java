
package net.mcreator.derimcraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.derimcraft.init.DerimcraftModTabs;

public class FakediamondAxeItem extends AxeItem {
	public FakediamondAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3.5f, new Item.Properties().tab(DerimcraftModTabs.TAB_DERIM_CRAFTCREATIVETAB));
	}
}
