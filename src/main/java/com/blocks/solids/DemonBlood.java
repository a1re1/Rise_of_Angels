package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemonBlood extends Block {

	public DemonBlood() {
		super(Material.clay);
		setHarvestLevel("shovel", 2);
		setBlockName("DemonBlood");
		setBlockTextureName(Reference.MOD_ID + ":" + "DemonBlood");
	}

}
