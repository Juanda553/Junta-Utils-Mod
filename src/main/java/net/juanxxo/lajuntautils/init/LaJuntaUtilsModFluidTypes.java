
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.juanxxo.lajuntautils.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.juanxxo.lajuntautils.fluid.types.PurifiedWaterFluidType;
import net.juanxxo.lajuntautils.LaJuntaUtilsMod;

public class LaJuntaUtilsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, LaJuntaUtilsMod.MODID);
	public static final RegistryObject<FluidType> PURIFIED_WATER_TYPE = REGISTRY.register("purified_water", () -> new PurifiedWaterFluidType());
}
