package com.kyro.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DemonTail extends Item {
	
	public DemonTail(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("DemonTail");
		setTextureName(Reference.MOD_ID + ":" + "DemonTail");
	}
	
}
