package org.maghtuireadh.lunariush.byhishands.handlers;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import static org.maghtuireadh.lunariush.byhishands.init.ItemInit.tutorial_ingot;
import static org.maghtuireadh.lunariush.byhishands.init.BlockInit.tutorial_ore;
/*
@EventBusSubscriber(modid = "bhh")
public class Registry{
	
    public static Item[] itemArray= {tutorial_ingot};
    public static Block[] blockArray= {tutorial_ore};
    
	@SubscribeEvent
    public static void RegisterModels(ModelRegistryEvent array) {
		for(Item i : itemArray) {
            ModelLoader.setCustomModelResourceLocation(i, 0, new ModelResourceLocation(i.getRegistryName().toString()));
        }
		for(Block b : blockArray) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(b), 0, new ModelResourceLocation(b.getRegistryName(),"inventory"));
        }
    }

}
*/