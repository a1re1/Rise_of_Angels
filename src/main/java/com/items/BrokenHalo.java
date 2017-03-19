package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BrokenHalo extends Item{

	public BrokenHalo(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("BrokenHalo");
		setTextureName(Reference.MOD_ID + ":" + "BrokenHalo");
	}

}
