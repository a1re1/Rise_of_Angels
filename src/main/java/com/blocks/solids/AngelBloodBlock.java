package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AngelBloodBlock extends Block {

	public AngelBloodBlock() {
		super(Material.clay);
		setHarvestLevel("shovel", 2);
		setBlockName("AngelBloodBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "AngelBloodBlock");
	}

}