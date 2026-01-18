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

import java.util.function.Supplier;

public class SimpleFood {
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
    //麻薯
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
}
