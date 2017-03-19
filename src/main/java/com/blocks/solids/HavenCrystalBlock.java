package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class HavenCrystalBlock extends Block {

	public HavenCrystalBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setBlockName("HavenCrystalBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "HavenCrystalBlock");
		setLightLevel(3F);
	}

}