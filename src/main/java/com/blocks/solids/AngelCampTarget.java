package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AngelCampTarget extends Block {

	public AngelCampTarget() {
		super(Material.wood);
		setHarvestLevel("axe", 2);
		setBlockName("AngelCampTarget");
		setBlockTextureName(Reference.MOD_ID + ":" + "AngelCampTarget");
	}

}