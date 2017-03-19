package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DemonBloodVial extends Item{

	public DemonBloodVial(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("DemonBloodVial");
		setTextureName(Reference.MOD_ID + ":" + "DemonBloodVial");
	}
	
}
