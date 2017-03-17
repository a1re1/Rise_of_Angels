package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AngelBloodBlock extends Block {

	public AngelBloodBlock() {
		super(Material.clay);
		setHarvestLevel("shovel", 2);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("AngelBloodBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "AngelBloodBlock");
	}

}