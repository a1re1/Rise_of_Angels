package com.items;

import com.kyro.riseofangels.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.IIcon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DemonSword extends ItemSword {
	
	public DemonSword(ToolMaterial enumtoolmaterial){
		super(enumtoolmaterial);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("DemonSword");
		setTextureName(Reference.MOD_ID + ":" + "DemonSword");
	}

}
