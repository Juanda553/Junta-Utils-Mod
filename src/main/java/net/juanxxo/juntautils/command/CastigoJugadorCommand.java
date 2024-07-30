
package net.juanxxo.juntautils.command;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandBuildContext;

import net.juanxxo.juntautils.procedures.CastigoLighningProcedure;

import com.mojang.brigadier.CommandDispatcher;

public class CastigoJugadorCommand {
	public static void register(CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext commandBuildContext, Commands.CommandSelection environment) {
		dispatcher.register(Commands.literal("castigar").requires(s -> s.hasPermission(4)).then(Commands.argument("position", EntityArgument.player()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			CastigoLighningProcedure.execute(world, x, y, z, entity);
			return 0;
		})));
	}
}
