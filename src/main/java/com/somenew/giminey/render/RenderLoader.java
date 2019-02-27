package com.somenew.giminey.render;

import com.somenew.giminey.entity.Fly_Hot_dog_break;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

public class RenderLoader {
	
	public static void registerRender() {
		RenderingRegistry.registerEntityRenderingHandler(Fly_Hot_dog_break.class, new Fly_Hot_dog_break_Render());

	}

}
