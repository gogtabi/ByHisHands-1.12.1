package org.maghtuireadh.lunariush.byhishands.init;

import org.maghtuireadh.lunariush.byhishands.init.blocks.CustomOre;
import org.maghtuireadh.lunariush.byhishands.init.items.CustomIngot;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockInit {
	public static Block tutorial_ore;

	public static void init() {
		//CustomOre("name", Hardness, Blast Resistance, Hardness Level)
		tutorial_ore = new CustomOre("tutorial_ore", 2.0F, 4.0F, 2);
	}
	
	public static void register() {
		registerBlock(tutorial_ore);
	}
	
	public static void registerBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
	}

	public static void registerRender(Block block) {
		registerRender(tutorial_ore);
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(),"inventory"));
	}
}
