package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Pentagram extends Block {

	public Pentagram() {
		super(Material.grass);
		setHarvestLevel("shovel", 0);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("Pentagram");
		setBlockTextureName(Reference.MOD_ID + ":" + "Pentagram");
	}

}