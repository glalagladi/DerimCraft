
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.derimcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.derimcraft.block.FakeDiamondBlockBlock;
import net.mcreator.derimcraft.block.DeepDrillBlock;
import net.mcreator.derimcraft.DerimcraftMod;

public class DerimcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DerimcraftMod.MODID);
	public static final RegistryObject<Block> DEEP_DRILL = REGISTRY.register("deep_drill", () -> new DeepDrillBlock());
	public static final RegistryObject<Block> FAKE_DIAMOND_BLOCK = REGISTRY.register("fake_diamond_block", () -> new FakeDiamondBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			DeepDrillBlock.registerRenderLayer();
		}
	}
}
