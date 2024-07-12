
package net.juanxxo.lajuntautils.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.Component;

import net.juanxxo.lajuntautils.init.LaJuntaUtilsModFluids;

import java.util.List;

public class PurifiedWaterItem extends BucketItem {
	public PurifiedWaterItem() {
		super(LaJuntaUtilsModFluids.PURIFIED_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Agua purificada gracias al impacto"));
	}
}
