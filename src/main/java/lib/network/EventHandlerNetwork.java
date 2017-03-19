package lib.network;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent.ClientConnectedToServerEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent.ClientDisconnectionFromServerEvent;
import cpw.mods.fml.relauncher.Side;
import lib.network.playerdata.PacketSyncGodliness;

import java.util.ArrayList;

import com.riseofangels.RiseOfAngels;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class EventHandlerNetwork {
    
	public EventHandlerNetwork() {
    }
    
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onPLayerEvent(PlayerRespawnEvent e){
    	System.out.println("Player: " + e.player);
    	System.out.println("has respawned with " + RiseOfAngels.proxy.getGodliness(e.player).getRating());
    }
    
    
}
