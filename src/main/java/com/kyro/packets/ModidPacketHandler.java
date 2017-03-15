package com.kyro.packets;

import com.kyro.packets.MyMessage.MyMessageHandler;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class ModidPacketHandler {
	
	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("RoA");
	
	public static int id = 0;
	
	public void update(){
		
		INSTANCE.registerMessage(MyMessageHandler.class, MyMessage.class, id, Side.SERVER);
		id++;
		
	}

}
