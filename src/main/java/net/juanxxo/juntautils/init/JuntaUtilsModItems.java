/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.juanxxo.juntautils.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.juanxxo.juntautils.JuntaUtilsMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class JuntaUtilsModItems {
	public static Item ZP_PURPLE_LASER;
	public static Item ZP_BLUE_LASER;
	public static Item ZERO_POINT_PASIVE;
	public static Item ZERO_POINT_ACTIVE;
	public static Item ZERO_PINT_ACTIVE_TWO;
	public static Item ZERO_POINT_ACTIVE_FINAL;

	public static void load() {
		ZP_PURPLE_LASER = register("zp_purple_laser", new BlockItem(JuntaUtilsModBlocks.ZP_PURPLE_LASER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(JuntaUtilsModTabs.TAB_JUNTA_TAB).register(content -> content.accept(ZP_PURPLE_LASER));
		ZP_BLUE_LASER = register("zp_blue_laser", new BlockItem(JuntaUtilsModBlocks.ZP_BLUE_LASER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(JuntaUtilsModTabs.TAB_JUNTA_TAB).register(content -> content.accept(ZP_BLUE_LASER));
		ZERO_POINT_PASIVE = register("zero_point_pasive", new BlockItem(JuntaUtilsModBlocks.ZERO_POINT_PASIVE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(JuntaUtilsModTabs.TAB_JUNTA_TAB).register(content -> content.accept(ZERO_POINT_PASIVE));
		ZERO_POINT_ACTIVE = register("zero_point_active", new BlockItem(JuntaUtilsModBlocks.ZERO_POINT_ACTIVE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(JuntaUtilsModTabs.TAB_JUNTA_TAB).register(content -> content.accept(ZERO_POINT_ACTIVE));
		ZERO_PINT_ACTIVE_TWO = register("zero_pint_active_two", new BlockItem(JuntaUtilsModBlocks.ZERO_PINT_ACTIVE_TWO, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(JuntaUtilsModTabs.TAB_JUNTA_TAB).register(content -> content.accept(ZERO_PINT_ACTIVE_TWO));
		ZERO_POINT_ACTIVE_FINAL = register("zero_point_active_final", new BlockItem(JuntaUtilsModBlocks.ZERO_POINT_ACTIVE_FINAL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(JuntaUtilsModTabs.TAB_JUNTA_TAB).register(content -> content.accept(ZERO_POINT_ACTIVE_FINAL));
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(JuntaUtilsMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
