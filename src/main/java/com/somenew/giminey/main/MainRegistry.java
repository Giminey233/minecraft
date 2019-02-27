package com.somenew.giminey.main;
import com.somenew.giminey.Item.SomenewItem;
import com.somenew.giminey.entity.EntityLoader;
import com.somenew.giminey.entity.Fly_Hot_dog_break;
import com.somenew.giminey.lib.CraftingList;
import com.somenew.giminey.lib.RefStrings;
import com.somenew.giminey.render.RenderLoader;
import com.somenew.giminey.tab.GimineyTab;
import com.somenew.giminey.tab.GimineyTabs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=RefStrings.MODID,name=RefStrings.NAME,version=RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide=RefStrings.CLIENTSIDE,serverSide=RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		proxy.registerRenderInfo();
		GimineyTab.initialiseTabs();
		SomenewItem.mainRegistry();
		EntityLoader.RegisterEntity();
		
	}
	@EventHandler
	public static void load(FMLInitializationEvent event){
		CraftingList.craftinglist_Crafting();
		CraftingList.craftinglist_Smelting();	
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
}
