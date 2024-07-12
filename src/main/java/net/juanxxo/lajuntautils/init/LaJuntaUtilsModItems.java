
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juanxxo.lajuntautils.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.juanxxo.lajuntautils.item.PurifiedWaterItem;
import net.juanxxo.lajuntautils.item.AguardienteTapaVerdeItem;
import net.juanxxo.lajuntautils.LaJuntaUtilsMod;

public class LaJuntaUtilsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LaJuntaUtilsMod.MODID);
	public static final RegistryObject<Item> AGUARDIENTE_TAPA_VERDE = REGISTRY.register("aguardiente_tapa_verde", () -> new AguardienteTapaVerdeItem());
	public static final RegistryObject<Item> PURIFIED_WATER_BUCKET = REGISTRY.register("purified_water_bucket", () -> new PurifiedWaterItem());
}
