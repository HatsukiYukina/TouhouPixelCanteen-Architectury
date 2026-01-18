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

public class BottleFood {
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
    //恋恋慕斯（未实现）
    public static final RegistrySupplier<Item> KOMEIJI_ICE_CREAM =
            ITEMS.register("komeiji_ice_cream", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationModifier(0.8f)
                            //.effect(new MobEffectInstance(ModEffects.NOURISHMENT, 2400, 0), 1.0f)
                            .build()
                    )
            ));
}
