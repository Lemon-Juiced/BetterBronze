package lemon_juice.better_bronze.item;

import lemon_juice.better_bronze.BetterBronze;
import lemon_juice.better_bronze.item.custom.tools.*;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterBronzeItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterBronze.MOD_ID);

    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new BronzeSwordItem(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new BronzeShovelItem(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new BronzePickaxeItem(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new BronzeAxeItem(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new BronzeHoeItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
