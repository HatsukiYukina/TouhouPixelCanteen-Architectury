package net.nyauru.gensokyoizakaya.fabric.init;

import net.fabricmc.loader.api.FabricLoader;
import net.nyauru.gensokyoizakaya.config.ModConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DependencyChecker {
    private static final Logger LOGGER = LoggerFactory.getLogger("GensokyoIzakaya:Dependency");

    //polymer modid
    private static final String POLYMER_CORE_ID = "polymer-core";

    public static boolean checkPolymerDependency() {
        //获取配置值
        boolean enablePolymer = ModConfig.INSTANCE != null && ModConfig.INSTANCE.enablePolymer;

        if (!enablePolymer) {
            LOGGER.info("Polymer is not Enable,skip dependency check.");
            return true;
        }

        //检查polymer核心模块
        boolean polymerCoreLoaded = FabricLoader.getInstance().isModLoaded(POLYMER_CORE_ID);

        if (!polymerCoreLoaded) {
            throwMissingPolymerError();
            return false;
        }

        return true;
    }

    // 抛出错误
    private static void throwMissingPolymerError() {
        String errorMessage = buildPolymerErrorMessage();
        LOGGER.error(errorMessage);

        throw new RuntimeException("GensokyoIzakaya:Polymer dependency missing!");
    }

    private static String buildPolymerErrorMessage() {
        return String.join("\n",
                "",
                "╔═══════════════════════════════════════════════════════════════════════╗",
                "║                                                                       ║",
                "║              GensokyoIzakaya - Missing dependency                     ║",
                "║                                                                       ║",
                "╠═══════════════════════════════════════════════════════════════════════╣",
                "║                                                                       ║",
                "║     检测到配置文件中启用了Polymer模式                                      ║",
                "║     (enablePolymer = true)，                                          ║",
                "║     但未检测到Polymer模组 (polymer-core)                                 ║",
                "║                                                                       ║",
                "║     解决方案一：安装 Polymer 模组                                         ║",
                "║                                                                       ║",
                "║     • Modrinth:                                                       ║",
                "║       https://modrinth.com/mod/polymer                                ║",
                "║                                                                       ║",
                "║     • CurseForge:                                                     ║",
                "║       https://www.curseforge.com/minecraft/mc-mods/polymer            ║",
                "║                                                                       ║",
                "║     解决方案二：关闭Polymer模式                                           ║",
                "║                                                                       ║",
                "║     编辑配置文件: config/GensokyoIzakaya.json5                           ║",
                "║     将 \"enablePolymer\" 的值从 true 改为 false                          ║",
                "║                                                                       ║",
                "║                                                                       ║",
                "║                                                                       ║",
                "╚═══════════════════════════════════════════════════════════════════════╝"
        );
    }
}
