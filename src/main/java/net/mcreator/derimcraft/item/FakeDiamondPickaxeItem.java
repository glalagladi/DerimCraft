
package net.mcreator.derimcraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.derimcraft.init.DerimcraftModTabs;

public class FakeDiamondPickaxeItem extends SwordItem {
	public FakeDiamondPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4;
			}

			public float getSpeed() {
				return 4f;
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
		}, 3, -3.8f, new Item.Properties().tab(DerimcraftModTabs.TAB_DERIM_CRAFTCREATIVETAB));
	}
}
