package com.kyro.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DeathFire extends Item{
	
	public DeathFire(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("DeathFire");
		setTextureName(Reference.MOD_ID + ":" + "DeathFire");
	}

}
