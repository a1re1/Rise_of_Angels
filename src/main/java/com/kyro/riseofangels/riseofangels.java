package com.kyro.riseofangels;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import lib.network.EventHandlerNetwork;
import lib.network.RoAPacketHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class RiseOfAngels{
	
	@SidedProxy(clientSide="com.kyro.riseofangels.ClientProxy", serverSide="com.kyro.riseofangels.ServerProxy")
	public static CommonProxy proxy;
	
	public static RoAPacketHandler packetHandler;
	
	@EventHandler 
	public void preInit(FMLPreInitializationEvent event)
	{	
		RoAItems.init();
		RoABlocks.init();
		RoARecipes.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
		FMLCommonHandler.instance().bus().register(new EventHandlerNetwork());
	}
	
	@EventHandler 
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}