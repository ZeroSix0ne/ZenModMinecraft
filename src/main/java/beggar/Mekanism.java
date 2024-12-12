package beggar;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Mekanism extends Block {
    protected Mekanism (Material p_i45394_1_, String name, String texture) {
        super (p_i45394_1_);
        this.setBlockName(name);
        this.setLightLevel(0F);
        this.setLightOpacity(10);
        this.setHardness(1.0F);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName(beggar.MODID+":"+texture);
        GameRegistry.registerBlock(this, name);
    }
}