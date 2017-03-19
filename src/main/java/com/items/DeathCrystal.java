package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class DeathCrystal extends Item {
	
	public DeathCrystal(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("DeathCrystal");
		setTextureName(Reference.MOD_ID + ":" + "DeathCrystal");
	}
}
