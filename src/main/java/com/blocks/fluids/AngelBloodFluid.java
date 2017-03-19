package com.blocks.fluids;

import com.blocks.RoABlocks;

import lib.utility.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class AngelBloodFluid extends BlockFluidClassic {

	public AngelBloodFluid() {
		super(RoABlocks.AngelBlood, Material.water);
		setBlockName("Fluid_AngelBlood");
		setBlockTextureName(Reference.MOD_ID + ":" + "Fluid_AngelBlood");
	}

}