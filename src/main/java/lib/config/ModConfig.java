package lib.config;

import java.io.File;

import lib.utility.GameLogger;

import com.blocks.tutblocks.BlockIDs;
import com.dim_battlefield.biomes.BiomeIDs;
import com.kyrodim.DimensionIDs;

import net.minecraftforge.common.config.Configuration;

public class ModConfig extends Configuration{
	
	//TADO: Config needs testing to see if it still uses ids if there changed or if it replaces the config file ?.

	/**
	 * Path for .minecraft folder
	 */
	private static String dir;

	private static Configuration config;

	/**
	 * Creates Config file in custom folder in .minecraft folder.
	 */
	public static void createTutConfig(){
		//My custom folder directory and config file name for the Config file.
		dir = GameLogger.getFilePath() + "Tutorial/Configs/";
		File file = new File(dir + "ConfiurationFile.cfg");
		config = new Configuration(file);
		
		//Load add add ids to config then save when finished.
		config.load();
		addLightBlockIDs();
		addDarkBlockIDs();
		
		addDimensionIDs();
		addBimeIDs();
		config.save();
	}

	/**
	 * Add Light Block IDs to config file.
	 */
	private static void addLightBlockIDs() {
		//Light Blocks
		BlockIDs.LIGHTSTONE = config.get(ConfigTypes.BLOCKS, "lightStone", 500).getInt();
		BlockIDs.LIGHTGRASS = config.get(ConfigTypes.BLOCKS, "lightGrass", 501).getInt();
		BlockIDs.LIGHTDIRT = config.get(ConfigTypes.BLOCKS, "lightDirt", 502).getInt();
		BlockIDs.LIGHTLOG = config.get(ConfigTypes.BLOCKS, "lightLig", 503).getInt();
		BlockIDs.LIGHTLEAVES = config.get(ConfigTypes.BLOCKS, "lighteaves", 504).getInt();
		BlockIDs.LIGHTFIRE = config.get(ConfigTypes.BLOCKS, "lightFire", 505).getInt();
		BlockIDs.LIGHTPORTAL = config.get(ConfigTypes.BLOCKS, "lightPortal", 506).getInt();
	}
	
	/**
	 * Add Dark Block IDs to config file.
	 */
	private static void addDarkBlockIDs() {
		//DarkBlocks
		BlockIDs.DARKSTONE = config.get(ConfigTypes.BLOCKS, "darkStone", 507).getInt();
	}

	/**
	 * Add Biome IDs to config file.
	 */
	private static void addBimeIDs() {
		BiomeIDs.ANGEL = config.get(ConfigTypes.BIOMES, "angelicBiome", 50).getInt();
		BiomeIDs.BETWEENLAND = config.get(ConfigTypes.BIOMES, "neutralBiome", 52).getInt();
		BiomeIDs.DEMON = config.get(ConfigTypes.BIOMES, "demonicBiome", 51).getInt();
	}

	/**
	 * Add Dimension IDs to config file.
	 */
	private static void addDimensionIDs() {
		DimensionIDs.KYRODIMENSION = config.get(ConfigTypes.DIMENSION, "kyroDimension", 35).getInt();
	}
	
	/**
	 * Gets the Configuration file
	 * @return config
	 */
	public static Configuration getConfig(){
		return config;
	}

}
