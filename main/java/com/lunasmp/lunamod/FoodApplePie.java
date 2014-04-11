package com.lunasmp.lunamod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodApplePie extends ItemFood{

	public FoodApplePie(int restore, float saturation, boolean wolf) {
		super(restore, saturation, wolf);
		
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName("applePie");
		this.setTextureName(LunaMod.modid + ":" + "applePie");
		GameRegistry.registerItem(this, "applePie");
	}
	
	

}
