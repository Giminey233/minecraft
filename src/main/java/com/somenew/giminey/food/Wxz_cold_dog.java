package com.somenew.giminey.food;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Wxz_cold_dog extends ItemFood{

	public Wxz_cold_dog(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		
	}
	
	public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 10;
    }

}
