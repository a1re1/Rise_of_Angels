package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ImmortalBlock extends Block {

	public ImmortalBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("ImmortalBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "ImmortalBlock");
	}

}