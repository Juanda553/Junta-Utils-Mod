
package net.juanxxo.lajuntautils.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.juanxxo.lajuntautils.init.LaJuntaUtilsModTabs;

public class ZpBeamFragmentPurpleItem extends Item {
	public ZpBeamFragmentPurpleItem() {
		super(new Item.Properties().tab(LaJuntaUtilsModTabs.TAB_LA_JUNTA_UTILS_TAB).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public int getEnchantmentValue() {
		return 22;
	}
}
