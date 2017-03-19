package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LucOre extends Block {

	public LucOre() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 3);
		setBlockName("LucOre");
		setBlockTextureName(Reference.MOD_ID + ":" + "LucOre");
	}

}
