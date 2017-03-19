package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CelestialBlock extends Block {

	public CelestialBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 3);
		setBlockName("CelestialBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "CelestialBlock");
	}

}