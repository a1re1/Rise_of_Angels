package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AngelDust extends Item {
	
	public AngelDust(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("AngelDust");
		setTextureName(Reference.MOD_ID + ":" + "AngelDust");
	}

}
