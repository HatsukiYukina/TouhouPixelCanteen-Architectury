package net.nyauru.gensokyoizakaya.fabric;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.nyauru.gensokyoizakaya.GensokyoIzakaya;
import net.fabricmc.api.ModInitializer;
import net.nyauru.gensokyoizakaya.config.ModConfig;
import net.nyauru.gensokyoizakaya.fabric.init.DependencyChecker;
import net.nyauru.gensokyoizakaya.fabric.init.PolymerInitEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class GensokyoIzakayaFabric implements ModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger("GensokyoIzakaya:Init");
    @Override
    public void onInitialize() {
        AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new); //注册配置
        ModConfig.INSTANCE = AutoConfig.getConfigHolder(ModConfig.class).getConfig(); //获取配置

        if(ModConfig.INSTANCE.skipPolymerCheck){LOGGER.warn("[GensokyoIzakaya] YOU ARE SKIPPING POLYMER CHECK!!!");};
        if (!ModConfig.INSTANCE.skipPolymerCheck) try{ //若未跳过Polymer检查
            DependencyChecker.checkPolymerDependency();//检查Polymer依赖
        }catch (Exception e) {throw e;}; //抛出异常

        if (ModConfig.INSTANCE.enableYHCheck) try{ //若未跳过归家检查
            DependencyChecker.checkYH(); //我知道Fabric没有归家，但是万一他们做了呢？
        }catch (Exception e) {throw e;}; //抛出异常

         GensokyoIzakaya.init(); //初始化
        if(ModConfig.INSTANCE.enablePolymer){
            PolymerInitEvent.init(); //初始化polymer
        }
    }
}
