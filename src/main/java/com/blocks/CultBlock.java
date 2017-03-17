package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CultBlock extends Block {

	public CultBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("CultBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "CultBlock");
	}

}