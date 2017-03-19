package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class LuciferousDust extends Item {
	
	public LuciferousDust(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("LuciferousDust");
		setTextureName(Reference.MOD_ID + ":" + "LuciferousDust");
	}
}
