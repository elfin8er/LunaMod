package com.lunasmp.lunamod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class CupMilk extends Item{

	public CupMilk(){
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setContainerItem(null);
		GameRegistry.registerItem(this, "cupMilk");
	}
	
}
