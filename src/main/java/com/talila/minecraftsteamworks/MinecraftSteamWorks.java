package com.talila.minecraftsteamworks;

import com.talila.minecraftsteamworks.handlers.ConfigurationHandler;
import com.talila.minecraftsteamworks.init.ModItems;
import com.talila.minecraftsteamworks.proxies.IProxy;
import com.talila.minecraftsteamworks.references.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Talila on 6/27/2014.
 */
@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.CONFIG_GUI_FACTORY_CLASS)
public class MinecraftSteamWorks {
   @Mod.Instance("minecraftsteamworks")
   public static MinecraftSteamWorks instance;

   @SidedProxy(clientSide = Reference.CLIENT_PROXY,
           serverSide = Reference.SERVER_PROXY)
   public static IProxy proxy;

   @Mod.EventHandler
   public void preInit(FMLPreInitializationEvent event) {
      ConfigurationHandler.init(event.getSuggestedConfigurationFile());
      FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

      ModItems.init();
   }

   @Mod.EventHandler
   public void init(FMLInitializationEvent event) {

   }

   @Mod.EventHandler
   public void postInit(FMLPostInitializationEvent event) {

   }
}
