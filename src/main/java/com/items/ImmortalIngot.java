package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ImmortalIngot extends Item {
	
	public ImmortalIngot(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("ImmortalIngot");
		setTextureName(Reference.MOD_ID + ":" + "ImmortalIngot");
	}

}
