package com.blocks.solids;

import lib.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class KyroanSoil extends Block {

	public KyroanSoil(Material m) {
		super(Material.ground);
		setHarvestLevel("shovel", 1);
		setBlockName("KyroanSoil");
		setBlockTextureName(Reference.MOD_ID + ":" + "KyroanSoil");
	}

}
