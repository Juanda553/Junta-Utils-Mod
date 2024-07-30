
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.juanxxo.juntautils.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.juanxxo.juntautils.block.ZpPurpleLaserBlock;
import net.juanxxo.juntautils.block.ZpBlueLaserBlock;
import net.juanxxo.juntautils.block.ZeroPointPasiveBlock;
import net.juanxxo.juntautils.block.ZeroPointActiveFinalBlock;
import net.juanxxo.juntautils.block.ZeroPointActiveBlock;
import net.juanxxo.juntautils.block.ZeroPintActiveTwoBlock;
import net.juanxxo.juntautils.JuntaUtilsMod;

public class JuntaUtilsModBlocks {
	public static Block ZP_PURPLE_LASER;
	public static Block ZP_BLUE_LASER;
	public static Block ZERO_POINT_PASIVE;
	public static Block ZERO_POINT_ACTIVE;
	public static Block ZERO_PINT_ACTIVE_TWO;
	public static Block ZERO_POINT_ACTIVE_FINAL;

	public static void load() {
		ZP_PURPLE_LASER = register("zp_purple_laser", new ZpPurpleLaserBlock());
		ZP_BLUE_LASER = register("zp_blue_laser", new ZpBlueLaserBlock());
		ZERO_POINT_PASIVE = register("zero_point_pasive", new ZeroPointPasiveBlock());
		ZERO_POINT_ACTIVE = register("zero_point_active", new ZeroPointActiveBlock());
		ZERO_PINT_ACTIVE_TWO = register("zero_pint_active_two", new ZeroPintActiveTwoBlock());
		ZERO_POINT_ACTIVE_FINAL = register("zero_point_active_final", new ZeroPointActiveFinalBlock());
	}

	public static void clientLoad() {
		ZpPurpleLaserBlock.clientInit();
		ZpBlueLaserBlock.clientInit();
		ZeroPointPasiveBlock.clientInit();
		ZeroPointActiveBlock.clientInit();
		ZeroPintActiveTwoBlock.clientInit();
		ZeroPointActiveFinalBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(JuntaUtilsMod.MODID, registryName), block);
	}
}
