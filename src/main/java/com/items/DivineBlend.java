package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DivineBlend extends Item {
	
	public DivineBlend(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("DivineBlend");
		setTextureName(Reference.MOD_ID + ":" + "DivineBlend");
	}
}
