package net.nyauru.gensokyoizakaya.fabric.init;

import eu.pb4.polymer.core.api.item.PolymerItemUtils;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.nyauru.l2.register.items.food.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

//polymer事件处理
public class PolymerInitEvent {
    private static final Logger LOGGER = LoggerFactory.getLogger("GensokyoIzakaya:Polymer");

    //直接硬编码显示物品
    private static final Item VISUAL_ITEM = Items.BREAD;

    //在这里添加要扫描的类
    private static final Class<?>[] FOOD_CLASSES = {
            BasicFood.class,
            BottleFood.class,
            BowlFood.class,
            FleshFood.class,
            MochiFood.class,
            SimpleFood.class,
            StickFood.class
    };

    //存储所有物品
    private static final Set<Item> MOD_ITEMS = new HashSet<>();
    // 初始化
    public static void init() {

        //扫描所有物品
        scanAllItems();

        //注册事件
        PolymerItemUtils.ITEM_CHECK.register((itemStack) -> {
            return MOD_ITEMS.contains(itemStack.getItem());
        });

        //注册
        PolymerItemUtils.ITEM_MODIFICATION_EVENT.register((original, client, context) -> {
            if (MOD_ITEMS.contains(original.getItem())) {
                //创建客户端物品栈
                ItemStack modified = new ItemStack(VISUAL_ITEM, client.getCount());

                ItemStack copy = client.copy(); //

                //保留原物品名称
                modified.set(DataComponents.CUSTOM_NAME, original.getHoverName());

                return modified;
            }
            return client;
        });
    }

    //使用反射自动扫描所有物品
    private static void scanAllItems() {
        for (Class<?> clazz : FOOD_CLASSES) {
            scanClass(clazz);
        }
    }

    private static void scanClass(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        int count = 0;

        for (Field field : fields) {
            try {
                if (isItemField(field)) {
                    field.setAccessible(true);
                    Object value = field.get(null);

                    Item item = extractItem(value);
                    if (item != null) {
                        MOD_ITEMS.add(item);
                        count++;
                    }
                }
            } catch (Exception e) {
                LOGGER.warn("{}{}", field.getName(), e.getMessage());
            }
        }

        LOGGER.debug("from class {} find {}", clazz.getSimpleName(), count);
    }

    private static boolean isItemField(Field field) {
        int modifiers = field.getModifiers();

        //必须final
        if (!Modifier.isPublic(modifiers) ||
                !Modifier.isStatic(modifiers) ||
                !Modifier.isFinal(modifiers)) {
            return false;
        }

        //检查是否RegistrySupplier
        Class<?> type = field.getType();
        return type.getSimpleName().equals("RegistrySupplier");
    }

    //提取Item
    private static Item extractItem(Object registrySupplier) {
        try {
            //
            Method getMethod = registrySupplier.getClass().getMethod("get");
            Object result = getMethod.invoke(registrySupplier);

            if (result instanceof Item) {
                return (Item) result;
            }
        } catch (Exception e) {
            LOGGER.warn("error: {}", e.getMessage());
        }
        return null;
    }
}
