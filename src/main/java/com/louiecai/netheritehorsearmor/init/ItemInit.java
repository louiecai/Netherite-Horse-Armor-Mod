package com.louiecai.netheritehorsearmor.init;

import com.louiecai.netheritehorsearmor.NetheriteHorseArmor;
import com.louiecai.netheritehorsearmor.objects.items.NetheriteHorseArmorItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(NetheriteHorseArmor.MOD_ID)
@Mod.EventBusSubscriber(modid = NetheriteHorseArmor.MOD_ID, bus = Bus.MOD)
public class ItemInit {
	
	public static final Item netherite_horse_armor = null;
		
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new NetheriteHorseArmorItem().setRegistryName("netherite_horse_armor"));
	}
}
