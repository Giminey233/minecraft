package com.somenew.giminey.Item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import scala.reflect.api.Constants;

public class SomenewArmor extends ItemArmor {

	public SomenewArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);

	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(this.armorType==2){
		return "somenew:textures/models/os_layer_2.png";
		}else {
		return "somenew:textures/models/os_layer_1.png";
		}
		
	}
	
}
