package org.maghtuireadh.lunariush.byhishands.init;

import org.maghtuireadh.lunariush.byhishands.Reference;
import org.maghtuireadh.lunariush.byhishands.init.items.CustomIngot;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemInit {
	
		public static Item tutorial_ingot;

		public static void init() {
			tutorial_ingot = new CustomIngot("tutorial_ingot");
		}
		
		public static void register() {
			registerItem(tutorial_ingot);
		}
		public static void registerItem(Item item) {
			ForgeRegistries.ITEMS.register(item);
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
			//Deprecated 1.12/1.10.2 method Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		}
}
