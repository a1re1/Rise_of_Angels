package com.blocks.solids;

import com.rendering.tiles.TileEntityHolyFountain;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lib.utility.Reference;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class HolyFountain extends BlockContainer {

	public HolyFountain() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 0);
		setBlockName("HolyFountain");
		setBlockBounds(.25f, 0f, .25f, .75f, 1f, .75f);
		setLightLevel(1F);
		setBlockTextureName(Reference.MOD_ID + ":" + "HolyFountain");
	}
	
	@Override
	public int getRenderType(){
		return -1;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	public boolean isNormalCube(){
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		return new TileEntityHolyFountain();
	}
	
}