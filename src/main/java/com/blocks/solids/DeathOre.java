package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DeathOre extends Block {

	public DeathOre() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setBlockName("DeathOre");
		setBlockTextureName(Reference.MOD_ID + ":" + "DeathOre");
		setLightLevel(0.5F);
	}

}