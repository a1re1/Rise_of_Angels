package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AngelWings extends Item{

	public AngelWings(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("AngelWings");
		setTextureName(Reference.MOD_ID + ":" + "AngelWings");
	}

}
