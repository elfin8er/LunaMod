package com.lunasmp.lunamod;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class CustomEventHandler {

	@SubscribeEvent
	public void onDeath(LivingDeathEvent event) {
		if(event.entityLiving.worldObj.isRemote)
		return;
		if(event.entity instanceof EntitySheep){
			EntitySheep sheep = (EntitySheep) event.entity;
			sheep.dropItem(LunaMod.FoodRawLamb, 0 + (int)(Math.random() * ((2 - 0) + 1)));
		}
	}
	
	@SubscribeEvent
    public void onPlayerLogin(PlayerLoggedInEvent event){
    	event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.YELLOW + "LunaMod Version: " + LunaMod.version + " is installed!"));
    }
}
