package net.nyauru.gensokyoizakaya.neoforge;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.nyauru.gensokyoizakaya.GensokyoIzakaya;
import net.neoforged.fml.common.Mod;
import net.nyauru.gensokyoizakaya.config.ModConfig;
import net.nyauru.gensokyoizakaya.neoforge.init.DependencyChecker;

@Mod(GensokyoIzakaya.MOD_ID)
public final class GensokyoIzakayaNeoForge {
    public GensokyoIzakayaNeoForge() {

        AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);//注册配置
        ModConfig.INSTANCE = AutoConfig.getConfigHolder(ModConfig.class).getConfig(); //获取配置

        if (ModConfig.INSTANCE.enableYHCheck) try{ //若未跳过归家检查
            DependencyChecker.checkYH(); //
        }catch (Exception e) {throw e;}; //抛出异常

        GensokyoIzakaya.init(); //初始化
    }
}
