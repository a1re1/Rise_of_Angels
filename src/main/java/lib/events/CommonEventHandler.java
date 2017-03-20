package lib.events;

import com.riseofangels.RiseOfAngels;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lib.utility.GodlyRating;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class CommonEventHandler {
	/**
	 * Registers a player with a god rating on player creation
	 */
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onEntityConstructing(EntityConstructing event)
	{
		/*
		Be sure to check if the entity being constructed is the correct type
		for the extended properties you're about to add!
		The null check may not be necessary - I only use it to make sure
		properties are only registered once per entity
		*/
		if (event.entity instanceof EntityPlayer & event.entity != null)
			//RiseOfAngels.proxy.getGodliness((EntityPlayer)event.entity).getClass();
			System.out.println("Player constructed with: " + RiseOfAngels.proxy.getGodliness((EntityPlayer)event.entity).getGodRating());
	}

}
