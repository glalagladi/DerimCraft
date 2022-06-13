package net.mcreator.derimcraft.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import java.util.HashMap;

public class SayAscoomandProcedure {
	public static void execute(LevelAccessor world, HashMap cmdparams) {
		if (cmdparams == null)
			return;
		String texte = "";
		double i = 0;
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList()
						.broadcastMessage(new TextComponent(("<" + (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + ">" + " "
								+ (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")+ " "
								+ (cmdparams.containsKey("2") ? cmdparams.get("2").toString() : "")+ " "
								+ (cmdparams.containsKey("3") ? cmdparams.get("3").toString() : "")+ " "
								+ (cmdparams.containsKey("4") ? cmdparams.get("4").toString() : "")+ " "
								+ (cmdparams.containsKey("5") ? cmdparams.get("5").toString() : "")+ " "
								+ (cmdparams.containsKey("6") ? cmdparams.get("6").toString() : "")+ " "
								+ (cmdparams.containsKey("7") ? cmdparams.get("7").toString() : "")+ " "
								+ (cmdparams.containsKey("8") ? cmdparams.get("8").toString() : "")+ " "
								+ (cmdparams.containsKey("9") ? cmdparams.get("9").toString() : "")+ " "
								+ (cmdparams.containsKey("10") ? cmdparams.get("10").toString() : "")+ " "
								+ (cmdparams.containsKey("11") ? cmdparams.get("11").toString() : "")+ " "
								+ (cmdparams.containsKey("12") ? cmdparams.get("12").toString() : "")+ " "
								+ (cmdparams.containsKey("13") ? cmdparams.get("13").toString() : "")+ " "
								+ (cmdparams.containsKey("14") ? cmdparams.get("14").toString() : "")+ " "
								+ (cmdparams.containsKey("15") ? cmdparams.get("15").toString() : "")+ " "
								+ (cmdparams.containsKey("16") ? cmdparams.get("16").toString() : "")+ " "
								+ (cmdparams.containsKey("17") ? cmdparams.get("17").toString() : "")+ " "
								+ (cmdparams.containsKey("18") ? cmdparams.get("18").toString() : "")+ " "
								+ (cmdparams.containsKey("19") ? cmdparams.get("19").toString() : "")+ " "
								+ (cmdparams.containsKey("20") ? cmdparams.get("20").toString() : "")+ " ")), ChatType.SYSTEM, Util.NIL_UUID);
		}
	}
}
