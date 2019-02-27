package com.somenew.giminey.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Wxz_Golden_hot_dog_bread extends ItemFood {

	public Wxz_Golden_hot_dog_bread(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		
		this.setPotionEffect(Potion.regeneration.id, 60, 1, 1.0F);
		this.setAlwaysEdible();
		this.setMaxStackSize(1);
	}

	@Override
    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {
            player.addPotionEffect(new PotionEffect(Potion.heal.id, 0, 1));
            
        }
        super.onFoodEaten(stack, worldIn, player);
    }
}
