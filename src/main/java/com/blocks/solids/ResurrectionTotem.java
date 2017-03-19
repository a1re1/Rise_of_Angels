package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ResurrectionTotem extends Block {

	public ResurrectionTotem() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 0);
		setBlockName("ResurrectionTotem");
		setBlockTextureName(Reference.MOD_ID + ":" + "ResurrectionTotem");
	}

}