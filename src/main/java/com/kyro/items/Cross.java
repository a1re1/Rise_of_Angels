package com.kyro.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Cross extends Item{

	public Cross(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("Cross");
		setTextureName(Reference.MOD_ID + ":" + "Cross");
	}

}
