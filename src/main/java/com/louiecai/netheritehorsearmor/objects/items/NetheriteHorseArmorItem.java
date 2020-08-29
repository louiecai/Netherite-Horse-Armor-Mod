package com.louiecai.netheritehorsearmor.objects.items;

import com.louiecai.netheritehorsearmor.NetheriteHorseArmor;

import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;

public class NetheriteHorseArmorItem extends HorseArmorItem {

	public NetheriteHorseArmorItem() {
		super(13,
				new ResourceLocation(NetheriteHorseArmor.MOD_ID,
						"textures/entity/horse/armor/horse_armor_netherite.png"),
				(new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC));
	}

	@Override
	public boolean func_234685_a_(DamageSource damageSource) {
		if (damageSource == DamageSource.LAVA || damageSource == DamageSource.IN_FIRE
				|| damageSource == DamageSource.ON_FIRE) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public int func_219977_e() {
		// TODO Auto-generated method stub
		return 13;
	}

}
