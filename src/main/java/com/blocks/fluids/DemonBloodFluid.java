package com.blocks.fluids;

import com.blocks.RoABlocks;

import lib.utility.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class DemonBloodFluid extends BlockFluidClassic {

	public DemonBloodFluid() {
		super(RoABlocks.AngelBlood, Material.water);
		setBlockName("Fluid_DemonBlood");
		setBlockTextureName(Reference.MOD_ID + ":" + "Fluid_DemonBlood");
	}

}