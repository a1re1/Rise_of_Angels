package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CelestialIngot extends Item {
	
	public CelestialIngot(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("CelestialIngot");
		setTextureName(Reference.MOD_ID + ":" + "CelestialIngot");
	}
}
