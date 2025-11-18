package net.nyauru.touhoupixelcanteen.register;

import dev.architectury.event.EventResult;
import dev.architectury.event.events.client.ClientTooltipEvent;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.nyauru.touhoupixelcanteen.Touhoupixelcanteen;

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
            components.add(Component.translatable("tooltip.touhoupixelcanteen.chili_pepper")
                    .withStyle(ChatFormatting.WHITE)); //可以修改tooltip的颜色了，可用mc预定义颜色
        }
        if (stack.getItem() == ModItems.CHILI_PEPPER_SEED.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.chili_pepper_seed")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_LAMPREY.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.raw_lamprey")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记1
        if (stack.getItem() == net.nyauru.l2.register.Items.ROASTED_LAMPREY.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.roasted_lamprey")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_LAMPREY_FILLET.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.raw_lamprey_fillet")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_TUNA.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.raw_tuna")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.ROASTED_LAMPREY_FILLET.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.roasted_lamprey_fillet")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SEARED_TUNA.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.seared_tuna")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记2
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_TUNA_SLICE.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.raw_tuna_slice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SEARED_TUNA_SLICE.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.seared_tuna_slice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.OTORO.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.otoro")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.CRAB.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.crab")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.STEAMED_CRAB.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.steamed_crab")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.CRAB_MEAT.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.crab_meat")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.CRAB_ROE.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.crab_roe")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_VENISON.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.raw_venison")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.GRILLED_VENISON.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.grilled_venison")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_VENISON_SLICE.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.raw_venison_slice")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记3
        if (stack.getItem() == net.nyauru.l2.register.Items.GRILLED_VENISON_SLICE.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.grilled_venison_slice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.COOKED_MANDRAKE_ROOT.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.cooked_mandrake_root")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.ROE.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.roe")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.BUTTER.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.butter")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.TOFU.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.tofu")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.OILY_BEAN_CURD.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.oily_bean_curd")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.IMITATION_CRAB.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.imitation_crab")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.TAMAGOYAKI.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.tamagoyaki")
                    .withStyle(ChatFormatting.WHITE));
        }if (stack.getItem() == net.nyauru.l2.register.Items.TAMAGOYAKI_SLICE.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.tamagoyaki_slice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.NATTOU.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.nattou")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.CUCUMBER_SLICE.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.cucumber_slice")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAISIN.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.raisin")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记4
        if (stack.getItem() == net.nyauru.l2.register.Items.MOCHI.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.mochi")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.TSUKIMI_DANGO.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.tsukimi_dango")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.MATCHA_MOCHI.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.matcha_mochi")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SAKURA_MOCHI.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.sakura_mochi")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.YASHOUMA_DANGO.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.yashouma_dango")
                    .withStyle(ChatFormatting.WHITE));
        }if (stack.getItem() == net.nyauru.l2.register.Items.ONIGILI.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.onigili")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SENBEI.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.senbei")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SEKIBANKIYAKI.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.sekibankiyaki")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.YAKUMO_INARI.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.yakumo_inari")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.MANTOU.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.mantou")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.BUN.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.bun")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.OYAKI.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.oyaki")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.PORK_RICE_BALL.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.pork_rice_ball")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.STEAMED_EGG_IN_BAMBOO.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.steamed_egg_in_bamboo")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.KABAYAKI.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.kabayaki")
                    .withStyle(ChatFormatting.WHITE));
        }//分区标记5，stick
        if (stack.getItem() == net.nyauru.l2.register.Items.CANDY_APPLE.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.candy_apple")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.MILK_POPSICLE.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.milk_popsicle")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.BIG_POPSICLE.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.big_popsicle")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.KINAKO_DANGO.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.kinako_dango")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.MITARASHI_DANGO.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.mitarashi_dango")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.ASSORTED_DANGO.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.assorted_dango")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.LAMPREY_SKEWER.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.lamprey_skewer")
                    .withStyle(ChatFormatting.WHITE));
        }

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