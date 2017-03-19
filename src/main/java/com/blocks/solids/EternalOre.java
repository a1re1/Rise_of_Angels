package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EternalOre extends Block {

	public EternalOre() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 3);
		setBlockName("EternalOre");
		setBlockTextureName(Reference.MOD_ID + ":" + "EternalOre");
	}

}