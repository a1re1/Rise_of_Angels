package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AngelCampTarget extends Block {

	public AngelCampTarget() {
		super(Material.wood);
		setHarvestLevel("axe", 2);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("AngelCampTarget");
		setBlockTextureName(Reference.MOD_ID + ":" + "AngelCampTarget");
	}

}