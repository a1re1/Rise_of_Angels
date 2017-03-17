package com.items;

import com.kyro.riseofangels.Reference;

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
