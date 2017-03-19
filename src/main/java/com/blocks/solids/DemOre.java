package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemOre extends Block {

	public DemOre() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setBlockName("DemOre");
		setBlockTextureName(Reference.MOD_ID + ":" + "DemOre");
	}

}

