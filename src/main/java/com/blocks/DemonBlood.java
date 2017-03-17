package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemonBlood extends Block {

	public DemonBlood() {
		super(Material.clay);
		setHarvestLevel("shovel", 2);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("DemonBlood");
		setBlockTextureName(Reference.MOD_ID + ":" + "DemonBlood");
	}

}
