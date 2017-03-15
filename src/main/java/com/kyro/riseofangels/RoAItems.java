package com.kyro.riseofangels;
import java.util.ArrayList;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class RoAItems {
	
	public static Item DemonTail = new DemonTail();
	public static Item AngelHeart = new AngelHeart();
	public static Item CultBritches = new CultBritches();
	public static Item CultHood = new CultHood();
	public static Item CultRobe = new CultRobe();
	public static Item CultShoes = new CultShoes();
	public static Item DeathFire = new DeathFire();
	public static Item DemonBloodVial = new DemonBloodVial();
	public static Item DemonHeart = new DemonHeart();
	public static Item DemonSword = new DemonSword(ToolMaterial.EMERALD);
	public static Item DragonscaleBoots = new DragonscaleBoots();
	public static Item DragonscaleChest = new DragonscaleChest();
	public static Item DragonscaleGrieves = new DragonscaleGrieves();
	public static Item DragonscaleHelm = new DragonscaleHelm();
	
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
		
	}	
	
}