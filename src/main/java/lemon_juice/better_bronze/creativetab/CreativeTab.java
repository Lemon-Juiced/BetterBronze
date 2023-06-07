package lemon_juice.better_bronze.creativetab;

import lemon_juice.better_bronze.BetterBronze;
import lemon_juice.better_bronze.block.ModBlocks;
import lemon_juice.better_bronze.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class CreativeTab {
    public static ResourceLocation BETTER_BRONZE_TAB = new ResourceLocation(BetterBronze.MOD_ID, "better_bronze");

    public static void registerTabs(CreativeModeTabEvent.Register event){
        event.registerCreativeModeTab(BETTER_BRONZE_TAB, builder -> builder
                .title(Component.translatable("itemGroup.better_bronze"))
                .icon(() -> new ItemStack(ModItems.BRONZE_DUST.get()))
                .displayItems((features, output) -> {
                    output.accept(new ItemStack(ModItems.COPPER_DUST.get()));
                    output.accept(new ItemStack(ModItems.TIN_DUST.get()));
                    output.accept(new ItemStack(ModItems.RAW_TIN.get()));
                    output.accept(new ItemStack(ModItems.BRONZE_DUST.get()));

                    output.accept(new ItemStack(ModBlocks.TIN_ORE.get()));
                    output.accept(new ItemStack(ModBlocks.DEEPSLATE_TIN_ORE.get()));
                    output.accept(new ItemStack(ModBlocks.RAW_TIN_BLOCK.get()));
                }));
    }
}
