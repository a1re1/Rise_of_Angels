package com.kyro.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class HolySword extends ItemSword {
	
	public HolySword(ToolMaterial enumtoolmaterial){
		super(enumtoolmaterial);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("HolySword");
		setTextureName(Reference.MOD_ID + ":" + "HolySword");
	}

}