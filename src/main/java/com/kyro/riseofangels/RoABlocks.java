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
	public static Block AngelBloodBlock = new AngelBloodBlock().setHardness((float)1);//
	public static Block AngelCampTarget = new AngelCampTarget().setHardness((float)1.5);
	public static Block CelestialBlock = new CelestialBlock().setHardness((float)2);
	public static Block CloudBlock = new CloudBlock().setHardness((float).3);
	public static Block CrossBlock = new Cross().setHardness((float)1);
	public static Block CultBlock = new CultBlock().setHardness((float)2);//finish
	public static Block DeathOre = new DeathOre().setHardness((float)4);
	public static Block DeathCrystalBlock = new DeathCrystalBlock().setHardness((float)2);
	public static Block DivineBlock = new DivineBlock().setHardness((float)2);
	public static Block EternalBlock = new EternalBlock().setHardness((float)2);
	public static Block EternalOre = new EternalOre().setHardness((float)4);
	public static Block HavenCrystalBlock = new HavenCrystalBlock().setHardness((float)2);
	public static Block HorcruxBlock = new HorcruxBlock().setHardness((float)2);
	public static Block ImmortalBlock = new ImmortalBlock().setHardness((float)2);
	public static Block InsanityBlock = new InsanityBlock().setHardness((float)2);
	public static Block LuciferousBlock = new LuciferousBlock().setHardness((float)2);
	public static Block Pentagram = new Pentagram().setHardness((float).3);
	public static Block ResurrectionTotem = new ResurrectionTotem().setHardness((float)1.5);
	//public static Block T = new T().setHardness((float)f);
	
	
	
	public static void init() {
		
		RegisterHelper.registerBlock(AngelBloodBlock);
		RegisterHelper.registerBlock(AngelCampTarget);
		RegisterHelper.registerBlock(CelestialBlock);
		RegisterHelper.registerBlock(CloudBlock);
		RegisterHelper.registerBlock(CrossBlock);
		RegisterHelper.registerBlock(CultBlock);
		RegisterHelper.registerBlock(DeathOre);
		RegisterHelper.registerBlock(DeathCrystalBlock);
		RegisterHelper.registerBlock(DivineBlock);
		RegisterHelper.registerBlock(EternalBlock);
		RegisterHelper.registerBlock(EternalOre);
		RegisterHelper.registerBlock(HavenCrystalBlock);
		RegisterHelper.registerBlock(HorcruxBlock);
		RegisterHelper.registerBlock(ImmortalBlock);
		RegisterHelper.registerBlock(InsanityBlock);
		RegisterHelper.registerBlock(LuciferousBlock);
		RegisterHelper.registerBlock(Pentagram);
		RegisterHelper.registerBlock(ResurrectionTotem);
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