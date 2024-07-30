
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.juanxxo.juntautils.init;

import net.juanxxo.juntautils.command.CastigoJugadorCommand;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class JuntaUtilsModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, environment) -> {
			CastigoJugadorCommand.register(dispatcher, commandBuildContext, environment);
		});
	}
}
