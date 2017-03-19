package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class TheRapture extends Item {
	
	public TheRapture(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("TheRapture");
		setTextureName(Reference.MOD_ID + ":" + "TheRapture");
	}

}
