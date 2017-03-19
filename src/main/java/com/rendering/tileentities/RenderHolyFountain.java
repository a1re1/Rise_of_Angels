package com.rendering.tileentities;

import org.lwjgl.opengl.GL11;

import com.models.HolyFountain;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderHolyFountain extends TileEntitySpecialRenderer{
	
	private HolyFountain model;
	private ResourceLocation texture = new ResourceLocation("roa:textures/models/HolyFountain.png");
	
	public RenderHolyFountain(){
		model = new HolyFountain();
	}
	

	@Override
	public void renderTileEntityAt(TileEntity p_147500_1_, double x, double y, double z,
			float scale) {
		
		GL11.glPushMatrix();
			GL11.glTranslated(x+0.5, y+1.5, z+0.5);
			GL11.glRotated(180, 0, 0, 1);
			this.bindTexture(texture);
			this.model.render((Entity)null, 0, -0.1F, 0, 0, 0, 0.0625F);
		GL11.glPopMatrix();
		
	}

}
