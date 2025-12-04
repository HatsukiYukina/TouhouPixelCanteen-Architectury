/*
MIT License
Copyright (c) 2025 aurora4123,Yukina,
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package net.nyauru.l2.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.nyauru.gensokyoizakaya.GensokyoIzakaya;
import vectorwing.farmersdelight.common.registry.ModEffects;

import java.util.function.Supplier;

public class Items {
    //为什么是请我一个写c语言嵌入式的程序员来写这个?这对吗?java程序员四哪去了?
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(GensokyoIzakaya.MOD_ID, Registries.ITEM);
    //注册普通物品
    //在1.20.1中，我们通过forge注册机来实现物品初始化，如需代码移植，在这里我们需要将 RegistryObject 改为 RegistrySupplier。作用类似，代码改动不大，需注意部分属性版本重命名
    private static RegistrySupplier<Item> registerItem(String id, Supplier<Item> itemSupplier) {
        return ITEMS.register(id, itemSupplier);
    }
    //注册方块物品
    private static RegistrySupplier<Item> registerBlockItem(String id, Supplier<Block> blockSupplier) {
        return ITEMS.register(id, () -> new BlockItem(blockSupplier.get(), new Item.Properties()));
    }
    /*
    //通过这样来创建你的普通物品，原理几乎和我们的1.20.1版本相同，纯大写的名称我们需要经常调用
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = registerItem("example_item",
            () -> new Item(new Item.Properties().stacksTo(64)));
    //这里是食物类物品
    public static final RegistrySupplier<Item> EXAMPLE_FOOD = registerItem("example_food",
        () -> new Item(new Item.Properties().food(//食物属性，抄1.20.1版本即可)));
    //方块物品，但随后需要去ModBlocks内实现它，参考1.20.1版
    public static final RegistrySupplier<Item> EXAMPLE_BLOCK_ITEM = registerBlockItem("example_block", ModBlocks.EXAMPLE_BLOCK);
    */
    //另请注意：
    //在归家中，使用了自定义构建器，而我们使用的是原版构建器，需要进行转换
    //下面是归家的示例
    /* RAW_LAMPREY(FoodType.SIMPLE, 2, 0.3f,
			new EffectEntry(() -> MobEffects.NIGHT_VISION, 2400, 0, 0.5f),
			ItemTags.FISHES, YHTagGen.RAW_EEL, DietTagGen.PROTEINS.tag
	),
     */
    //生八目鳗
    public static final RegistrySupplier<Item> RAW_LAMPREY =
            ITEMS.register("raw_lamprey", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(0.3f)
                            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 2400, 0), 0.5f)
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> ROASTED_LAMPREY =
            ITEMS.register("roasted_lamprey",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationModifier(0.8F)
                            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 2400, 0), 1)
                            .build()
                    )
                    .stacksTo(64)//设置堆叠数量
            ));

    public static final RegistrySupplier<Item> RAW_LAMPREY_FILLET =
            ITEMS.register("raw_lamprey_fillet", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .saturationModifier(0.3F)
                            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1800, 0), 0.5f)
                            .fast()
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> RAW_TUNA =
            ITEMS.register("raw_tuna",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(9)
                            .saturationModifier(0.3F)
                            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 800, 0), 0.3f)
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> ROASTED_LAMPREY_FILLET =
            ITEMS.register("roasted_lamprey_fillet", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.8F)
                            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1800, 0), 1)
                            .fast()
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> SEARED_TUNA =
            ITEMS.register("seared_tuna",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.8F)
                            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 800, 0), 0.4f)
                            .build()
                    )
            ));
    //分区标记2
    //生金枪鱼片
    public static final RegistrySupplier<Item> RAW_TUNA_SLICE =
            ITEMS.register("raw_tuna_slice", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.3f)
                            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 400, 0), 0.3f)
                            .build()
                    )
            ));
    //炙烤金枪鱼片
    public static final RegistrySupplier<Item> SEARED_TUNA_SLICE =
            ITEMS.register("seared_tuna_slice", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 400, 0), 0.4f)
                            .build()
                    )
            ));
    //金枪鱼大腹
    public static final RegistrySupplier<Item> OTORO =
            ITEMS.register("otoro", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(9)
                            .saturationModifier(0.3f)
                            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 800, 0), 0.5f)
                            .build()
                    )
            ));
    //螃蟹
    public static final RegistrySupplier<Item> CRAB =
            ITEMS.register("crab", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(0.3f)
                            //.effect(new MobEffectInstance(YHEffects.CRABY, 600, 0), 0.2f)
                            .build()
                    )
            ));
    //蒸螃蟹
    public static final RegistrySupplier<Item> STEAMED_CRAB =
            ITEMS.register("steamed_crab", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.8f)
                            //.effect(new MobEffectInstance(YHEffects.CRABY, 600, 0), 0.3f)
                            .build()
                    )
            ));
    //蟹粉
    public static final RegistrySupplier<Item> CRAB_MEAT =
            ITEMS.register("crab_meat", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.8f)
                            //.effect(new MobEffectInstance(YHEffects.CRABY, 600, 0), 0.5f)
                            .build()
                    )
            ));
    //蟹籽
    public static final RegistrySupplier<Item> CRAB_ROE =
            ITEMS.register("crab_roe", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.8f)
                            //.effect(new MobEffectInstance(YHEffects.CRABY, 600, 1), 0.5f)
                            .build()
                    )
            ));
    //生鹿排
    public static final RegistrySupplier<Item> RAW_VENISON =
            ITEMS.register("raw_venison", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.3f)
                            .build()
                    )
            ));
    //烤鹿排
    public static final RegistrySupplier<Item> GRILLED_VENISON =
            ITEMS.register("grilled_venison", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationModifier(0.8f)
                            .build()
                    )
            ));
    //生鹿片
    public static final RegistrySupplier<Item> RAW_VENISON_SLICE =
            ITEMS.register("raw_venison_slice", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(0.3f)
                            .fast()
                            .build()
                    )
            ));
    //分区标记3
    //烤鹿片
    public static final RegistrySupplier<Item> GRILLED_VENISON_SLICE =
            ITEMS.register("grilled_venison_slice",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.8F)
                            .fast()
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> COOKED_MANDRAKE_ROOT =
            ITEMS.register("cooked_mandrake_root",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.6F)
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> ROE =
            ITEMS.register("roe",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .saturationModifier(0.6F)
                            .effect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 400, 0), 0.3f)
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> BUTTER =
            ITEMS.register("butter",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationModifier(0.3F)
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> TOFU =
            ITEMS.register("tofu",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.5F)
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> OILY_BEAN_CURD =
            ITEMS.register("oily_bean_curd",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.8F)
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> IMITATION_CRAB =
            ITEMS.register("imitation_crab",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(1F)
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> TAMAGOYAKI =
            ITEMS.register("tamagoyaki",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.6F)
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> TAMAGOYAKI_SLICE =
            ITEMS.register("tamagoyaki_slice",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationModifier(0.6F)
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> NATTOU =
            ITEMS.register("nattou",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.6F)
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> CUCUMBER_SLICE =
            ITEMS.register("cucumber_slice",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .saturationModifier(0.3F)
                            .fast()
                            .build()
                    )
            ));

    public static final RegistrySupplier<Item> RAISIN =
            ITEMS.register("raisin",() -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationModifier(0.6F)
                            .fast()
                            .build()
                    )
            ));
    //分区4
    //麻薯
    public static final RegistrySupplier<Item> MOCHI =
            ITEMS.register("mochi", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.6f)
                            .fast()
                            .build()
                    )
            ));
    //月见团子
    public static final RegistrySupplier<Item> TSUKIMI_DANGO =
            ITEMS.register("tsukimi_dango", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationModifier(0.6f)
                            .fast()
                            .build()
                    )
            ));
    //抹茶麻薯
    public static final RegistrySupplier<Item> MATCHA_MOCHI =
            ITEMS.register("matcha_mochi", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.6f)
                            .fast()
                            //.effect(new MobEffectInstance(YHEffects.TEA, 1200, 0), 1.0f)
                            .build()
                    )
            ));
    //樱饼
    public static final RegistrySupplier<Item> SAKURA_MOCHI =
            ITEMS.register("sakura_mochi", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.6f)
                            .fast()
                            .build()
                    )
            ));
    //信州瘦马
    public static final RegistrySupplier<Item> YASHOUMA_DANGO =
            ITEMS.register("yashouma_dango", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(0.6f)
                            .fast()
                            .build()
                    )
            ));
    //饭团
    public static final RegistrySupplier<Item> ONIGILI =
            ITEMS.register("onigili", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.6f)
                            .build()
                    )
            ));
    //仙贝
    public static final RegistrySupplier<Item> SENBEI =
            ITEMS.register("senbei", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.6f)
                            .build()
                    )
            ));
    //生首烧
    public static final RegistrySupplier<Item> SEKIBANKIYAKI =
            ITEMS.register("sekibankiyaki", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.6f)
                            .build()
                    )
            ));
    //八云豆包饭
    public static final RegistrySupplier<Item> YAKUMO_INARI =
            ITEMS.register("yakumo_inari", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.6f)
                            .build()
                    )
            ));
    //馒头
    public static final RegistrySupplier<Item> MANTOU =
            ITEMS.register("mantou", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(0.6f)
                            .build()
                    )
            ));
    //包子
    public static final RegistrySupplier<Item> BUN =
            ITEMS.register("bun", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationModifier(0.8f)
                            .build()
                    )
            ));
    //御烧
    public static final RegistrySupplier<Item> OYAKI =
            ITEMS.register("oyaki", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(0.6f)
                            .build()
                    )
            ));
    //猪肉饭团
    public static final RegistrySupplier<Item> PORK_RICE_BALL =
            ITEMS.register("pork_rice_ball", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationModifier(0.6f)
                            .build()
                    )
            ));
    //竹筒蒸蛋
    public static final RegistrySupplier<Item> STEAMED_EGG_IN_BAMBOO =
            ITEMS.register("steamed_egg_in_bamboo", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(0.6f)
                            .build()
                    )
            ));
    //蒲烧鳗鱼
    public static final RegistrySupplier<Item> KABAYAKI =
            ITEMS.register("kabayaki", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(0.8f)
                            .fast()
                            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 2400, 0), 1.0f)
                            .effect(new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.NOURISHMENT, 2400, 0), 1.0f)
                            .build()
                    )
            ));
    //分区标记5,sitck
    //苹果糖
    public static final RegistrySupplier<Item> CANDY_APPLE =
            ITEMS.register("candy_apple", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.5f)
                            .build()
                    )
            ));
    //牛奶冰棍
    public static final RegistrySupplier<Item> MILK_POPSICLE =
            ITEMS.register("milk_popsicle", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.5f)
                            .build()
                    )
            ));
    //大冰棍儿
    public static final RegistrySupplier<Item> BIG_POPSICLE =
            ITEMS.register("big_popsicle", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationModifier(0.1f)
                            .build()
                    )
            ));
    //黄豆粉团子🍡
    public static final RegistrySupplier<Item> KINAKO_DANGO =
            ITEMS.register("kinako_dango", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.6f)
                            //.effect(new MobEffectInstance(ModEffects.NOURISHMENT, 1200, 0), 1.0f)
                            .build()
                    )
            ));
    //御手洗团子
    public static final RegistrySupplier<Item> MITARASHI_DANGO =
            ITEMS.register("mitarashi_dango", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.6f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 2400, 0), 1.0f)
                            .build()
                    )
            ));
    //三彩团子🍡
    public static final RegistrySupplier<Item> ASSORTED_DANGO =
            ITEMS.register("assorted_dango", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.6f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 2400, 0), 1.0f)
                            .build()
                    )
            ));
    //蒲烧鳗鱼烤串
    public static final RegistrySupplier<Item> LAMPREY_SKEWER =
            ITEMS.register("lamprey_skewer", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(14)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 4800, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 4800, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 4800, 0), 1.0f)
                            .build()
                    )
            ));
    //分区6
    //bottle资源区
    //儿童刨冰盖饭
    public static final RegistrySupplier<Item> SHAVED_ICE_OVER_RICE =
            ITEMS.register("shaved_ice_over_rice", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 2400, 0), 1.0f)
                            .build()
                    )
            ));
    //bowl资源区
    //鸡蛋柠檬汤
    public static final RegistrySupplier<Item> AVGOLEMONO =
            ITEMS.register("avgolemono", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(0.6f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(MobEffects.GLOWING, 3600, 0), 1.0f)
                            .build()
                    )
            ));
    //烈焰红咖喱
    public static final RegistrySupplier<Item> BLAZING_RED_CURRY =
            ITEMS.register("blazing_red_curry", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0), 1.0f)
                            .build()
                    )
            ));
    //鳗鱼饭
    public static final RegistrySupplier<Item> GRILLED_EEL_OVER_RICE =
            ITEMS.register("grilled_eel_over_rice", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0), 1.0f)
                            .build()
                    )
            ));
    //长寿面
    public static final RegistrySupplier<Item> LONGEVITY_NOODLES =
            ITEMS.register("longevity_noodles", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 3600, 0), 1.0f)
                            .build()
                    )
            ));
    //白雪
    public static final RegistrySupplier<Item> SHIRAYUKI =
            ITEMS.register("shirayuki", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 6000, 0), 1.0f)
                            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 6000, 0), 1.0f)
                            .build()
                    )
            ));
    //汉屋藏娇
    public static final RegistrySupplier<Item> HAN_PALACE =
            ITEMS.register("han_palace", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 6000, 0), 1.0f)
                            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 6000, 0), 1.0f)
                            .build()
                    )
            ));
    //豆腐蟹煲
    public static final RegistrySupplier<Item> TOFU_CRAB_STEW =
            ITEMS.register("tofu_crab_stew", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 6000, 0), 1.0f)
                            //.effect(new MobEffectInstance(YHEffects.CRABY, 6000, 0), 1.0f)
                            .build()
                    )
            ));
    //甜豆沙麻薯杂煮
    public static final RegistrySupplier<Item> SWEET_ORMOSIA_MOCHI_MIXED_BOILED =
            ITEMS.register("sweet_ormosia_mochi_mixed_boiled", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 3600, 0), 1.0f)
                            .build()
                    )
            ));
    //蔬菜奶油鲑鱼
    public static final RegistrySupplier<Item> TUSCAN_SALMON =
            ITEMS.register("tuscan_salmon", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 3600, 0), 1.0f)
                            .build()
                    )
            ));
    //密渍黄瓜
    public static final RegistrySupplier<Item> HONEY_GLAZED_CUCUMBER =
            ITEMS.register("honey_glazed_cucumber", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 3600, 0), 1.0f)
                            .build()
                    )
            ));
    //狮子头
    public static final RegistrySupplier<Item> LIONS_HEAD =
            ITEMS.register("lions_head", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0), 1.0f)
                            .build()
                    )
            ));
    //麻婆豆腐
    public static final RegistrySupplier<Item> MAPO_TOFU =
            ITEMS.register("mapo_tofu", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 3600, 0), 1.0f)
                            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 0), 1.0f)
                            .build()
                    )
            ));
    //幻昙花羹
    public static final RegistrySupplier<Item> UDUMBARA_CAKE =
            ITEMS.register("udumbara_cake", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationModifier(0.6f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1.0f)
                            //.effect(new MobEffectInstance(YHEffects.UDUMBARA, 3600, 0), 1.0f)
                            .build()
                    )
            ));
    //碗装惊吓大冒险
    public static final RegistrySupplier<Item> BOWL_OF_HEART_THROBBING_SURPRISE =
            ITEMS.register("bowl_of_heart_throbbing_surprise", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 6000, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 6000, 0), 1.0f)
                            //.effect(new MobEffectInstance(YHEffects.UDUMBARA, 2400, 1), 1.0f)
                            .build()
                    )
            ));
    //分区7
    //怪肉
    public static final RegistrySupplier<Item> FLESH =
            ITEMS.register("flesh", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(0.3f)
                            .build()
                    )
            ));
    //烤熟的怪肉
    public static final RegistrySupplier<Item> COOKED_FLESH =
            ITEMS.register("cooked_flesh", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.8f)
                            .build()
                    )
            ));
    //怪肉片
    public static final RegistrySupplier<Item> FLESH_SLICE =
            ITEMS.register("flesh_slice", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .saturationModifier(0.3f)
                            .fast()
                            .build()
                    )
            ));
    //烤熟的怪肉片
    public static final RegistrySupplier<Item> COOKED_FLESH_SLICE =
            ITEMS.register("cooked_flesh_slice", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(0.8f)
                            .fast()
                            .build()
                    )
            ));
    //怪肉饺子
    public static final RegistrySupplier<Item> FLESH_DUMPLINGS =
            ITEMS.register("flesh_dumplings", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 2400, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 2400, 0), 1.0f)
                            .build()
                    )
            ));
    //罐装怪肉
    public static final RegistrySupplier<Item> CANNED_FLESH =
            ITEMS.register("canned_flesh", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.8f)
                            .build()
                    )
            ));
    //炖怪肉
    public static final RegistrySupplier<Item> FLESH_STEW =
            ITEMS.register("flesh_stew", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(7)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 6000, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 6000, 0), 1.0f)
                            .build()
                    )
            ));
    //怪肉宴
    public static final RegistrySupplier<Item> BOWL_OF_FLESH_FEAST =
            ITEMS.register("bowl_of_flesh_feast", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.8f)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT, 6000, 0), 1.0f)
                            .effect(new MobEffectInstance(ModEffects.COMFORT, 6000, 0), 1.0f)
                            .build()
                    )
            ));
    //巧克力慕斯
    public static final RegistrySupplier<Item> FLESH_CHOCOLATE_MOUSSE =
            ITEMS.register("flesh_chocolate_mousse", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationModifier(0.5f)
                            .fast()
                            .build()
                    )
            ));
    //红丝绒蛋糕
    public static final RegistrySupplier<Item> SCARLET_DEVIL_CAKE =
            ITEMS.register("scarlet_devil_cake", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.5f)
                            .fast()
                            .build()
                    )
            ));
    //分区标记8


    public static Item.Properties basicItem() {
        return new Item.Properties();
    }
}