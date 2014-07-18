package com.talila.minecraftsteamworks.init;

import com.talila.minecraftsteamworks.items.ItemClayBucket;
import com.talila.minecraftsteamworks.items.ItemMSW;
import com.talila.minecraftsteamworks.items.ItemUnfiredClayBucket;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Talila on 7/6/2014.
 */
public class ModItems {
   public static final ItemMSW clayBucket = new ItemClayBucket();
   public static final ItemMSW unfiredClayBucket = new ItemUnfiredClayBucket();

   public static void init() {
      GameRegistry.registerItem(clayBucket, "clayBucket");
      GameRegistry.registerItem(unfiredClayBucket, "unfiredClayBucket");
   }
}
