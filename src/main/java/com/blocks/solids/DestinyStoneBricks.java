package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DestinyStoneBricks extends Block {

	public DestinyStoneBricks() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 1);
		setBlockName("DestinyStoneBricks");
		setBlockTextureName(Reference.MOD_ID + ":" + "DestinyStoneBricks");
	}

}
