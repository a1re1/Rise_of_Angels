package com.blocks.tutblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blockss {
	
	public static BlockModPortal lightPortal;
	public static BlockModFire lightFire;
	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks(){
		lightPortal = new BlockModPortal("lightPortal");
		lightFire  = new BlockModFire("lightFire");
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){
		GameRegistry.registerBlock(lightPortal, "lightPortal");
		GameRegistry.registerBlock(lightFire, "lightFire");
	}
}
