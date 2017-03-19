package com.blocks;

import com.blocks.solids.*;
import com.blocks.fluids.*;

import cpw.mods.fml.common.registry.GameRegistry;
import lib.utility.RegisterHelper;
import com.rendering.tiles.TileEntityCrossBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class RoABlocks {
	
	public static CreativeTabs tab = CreativeTabs.tabMisc;
	
	//Blocks
	public static Block KyroanSoil = new KyroanSoil(Material.rock).setHardness((float)0.60).setCreativeTab(tab);
	public static Block KyroanGrass = new KyroanGrass(Material.ground, "KyroanGrass",Block.soundTypeGrass).setHardness((float)0.60).setCreativeTab(tab);
	public static Block DemonBlood = new DemonBlood().setHardness((float)1).setCreativeTab(tab);
	public static Block DestinyStone = new DestinyStone().setHardness((float)2).setCreativeTab(tab);
	public static Block DestinyStoneBricks = new DestinyStoneBricks().setHardness((float)1.5).setCreativeTab(tab);
	public static Block AngelicMarble = new AngelicMarble().setHardness((float)1.5).setCreativeTab(tab);
	public static Block AngelicMarbWall = new AngelicMarbWall().setHardness((float)1.5).setCreativeTab(tab);
	public static Block Clock = new Clock().setHardness((float)2).setCreativeTab(tab);
	public static Block AngOre = new AngOre().setHardness((float)4).setCreativeTab(tab);
	public static Block DemOre = new DemOre().setHardness((float)4).setCreativeTab(tab);
	public static Block HavOre = new HavOre().setHardness((float)20).setCreativeTab(tab);
	public static Block LucOre = new LucOre().setHardness((float)20).setCreativeTab(tab);
	public static Block AngelBloodBlock = new AngelBloodBlock().setHardness((float)1).setCreativeTab(tab);//
	public static Block AngelCampTarget = new AngelCampTarget().setHardness((float)1.5).setCreativeTab(tab);
	public static Block CelestialBlock = new CelestialBlock().setHardness((float)2).setCreativeTab(tab);
	public static Block CloudBlock = new CloudBlock().setHardness((float).3).setCreativeTab(tab);
	public static Block CrossBlock = new Cross().setHardness((float)1).setCreativeTab(tab);
	public static Block HolyFountain = new HolyFountain().setHardness((float)1).setCreativeTab(tab);
	public static Block CultBlock = new CultBlock().setHardness((float)2).setCreativeTab(tab);//finish
	public static Block DeathOre = new DeathOre().setHardness((float)4).setCreativeTab(tab);
	public static Block DeathCrystalBlock = new DeathCrystalBlock().setHardness((float)2).setCreativeTab(tab);
	public static Block DivineBlock = new DivineBlock().setHardness((float)2).setCreativeTab(tab);
	public static Block EternalBlock = new EternalBlock().setHardness((float)2).setCreativeTab(tab);
	public static Block EternalOre = new EternalOre().setHardness((float)4).setCreativeTab(tab);
	public static Block HavenCrystalBlock = new HavenCrystalBlock().setHardness((float)2).setCreativeTab(tab);
	public static Block HorcruxBlock = new HorcruxBlock().setHardness((float)2).setCreativeTab(tab);
	public static Block ImmortalBlock = new ImmortalBlock().setHardness((float)2).setCreativeTab(tab);
	public static Block InsanityBlock = new InsanityBlock().setHardness((float)2).setCreativeTab(tab);
	public static Block LuciferousBlock = new LuciferousBlock().setHardness((float)2).setCreativeTab(tab);
	public static Block Pentagram = new Pentagram().setHardness((float).3).setCreativeTab(tab);
	public static Block ResurrectionTotem = new ResurrectionTotem().setHardness((float)1.5).setCreativeTab(tab);
	//public static Block T = new T().setHardness((float)f).setCreativeTab(tab);
	
	//Fluids
	//Angel Blood
	public static Block blockAngelBlood;
	public static Material materialAngelBlood = new MaterialLiquid(MapColor.silverColor);
	public static Fluid AngelBlood = new Fluid("AngelBloodFluid").setBlock(blockAngelBlood);
	//Demon Blood
	public static Block blockDemonBlood;
	public static Material materialDemonBlood = new MaterialLiquid(MapColor.blueColor);
	public static Fluid DemonBloodFluid = new Fluid("DemonBloodFluid").setBlock(blockDemonBlood);
	
	public static void init() {
		
		//Block Registry
		RegisterHelper.registerBlock(AngelBloodBlock);
		RegisterHelper.registerBlock(AngelCampTarget);
		RegisterHelper.registerBlock(CelestialBlock);
		RegisterHelper.registerBlock(CloudBlock);
		RegisterHelper.registerBlock(CrossBlock);
		RegisterHelper.registerBlock(HolyFountain);
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
		RegisterHelper.registerBlock(KyroanGrass);
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
		
		//Tile Registry
		GameRegistry.registerTileEntity(TileEntityCrossBlock.class, "CrossBlock");
		
		//Fluid Registry
		FluidRegistry.registerFluid(AngelBlood);
		blockAngelBlood = new AngelBloodFluid().setCreativeTab(tab);
		RegisterHelper.registerBlock(blockAngelBlood);
		
		FluidRegistry.registerFluid(DemonBloodFluid);
		blockDemonBlood = new DemonBloodFluid().setCreativeTab(tab);
		RegisterHelper.registerBlock(blockDemonBlood);
		
		
		
	}
	
}