package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SilverBullet extends Item{

	public SilverBullet(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("SilverBullet");
		setTextureName(Reference.MOD_ID + ":" + "SilverBullet");
	}

}

