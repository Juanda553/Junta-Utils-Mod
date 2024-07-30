/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.juanxxo.juntautils;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.juanxxo.juntautils.init.JuntaUtilsModTabs;
import net.juanxxo.juntautils.init.JuntaUtilsModProcedures;
import net.juanxxo.juntautils.init.JuntaUtilsModParticleTypes;
import net.juanxxo.juntautils.init.JuntaUtilsModItems;
import net.juanxxo.juntautils.init.JuntaUtilsModCommands;
import net.juanxxo.juntautils.init.JuntaUtilsModBlocks;
import net.juanxxo.juntautils.init.JuntaUtilsModBiomes;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.api.ModInitializer;

public class JuntaUtilsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "junta_utils";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing JuntaUtilsMod");
		JuntaUtilsModParticleTypes.load();
		JuntaUtilsModTabs.load();

		JuntaUtilsModBlocks.load();
		JuntaUtilsModItems.load();

		JuntaUtilsModProcedures.load();
		JuntaUtilsModCommands.load();

		JuntaUtilsModBiomes.loadEndBiomes();
		ServerLifecycleEvents.SERVER_STARTING.register((server) -> {
			JuntaUtilsModBiomes.load(server);
		});
	}
}
