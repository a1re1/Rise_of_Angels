package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class HavenCrystal extends Item {
	
	public HavenCrystal(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("HavenCrystal");
		setTextureName(Reference.MOD_ID + ":" + "HavenCrystal");
	}
}
