package com.dim_battlefield.biomes.decorators;

import com.blocks.RoABlocks;
import com.dim_battlefield.biomes.Battlegrounds;
import com.dim_battlefield.biomes.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeDecoratorHelper {

    private static WorldGenerator AngOre;
    private static WorldGenerator DemOre;
    private static WorldGenerator HavOre;
    private static WorldGenerator DeathOre;
    private static WorldGenerator EternalOre;
    private static WorldGenerator LucOre;

    public BiomeDecoratorHelper(){
        //		glowStone = new WorldGenMinable(Blocks.glowstone, 30, Blockss.lightStone);
    }

    protected static void decorateBiome(BiomeGenBase biome) {
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, BiomeDecoratorMod.chunk_X, BiomeDecoratorMod.chunk_Z));
        //perpere ores for generation
        initOres();
        //GenerateOres
        generateOreInBiome(biome);

        if(biome == ModBiomes.battlegrounds){
            BiomeDecoratorMod.howMenyTrees = Battlegrounds.treesPerChunk;
            int i = BiomeDecoratorMod.howMenyTrees;
            /** Chunk Postions **/
            int chunkX;
            int chunkZ;
            int y;
            /** get blocks at the given locations **/
            Block block;
            Block blockA;
            /** Generates Small tree **/
            for(int a = 0; a < i; ++a){
                if(i == BiomeDecoratorMod.randomGenerator.nextInt(8)){
                    chunkX = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    chunkZ = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    y = BiomeDecoratorMod.currentWorld.getTopSolidOrLiquidBlock(chunkX, chunkZ);
                    block = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y, chunkZ);
                    blockA = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y - 1, chunkZ);
                    if(block != Blocks.air || block != Blocks.water){
                        if(blockA != Blocks.air || blockA != Blocks.water){
                            //BiomeDecoratorMod.smallTree.generate(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, chunkX, y, chunkZ);
                        }
                    }
                }
                /** Generates Big tree **/
                if(i == BiomeDecoratorMod.randomGenerator.nextInt(15)){
                    chunkX = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    chunkZ = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    y = BiomeDecoratorMod.currentWorld.getTopSolidOrLiquidBlock(chunkX, chunkZ);
                    block = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y, chunkZ);
                    blockA = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y - 1, chunkZ);
                    if(block != Blocks.air || block != Blocks.water){
                        if(blockA != Blocks.air || blockA != Blocks.water){
                            //BiomeDecoratorMod.bigTree.generate(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, chunkX, y, chunkZ);
                        }
                    }
                }
            }
            if(biome == ModBiomes.ruins){
                //GENERARTE DARK FOREST STUFF HERE 
            }
        }
    }

    /**
     * Prepare ores for generation
     */
    private static void initOres() {
        //Add ores here.
        AngOre = new WorldGenMinable(RoABlocks.AngOre, 20, RoABlocks.DestinyStone);
        DemOre = new WorldGenMinable(RoABlocks.DemOre, 20, RoABlocks.DestinyStone);
        HavOre = new WorldGenMinable(RoABlocks.HavOre, 10, RoABlocks.DestinyStone);
        DeathOre = new WorldGenMinable(RoABlocks.DeathOre, 10, RoABlocks.DestinyStone);
        EternalOre = new WorldGenMinable(RoABlocks.EternalOre, 3, RoABlocks.DestinyStone);
        LucOre = new WorldGenMinable(RoABlocks.LucOre, 3, RoABlocks.DestinyStone);
    }

    /**
     * Geberate Ores In a Biome
     * @param biome
     */
    private static void generateOreInBiome(BiomeGenBase biome){
        if(biome == ModBiomes.battlegrounds){
            genStandardOre(10, AngOre, 0, 128);
            genStandardOre(10, DemOre, 0, 128);
            genStandardOre(3, HavOre, 20, 48);
            genStandardOre(3, DeathOre, 20, 48);
            genStandardOre(1, EternalOre, 0, 20);
            genStandardOre(1, LucOre, 0, 20);
        }
    }

    /**
     * Generate ores in chunks.
     * @param spawnWeight
     * @param generatorToSpawn
     * @param minSpawnHeight
     * @param maxYSpawnHeight
     */
    private static void genStandardOre(int spawnWeight, WorldGenerator generatorToSpawn, int minSpawnHeight, int maxYSpawnHeight) {
        for (int l = 0; l < spawnWeight; ++l) {
            int i1 = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16);
            int j1 = BiomeDecoratorMod.randomGenerator.nextInt(maxYSpawnHeight - minSpawnHeight) + minSpawnHeight;
            int k1 = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16);
            generatorToSpawn.generate(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, i1, j1, k1);
        }
    }
}
