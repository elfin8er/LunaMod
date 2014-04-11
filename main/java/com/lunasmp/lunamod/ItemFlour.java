package com.lunasmp.lunamod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemFlour extends Item{

	public ItemFlour(){
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("flour");
		this.setTextureName(LunaMod.modid + ":" + "flour");
		GameRegistry.registerItem(this, "flour");
	}
}
