package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CloudBlock extends Block {

	public CloudBlock() {
		super(Material.rock);
		setHarvestLevel("shovel", 2);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("CloudBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "CloudBlock");
	}

}