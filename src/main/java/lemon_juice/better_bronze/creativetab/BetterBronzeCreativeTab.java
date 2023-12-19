package lemon_juice.better_bronze.creativetab;

import lemon_juice.better_bronze.BetterBronze;
import lemon_juice.better_bronze.block.BetterBronzeBlocks;
import lemon_juice.better_bronze.item.BetterBronzeItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterBronzeCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterBronze.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BETTER_BRONZE_TAB = CREATIVE_MODE_TABS.register("better_bronze", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_bronze"))
            .icon(() -> new ItemStack(BetterBronzeItems.BRONZE_SWORD.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == BETTER_BRONZE_TAB.get()){
            event.accept(BetterBronzeItems.BRONZE_SWORD.get());
            event.accept(BetterBronzeItems.BRONZE_PICKAXE.get());
            event.accept(BetterBronzeItems.BRONZE_AXE.get());
            event.accept(BetterBronzeItems.BRONZE_SHOVEL.get());
            event.accept(BetterBronzeItems.BRONZE_HOE.get());

            event.accept(BetterBronzeItems.RAW_TIN.get());

            event.accept(BetterBronzeBlocks.TIN_ORE.get());
            event.accept(BetterBronzeBlocks.DEEPSLATE_TIN_ORE.get());
            event.accept(BetterBronzeBlocks.RAW_TIN_BLOCK.get());
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
