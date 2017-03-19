package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class LuciferousIngot extends Item {
	
	public LuciferousIngot(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("LuciferousIngot");
		setTextureName(Reference.MOD_ID + ":" + "LuciferousIngot");
	}

}
