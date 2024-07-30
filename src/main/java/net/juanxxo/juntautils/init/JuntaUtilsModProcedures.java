
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.juanxxo.juntautils.init;

import net.juanxxo.juntautils.procedures.ZpBlueParticleEmitterProcedure;
import net.juanxxo.juntautils.procedures.DamagePlayerZpProcedure;
import net.juanxxo.juntautils.procedures.DamagePlayerZpLvlFinalProcedure;
import net.juanxxo.juntautils.procedures.DamagePalyerZpLvlTwoProcedure;
import net.juanxxo.juntautils.procedures.CastigoLighningProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class JuntaUtilsModProcedures {
	public static void load() {
		new DamagePlayerZpProcedure();
		new ZpBlueParticleEmitterProcedure();
		new DamagePalyerZpLvlTwoProcedure();
		new DamagePlayerZpLvlFinalProcedure();
		new CastigoLighningProcedure();
	}
}
