package com.items;

import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class PriestRobe extends ItemArmor{
	
	public String textureName;

	public PriestRobe(ArmorMaterial enumarmormaterial, int j, int k){
		super(enumarmormaterial, j, k);
		this.textureName = "priestrobes";
		setCreativeTab(CreativeTabs.tabMisc);
		if(k == 0){
			setUnlocalizedName("PriestHat");
			setTextureName(Reference.MOD_ID + ":" + "PriestHat");
		}
		else if(k ==1){
			setUnlocalizedName("PriestRobe");
			setTextureName(Reference.MOD_ID + ":" + "PriestRobe");
		}
		else if(k ==2){
			setUnlocalizedName("PriestPants");
			setTextureName(Reference.MOD_ID + ":" + "PriestPants");
		}
		else{
			setUnlocalizedName("PriestShoes");
			setTextureName(Reference.MOD_ID + ":" + "PriestShoes");
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (armorType == 0 || armorType == 1 || armorType == 3) {
			return Reference.MOD_ID + ":textures/armor/priestrobes_1.png";
		}else if(armorType == 2){
			return Reference.MOD_ID + ":textures/armor/priestrobes_2.png";
		}else{
			return null;
		}
	}

}