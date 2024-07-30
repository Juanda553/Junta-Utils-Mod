/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.juanxxo.juntautils.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;

import net.juanxxo.juntautils.client.particle.ZpBlueParticleParticle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class JuntaUtilsModParticleTypes {
	public static final SimpleParticleType ZP_BLUE_PARTICLE = FabricParticleTypes.simple(true);

	public static void clientLoad() {
		ParticleFactoryRegistry.getInstance().register(ZP_BLUE_PARTICLE, ZpBlueParticleParticle::provider);
	}

	public static void load() {
		Registry.register(BuiltInRegistries.PARTICLE_TYPE, new ResourceLocation("junta_utils", "zp_blue_particle"), ZP_BLUE_PARTICLE);
	}
}
