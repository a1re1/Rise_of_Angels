package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class HavOre extends Block {

	public HavOre() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setBlockName("HavOre");
		setBlockTextureName(Reference.MOD_ID + ":" + "HavOre");
		setLightLevel(0.5F);
	}

}
