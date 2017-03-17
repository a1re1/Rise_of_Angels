package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class CrusaderGear extends ItemArmor{
	
	public String textureName;

	public CrusaderGear(ArmorMaterial enumarmormaterial, int j, int k){
		super(enumarmormaterial, j, k);
		this.textureName = "crusadergarb";
		setCreativeTab(CreativeTabs.tabMisc);
		if(k == 0){
			setUnlocalizedName("CrusaderHelm");
			setTextureName(Reference.MOD_ID + ":" + "CrusaderHelm");
		}
		else if(k ==1){
			setUnlocalizedName("CrusaderMail");
			setTextureName(Reference.MOD_ID + ":" + "CrusaderMail");
		}
		else if(k ==2){
			setUnlocalizedName("CrusaderLeggings");
			setTextureName(Reference.MOD_ID + ":" + "CrusaderLeggings");
		}
		else{
			setUnlocalizedName("CrusaderBoots");
			setTextureName(Reference.MOD_ID + ":" + "CrusaderBoots");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (armorType == 0 || armorType == 1 || armorType == 3) {
			return Reference.MOD_ID + ":textures/armor/crusader_1.png";
		}else if(armorType == 2){
			return Reference.MOD_ID + ":textures/armor/crusader_2.png";
		}else{
			return null;
		}
	}
}
