package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ImmortalBlock extends Block {

	public ImmortalBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setBlockName("ImmortalBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "ImmortalBlock");
	}

}