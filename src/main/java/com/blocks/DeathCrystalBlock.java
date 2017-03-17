package com.blocks;

import com.kyro.riseofangels.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DeathCrystalBlock extends Block {

	public DeathCrystalBlock() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("DeathCrystalBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + "DeathCrystalBlock");
		setLightLevel(3F);
	}

}