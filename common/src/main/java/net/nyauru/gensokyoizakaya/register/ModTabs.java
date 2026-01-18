/*
MIT License
Copyright (c) 2025 aurora4123,Yukina,
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package net.nyauru.gensokyoizakaya.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.nyauru.l2.register.items.food.*;
import net.nyauru.gensokyoizakaya.GensokyoIzakaya;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(GensokyoIzakaya.MOD_ID, Registries.CREATIVE_MODE_TAB);

    //创造模式 主物品栏
    public static final RegistrySupplier<CreativeModeTab> CREATIVE_TAB_MAIN = TABS.register(
            "main_tab",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("tab.gensokyoizakaya.main"))
                    .icon(() -> new ItemStack(ModItems.CHILI_PEPPER.get()))
                    .displayItems((parameters, output) -> {
                        //在这填充物品
                        output.accept(ModItems.CHILI_PEPPER.get()); //辣椒
                        output.accept(ModItems.CHILI_PEPPER_SEED.get()); //辣椒种子
                    })
                    .build()
    );
    //归家主栏
    public static final RegistrySupplier<CreativeModeTab> CREATIVE_TAB_YH = TABS.register(
            "yh_tab",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("tab.gensokyoizakaya.youkaishomecoming"))
                    .icon(() -> new ItemStack(BasicFood.RAW_LAMPREY.get()))
                    .displayItems((parameters, output) -> {
                        //在这填充物品
                        output.accept(BasicFood.RAW_LAMPREY.get());
                        output.accept(BasicFood.ROASTED_LAMPREY.get());
                        output.accept(BasicFood.RAW_LAMPREY_FILLET.get());
                        output.accept(BasicFood.RAW_TUNA.get());
                        output.accept(BasicFood.ROASTED_LAMPREY_FILLET.get());
                        output.accept(BasicFood.SEARED_TUNA.get());
                        //分区标记2
                        output.accept(BasicFood.RAW_TUNA_SLICE.get());
                        output.accept(BasicFood.SEARED_TUNA_SLICE.get());
                        output.accept(BasicFood.OTORO.get());
                        output.accept(BasicFood.CRAB.get());
                        output.accept(BasicFood.STEAMED_CRAB.get());
                        output.accept(BasicFood.CRAB_MEAT.get());
                        output.accept(BasicFood.CRAB_ROE.get());
                        output.accept(BasicFood.RAW_VENISON.get());
                        output.accept(BasicFood.GRILLED_VENISON.get());
                        output.accept(BasicFood.RAW_VENISON_SLICE.get());
                        //分区标记3
                        output.accept(BasicFood.GRILLED_VENISON_SLICE.get());
                        output.accept(BasicFood.COOKED_MANDRAKE_ROOT.get());
                        output.accept(BasicFood.ROE.get());
                        output.accept(BasicFood.BUTTER.get());
                        output.accept(BasicFood.TOFU.get());
                        output.accept(BasicFood.OILY_BEAN_CURD.get());
                        output.accept(BasicFood.IMITATION_CRAB.get());
                        output.accept(BasicFood.TAMAGOYAKI.get());
                        output.accept(BasicFood.TAMAGOYAKI_SLICE.get());
                        output.accept(BasicFood.NATTOU.get());
                        output.accept(BasicFood.CUCUMBER_SLICE.get());
                        output.accept(BasicFood.RAISIN.get());
                        //分区标记4
                        output.accept(MochiFood.MOCHI.get());
                        output.accept(MochiFood.TSUKIMI_DANGO.get());
                        output.accept(MochiFood.MATCHA_MOCHI.get());
                        output.accept(MochiFood.SAKURA_MOCHI.get());
                        output.accept(MochiFood.COFFEE_MOCHI.get()); //待咖啡实现
                        output.accept(MochiFood.YASHOUMA_DANGO.get());
                        output.accept(SimpleFood.ONIGILI.get());
                        output.accept(SimpleFood.SENBEI.get());
                        output.accept(SimpleFood.SEKIBANKIYAKI.get());
                        output.accept(SimpleFood.YAKUMO_INARI.get());
                        output.accept(SimpleFood.MANTOU.get());
                        output.accept(SimpleFood.BUN.get());
                        output.accept(SimpleFood.OYAKI.get());
                        output.accept(SimpleFood.PORK_RICE_BALL.get());
                        output.accept(SimpleFood.STEAMED_EGG_IN_BAMBOO.get());
                        output.accept(SimpleFood.KABAYAKI.get());
                        //分区标记5，stick
                        output.accept(StickFood.CANDY_APPLE.get());
                        output.accept(StickFood.MILK_POPSICLE.get());
                        output.accept(StickFood.BIG_POPSICLE.get());
                        output.accept(StickFood.KINAKO_DANGO.get());
                        output.accept(StickFood.MITARASHI_DANGO.get());
                        output.accept(StickFood.ASSORTED_DANGO.get());
                        output.accept(StickFood.LAMPREY_SKEWER.get());
                        //分区标记6
                        output.accept(BottleFood.SHAVED_ICE_OVER_RICE.get());
                        output.accept(BottleFood.KOMEIJI_ICE_CREAM.get()); //待实现
                        output.accept(BowlFood.AVGOLEMONO.get());
                        output.accept(BowlFood.BLAZING_RED_CURRY.get());
                        output.accept(BowlFood.GRILLED_EEL_OVER_RICE.get());
                        output.accept(BowlFood.LONGEVITY_NOODLES.get());
                        output.accept(BowlFood.SHIRAYUKI.get());
                        output.accept(BowlFood.HAN_PALACE.get());
                        output.accept(BowlFood.TOFU_CRAB_STEW.get());
                        output.accept(BowlFood.SWEET_ORMOSIA_MOCHI_MIXED_BOILED.get());
                        output.accept(BowlFood.TUSCAN_SALMON.get());
                        output.accept(BowlFood.HONEY_GLAZED_CUCUMBER.get());
                        output.accept(BowlFood.LIONS_HEAD.get());
                        output.accept(BowlFood.MAPO_TOFU.get());
                        output.accept(BowlFood.UDUMBARA_CAKE.get());
                        output.accept(BowlFood.BOWL_OF_HEART_THROBBING_SURPRISE.get());
                        //分区标记7，怪肉
                        output.accept(FleshFood.FLESH.get());
                        output.accept(FleshFood.COOKED_FLESH.get());
                        output.accept(FleshFood.FLESH_SLICE.get());
                        output.accept(FleshFood.COOKED_FLESH_SLICE.get());
                        output.accept(FleshFood.FLESH_DUMPLINGS.get());
                        output.accept(FleshFood.CANNED_FLESH.get());
                        output.accept(FleshFood.FLESH_STEW.get());
                        output.accept(FleshFood.BOWL_OF_FLESH_FEAST.get());
                        output.accept(FleshFood.FLESH_CHOCOLATE_MOUSSE.get());
                        output.accept(FleshFood.SCARLET_DEVIL_CAKE.get());
                    })
                    .build()
    );
}