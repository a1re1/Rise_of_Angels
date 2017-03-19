package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LuciferousBlock extends Block {

	public LuciferousBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setBlockName("LuciferousBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "LuciferousBlock");
	}

}