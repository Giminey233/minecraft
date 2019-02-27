package com.somenew.giminey.render;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class Fly_Hot_dog_break_Render extends Render{

	ResourceLocation flyhotdog = new ResourceLocation("somenew:textures/items/Fly_Hot_dog_break.png");
	@Override
	public void doRender(Entity entity, double x, double y, double z, float f, float f1) {
		Tessellator t=Tessellator.instance;
		TextureManager renderEngine = Minecraft.getMinecraft().renderEngine;
		final double WIDTH=0.5F, LENGTH=0.5F;
		
		GL11.glPushMatrix();
		
		renderEngine.bindTexture(flyhotdog);
		
		
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glDisable(GL11.GL_CULL_FACE);
        
        GL11.glTranslated(x, y, z);
        
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);
        t.startDrawingQuads();
        t.setBrightness(15728880);
		
        t.addVertexWithUV(-WIDTH, 0, -LENGTH, 0.0, 0.0);
        t.addVertexWithUV(WIDTH, 0, -LENGTH, 0.0, 1.0);
        t.addVertexWithUV(WIDTH, 0, LENGTH, 1.0, 1.0);
        t.addVertexWithUV(-WIDTH, 0, LENGTH, 1.0, 0.0);
        
        t.addVertexWithUV(0, -WIDTH, -LENGTH, 0.0, 0.0);
        t.addVertexWithUV(0, WIDTH, -LENGTH, 0.0, 1.0);
        t.addVertexWithUV(0, WIDTH, LENGTH, 1.0, 1.0);
        t.addVertexWithUV(0, -WIDTH, LENGTH, 1.0, 0.0);
        
        t.addVertexWithUV(-LENGTH, WIDTH, 0, 0.0, 0.0);
        t.addVertexWithUV(-LENGTH,-WIDTH, 0, 0.0, 1.0);
        t.addVertexWithUV(LENGTH,-WIDTH, 0, 1.0, 1.0);
        t.addVertexWithUV(LENGTH, WIDTH, 0, 1.0, 0.0);
        
        t.draw();
        
        GL11.glEnable(GL11.GL_CULL_FACE);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_BLEND); 
        GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		
		return null;
	}

}
