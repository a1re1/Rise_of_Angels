package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EternalBlock extends Block {

	public EternalBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setBlockName("EternalBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "EternalBlock");
	}

}