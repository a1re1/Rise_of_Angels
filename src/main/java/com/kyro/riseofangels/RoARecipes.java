package com.kyro.riseofangels;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RoARecipes {

	public static void init(){
		
		/*Shaped Crafting
		 * ex:
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock),
				"##", "##", '#', 
				ModItems.tutorialItem);
		*/
		/*
		 * Items
		 */
		//Demon Sword
		GameRegistry.addRecipe(new ItemStack(RoAItems.DemonSword),
				"  #", " # ", "I  ",
				'#', RoAItems.InsanityIngot, 'I', RoAItems.AngelWings);
		
		//Holy Sword
		GameRegistry.addRecipe(new ItemStack(RoAItems.HolySword),
				"  #", " # ", "I  ",
				'#', RoAItems.ImmortalIngot, 'I', RoAItems.DemonTail);
		
		//Cult Hood
		GameRegistry.addRecipe(new ItemStack(RoAItems.CultHood),
				"#I#", "# #", "   ",
				'#', Items.leather, 'I', RoAItems.HorcruxIngot);
		
		//Cult Robe
		GameRegistry.addRecipe(new ItemStack(RoAItems.CultRobe),
				"# #", "#I#", "###",
				'#', Items.leather, 'I', RoAItems.HorcruxIngot);
		
		//Cult Britches
		GameRegistry.addRecipe(new ItemStack(RoAItems.CultBritches),
				"#I#", "# #", "# #",
				'#', Items.leather, 'I', RoAItems.HorcruxIngot);
		
		//Cult Shoes_1
		GameRegistry.addRecipe(new ItemStack(RoAItems.CultShoes),
				"I I", "# #", "   ",
				'#', Items.leather, 'I', RoAItems.HorcruxIngot);
		//Cult Shoes_2
		GameRegistry.addRecipe(new ItemStack(RoAItems.CultShoes),
				"   ", "I I", "# #",
				'#', Items.leather, 'I', RoAItems.HorcruxIngot);
		
		//Priest Hood
		GameRegistry.addRecipe(new ItemStack(RoAItems.PriestHat),
				"#I#", "# #", "   ",
				'#', Items.leather, 'I', RoAItems.CelestialIngot);
		
		//Priest Robe
		GameRegistry.addRecipe(new ItemStack(RoAItems.PriestRobe),
				"# #", "#I#", "###",
				'#', Items.leather, 'I', RoAItems.CelestialIngot);
		
		//Priest Britches
		GameRegistry.addRecipe(new ItemStack(RoAItems.PriestPants),
				"#I#", "# #", "# #",
				'#', Items.leather, 'I', RoAItems.CelestialIngot);
		
		//Priest Shoes_1
		GameRegistry.addRecipe(new ItemStack(RoAItems.PriestShoes),
				"I I", "# #", "   ",
				'#', Items.leather, 'I', RoAItems.CelestialIngot);
		//Priest Shoes_2
		GameRegistry.addRecipe(new ItemStack(RoAItems.PriestShoes),
				"   ", "I I", "# #",
				'#', Items.leather, 'I', RoAItems.CelestialIngot);
		
		/*
		 * Blocks
		 */
		//Clock
		GameRegistry.addRecipe(new ItemStack(RoABlocks.Clock),
				"###", "#I#", "###",
				'#', RoABlocks.DestinyStone, 'I', Items.redstone);
		
		//Camp Target_1
		GameRegistry.addRecipe(new ItemStack(RoABlocks.AngelCampTarget),
				"###", "#I#", "###",
				'I', RoAItems.AngelHeart, '#', Blocks.log);
		
		//Camp Target_2
		GameRegistry.addRecipe(new ItemStack(RoABlocks.AngelCampTarget),
				"###", "#I#", "###",
				'I', RoAItems.DemonHeart, '#', Blocks.log);
		
		//Cross
		GameRegistry.addRecipe(new ItemStack(RoABlocks.CrossBlock),
				" # ", "###", " # ",
				'#', Items.gold_ingot);
		
		//Destiny Stone Bricks
		GameRegistry.addRecipe(new ItemStack(RoABlocks.DestinyStoneBricks, 4),
				"##", "##",
				'#', RoABlocks.DestinyStone);
		
		//Angelic Marble Wall
		GameRegistry.addRecipe(new ItemStack(RoABlocks.AngelicMarbWall, 4),
				"##", "##",
				'#', RoABlocks.AngelicMarble);
		
		//Death Crystal Block
		GameRegistry.addRecipe(new ItemStack(RoABlocks.DeathCrystalBlock),
				"##", "##",
				'#', RoAItems.DeathCrystal);
		
		//Haven Crystal Block
		GameRegistry.addRecipe(new ItemStack(RoABlocks.HavenCrystalBlock),
				"##", "##",
				'#', RoAItems.HavenCrystal);
		
		//Divine Block
		GameRegistry.addRecipe(new ItemStack(RoABlocks.DivineBlock),
				"###", "###", "###",
				'#', RoAItems.DivineIngot);
		
		//Eternal Block
		GameRegistry.addRecipe(new ItemStack(RoABlocks.EternalBlock),
				"###", "###", "###",
				'#', RoAItems.EternalIngot);

		//Immortal Block
		GameRegistry.addRecipe(new ItemStack(RoABlocks.ImmortalBlock),
				"###", "###", "###",
				'#', RoAItems.ImmortalIngot);
		
		//Celestial Block
		GameRegistry.addRecipe(new ItemStack(RoABlocks.CelestialBlock),
				"###", "###", "###",
				'#', RoAItems.CelestialIngot);
		
		//Cult Block
		GameRegistry.addRecipe(new ItemStack(RoABlocks.CultBlock),
				"###", "###", "###",
				'#', RoAItems.CultuousIngot);
		
		//Luciferous Block
		GameRegistry.addRecipe(new ItemStack(RoABlocks.LuciferousBlock),
				"###", "###", "###",
				'#', RoAItems.LuciferousIngot);
		
		//Insanity Block
		GameRegistry.addRecipe(new ItemStack(RoABlocks.InsanityBlock),
				"###", "###", "###",
				'#', RoAItems.InsanityIngot);
		
		//Horcrux Block
		GameRegistry.addRecipe(new ItemStack(RoABlocks.HorcruxBlock),
				"###", "###", "###",
				'#', RoAItems.HorcruxIngot);
		
		
		/*Shapeless Crafting
		*ex:
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), 
				new Object[] {Items.redstone, 
						new ItemStack(Items.dye, 1, 4)});
		*/
		/*
		 * Demonic
		 */
		//Insanity Blend
		GameRegistry.addShapelessRecipe(new ItemStack(RoAItems.HorcruxDust), 
				new Object[] {RoAItems.HorcruxIngot, new ItemStack(Items.redstone, 4), Items.iron_ingot});
		
		//Cultuous Blend
		GameRegistry.addShapelessRecipe(new ItemStack(RoAItems.CultuousBlend), 
				new Object[] {RoAItems.InsanityIngot, RoAItems.LuciferousIngot, RoAItems.DeathCrystal});
		
		/*
		 * Angelic
		 */
		//Divinity Blend
		GameRegistry.addShapelessRecipe(new ItemStack(RoAItems.AngelDust), 
				new Object[] {RoAItems.CelestialIngot, new ItemStack(Items.redstone, 4), Items.iron_ingot});
		
		//Divinity Blend
		GameRegistry.addShapelessRecipe(new ItemStack(RoAItems.DivineBlend), 
				new Object[] {RoAItems.ImmortalIngot, RoAItems.EternalIngot, RoAItems.HavenCrystal});
		
		/*Furnace
		 * ex:
		GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.tutorialItem), 1.0F);
		*/
		
		//Celestial Ingot
		GameRegistry.addSmelting(RoABlocks.AngelicMarble, new ItemStack(RoABlocks.DestinyStone), 1.0F);
		
		/*
		 * Demonic Smelting
		 */
		//Horcrux Ingot
		GameRegistry.addSmelting(RoABlocks.DemOre, new ItemStack(RoAItems.HorcruxIngot), 1.0F);
		
		//Luciferous Ingot
		GameRegistry.addSmelting(RoAItems.LuciferousDust, new ItemStack(RoAItems.LuciferousIngot), 1.0F);
		
		//Insanity Ingot
		GameRegistry.addSmelting(RoAItems.HorcruxDust, new ItemStack(RoAItems.InsanityIngot), 1.0F);
		
		//Cultuous Ingot
		GameRegistry.addSmelting(RoAItems.CultuousBlend, new ItemStack(RoAItems.CultuousIngot), 1.0F);
		
		/*
		 * Angelic Smelting
		 */
		//Celestial Ingot
		GameRegistry.addSmelting(RoABlocks.AngOre, new ItemStack(RoAItems.CelestialIngot), 1.0F);
		
		//Eternal Ingot
		GameRegistry.addSmelting(RoAItems.EternalDust, new ItemStack(RoAItems.EternalIngot), 1.0F);
		
		//Immortal Ingot
		GameRegistry.addSmelting(RoAItems.AngelDust, new ItemStack(RoAItems.ImmortalIngot), 1.0F);
		
		//Divine Ingot
		GameRegistry.addSmelting(RoAItems.DivineBlend, new ItemStack(RoAItems.DivineIngot), 1.0F);
		
	}
	
}
