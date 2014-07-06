package com.talila.minecraftsteamworks.handlers;

import com.talila.minecraftsteamworks.references.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Talila on 6/29/2014.
 */
public class ConfigurationHandler {
   public static Configuration configuration;

   public static void init(File configFile) {
      if (configuration == null) {
         configuration = new Configuration(configFile);
         loadConfigurations();
      }
   }

   @SubscribeEvent
   public void onConfigurationChangedEvent(ConfigChangedEvent event) {
      if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
         loadConfigurations();
      }
   }

   private static void loadConfigurations() {
      if (configuration.hasChanged()) {
         configuration.save();
      }
   }
}
