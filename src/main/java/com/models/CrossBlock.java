package com.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * CrossBlock - a1re1
 * Created using Tabula 4.1.1
 */
public class CrossBlock extends ModelBase {
    public ModelRenderer base;
    public ModelRenderer column;
    public ModelRenderer row;
    public ModelRenderer vert;

    public CrossBlock() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.base = new ModelRenderer(this, 0, 25);
        this.base.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.base.addBox(-2.5F, 0.0F, -2.5F, 5, 2, 5, 0.0F);
        this.row = new ModelRenderer(this, 0, 0);
        this.row.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.row.addBox(-5.0F, 0.0F, -1.0F, 10, 2, 2, 0.0F);
        this.column = new ModelRenderer(this, 0, 0);
        this.column.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.column.addBox(-1.0F, 0.0F, -1.0F, 2, 16, 2, 0.0F);
        this.vert = new ModelRenderer(this, 0, 0);
        this.vert.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.vert.addBox(-1.0F, 0.0F, -5.0F, 2, 2, 10, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.base.render(f5);
        this.row.render(f5);
        this.column.render(f5);
        this.vert.render(f5);
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
