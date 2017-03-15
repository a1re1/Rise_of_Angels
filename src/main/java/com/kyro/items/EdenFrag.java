package com.kyro.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EdenFrag extends Item{

	public EdenFrag(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("EdenFrag");
		setTextureName(Reference.MOD_ID + ":" + "EdenFrag");
	}

}
