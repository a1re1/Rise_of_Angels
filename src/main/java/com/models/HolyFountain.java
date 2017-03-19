package com.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * HolyFountain - a1re1
 * Created using Tabula 4.1.1
 */
public class HolyFountain extends ModelBase {
    public ModelRenderer base;
    public ModelRenderer shaft;
    public ModelRenderer water;
    public ModelRenderer bottom;
    public ModelRenderer side1;
    public ModelRenderer side2;
    public ModelRenderer side3;
    public ModelRenderer side4;

    public HolyFountain() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.bottom = new ModelRenderer(this, 0, 5);
        this.bottom.setRotationPoint(0.0F, 10.5F, 0.0F);
        this.bottom.addBox(-3.5F, 0.0F, -3.5F, 7, 2, 7, 0.0F);
        this.side1 = new ModelRenderer(this, 0, 20);
        this.side1.setRotationPoint(0.0F, 8.1F, 3.5F);
        this.side1.addBox(-3.5F, 0.0F, 0.0F, 7, 3, 1, 0.0F);
        this.side2 = new ModelRenderer(this, 0, 20);
        this.side2.setRotationPoint(0.0F, 8.1F, -4.5F);
        this.side2.addBox(-3.5F, 0.0F, 0.0F, 7, 3, 1, 0.0F);
        this.side3 = new ModelRenderer(this, 16, 10);
        this.side3.setRotationPoint(3.5F, 8.1F, 0.0F);
        this.side3.addBox(0.0F, 0.0F, -3.5F, 1, 3, 7, 0.0F);
        this.water = new ModelRenderer(this, 0, 24);
        this.water.setRotationPoint(0.0F, 8.9F, 0.0F);
        this.water.addBox(-3.5F, 0.0F, -3.5F, 7, 1, 7, 0.0F);
        this.shaft = new ModelRenderer(this, 0, 0);
        this.shaft.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.shaft.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.base = new ModelRenderer(this, 0, 9);
        this.base.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.base.addBox(-2.5F, 0.0F, -2.5F, 5, 3, 5, 0.0F);
        this.side4 = new ModelRenderer(this, 16, 10);
        this.side4.setRotationPoint(-4.5F, 8.1F, 0.0F);
        this.side4.addBox(0.0F, 0.0F, -3.5F, 1, 3, 7, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.bottom.render(f5);
        this.side1.render(f5);
        this.side2.render(f5);
        this.side3.render(f5);
        this.water.render(f5);
        this.shaft.render(f5);
        this.base.render(f5);
        this.side4.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
