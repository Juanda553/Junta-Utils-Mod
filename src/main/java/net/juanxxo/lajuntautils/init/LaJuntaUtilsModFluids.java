
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.juanxxo.lajuntautils.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.juanxxo.lajuntautils.fluid.PurifiedWaterFluid;
import net.juanxxo.lajuntautils.LaJuntaUtilsMod;

public class LaJuntaUtilsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, LaJuntaUtilsMod.MODID);
	public static final RegistryObject<FlowingFluid> PURIFIED_WATER = REGISTRY.register("purified_water", () -> new PurifiedWaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_PURIFIED_WATER = REGISTRY.register("flowing_purified_water", () -> new PurifiedWaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(PURIFIED_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PURIFIED_WATER.get(), RenderType.translucent());
		}
	}
}
