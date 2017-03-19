package com.items;

import lib.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
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
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (armorType == 0 || armorType == 1 || armorType == 3) {
			return Reference.MOD_ID + ":textures/armor/dragon_1.png";
		}else if(armorType == 2){
			return Reference.MOD_ID + ":textures/armor/dragon_2.png";
		}else{
			return null;
		}
	}

}