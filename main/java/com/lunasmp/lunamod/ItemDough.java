package com.lunasmp.lunamod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemDough extends Item {

	public ItemDough(){
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("dough");
		this.setTextureName(LunaMod.modid + ":" + "dough");
		GameRegistry.registerItem(this, "dough");
	}
	
}
