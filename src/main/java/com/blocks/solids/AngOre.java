package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AngOre extends Block {

	public AngOre() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setBlockName("AngOre");
		setBlockTextureName(Reference.MOD_ID + ":" + "AngOre");
	}

}
