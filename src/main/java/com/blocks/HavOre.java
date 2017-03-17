package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class HavOre extends Block {

	public HavOre() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("HavOre");
		setBlockTextureName(Reference.MOD_ID + ":" + "HavOre");
	}

}
