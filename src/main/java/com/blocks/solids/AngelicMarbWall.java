package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AngelicMarbWall extends Block {

	public AngelicMarbWall() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 1);
		setBlockName("AngelicMarbWall");
		setBlockTextureName(Reference.MOD_ID + ":" + "AngelicMarbWall");
	}

}