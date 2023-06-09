package lemon_juice.better_bronze.creativetab;

import lemon_juice.better_bronze.BetterBronze;
import lemon_juice.better_bronze.block.ModBlocks;
import lemon_juice.better_bronze.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.f_279569_, BetterBronze.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTER_BRONZE_TAB = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_bronze"))
            .icon(() -> new ItemStack(ModItems.BRONZE_DUST.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == BETTER_BRONZE_TAB.get()){
            event.accept(ModItems.COPPER_DUST.get());
            event.accept(ModItems.TIN_DUST.get());
            event.accept(ModItems.RAW_TIN.get());
            event.accept(ModItems.BRONZE_DUST.get());

            event.accept(ModBlocks.TIN_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
            event.accept(ModBlocks.RAW_TIN_BLOCK.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
