
package net.juanxxo.lajuntautils.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.juanxxo.lajuntautils.init.LaJuntaUtilsModItems;
import net.juanxxo.lajuntautils.init.LaJuntaUtilsModFluids;
import net.juanxxo.lajuntautils.init.LaJuntaUtilsModFluidTypes;
import net.juanxxo.lajuntautils.init.LaJuntaUtilsModBlocks;

public abstract class PurifiedWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> LaJuntaUtilsModFluidTypes.PURIFIED_WATER_TYPE.get(), () -> LaJuntaUtilsModFluids.PURIFIED_WATER.get(),
			() -> LaJuntaUtilsModFluids.FLOWING_PURIFIED_WATER.get()).explosionResistance(100f).tickRate(8).bucket(() -> LaJuntaUtilsModItems.PURIFIED_WATER_BUCKET.get()).block(() -> (LiquidBlock) LaJuntaUtilsModBlocks.PURIFIED_WATER.get());

	private PurifiedWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PurifiedWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PurifiedWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
