package com.kyro.riseofangels;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;

public class RoAItems {
	
	public static Item DemonTail = new DemonTail().setUnlocalizedName("DemonTail");
	
	public static void init() {
		
		RegisterHelper.registerItem(DemonTail);
		
	}
	
	
}