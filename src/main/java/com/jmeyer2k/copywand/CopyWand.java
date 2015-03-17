package com.jmeyer2k.copywand;


import org.apache.logging.log4j.Logger;

import com.jmeyer2k.copywand.items.CopyWandItem;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = CopyWand.MODID, version = CopyWand.VERSION)
public class CopyWand
{
    public static final String MODID = "copywand";
    public static final String VERSION = "1.0.1a";
    public Logger logger;
    
    @Instance
    public static CopyWand instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	CopyWandItem copyWand = new CopyWandItem();
    	GameRegistry.registerItem(copyWand, "copyWand");
    }
}
