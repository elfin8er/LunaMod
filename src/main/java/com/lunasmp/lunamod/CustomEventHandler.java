package com.lunasmp.lunamod;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class CustomEventHandler {
	
	@SubscribeEvent
	public void onDeath(LivingDeathEvent event) {
		if(event.entityLiving.worldObj.isRemote)
		return;
		if(event.entity instanceof EntitySheep){
			EntitySheep sheep = (EntitySheep) event.entity;
			sheep.dropItem(LunaMod.FoodRawLamb, 1);
		}
	}

}
