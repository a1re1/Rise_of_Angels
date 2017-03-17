package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Clock extends Block {

	public Clock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("Clock");
		setBlockTextureName(Reference.MOD_ID + ":" + "Clock");
	}

}