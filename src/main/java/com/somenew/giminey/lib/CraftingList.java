package com.somenew.giminey.lib;

import com.somenew.giminey.Item.SomenewItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class CraftingList {
	
	public static void craftinglist_Crafting() {
		
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.obsidian_boots), new Object[]
		        {
		                "   ", "# #", "# #", '#', SomenewItem.obsidian_Processed
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.obsidian_leggings), new Object[]
		        {
		                "###", "# #", "# #", '#', SomenewItem.obsidian_Processed
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.obsidian_chestplate), new Object[]
		        {
		                "# #", "###", "###", '#', SomenewItem.obsidian_Processed
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.obsidian_helmet), new Object[]
		        {
		                "###", "# #", "   ", '#', SomenewItem.obsidian_Processed
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.obsidian_Powder), new Object[]
		        {
		                "$*$", "*#*", "$*$", '#', SomenewItem.diamond_debris,'*',Items.iron_ingot,'$',Blocks.obsidian
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.obsidian_axe), new Object[]
		        {
		                " ##", " $#", " $ ", '#', SomenewItem.obsidian_Processed,'$',SomenewItem.obsidian_stick
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.obsidian_pickaxe), new Object[]
		        {
		                "###", " $ ", " $ ", '#', SomenewItem.obsidian_Processed,'$',SomenewItem.obsidian_stick
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.obsidian_sword), new Object[]
		        {
		                " # ", " # ", " $ ", '#', SomenewItem.obsidian_Processed,'$',SomenewItem.obsidian_stick
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.obsidian_shovel), new Object[]
		        {
		                " # ", " $ ", " $ ", '#', SomenewItem.obsidian_Processed,'$',SomenewItem.obsidian_stick
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.obsidian_hoe), new Object[]
		        {
		                " ##", " $ ", " $ ", '#', SomenewItem.obsidian_Processed,'$',SomenewItem.obsidian_stick
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.Wxz_Iron_hot_dog_bread), new Object[]
		        {
		                "$$$", "$#$", "$$$", '#', SomenewItem.Wxz_hot_dog_bread,'$',Items.iron_ingot
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.Wxz_Golden_hot_dog_bread), new Object[]
		        {
		                "$$$", "$#$", "$$$", '#', SomenewItem.Wxz_hot_dog_bread,'$',Items.gold_ingot
		        });
		GameRegistry.addShapedRecipe(new ItemStack(Items.bread), new Object[]
		        {
		                "   ", "   ", "$$$",'$',SomenewItem.flour
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.Golden_IG), new Object[]
		        {
		                "$$$", "###", "$$$",'$',Items.gold_ingot,'#',Items.gold_nugget
		        });
		GameRegistry.addShapedRecipe(new ItemStack(SomenewItem.os_IG), new Object[]
		        {
		                "$*$", "*#*", "$*$", '#', SomenewItem.diamond_debris,'*',Items.iron_ingot,'$',Blocks.obsidian
		        });
		
		GameRegistry.addShapelessRecipe(new ItemStack(SomenewItem.diamond_debris,2), Items.diamond);
		GameRegistry.addShapelessRecipe(new ItemStack(SomenewItem.obsidian_stick,2), SomenewItem.obsidian_Processed);
		GameRegistry.addShapelessRecipe(new ItemStack(SomenewItem.Wxz_cold_dog,3), Items.porkchop);
		GameRegistry.addShapelessRecipe(new ItemStack(SomenewItem.flour,1), Items.wheat);
		GameRegistry.addShapelessRecipe(new ItemStack(SomenewItem.beurre,1), new Object[] {Items.milk_bucket,SomenewItem.flour,Items.sugar,Items.egg});
		GameRegistry.addShapelessRecipe(new ItemStack(SomenewItem.Wxz_hot_dog_bread,1), new Object[] {SomenewItem.beurre,SomenewItem.Wxz_hot_dog,Items.bread});
		GameRegistry.addShapelessRecipe(new ItemStack(SomenewItem.Wxz_Diamond_hot_dog_bread,1), new Object[] {Items.diamond,SomenewItem.Wxz_hot_dog_bread});
		GameRegistry.addShapelessRecipe(new ItemStack(SomenewItem.Wxz_Obsidian_hot_dog_bread,1), new Object[] {SomenewItem.obsidian_Powder,SomenewItem.Wxz_hot_dog_bread});
		GameRegistry.addShapelessRecipe(new ItemStack(SomenewItem.Wxz_Biochemistry_hot_dog_bread,1), new Object[] {SomenewItem.Wxz_hot_dog_bread,Items.rotten_flesh});
		GameRegistry.addShapelessRecipe(new ItemStack(SomenewItem.Shooter_WXZ,1), new Object[] {SomenewItem.Diamond_IG,SomenewItem.Golden_IG,SomenewItem.os_IG,SomenewItem.Wxz_Obsidian_hot_dog_bread,
		SomenewItem.Wxz_Biochemistry_hot_dog_bread,SomenewItem.Wxz_Diamond_hot_dog_bread,SomenewItem.Wxz_Golden_hot_dog_bread,SomenewItem.Wxz_hot_dog_bread,SomenewItem.Wxz_Iron_hot_dog_bread});
		GameRegistry.addShapelessRecipe(new ItemStack(SomenewItem.Diamond_IG,1), Items.diamond);
		GameRegistry.addShapelessRecipe(new ItemStack(SomenewItem.os_IG,1), SomenewItem.obsidian_Powder);
	}

	
	public static void craftinglist_Smelting() {
		GameRegistry.addSmelting(SomenewItem.Wxz_cold_dog, new ItemStack(SomenewItem.Wxz_hot_dog), 0.F);
		GameRegistry.addSmelting(SomenewItem.obsidian_Powder, new ItemStack(SomenewItem.obsidian_Processed), 1.0F);
		
	}
	
}
