package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HolyWaterVial extends Item{

	public HolyWaterVial(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("HolyWaterVial");
		setTextureName(Reference.MOD_ID + ":" + "HolyWaterVial");
	}

}

