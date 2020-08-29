package com.louiecai.netheritehorsearmor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * 
 * @author Louie Cai
 *
 */

@Mod("netheritehorsearmor")
@Mod.EventBusSubscriber(modid = NetheriteHorseArmor.MOD_ID, bus = Bus.MOD)
public class NetheriteHorseArmor {
	
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "netheritehorsearmor";
    public static NetheriteHorseArmor instance;

    public NetheriteHorseArmor() {
    	
    	final IEventBus modEventBus =  FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        
     //   ItemInit.ITEMS.register(modEventBus);
     //   BlockInit.BLOCKS.register(modEventBus);
     //   TileEntityTypesInit.TILE_ENTITY_TYPES.register(modEventBus);
      //  FeatureInit.FEATURES.register(modEventBus);
      //  BiomeInit.BIOMES.register(modEventBus);
     //   DimensionInit.MOD_DIMENSIONS.register(modEventBus);
        
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }
       
    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    	
    }
    
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    }
}