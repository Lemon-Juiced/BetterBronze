package lemon_juice.better_bronze;

import lemon_juice.better_bronze.block.BetterBronzeBlocks;
import lemon_juice.better_bronze.creativetab.BetterBronzeCreativeTab;
import lemon_juice.better_bronze.item.BetterBronzeItems;
import lemon_juice.better_bronze.tag.BetterBronzeTags;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(BetterBronze.MOD_ID)
public class BetterBronze {
    public static final String MOD_ID = "better_bronze";

    public BetterBronze(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        // Register Items
        BetterBronzeItems.register(modEventBus);
        BetterBronzeBlocks.register(modEventBus);

        // Register Creative Tab
        BetterBronzeCreativeTab.register(modEventBus);
        modEventBus.addListener(BetterBronzeCreativeTab::registerTabs);

        // Register Tags
        BetterBronzeTags.init();

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
