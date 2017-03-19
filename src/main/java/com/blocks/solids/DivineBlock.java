package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DivineBlock extends Block {

	public DivineBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setBlockName("DivineBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "DivineBlock");
	}

}