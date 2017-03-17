package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class DivineIngot extends Item {
	
	public DivineIngot(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("DivineIngot");
		setTextureName(Reference.MOD_ID + ":" + "DivineIngot");
	}
}
