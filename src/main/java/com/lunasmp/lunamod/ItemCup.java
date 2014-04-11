package com.lunasmp.lunamod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCup extends Item{

	public ItemCup(){
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("cup");
		this.setTextureName(LunaMod.modid + ":" + "cup");
		GameRegistry.registerItem(this, "cup");
	}
	
}
