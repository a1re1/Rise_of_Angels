package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DestinyStone extends Block {

	public DestinyStone() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("DestinyStone");
		setBlockTextureName(Reference.MOD_ID + ":" + "DestinyStone");
	}

}
