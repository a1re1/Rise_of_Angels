package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class HorcruxIngot extends Item {
	
	public HorcruxIngot(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("HorcruxIngot");
		setTextureName(Reference.MOD_ID + ":" + "HorcruxIngot");
	}
}
