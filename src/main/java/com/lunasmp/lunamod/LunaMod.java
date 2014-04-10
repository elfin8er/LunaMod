/*
 * Feel free to add whatever you want to this mod. When we get a bunch of content added to it, we can
 * Use it for let's plays.
 * 
 * For now, this mod is going to stay private. Please don't share it with anyone outside of the group.
 */

package com.lunasmp.lunamod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = LunaMod.modid, version = LunaMod.version)
public class LunaMod {
	
	public static final String modid = "LunaMod";
	public static final String version = "MC1.7.4";
	
	// Items
	static Item ChocolateMilk;
	static Item Cup;
	static Item CupMilk;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Cup = new Cup().setUnlocalizedName("cup").setTextureName(this.modid + ":" + "cup");
		
		ChocolateMilk = new ChocolateMilk(2, 0, false).setUnlocalizedName("chocolateMilk").setTextureName(this.modid + ":" + "chocolateMilk");
		
		CupMilk = new CupMilk().setUnlocalizedName("cupMilk").setTextureName(this.modid + ":" + "cupMilk");
		
		// Crafting
		new CraftingManager();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
