package com.dim_battlefield.biomes;

import java.util.Random;

import com.blocks.RoABlocks;
import com.dim_battlefield.biomes.decorators.BiomeDecoratorMod;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;

public class Battlegrounds extends ModBiomes{

    public static int treesPerChunk;

    protected BiomeDecoratorMod decorator;

    public Battlegrounds(int biomeId) {
        super(biomeId);
        Battlegrounds.treesPerChunk = 2;
        this.topBlock = RoABlocks.KyroanGrass;
        this.fillerBlock = RoABlocks.KyroanSoil;
    }

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForGrass(Random random){
        return random.nextInt(2) == 0 ? new WorldGenTallGrass(Blocks.tallgrass, 1) : new WorldGenTallGrass(Blocks.tallgrass, 2);
    }

    /**
     * Remove this to remove vines from dimension
     */
    public void decorate(World world, Random random, int par3, int par4) {
        super.decorate(world, random, par3, par4);
//        WorldGenVines worldgenvines = new WorldGenVines();
//
//        for (int k = 0; k < 50; ++k) {
//            int l = par3 + random.nextInt(16) + 8;
//            byte b0 = 64;
//            int i1 = par4 + random.nextInt(16) + 8;
//            worldgenvines.generate(world, random, l, b0, i1);
//        }
    }
}
