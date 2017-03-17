package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EternalIngot extends Item {
	
	public EternalIngot(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("EternalIngot");
		setTextureName(Reference.MOD_ID + ":" + "EternalIngot");
	}
}
