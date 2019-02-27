package com.somenew.giminey.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class Fly_Hot_dog_break extends EntityThrowable {

	public Fly_Hot_dog_break(World par1World) {
        super(par1World);
        setSize(0.5F, 0.5F);
    }
	
	public Fly_Hot_dog_break(World par1World, EntityLivingBase par2EntityLivingBase, int dmg) {
        super(par1World, par2EntityLivingBase);
        this.damage = dmg;
        setSize(0.5F, 0.5F);
    }

	int damage=8;
	


	@Override
	protected void onImpact(MovingObjectPosition xx) {
		
		Vec3 vec3 = xx.hitVec;
		int beginX = (int) (vec3.xCoord - 4),
	        beginY = (int) (vec3.yCoord - 2),
	        beginZ = (int) (vec3.zCoord - 4);
		
		if(xx.typeOfHit == MovingObjectType.ENTITY) {
            xx.entityHit.attackEntityFrom(DamageSource.causeThornsDamage(this), damage);
        }
        
        this.setDead();
	}
	
	protected float func_70182_d()
    {
        return 1.5F;
    }
	
	protected float getGravityVelocity()
    {
        return 0.01F;
    }
	
}
