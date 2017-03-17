package com.kyro.riseofangels;

import com.blocks.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;

public class RoABlocks {

	public static Block KyroanSoil = new KyroanSoil(Material.rock).setHardness((float)0.60);
	public static Block DemonBlood = new DemonBlood().setHardness((float)1);
	public static Block DestinyStone = new DestinyStone().setHardness((float)2);
	public static Block DestinyStoneBricks = new DestinyStoneBricks().setHardness((float)1.5);
	public static Block AngelicMarble = new AngelicMarble().setHardness((float)1.5);
	public static Block AngelicMarbWall = new AngelicMarbWall().setHardness((float)1.5);
	public static Block Clock = new Clock().setHardness((float)2);
	public static Block AngOre = new AngOre().setHardness((float)4);
	public static Block DemOre = new DemOre().setHardness((float)4);
	public static Block HavOre = new HavOre().setHardness((float)20);
	public static Block LucOre = new LucOre().setHardness((float)20);
	
	public static void init() {
		
		RegisterHelper.registerBlock(KyroanSoil);
		RegisterHelper.registerBlock(DemonBlood);
		RegisterHelper.registerBlock(DestinyStone);
		RegisterHelper.registerBlock(DestinyStoneBricks);
		RegisterHelper.registerBlock(AngelicMarble);
		RegisterHelper.registerBlock(AngelicMarbWall);
		RegisterHelper.registerBlock(Clock);
		RegisterHelper.registerBlock(AngOre);
		RegisterHelper.registerBlock(DemOre);
		RegisterHelper.registerBlock(HavOre);
		RegisterHelper.registerBlock(LucOre);
		
	}
	
}