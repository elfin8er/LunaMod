/*
 * Feel free to add whatever you want to this mod. When we get a bunch of content added to it, we can
 * Use it for let's plays. 
 * 
 * Note that currently this MOD may not be compatible with Multiplayer. If anyone would like to keep it updated for multiplayer, that would be great!
 *
 */

package com.lunasmp.lunamod;

import com.sun.xml.internal.stream.Entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = LunaMod.modid, version = LunaMod.version)
public class LunaMod {
	
	public static final String modid = "LunaMod";
	public static final String version = "MC1.7.4_DEV";
	
	// Items
	static Item FoodChocolateMilk;
	static Item ItemCup;
	static Item ItemCupMilk;
	static Item FoodHamburger;
	static Item FoodEggs;
	static Item FoodRawLamb;
	static Item FoodCookedLamb;
	static Item FoodApplePie;
	static Item ItemFlour;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		// I'm putting each item and food in a seperate class for now. This may change
		// in the future!
		ItemCup = new ItemCup();
		FoodChocolateMilk = new FoodChocolateMilk(2, 0, false);
		ItemCupMilk = new ItemCupMilk();
		FoodHamburger = new FoodHamburger(6, 0.3F, false);
		FoodEggs = new FoodEggs(3, 0.3F, false);
		FoodRawLamb = new FoodRawLamb(3, 0.3F, false);
		FoodCookedLamb = new FoodCookedLamb(6, 0.3F, false);
		FoodApplePie = new FoodApplePie(8, 0.3F, false);
		ItemFlour = new ItemFlour();
		
		// Crafting
		new CraftingManager();
		
		FMLCommonHandler.instance().bus().register(new CustomEventHandler());
	}

	@EventHandler
	public void init(FMLInitializationEvent event){

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
