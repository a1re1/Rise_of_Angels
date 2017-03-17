package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class InsanityBlock extends Block {

	public InsanityBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("InsanityBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "InsanityBlock");
	}

}