package com.lunasmp.lunamod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FoodChocolateMilk extends ItemFood{

	public FoodChocolateMilk(int restore, int saturation, boolean wolf) {
		super(restore, saturation, wolf);
		
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName("chocolateMilk");
		this.setTextureName(LunaMod.modid + ":" + "chocolateMilk");
		this.setMaxStackSize(1);
		GameRegistry.registerItem(this, "chocolateMilk");
	}
}
