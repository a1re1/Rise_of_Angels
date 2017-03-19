package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CultuousBlend extends Item {
	
	public CultuousBlend(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("CultuousBlend");
		setTextureName(Reference.MOD_ID + ":" + "CultuousBlend");
	}
}
