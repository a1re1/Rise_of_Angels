package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class CultuousIngot extends Item {
	
	public CultuousIngot(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("CultuousIngot");
		setTextureName(Reference.MOD_ID + ":" + "CultuousIngot");
	}
}
