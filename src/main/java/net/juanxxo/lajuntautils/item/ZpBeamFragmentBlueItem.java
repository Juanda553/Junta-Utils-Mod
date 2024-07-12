
package net.juanxxo.lajuntautils.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.juanxxo.lajuntautils.init.LaJuntaUtilsModTabs;

public class ZpBeamFragmentBlueItem extends Item {
	public ZpBeamFragmentBlueItem() {
		super(new Item.Properties().tab(LaJuntaUtilsModTabs.TAB_LA_JUNTA_UTILS_TAB).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public int getEnchantmentValue() {
		return 22;
	}
}
