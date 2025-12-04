package net.nyauru.gensokyoizakaya.register;

import dev.architectury.event.events.client.ClientTooltipEvent;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.List;

public class ModTooltips {
    //初始化代码
    public static void init() {
        ClientTooltipEvent.ITEM.register((stack, components, tooltipX, tooltipY) -> {
            addTooltips(stack, components);
        });
    }

    private static void addTooltips(ItemStack stack, List<Component> components) {
        //模组物品
        //纯大写的那个常量就是你在物品注册的地方搞得，和1.20.1版本一致
        //翻译键名也自己修改
        //可考虑使用颜色常量
        if (stack.getItem() == ModItems.CHILI_PEPPER.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.chili_pepper")
                    .withStyle(ChatFormatting.WHITE)); //可以修改tooltip的颜色了，可用mc预定义颜色
        }
        if (stack.getItem() == ModItems.CHILI_PEPPER_SEED.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.chili_pepper_seed")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_LAMPREY.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.raw_lamprey")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记1
        if (stack.getItem() == net.nyauru.l2.register.Items.ROASTED_LAMPREY.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.roasted_lamprey")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_LAMPREY_FILLET.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.raw_lamprey_fillet")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_TUNA.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.raw_tuna")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.ROASTED_LAMPREY_FILLET.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.roasted_lamprey_fillet")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SEARED_TUNA.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.seared_tuna")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记2
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_TUNA_SLICE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.raw_tuna_slice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SEARED_TUNA_SLICE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.seared_tuna_slice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.OTORO.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.otoro")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.CRAB.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.crab")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.STEAMED_CRAB.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.steamed_crab")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.CRAB_MEAT.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.crab_meat")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.CRAB_ROE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.crab_roe")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_VENISON.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.raw_venison")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.GRILLED_VENISON.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.grilled_venison")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_VENISON_SLICE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.raw_venison_slice")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记3
        if (stack.getItem() == net.nyauru.l2.register.Items.GRILLED_VENISON_SLICE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.grilled_venison_slice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.COOKED_MANDRAKE_ROOT.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.cooked_mandrake_root")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.ROE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.roe")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.BUTTER.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.butter")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.TOFU.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.tofu")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.OILY_BEAN_CURD.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.oily_bean_curd")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.IMITATION_CRAB.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.imitation_crab")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.TAMAGOYAKI.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.tamagoyaki")
                    .withStyle(ChatFormatting.WHITE));
        }if (stack.getItem() == net.nyauru.l2.register.Items.TAMAGOYAKI_SLICE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.tamagoyaki_slice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.NATTOU.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.nattou")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.CUCUMBER_SLICE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.cucumber_slice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAISIN.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.raisin")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记4
        if (stack.getItem() == net.nyauru.l2.register.Items.MOCHI.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.mochi")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.TSUKIMI_DANGO.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.tsukimi_dango")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.MATCHA_MOCHI.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.matcha_mochi")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SAKURA_MOCHI.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.sakura_mochi")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.YASHOUMA_DANGO.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.yashouma_dango")
                    .withStyle(ChatFormatting.WHITE));
        }if (stack.getItem() == net.nyauru.l2.register.Items.ONIGILI.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.onigili")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SENBEI.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.senbei")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SEKIBANKIYAKI.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.sekibankiyaki")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.YAKUMO_INARI.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.yakumo_inari")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.MANTOU.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.mantou")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.BUN.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.bun")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.OYAKI.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.oyaki")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.PORK_RICE_BALL.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.pork_rice_ball")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.STEAMED_EGG_IN_BAMBOO.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.steamed_egg_in_bamboo")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.KABAYAKI.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.kabayaki")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记5，stick
        if (stack.getItem() == net.nyauru.l2.register.Items.CANDY_APPLE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.candy_apple")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.MILK_POPSICLE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.milk_popsicle")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.BIG_POPSICLE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.big_popsicle")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.KINAKO_DANGO.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.kinako_dango")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.MITARASHI_DANGO.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.mitarashi_dango")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.ASSORTED_DANGO.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.assorted_dango")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.LAMPREY_SKEWER.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.lamprey_skewer")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记6
        if (stack.getItem() == net.nyauru.l2.register.Items.SHAVED_ICE_OVER_RICE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.shaved_ice_over_rice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.AVGOLEMONO.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.avgolemono")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.BLAZING_RED_CURRY.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.blazing_red_curry")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.GRILLED_EEL_OVER_RICE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.grilled_eel_over_rice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.LONGEVITY_NOODLES.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.longevity_noodles")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SHIRAYUKI.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.shirayuki")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.HAN_PALACE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.han_palace")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.TOFU_CRAB_STEW.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.tofu_crab_stew")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SWEET_ORMOSIA_MOCHI_MIXED_BOILED.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.sweet_ormosia_mochi_mixed_boiled")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.TUSCAN_SALMON.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.tuscan_salmon")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.HONEY_GLAZED_CUCUMBER.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.honey_glazed_cucumber")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.LIONS_HEAD.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.lions_head")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.MAPO_TOFU.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.mapo_tofu")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.UDUMBARA_CAKE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.udumbara_cake")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.BOWL_OF_HEART_THROBBING_SURPRISE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.bowl_of_heart_throbbing_surprise")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记7
        if (stack.getItem() == net.nyauru.l2.register.Items.FLESH.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.flesh")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.COOKED_FLESH.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.cooked_flesh")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.FLESH_SLICE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.flesh_slice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.COOKED_FLESH_SLICE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.cooked_flesh_slice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.FLESH_DUMPLINGS.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.flesh_dumplings")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.CANNED_FLESH.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.canned_flesh")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.FLESH_STEW.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.flesh_stew")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.BOWL_OF_FLESH_FEAST.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.bowl_of_flesh_feast")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.FLESH_CHOCOLATE_MOUSSE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.flesh_chocolate_mousse")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SCARLET_DEVIL_CAKE.get()) {
            components.add(Component.translatable("tooltip.gensokyoizakaya.scarlet_devil_cake")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记8

        //原版物品
        if (stack.getItem() == Items.CARROT) {
            components.add(Component.translatable("tooltip.minecraft.carrot")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == Items.DRIED_KELP) {
            components.add(Component.translatable("tooltip.minecraft.kelp"));
        }
        if (stack.getItem() == Items.POTATO) {
            components.add(Component.translatable("tooltip.minecraft.potato"));
        }
        if (stack.getItem() == Items.PUMPKIN) {
            components.add(Component.translatable("tooltip.minecraft.pumpkin"));
        }
        if (stack.getItem() == Items.BAMBOO) {
            components.add(Component.translatable("tooltip.minecraft.bamboo"));
        }
        if (stack.getItem() == Items.EGG) {
            components.add(Component.translatable("tooltip.minecraft.egg"));
        }
        if (stack.getItem() == Items.PORKCHOP) {
            components.add(Component.translatable("tooltip.minecraft.porkchop"));
        }
        if (stack.getItem() == Items.BEEF) {
            components.add(Component.translatable("tooltip.minecraft.beef"));
        }
        if (stack.getItem() == Items.PUFFERFISH) {
            components.add(Component.translatable("tooltip.minecraft.pufferfish").withStyle(ChatFormatting.YELLOW));
        }
        if (stack.getItem() == Items.HONEY_BOTTLE) {
            components.add(Component.translatable("tooltip.minecraft.honey_bottle"));
        }
        if (stack.getItem() == Items.SALMON) {
            components.add(Component.translatable("tooltip.minecraft.salmon"));
        }
        if (stack.getItem() == Items.BROWN_MUSHROOM) {
            components.add(Component.translatable("tooltip.minecraft.mushroom"));
        }
        if (stack.getItem() == Items.RED_MUSHROOM) {
            components.add(Component.translatable("tooltip.minecraft.mushroom"));
        }
    }
}