package beggar;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid = beggar.MODID, name = beggar.MODNAME, version = beggar.VERSION)

public class beggar {
    public static final CreativeTabs tabZen = new CreativeTabs("tabZen") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.redstone_block);
        }
    };
    public static final String MODNAME = "Zen Technology";
    public static final String MODID = "zen";
    public static final String VERSION = "1.0.0";
    public static Block MolecT;
    public static Block blockStar;

    @EventHandler
    public void preLoad(FMLInitializationEvent event)
    {
        MolecT = new Mekanism(Material.iron, "BlockMekanism", "Wood").setCreativeTab(tabZen);
        blockStar = new Mekanism(Material.iron, "BlockNetherStar", "blockNetherStar").setCreativeTab(tabZen);
    }
}
