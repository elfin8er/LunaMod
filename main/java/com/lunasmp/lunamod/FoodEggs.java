package com.lunasmp.lunamod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodEggs extends ItemFood{

	public FoodEggs(int restore, float saturation, boolean wolf) {
		super(restore, saturation, wolf);
		this.setUnlocalizedName("eggs");
		this.setTextureName(LunaMod.modid + ":" + "eggs");
		this.setCreativeTab(CreativeTabs.tabFood);
	}
}
