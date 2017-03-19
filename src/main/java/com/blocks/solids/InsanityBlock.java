package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class InsanityBlock extends Block {

	public InsanityBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setBlockName("InsanityBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "InsanityBlock");
	}

}