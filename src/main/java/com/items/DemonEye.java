package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class DemonEye extends Item {
	
	public DemonEye(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("DemonEye");
		setTextureName(Reference.MOD_ID + ":" + "DemonEye");
	}
}
