package com.kyro.riseofangels;
import java.util.ArrayList;

import com.kyro.items.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;


public class RoAItems {
	
	//Items
	public static Item DemonTail = new DemonTail();
	public static Item DeathFire = new DeathFire();
	public static Item DemonBloodVial = new DemonBloodVial();
	public static Item AngelWings = new AngelWings();
	public static Item BrokenHalo = new BrokenHalo();
	public static Item Cross = new Cross();
	public static Item HolyWaterVial = new HolyWaterVial();
	public static Item SilverBullet = new SilverBullet();
	
	//Consumables
	public static Item AngelHeart = new AngelHeart(5, 4, false);
	public static Item DemonHeart = new DemonHeart();//TODO
	public static Item EdenFrag = new EdenFrag();//TODO
	
	//Tools
	public static Item DemonSword = new DemonSword(ToolMaterial.EMERALD);
	public static Item HolySword = new HolySword(ToolMaterial.EMERALD);
	
	//Armor
	public static Item CultBritches = new CultistArmor(ArmorMaterial.CHAIN, riseofangels.proxy.addArmor("CultistBritches"), 2);
	public static Item CultHood = new CultistArmor(ArmorMaterial.CHAIN, riseofangels.proxy.addArmor("CultHood"), 0);
	public static Item CultRobe = new CultistArmor(ArmorMaterial.CHAIN, riseofangels.proxy.addArmor("CultRobe"), 1);
	public static Item CultShoes = new CultistArmor(ArmorMaterial.CHAIN, riseofangels.proxy.addArmor("CultShoes"), 3);
	public static Item DragonscaleBoots = new DragonscaleArmor(ArmorMaterial.DIAMOND, riseofangels.proxy.addArmor("DragonscaleBoots"), 3);
	public static Item DragonscaleChest = new DragonscaleArmor(ArmorMaterial.DIAMOND, riseofangels.proxy.addArmor("DragonscaleChest"), 1);
	public static Item DragonscaleGrieves = new DragonscaleArmor(ArmorMaterial.DIAMOND, riseofangels.proxy.addArmor("DragonscaleGrieves"), 2);
	public static Item DragonscaleHelm = new DragonscaleArmor(ArmorMaterial.DIAMOND, riseofangels.proxy.addArmor("DragonscaleHelm"), 0);
	public static Item CrusaderHelm = new CrusaderGear(ArmorMaterial.DIAMOND, riseofangels.proxy.addArmor("CrusaderHelm"), 0);
	public static Item CrusaderMail = new CrusaderGear(ArmorMaterial.DIAMOND, riseofangels.proxy.addArmor("CrusaderMail"), 1);
	public static Item CrusaderLeggings = new CrusaderGear(ArmorMaterial.DIAMOND, riseofangels.proxy.addArmor("CrusaderLeggings"), 2);
	public static Item CrusaderBoots = new CrusaderGear(ArmorMaterial.DIAMOND, riseofangels.proxy.addArmor("CrusaderBoots"), 3);
	public static Item PriestHat = new PriestRobe(ArmorMaterial.CHAIN, riseofangels.proxy.addArmor("PriestHat"), 0);
	public static Item PriestRobe = new PriestRobe(ArmorMaterial.CHAIN, riseofangels.proxy.addArmor("PriestRobe"), 1);
	public static Item PriestPants = new PriestRobe(ArmorMaterial.CHAIN, riseofangels.proxy.addArmor("PriestPants"), 2);
	public static Item PriestShoes = new PriestRobe(ArmorMaterial.CHAIN, riseofangels.proxy.addArmor("PriestShoes"), 3);
	
	public static void init() {
		
		RegisterHelper.registerItem(AngelHeart);
		RegisterHelper.registerItem(DemonTail);
		RegisterHelper.registerItem(CultBritches);
		RegisterHelper.registerItem(CultHood);
		RegisterHelper.registerItem(CultRobe);
		RegisterHelper.registerItem(CultShoes);
		RegisterHelper.registerItem(DeathFire);
		RegisterHelper.registerItem(DemonBloodVial);
		RegisterHelper.registerItem(DemonHeart);
		RegisterHelper.registerItem(DemonSword);
		RegisterHelper.registerItem(DragonscaleBoots);
		RegisterHelper.registerItem(DragonscaleChest);
		RegisterHelper.registerItem(DragonscaleGrieves);
		RegisterHelper.registerItem(DragonscaleHelm);
		RegisterHelper.registerItem(PriestHat);
		RegisterHelper.registerItem(PriestRobe);
		RegisterHelper.registerItem(PriestPants);
		RegisterHelper.registerItem(PriestShoes);
		RegisterHelper.registerItem(CrusaderHelm);
		RegisterHelper.registerItem(CrusaderMail);
		RegisterHelper.registerItem(CrusaderLeggings);
		RegisterHelper.registerItem(CrusaderBoots);
		RegisterHelper.registerItem(AngelWings);
		RegisterHelper.registerItem(BrokenHalo);
		RegisterHelper.registerItem(Cross);
		RegisterHelper.registerItem(EdenFrag);
		RegisterHelper.registerItem(HolySword);
		RegisterHelper.registerItem(HolyWaterVial);
		RegisterHelper.registerItem(SilverBullet);
		
	}	
	
}