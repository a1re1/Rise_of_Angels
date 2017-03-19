package com.proxies;

import com.rendering.tileentities.RenderCrossBlock;
import com.rendering.tiles.TileEntityCrossBlock;
import com.riseofangels.RiseOfAngels;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lib.network.RoAPacketHandler;
import lib.utility.GodlyRating;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
			
	public void preInit(FMLPreInitializationEvent event){}
		
	public void init(FMLInitializationEvent event){}
		
	public void postInit(FMLPostInitializationEvent event){
		RiseOfAngels.packetHandler = new RoAPacketHandler();
	}
	
    public void registerRenderers(){}
	
	public int addArmor(String armor){
		return 0;
	}

	public GodlyRating getGodliness(EntityPlayer player){
		return new GodlyRating(player);
	}
	
	public World getClientWorld() {
        return null;
    }
	
	public void initLog(){}
	
	public void initConfig(){}

}
