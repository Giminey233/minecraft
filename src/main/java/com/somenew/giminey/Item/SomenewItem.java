package com.somenew.giminey.Item;

import com.somenew.giminey.food.Diamond_IG;
import com.somenew.giminey.food.Golden_IG;
import com.somenew.giminey.food.Wxz_Biochemistry_hot_dog_bread;
import com.somenew.giminey.food.Wxz_Diamond_hot_dog_bread;
import com.somenew.giminey.food.Wxz_Golden_hot_dog_bread;
import com.somenew.giminey.food.Wxz_Iron_hot_dog_bread;
import com.somenew.giminey.food.Wxz_Obsidian_hot_dog_bread;
import com.somenew.giminey.food.Wxz_cold_dog;
import com.somenew.giminey.food.Wxz_hot_dog;
import com.somenew.giminey.food.Wxz_hot_dog_bread;
import com.somenew.giminey.food.os_IG;
import com.somenew.giminey.lib.RefStrings;
import com.somenew.giminey.tab.GimineyTab;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SomenewItem {
	
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ArmorMaterial obsidian=EnumHelper.addArmorMaterial("obsidian", 50, new int[]{3, 8, 6, 3}, 9);
	public static ToolMaterial obsidian_pro=EnumHelper.addToolMaterial("obsidian", 3, 2048, 10.0F, 4.0F, 8);

	public static Item Wxz_cold_dog;
	public static Item Wxz_hot_dog;
	public static Item Wxz_hot_dog_bread;
	public static Item Wxz_Obsidian_hot_dog_bread;
	public static Item Wxz_Diamond_hot_dog_bread;
	public static Item Wxz_Golden_hot_dog_bread;
	public static Item Wxz_Iron_hot_dog_bread;
	public static Item Wxz_Biochemistry_hot_dog_bread;

	public static Item beurre;
	public static Item flour;
	
	public static Item obsidian_axe;
	public static Item obsidian_pickaxe;
	public static Item obsidian_hoe;
	public static Item obsidian_shovel;
	public static Item obsidian_sword;
	
	public static Item diamond_debris;
	public static Item Diamond_IG;
	public static Item os_IG;
	public static Item Golden_IG;
	
	public static Item Shooter_WXZ;
	
	public static Item obsidian_stick;
	public static Item obsidian_Powder;
	public static Item obsidian_Processed;
	public static Item obsidian_somenew_lab_logo;
	public static Item obsidian_chestplate;
	public static Item obsidian_boots;
	public static Item obsidian_helmet;
	public static Item obsidian_leggings;
	
	public static void initializeItem() {
		Wxz_cold_dog=new Wxz_cold_dog(1,0.5F,false).setUnlocalizedName("Wxz_cold_dog").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:Wxz_cold_dog");
		Wxz_hot_dog=new Wxz_hot_dog(3,0.6F,false).setUnlocalizedName("Wxz_hot_dog").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:Wxz_hot_dog");
		Wxz_hot_dog_bread=new Wxz_hot_dog_bread(10,0.8F,false).setUnlocalizedName("Wxz_hot_dog_bread").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:Wxz_hot_dog_bread");
		Wxz_Obsidian_hot_dog_bread=new Wxz_Obsidian_hot_dog_bread(18,1.0F,false).setUnlocalizedName("Wxz_Obsidian_hot_dog_bread").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:Wxz_Obsidian_hot_dog_bread");
		Wxz_Diamond_hot_dog_bread=new Wxz_Diamond_hot_dog_bread(18,1.0F,false).setUnlocalizedName("Wxz_Diamond_hot_dog_bread").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:Wxz_Diamond_hot_dog_bread");
		Wxz_Golden_hot_dog_bread=new Wxz_Golden_hot_dog_bread(14,0.8F,false).setUnlocalizedName("Wxz_Golden_hot_dog_bread").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:Wxz_Golden_hot_dog_bread");
		Wxz_Iron_hot_dog_bread=new Wxz_Iron_hot_dog_bread(14,0.8F,false).setUnlocalizedName("Wxz_Iron_hot_dog_bread").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:Wxz_Iron_hot_dog_bread");
		Wxz_Biochemistry_hot_dog_bread=new Wxz_Biochemistry_hot_dog_bread(11,0.0F,true).setUnlocalizedName("Wxz_Biochemistry_hot_dog_bread").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:Wxz_Biochemistry_hot_dog_bread");
		
		Diamond_IG=new Diamond_IG(0,0F,false).setUnlocalizedName("Diamond_IG").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:Diamond_IG").setMaxStackSize(1);
		os_IG=new os_IG(0,0F,false).setUnlocalizedName("os_IG").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_IG").setMaxStackSize(1);
		Golden_IG=new Golden_IG(0,0F,false).setUnlocalizedName("Golden_IG").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:Golden_IG").setMaxStackSize(1);
		beurre=new Item().setUnlocalizedName("beurre").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:beurre");
		flour=new Item().setUnlocalizedName("flour").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:flour");
		obsidian_stick=new Item().setUnlocalizedName("obsidian_stick").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_stick");
		diamond_debris=new Item().setUnlocalizedName("diamond_debris").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:diamond_debris");
		obsidian_Processed=new Item().setUnlocalizedName("obsidian_Processed").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_processed");
		obsidian_Powder=new Item().setUnlocalizedName("obsidian_Powder").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_powder").setMaxStackSize(1);
		obsidian_somenew_lab_logo=new Item().setUnlocalizedName("obsidian_somenew_lab_logo").setTextureName("somenew:somenew_lab_logo");
		
		obsidian_chestplate=new obsidian_chestplate(obsidian,5,1).setUnlocalizedName("obsidian_chestplate").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_chestplate");
		obsidian_boots=new obsidian_boots(obsidian,5,3).setUnlocalizedName("obsidian_boots").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_boots");
		obsidian_helmet=new obsidian_helmet(obsidian,5,0).setUnlocalizedName("obsidian_helmet").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_helmet");
		obsidian_leggings=new obsidian_leggings(obsidian,5,2).setUnlocalizedName("obsidian_leggings").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_leggings");
		obsidian_axe=new obsidian_axe(obsidian_pro).setUnlocalizedName("obsidian_axe").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_axe");
		obsidian_pickaxe=new obsidian_pickaxe(obsidian_pro).setUnlocalizedName("obsidian_pickaxe").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_pickaxe");
		obsidian_hoe=new obsidian_hoe(obsidian_pro).setUnlocalizedName("obsidian_hoe").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_hoe");
		obsidian_shovel=new obsidian_shovel(obsidian_pro).setUnlocalizedName("obsidian_shovel").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_shovel");
		obsidian_sword=new obsidian_sword(obsidian_pro).setUnlocalizedName("obsidian_sword").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:os_sword");
		Shooter_WXZ=new Shooter_WXZ().setUnlocalizedName("Shooter_WXZ").setCreativeTab(GimineyTab.GimineyTabs).setTextureName("somenew:Shooter_WXZ").setMaxStackSize(1);
		
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(Wxz_Obsidian_hot_dog_bread, Wxz_Obsidian_hot_dog_bread.getUnlocalizedName());
		GameRegistry.registerItem(Wxz_Diamond_hot_dog_bread, Wxz_Diamond_hot_dog_bread.getUnlocalizedName());
		GameRegistry.registerItem(Wxz_Golden_hot_dog_bread, Wxz_Golden_hot_dog_bread.getUnlocalizedName());
		GameRegistry.registerItem(Wxz_Iron_hot_dog_bread, Wxz_Iron_hot_dog_bread.getUnlocalizedName());
		GameRegistry.registerItem(Wxz_Biochemistry_hot_dog_bread, Wxz_Biochemistry_hot_dog_bread.getUnlocalizedName());
		
		GameRegistry.registerItem(Shooter_WXZ, Shooter_WXZ.getUnlocalizedName());
		GameRegistry.registerItem(Wxz_cold_dog, Wxz_cold_dog.getUnlocalizedName());
		GameRegistry.registerItem(Wxz_hot_dog, Wxz_hot_dog.getUnlocalizedName());
		GameRegistry.registerItem(Wxz_hot_dog_bread, Wxz_hot_dog_bread.getUnlocalizedName());
		
		GameRegistry.registerItem(Diamond_IG, Diamond_IG.getUnlocalizedName());
		GameRegistry.registerItem(os_IG, os_IG.getUnlocalizedName());
		GameRegistry.registerItem(Golden_IG, Golden_IG.getUnlocalizedName());
		GameRegistry.registerItem(beurre, beurre.getUnlocalizedName());
		GameRegistry.registerItem(flour, flour.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_stick, obsidian_stick.getUnlocalizedName());
		GameRegistry.registerItem(diamond_debris, diamond_debris.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_Processed, obsidian_Processed.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_Powder, obsidian_Powder.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_somenew_lab_logo, obsidian_somenew_lab_logo.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_chestplate, obsidian_chestplate.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_boots, obsidian_boots.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_helmet, obsidian_helmet.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_leggings, obsidian_leggings.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_axe, obsidian_axe.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_pickaxe, obsidian_pickaxe.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_hoe, obsidian_hoe.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_shovel, obsidian_shovel.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_sword, obsidian_sword.getUnlocalizedName());
		
	}
	
	
}
