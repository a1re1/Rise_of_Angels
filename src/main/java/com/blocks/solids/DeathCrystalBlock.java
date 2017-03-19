package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DeathCrystalBlock extends Block {

	public DeathCrystalBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setBlockName("DeathCrystalBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "DeathCrystalBlock");
		setLightLevel(3F);
	}

}