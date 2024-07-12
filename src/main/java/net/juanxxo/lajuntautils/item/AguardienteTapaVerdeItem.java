
package net.juanxxo.lajuntautils.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.juanxxo.lajuntautils.procedures.BorracheraProcedure;
import net.juanxxo.lajuntautils.init.LaJuntaUtilsModTabs;

public class AguardienteTapaVerdeItem extends Item {
	public AguardienteTapaVerdeItem() {
		super(new Item.Properties().tab(LaJuntaUtilsModTabs.TAB_LA_JUNTA_UTILS_TAB).stacksTo(1).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(0).saturationMod(1f).alwaysEat().meat().build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 60;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BorracheraProcedure.execute(entity);
		return retval;
	}
}
