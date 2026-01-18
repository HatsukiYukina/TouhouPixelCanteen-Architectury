package net.nyauru.l2.register.items.food;

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

public class StickFood {
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
    //注册物品的相关注释请看BasicFood，这里就不拿来凑行数了
    //分区标记5,stick
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
}
