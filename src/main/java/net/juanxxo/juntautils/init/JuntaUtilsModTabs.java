
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.juanxxo.juntautils.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.juanxxo.juntautils.JuntaUtilsMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class JuntaUtilsModTabs {
	public static ResourceKey<CreativeModeTab> TAB_JUNTA_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(JuntaUtilsMod.MODID, "junta_tab"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_JUNTA_TAB, FabricItemGroup.builder().title(Component.translatable("item_group." + JuntaUtilsMod.MODID + ".junta_tab")).icon(() -> new ItemStack(Items.SUGAR)).build());
	}
}
