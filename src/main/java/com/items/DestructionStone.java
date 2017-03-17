package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class DestructionStone extends Item {
	
	public DestructionStone(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("DestructionStone");
		setTextureName(Reference.MOD_ID + ":" + "DestructionStone");
	}
}
