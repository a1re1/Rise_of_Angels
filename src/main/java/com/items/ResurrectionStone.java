package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ResurrectionStone extends Item {
	
	public ResurrectionStone(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("ResurrectionStone");
		setTextureName(Reference.MOD_ID + ":" + "ResurrectionStone");
	}


}
