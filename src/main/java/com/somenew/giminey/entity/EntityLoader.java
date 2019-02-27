package com.somenew.giminey.entity;


import com.somenew.giminey.Item.SomenewItem;
import com.somenew.giminey.lib.RefStrings;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;


public class EntityLoader {
	
	private static int nextID = 0;
	
	public static void RegisterEntity() {
		
		EntityRegistry.registerModEntity(Fly_Hot_dog_break.class, "Fly_Hot_dog_break", nextID++, RefStrings.MODID, 64, 3, true);
		
	}
}

