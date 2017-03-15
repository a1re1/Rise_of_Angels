package com.kyro.riseofangels;

import com.kyro.functionality.godlyRating;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;

public class eventHandler {
	
	/**
	 * Registers a player with a god rating on player creation
	 */
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
		/*
		Be sure to check if the entity being constructed is the correct type
		for the extended properties you're about to add!
		The null check may not be necessary - I only use it to make sure
		properties are only registered once per entity
		*/
		if (event.entity instanceof EntityPlayer && godlyRating.get((EntityPlayer) event.entity) == null)
			// This is how extended properties are registered using our convenient method from earlier
			godlyRating.register((EntityPlayer) event.entity);
			// That will call the constructor as well as cause the init() method
			// to be called automatically
		
		// If you didn't make the two convenient methods from earlier, your code would be
		// much uglier:
		if (event.entity instanceof EntityPlayer && event.entity.getExtendedProperties(godlyRating.godRate) == null)
			event.entity.registerExtendedProperties(godlyRating.godRate, new godlyRating((EntityPlayer) event.entity));
	}

}
