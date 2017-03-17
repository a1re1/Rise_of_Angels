package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Cross extends Block {

	public Cross() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("CrossBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "CrossBlock");
	}

}