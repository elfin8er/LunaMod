package com.lunasmp.lunamod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCup extends Item{

	public ItemCup(){
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setContainerItem(null);
		GameRegistry.registerItem(this, "cup");
	}
	
}
