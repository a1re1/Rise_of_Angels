package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CelestialBlock extends Block {

	public CelestialBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("CelestialBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "CelestialBlock");
	}

}