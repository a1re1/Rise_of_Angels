package com.kyro.items;

import com.kyro.functionality.godlyRating;
import com.kyro.riseofangels.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AngelHeart extends ItemFood{
	
	godlyRating player;
	
	public AngelHeart(int healAmount, float saturationModifier, boolean wolvesFavorite){
		super(healAmount, saturationModifier, wolvesFavorite);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("AngelHeart");
		setTextureName(Reference.MOD_ID + ":" + "AngelHeart");
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	    this.player = new godlyRating(player);
	    this.player.addRating(-10);
	}
	
}


