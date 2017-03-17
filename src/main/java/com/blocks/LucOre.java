package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LucOre extends Block {

	public LucOre() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("LucOre");
		setBlockTextureName(Reference.MOD_ID + ":" + "LucOre");
	}

}
