package com.lunasmp.lunamod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class FoodCookedLamb extends ItemFood {

	public FoodCookedLamb(int restore, float saturation, boolean wolf) {
		super(restore, saturation, wolf);
		this.setUnlocalizedName("lamb");
		this.setTextureName(LunaMod.modid + ":" + "lamb");
		this.setCreativeTab(CreativeTabs.tabFood);
	}

}
