package com.lunasmp.lunamod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {

	public CraftingManager(){
		// Chocolate Milk
		GameRegistry.addShapelessRecipe(new ItemStack(LunaMod.ChocolateMilk, 1), new Object[]{
			LunaMod.CupMilk,
			new ItemStack(Items.dye, 1, 3)
		});
		
		// Cup
		GameRegistry.addRecipe(new ItemStack(LunaMod.Cup, 3), new Object[]{
	    	"   ",
	    	"C C",
	    	" C ",
	    	
	    	'C', Items.clay_ball
		});
		
		// Cup Milk
		GameRegistry.addShapelessRecipe(new ItemStack(LunaMod.CupMilk, 3), new Object[]{
			LunaMod.Cup,
			LunaMod.Cup,
			LunaMod.Cup,
			Items.milk_bucket
		});
		
		// Hamburger
		GameRegistry.addRecipe(new ItemStack(LunaMod.Hamburger), new Object[]{
			"BBB",
			"PPP",
			"BBB",
			
			'B', Items.bread,
			'P', Items.beef
		});
	}
	
}
