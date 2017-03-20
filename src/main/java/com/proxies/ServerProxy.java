package com.proxies;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lib.config.ModConfig;
import lib.utility.GameLogger;
import lib.utility.GodlyRating;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

public class ServerProxy extends CommonProxy{
	
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
	
	public int addArmor(String armor){
		return 0;
	}
	
	@Override
	public void initLog(){
		GameLogger.createFolders();
	}
	
	@Override
	public void initConfig(){
		ModConfig.createTutConfig();
	}

}
