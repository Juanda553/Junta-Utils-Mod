
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juanxxo.lajuntautils.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LaJuntaUtilsModTabs {
	public static CreativeModeTab TAB_LA_JUNTA_UTILS_TAB;

	public static void load() {
		TAB_LA_JUNTA_UTILS_TAB = new CreativeModeTab("tabla_junta_utils_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LaJuntaUtilsModItems.AGUARDIENTE_TAPA_VERDE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
