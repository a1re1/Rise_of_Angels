package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class InsanityIngot extends Item {
	
	public InsanityIngot(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("InsanityIngot");
		setTextureName(Reference.MOD_ID + ":" + "InsanityIngot");
	}

}
