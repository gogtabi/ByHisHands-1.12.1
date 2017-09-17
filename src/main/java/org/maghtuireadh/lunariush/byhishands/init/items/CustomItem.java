package org.maghtuireadh.lunariush.byhishands.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomItem extends Item
	{
		public CustomItem(String name)
		{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
	}
}