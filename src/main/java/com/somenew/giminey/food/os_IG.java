package com.somenew.giminey.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class os_IG extends ItemFood {

	public os_IG(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		
	}
	
	@Override  
	public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
	        
		 if (!worldIn.isRemote) {
			 
			 player.addExperience(200);
			
		 }
		 super.onFoodEaten(stack, worldIn, player);
	    	
	 }

}
