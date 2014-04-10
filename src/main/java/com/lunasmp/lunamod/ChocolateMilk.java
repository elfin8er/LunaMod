package com.lunasmp.lunamod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ChocolateMilk extends ItemFood{

	public ChocolateMilk(int restore, int i, boolean wolf) {
		super(restore, i, wolf);
		
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setContainerItem(null);
		this.setMaxStackSize(1);
		GameRegistry.registerItem(this, "chocolateMilk");
	}
	
	
	
		
	
}
