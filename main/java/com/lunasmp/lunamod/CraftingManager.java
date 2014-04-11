package com.lunasmp.lunamod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {

	public CraftingManager(){
		// Chocolate Milk
		GameRegistry.addShapelessRecipe(new ItemStack(LunaMod.FoodChocolateMilk, 1), new Object[]{
			LunaMod.ItemCupMilk,
			new ItemStack(Items.dye, 1, 3)
		});
		
		// Cup
		GameRegistry.addRecipe(new ItemStack(LunaMod.ItemCup, 3), new Object[]{
	    	"   ",
	    	"C C",
	    	" C ",
	    	
	    	'C', Items.clay_ball
		});
		
		// Cup Milk
		GameRegistry.addShapelessRecipe(new ItemStack(LunaMod.ItemCupMilk, 3), new Object[]{
			LunaMod.ItemCup,
			LunaMod.ItemCup,
			LunaMod.ItemCup,
			Items.milk_bucket
		});
		
		// Hamburger
		GameRegistry.addRecipe(new ItemStack(LunaMod.FoodHamburger), new Object[]{
			"BBB",
			"PPP",
			"BBB",
			
			'B', Items.bread,
			'P', Items.beef
		});
		
		// Eggs
		GameRegistry.addSmelting(Items.egg, new ItemStack(LunaMod.FoodEggs), 0.35F);
		
		// Cooked Lamb
		GameRegistry.addSmelting(LunaMod.FoodRawLamb, new ItemStack(LunaMod.FoodCookedLamb), 1F);
	}
	
}
