package com.kyrodim;

import net.minecraftforge.common.DimensionManager;

public class Dimension {
	
	/**
	 * Register dimensions.
	 * @param register
	 */
	public static void registerDimensions(){
		DimensionManager.registerDimension(DimensionIDs.KYRODIMENSION, DimensionIDs.KYRODIMENSION);
	}
	
	/**
	 * Regster dimension world providers with the dimension manager.
	 */
	public static void registerWorldProvider(){
		DimensionManager.registerProviderType(DimensionIDs.KYRODIMENSION, WorldProviderForest.class, true);
	}
}
