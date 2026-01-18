package net.nyauru.gensokyoizakaya;

import net.nyauru.gensokyoizakaya.register.ModBlocks;
import net.nyauru.gensokyoizakaya.register.ModItems;
import net.nyauru.gensokyoizakaya.register.ModTabs;
import net.nyauru.gensokyoizakaya.register.ModTooltips;
import net.nyauru.l2.register.items.food.*;

public final class GensokyoIzakaya {
    public static final String MOD_ID = "gensokyoizakaya";
    //需注意：common代码不可混入特定平台依赖，你可理解为上面的import不可出现neoforge或fabricapi的依赖！
    //若需编写平台特定代码，请去相应部分自行编写，根据文档使用注解
    public static void init() {
        //初始化物品与相应方块
        ModBlocks.BLOCKS.register();
        net.nyauru.l2.register.Blocks.BLOCKS.register();
        //本体物品导入
        ModItems.ITEMS.register();
        //开始导入食物
        BasicFood.ITEMS.register();
        BottleFood.ITEMS.register();
        BowlFood.ITEMS.register();
        MochiFood.ITEMS.register();
        SimpleFood.ITEMS.register();
        StickFood.ITEMS.register();
        FleshFood.ITEMS.register();
        //导入创造物品栏
        ModTabs.TABS.register();
        //初始化tooltip
        ModTooltips.init();
    }
}
