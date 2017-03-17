package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class HorcruxDust extends Item {
	
	public HorcruxDust(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("HorcruxDust");
		setTextureName(Reference.MOD_ID + ":" + "HorcruxDust");
	}
}
