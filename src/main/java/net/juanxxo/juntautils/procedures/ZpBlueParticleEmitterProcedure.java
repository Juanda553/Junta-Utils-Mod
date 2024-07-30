package net.juanxxo.juntautils.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.juanxxo.juntautils.init.JuntaUtilsModParticleTypes;

public class ZpBlueParticleEmitterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (JuntaUtilsModParticleTypes.ZP_BLUE_PARTICLE), x, y, z, 0, 1, 0);
	}
}
