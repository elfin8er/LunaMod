package com.lunasmp.lunamod;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityThrowingKnife extends EntityThrowable
{
    public EntityThrowingKnife(World par1World)
    {
        super(par1World);
    }

    public EntityThrowingKnife(World par1World, EntityLiving par2EntityLiving)
    {
        super(par1World, par2EntityLiving);
    }

    public EntityThrowingKnife(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (par1MovingObjectPosition.entityHit != null)
        {
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 6);
        }

        if (!this.worldObj.isRemote && this.rand.nextInt(8) == 0)
        {
            byte var2 = 0;

            if (this.rand.nextInt(32) == 0)
            {
                var2 = 0;
            }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}}