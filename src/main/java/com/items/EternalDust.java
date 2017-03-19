package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class EternalDust extends Item {
	
	public EternalDust(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("EternalDust");
		setTextureName(Reference.MOD_ID + ":" + "EternalDust");
	}
}
