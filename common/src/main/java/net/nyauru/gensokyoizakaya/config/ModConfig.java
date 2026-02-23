package net.nyauru.gensokyoizakaya.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "GensokyoIzakaya")
public class ModConfig implements ConfigData{
    public static ModConfig INSTANCE;

    @Comment("(未完成功能)此选项仅限fabric平台开启，且需装polymer作为前置。")
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Gui.RequiresRestart
    public boolean enablePolymer = false;

    @Comment("如有特殊需求，可禁用Polymer启动时检查。非常不建议开启")
    @ConfigEntry.Gui.Tooltip
    public boolean skipPolymerCheck = false;

    @Comment("当检测到归家时，崩溃游戏")
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableYHCheck = true;
}
