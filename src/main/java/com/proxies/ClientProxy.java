package com.proxies;

import com.blocks.RoABlocks;
import com.rendering.items.GenericBlockItemRenderer;
import com.rendering.tileentities.*;
import com.rendering.tiles.*;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lib.utility.GodlyRating;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{
	
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
        getGodliness(Minecraft.getMinecraft().thePlayer);
        
    }
    
    public void registerRenderers(){
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrossBlock.class, new RenderCrossBlock());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHolyFountain.class, new RenderHolyFountain());
    	
    	registerItemRenderers();
    }
    
    public void registerItemRenderers(){
    	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RoABlocks.CrossBlock), new GenericBlockItemRenderer(new TileEntityCrossBlock(), new RenderCrossBlock()));
    	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RoABlocks.HolyFountain), new GenericBlockItemRenderer(new TileEntityHolyFountain(), new RenderHolyFountain()));
    }

	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
	public World getClientWorld(){
		return Minecraft.getMinecraft().theWorld;
	}

}
