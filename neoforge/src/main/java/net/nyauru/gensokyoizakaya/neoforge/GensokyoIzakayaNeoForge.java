package net.nyauru.gensokyoizakaya.neoforge;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.nyauru.gensokyoizakaya.GensokyoIzakaya;
import net.neoforged.fml.common.Mod;
import net.nyauru.gensokyoizakaya.config.ModConfig;

@Mod(GensokyoIzakaya.MOD_ID)
public final class GensokyoIzakayaNeoForge {
    public GensokyoIzakayaNeoForge() {

        AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);//注册配置
        ModConfig.INSTANCE = AutoConfig.getConfigHolder(ModConfig.class).getConfig(); //获取配置

        GensokyoIzakaya.init(); //初始化
    }
}
