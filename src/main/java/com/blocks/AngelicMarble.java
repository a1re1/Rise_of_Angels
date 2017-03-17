package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AngelicMarble extends Block {

	public AngelicMarble() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("AngelicMarble");
		setBlockTextureName(Reference.MOD_ID + ":" + "AngelicMarble");
	}

}