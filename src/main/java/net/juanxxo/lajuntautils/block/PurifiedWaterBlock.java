
package net.juanxxo.lajuntautils.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.juanxxo.lajuntautils.procedures.RepirarBajoAguaPurificadaProcedure;
import net.juanxxo.lajuntautils.init.LaJuntaUtilsModFluids;

public class PurifiedWaterBlock extends LiquidBlock {
	public PurifiedWaterBlock() {
		super(() -> LaJuntaUtilsModFluids.PURIFIED_WATER.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		RepirarBajoAguaPurificadaProcedure.execute(entity);
	}
}
