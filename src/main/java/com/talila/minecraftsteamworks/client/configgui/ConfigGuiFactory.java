package com.talila.minecraftsteamworks.client.configgui;

import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

import java.util.Set;

/**
 * Created by Talila on 7/6/2014.
 */
public class ConfigGuiFactory implements IModGuiFactory {
   @Override
   public void initialize(Minecraft minecraftInstance) {

   }

   @Override
   public Class<? extends GuiScreen> mainConfigGuiClass() {
      return MinecraftSteamworksGuiConfig.class;
   }

   @Override
   public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
      return null;
   }

   @Override
   public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
      return null;
   }
}
