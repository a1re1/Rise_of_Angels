package lib.network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import lib.network.playerdata.PacketSyncGodliness;

public class RoAPacketHandler {
	
	public static final SimpleNetworkWrapper INSTANCE;
	
	public RoAPacketHandler(){
		
	}
	
	public void register(){
		
	}
	
	static {
		
		INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("RoA".toLowerCase());
		
	}

}
