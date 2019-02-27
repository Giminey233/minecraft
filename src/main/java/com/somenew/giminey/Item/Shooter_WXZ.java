package com.somenew.giminey.Item;

import com.somenew.giminey.entity.Fly_Hot_dog_break;
import akka.io.Tcp.Event;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;

public class Shooter_WXZ extends Item {
	

	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
    {
        entityPlayer.setItemInUse(itemStack, getMaxItemUseDuration(itemStack)); 
        return itemStack;
    }
    
	public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.bow;
    }
    public void onPlayerStoppedUsing(ItemStack itemStack, World world, EntityPlayer entityPlayer, int par4) {
    
        	if(!world.isRemote) { 
            	int damage = par4 / 10 + 8;
        		if(damage >= 8) damage = 8;
        		world.spawnEntityInWorld(new Fly_Hot_dog_break(world, entityPlayer, damage));

        	}
    }
    
    public int getMaxItemUseDuration(ItemStack itemStack)
    {
        return 200;
    }
}
