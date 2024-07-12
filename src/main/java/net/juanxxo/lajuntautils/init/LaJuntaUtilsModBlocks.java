
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juanxxo.lajuntautils.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.juanxxo.lajuntautils.block.ZeroPointBeamPurpleBlock;
import net.juanxxo.lajuntautils.block.ZeroPointBeamBlueBlock;
import net.juanxxo.lajuntautils.block.PurifiedWaterBlock;
import net.juanxxo.lajuntautils.LaJuntaUtilsMod;

public class LaJuntaUtilsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LaJuntaUtilsMod.MODID);
	public static final RegistryObject<Block> PURIFIED_WATER = REGISTRY.register("purified_water", () -> new PurifiedWaterBlock());
	public static final RegistryObject<Block> ZERO_POINT_BEAM_BLUE = REGISTRY.register("zero_point_beam_blue", () -> new ZeroPointBeamBlueBlock());
	public static final RegistryObject<Block> ZERO_POINT_BEAM_PURPLE = REGISTRY.register("zero_point_beam_purple", () -> new ZeroPointBeamPurpleBlock());
}
