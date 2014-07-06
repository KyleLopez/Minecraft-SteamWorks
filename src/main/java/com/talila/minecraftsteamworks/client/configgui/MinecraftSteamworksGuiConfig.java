package com.talila.minecraftsteamworks.client.configgui;

import com.talila.minecraftsteamworks.handlers.ConfigurationHandler;
import com.talila.minecraftsteamworks.references.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

/**
 * Created by Talila on 7/6/2014.
 */
public class MinecraftSteamworksGuiConfig extends GuiConfig {

   public MinecraftSteamworksGuiConfig(GuiScreen parentScreen) {
      super(parentScreen,
              new ConfigElement(ConfigurationHandler.configuration.getCategory(
                      Configuration.CATEGORY_GENERAL)).getChildElements(),
              Reference.MOD_ID,
              false,
              false,
              GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
   }
}
