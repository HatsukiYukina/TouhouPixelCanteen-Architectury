package net.nyauru.l2.register.items.food;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.nyauru.gensokyoizakaya.GensokyoIzakaya;
import vectorwing.farmersdelight.common.registry.ModEffects;

import java.util.function.Supplier;

public class FleshFood {
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
}
