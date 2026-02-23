package net.nyauru.gensokyoizakaya.neoforge.init;

import net.neoforged.fml.ModList;
import net.nyauru.gensokyoizakaya.config.ModConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DependencyChecker {
    private static final Logger LOGGER = LoggerFactory.getLogger("GensokyoIzakaya:Dependency");

    //polymer modid
    private static final String POLYMER_CORE_ID = "polymer-core";
    //YH modid
    private static final String YH_ID = "youkaishomecoming";
    private static final String YF_ID = "youkaisfeasts";

    /*
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
*/


    public static boolean checkYH() {
        //检查YH是否安装
        boolean YHLoaded = ModList.get().isLoaded(YH_ID);
        boolean YFLoaded = ModList.get().isLoaded(YF_ID);
        if (YHLoaded) {
            throwYHIsLoaded();
            return true;
        }
        if (YFLoaded) {
            throwYFIsLoaded();
            return true;
        }
        return false;
    }

    private static void throwYHIsLoaded() {
        String errorMessage = buildYHMessage();
        LOGGER.error(errorMessage);

        throw new RuntimeException("GensokyoIzakaya:YoukaisHomecoming been install!");
    }

    private static void throwYFIsLoaded() {
        String errorMessage = buildYFMessage();
        LOGGER.error(errorMessage);

        throw new RuntimeException("GensokyoIzakaya:YoukaisFeast been install!");
    }
/*
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
*/
    private static String buildYHMessage() {
        return String.join("\n",
                "",
                "╔═══════════════════════════════════════════════════════════════════════╗",
                "║                                                                       ║",
                "║                  GensokyoIzakaya - Mod Incompatible                   ║",
                "║                                                                       ║",
                "╠═══════════════════════════════════════════════════════════════════════╣",
                "║                                                                       ║",
                "║     检测到您安装了“妖怪们的归家”(YoukaisHomecoming)                         ║",
                "║     为了防止内容重复对您造成不良体验，本模组已主动停止加载。                      ║",
                "║     这并不是模组代码发生了冲突，前者与本模组均可正常工作。                        ║",
                "║     请不要在归家的Github仓库或本模组的Github仓库报告这个崩溃！                  ║",
                "║                                                                       ║",
                "║     解决方案一：卸载本模组                                                 ║",
                "║                                                                       ║",
                "║     本模组(幻雀妖)仅为前者(归家/幻想乡乐事)的移植版本，无论如何前者做的比本模组更完善。║",
                "║                                                                       ║",
                "║     解决方案二：关闭兼容性检查                                              ║",
                "║                                                                       ║",
                "║     编辑配置文件: config/GensokyoIzakaya.json5                           ║",
                "║     将 \"enableYHCheck\" 的值从 true 改为 false                          ║",
                "║                                                                       ║",
                "║                                                                       ║",
                "║                                                                       ║",
                "╚═══════════════════════════════════════════════════════════════════════╝"
        );
    }

    private static String buildYFMessage() {
        return String.join("\n",
                "",
                "╔═══════════════════════════════════════════════════════════════════════╗",
                "║                                                                       ║",
                "║                  GensokyoIzakaya - Mod Incompatible                   ║",
                "║                                                                       ║",
                "╠═══════════════════════════════════════════════════════════════════════╣",
                "║                                                                       ║",
                "║     检测到您安装了“幻想乡乐事”(Youkais' Feasts)                            ║",
                "║     为了防止内容重复对您造成不良体验，本模组已主动停止加载。                      ║",
                "║     这并不是模组代码发生了冲突，前者与本模组均可正常工作。                        ║",
                "║     请不要在幻想乡乐事的Github仓库或本模组的Github仓库报告这个崩溃！             ║",
                "║                                                                       ║",
                "║     解决方案一：卸载本模组                                                 ║",
                "║                                                                       ║",
                "║     本模组(幻雀妖)仅为前者(归家/幻想乡乐事)的移植版本，无论如何前者做的比本模组更完善。║",
                "║                                                                       ║",
                "║     解决方案二：关闭兼容性检查                                              ║",
                "║                                                                       ║",
                "║     编辑配置文件: config/GensokyoIzakaya.json5                           ║",
                "║     将 \"enableYHCheck\" 的值从 true 改为 false                          ║",
                "║                                                                       ║",
                "║                                                                       ║",
                "║                                                                       ║",
                "╚═══════════════════════════════════════════════════════════════════════╝"
        );
    }
}

