package com.kyro.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BrokenHalo extends Item{

	public BrokenHalo(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("BrokenHalo");
		setTextureName(Reference.MOD_ID + ":" + "BrokenHalo");
	}

}
