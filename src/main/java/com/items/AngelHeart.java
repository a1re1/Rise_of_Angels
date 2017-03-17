package com.items;

import com.kyro.riseofangels.Reference;
import com.kyro.riseofangels.RiseOfAngels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lib.utility.GodlyRating;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AngelHeart extends ItemFood{
	
	GodlyRating rate;
	
	public AngelHeart(int healAmount, float saturationModifier, boolean wolvesFavorite){
		super(healAmount, saturationModifier, wolvesFavorite);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("AngelHeart");
		setTextureName(Reference.MOD_ID + ":" + "AngelHeart");
	}
	
	@SideOnly(Side.CLIENT)
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	    rate = RiseOfAngels.proxy.getGodliness(player);
	    rate.addRating(-100/2);
	}
	
}


