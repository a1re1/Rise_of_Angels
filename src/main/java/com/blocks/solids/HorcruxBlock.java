package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class HorcruxBlock extends Block {

	public HorcruxBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setBlockName("HorcruxBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "HorcruxBlock");
	}

}