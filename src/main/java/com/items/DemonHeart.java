package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DemonHeart extends Item{
	
	public DemonHeart(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("DemonHeart");
		setTextureName(Reference.MOD_ID + ":" + "DemonHeart");
	}

}
