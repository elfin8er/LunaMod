package com.lunasmp.lunamod;

import net.minecraft.item.ItemFood;

public class FoodHamburger extends ItemFood{

	public FoodHamburger(int restore, float saturation, boolean wolf) {
		super(restore, saturation, wolf);
		this.setUnlocalizedName("hamburger");
		this.setTextureName(LunaMod.modid + ":" + "hamburger");
	}

}
