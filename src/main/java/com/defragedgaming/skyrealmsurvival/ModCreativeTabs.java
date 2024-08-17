package com.defragedgaming.skyrealmsurvival;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final RegistryObject<CreativeModeTab> SKYREALM_TAB = DeferredRegister.create(
                    ForgeRegistries.CREATIVE_MODE_TABS, SkyRealmSurvivalMod.MODID)
            .register("skyrealm_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(Items.DIAMOND))
                            .title(Component.translatable("creativetab.skyrealm_tab"))
                            .build());
}
