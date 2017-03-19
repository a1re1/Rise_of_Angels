package com.riseofangels;

import com.blocks.RoABlocks;
import com.dim_battlefield.biomes.ModBiomes;
import com.events.CommonEventHandler;
import com.items.RoAItems;
import com.kyrodim.block.Blockss;
import com.kyrodim.config.ModConfig;
import com.kyrodim.world.Dimension;
import com.kyrodim.world.WorldTypesTutorial;
import com.proxies.ClientProxy;
import com.proxies.CommonProxy;

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
import lib.utility.GameLogger;
import lib.utility.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class RiseOfAngels{
	
	@SidedProxy(clientSide="com.proxies.ClientProxy", serverSide="com.proxies.ServerProxy")
	public static CommonProxy proxy;
	
	public static RoAPacketHandler packetHandler;
	
	@EventHandler 
	public void preInit(FMLPreInitializationEvent event)
	{	
		RoAItems.init();
		RoABlocks.init();
		RoARecipes.init();
		proxy.registerRenderers();
		proxy.initLog();
		proxy.initConfig();
		GameLogger.createFolders();
		ModConfig.createTutConfig();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
		FMLCommonHandler.instance().bus().register(new EventHandlerNetwork());
		
		Blockss.loadBlocks();
		ModBiomes.registerWithBiomeDictionary();
		Dimension.registerWorldProvider();
		Dimension.registerDimensions();
		WorldTypesTutorial.addCustomWorldTypes();
		
		proxy.registerRenderers();
		
	}
	
	@EventHandler 
	public void postInit(FMLPostInitializationEvent event)
	{

	}
	
}