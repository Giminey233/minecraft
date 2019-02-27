package com.somenew.giminey.food;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class Wxz_Iron_hot_dog_bread extends ItemFood {

	public Wxz_Iron_hot_dog_bread(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		
		this.setPotionEffect(Potion.field_76444_x.id, 180, 2, 1.0F);
		this.setAlwaysEdible();
		this.setMaxStackSize(1);
	}
	

}
