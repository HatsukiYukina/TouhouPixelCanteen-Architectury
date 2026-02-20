package net.nyauru.gensokyoizakaya.fabric.integration;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.client.gui.screens.Screen;
import net.nyauru.gensokyoizakaya.config.ModConfig;

public class ModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        //返回自动生成的配置屏幕
        return parent -> (Screen) AutoConfig.getConfigScreen(ModConfig.class, parent).get();
    }

}
