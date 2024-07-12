
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juanxxo.lajuntautils.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.juanxxo.lajuntautils.item.ZpBeamFragmentPurpleItem;
import net.juanxxo.lajuntautils.item.ZpBeamFragmentBlueItem;
import net.juanxxo.lajuntautils.item.PurifiedWaterItem;
import net.juanxxo.lajuntautils.item.AguardienteTapaVerdeItem;
import net.juanxxo.lajuntautils.LaJuntaUtilsMod;

public class LaJuntaUtilsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LaJuntaUtilsMod.MODID);
	public static final RegistryObject<Item> AGUARDIENTE_TAPA_VERDE = REGISTRY.register("aguardiente_tapa_verde", () -> new AguardienteTapaVerdeItem());
	public static final RegistryObject<Item> PURIFIED_WATER_BUCKET = REGISTRY.register("purified_water_bucket", () -> new PurifiedWaterItem());
	public static final RegistryObject<Item> ZERO_POINT_BEAM_BLUE = block(LaJuntaUtilsModBlocks.ZERO_POINT_BEAM_BLUE, LaJuntaUtilsModTabs.TAB_LA_JUNTA_UTILS_TAB);
	public static final RegistryObject<Item> ZP_BEAM_FRAGMENT_BLUE = REGISTRY.register("zp_beam_fragment_blue", () -> new ZpBeamFragmentBlueItem());
	public static final RegistryObject<Item> ZP_BEAM_FRAGMENT_PURPLE = REGISTRY.register("zp_beam_fragment_purple", () -> new ZpBeamFragmentPurpleItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
