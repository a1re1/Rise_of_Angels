package lib.utility;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.item.Item;

public class RegisterHelper {

	public static void registerBlock(Block block){
		GameRegistry.registerBlock(block, Reference.MOD_ID + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerItem(Item item){
		GameRegistry.registerItem(item,  Reference.MOD_ID + item.getUnlocalizedName().substring(5));
	}
	
}
