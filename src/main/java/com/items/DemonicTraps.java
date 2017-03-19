package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class DemonicTraps extends Item {
	
	public DemonicTraps(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("DemonicTraps");
		setTextureName(Reference.MOD_ID + ":" + "DemonicTraps");
	}
}
