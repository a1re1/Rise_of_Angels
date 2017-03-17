package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class CultistArmor extends ItemArmor{
	
	public String textureName;

	public CultistArmor(ArmorMaterial enumarmormaterial, int j, int k){
		super(enumarmormaterial, j, k);
		this.textureName = "cultrobes";
		setCreativeTab(CreativeTabs.tabMisc);
		if(k == 0){
			setUnlocalizedName("CultHood");
			setTextureName(Reference.MOD_ID + ":" + "CultHood");
		}
		else if(k ==1){
			setUnlocalizedName("CultRobe");
			setTextureName(Reference.MOD_ID + ":" + "CultRobe");
		}
		else if(k ==2){
			setUnlocalizedName("CultBritches");
			setTextureName(Reference.MOD_ID + ":" + "CultBritches");
		}
		else{
			setUnlocalizedName("CultShoes");
			setTextureName(Reference.MOD_ID + ":" + "CultShoes");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (armorType == 0 || armorType == 1 || armorType == 3) {
			return Reference.MOD_ID + ":textures/armor/cultrobes_1.png";
		}else if(armorType == 2){
			return Reference.MOD_ID + ":textures/armor/cultrobes_2.png";
		}else{
			return null;
		}
	}

}