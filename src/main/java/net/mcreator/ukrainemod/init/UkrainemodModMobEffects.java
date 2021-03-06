
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ukrainemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.ukrainemod.potion.GasMobEffect;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UkrainemodModMobEffects {
	private static final List<MobEffect> REGISTRY = new ArrayList<>();
	public static final MobEffect GAS = register(new GasMobEffect());

	private static MobEffect register(MobEffect effect) {
		REGISTRY.add(effect);
		return effect;
	}

	@SubscribeEvent
	public static void registerMobEffects(RegistryEvent.Register<MobEffect> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MobEffect[0]));
	}
}
