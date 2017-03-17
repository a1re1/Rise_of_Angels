package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class DragonscaleArmor extends ItemArmor{
	
	public DragonscaleArmor(ArmorMaterial enumarmormaterial, int j, int k){
		super(enumarmormaterial, j, k);
		setCreativeTab(CreativeTabs.tabMisc);
		if(k == 0){
			setUnlocalizedName("DragonscaleHelm");
			setTextureName(Reference.MOD_ID + ":" + "DragonscaleHelm");
		}
		else if(k ==1){
			setUnlocalizedName("DragonscaleChest");
			setTextureName(Reference.MOD_ID + ":" + "DragonscaleChest");
		}
		else if(k ==2){
			setUnlocalizedName("DragonscaleGrieves");
			setTextureName(Reference.MOD_ID + ":" + "DragonscaleGrieves");
		}
		else{
			setUnlocalizedName("DragonscaleBoots");
			setTextureName(Reference.MOD_ID + ":" + "DragonscaleBoots");
		}
	}

}