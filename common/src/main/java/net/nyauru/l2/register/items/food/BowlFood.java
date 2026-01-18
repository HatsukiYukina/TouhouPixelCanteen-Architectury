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

public class BowlFood {
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
    //分区6
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
}
