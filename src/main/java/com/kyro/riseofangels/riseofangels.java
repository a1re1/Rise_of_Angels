package com.kyro.riseofangels;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class riseofangels{
	
	@SidedProxy(clientSide="com.kyro.riseofangels.ClientProxy", serverSide="com.kyro.riseofangels.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler 
	public void preInit(FMLPreInitializationEvent event)
	{	
		RoAItems.init();
		RoABlocks.init();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new eventHandler());
		
	}
	
	@EventHandler 
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}