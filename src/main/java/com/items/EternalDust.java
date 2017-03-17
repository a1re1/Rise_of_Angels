package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class EternalDust extends Item {
	
	public EternalDust(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("EternalDust");
		setTextureName(Reference.MOD_ID + ":" + "EternalDust");
	}
}
