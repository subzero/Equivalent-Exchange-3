package ee3.common.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import ee3.common.lib.BlockIds;
import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class ModBlocks {
    
    /* Block name constants */
    public static final String CALCINATOR_NAME = "calcinator";
    public static final String RED_WATER_STILL_NAME = "redWaterStill";
	
    /* Mod block instances */
	public static Block calcinator;
	public static Block redWaterStill;
	public static Block redWaterFlowing;

	public static void init() {

		calcinator = new BlockCalcinator(BlockIds.CALCINATOR).setBlockName(CALCINATOR_NAME);
		redWaterStill = new BlockRedWaterStill(BlockIds.RED_WATER_STILL, Material.water);
		redWaterFlowing = new BlockRedWaterFlowing(BlockIds.RED_WATER_STILL - 1, Material.water);
		
		LanguageRegistry.addName(calcinator, "Calcinator");
		LanguageRegistry.addName(redWaterStill, "Red Water (Still)");
		LanguageRegistry.addName(redWaterFlowing, "Red Water (Flowing)");
		
		GameRegistry.registerBlock(calcinator);
		GameRegistry.registerBlock(redWaterStill);
		GameRegistry.registerBlock(redWaterFlowing);
		
	}

}
