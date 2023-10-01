package lemon_juice.better_bronze.item.custom.tiers;

import lemon_juice.better_bronze.BetterBronze;
import lemon_juice.better_bronze.tag.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModTiers {
    /**
     * Contains the Tiers for the mod
     *
     * Vanilla Tier Reference:
     * WOOD(0, 59, 2.0F, 0.0F, 15, () -> {return Ingredient.of(ItemTags.PLANKS);}),
     * STONE(1, 131, 4.0F, 1.0F, 5, () -> {return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);}),
     * IRON(2, 250, 6.0F, 2.0F, 14, () -> {return Ingredient.of(Items.IRON_INGOT);}),
     * DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {return Ingredient.of(Items.DIAMOND);}),
     * GOLD(0, 32, 12.0F, 0.0F, 22, () -> {return Ingredient.of(Items.GOLD_INGOT);}),
     * NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {return Ingredient.of(Items.NETHERITE_INGOT);});
     *
     * The hoe has its own tier because the base tier is offset by .5f and the vanilla developers didn't have the
     * foresight to think someone may want to increment a hoe by .5f instead of a flat integer.
     */

    public static final Tier BRONZE_TIER = TierSortingRegistry.registerTier(new ForgeTier(2, 191, 5.0F, 1.5F, 9, ModTags.Blocks.NEEDS_BRONZE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_BRONZE)), new ResourceLocation(BetterBronze.MOD_ID, "bronze"), List.of(Tiers.STONE), List.of(Tiers.IRON));
    public static final Tier BRONZE_HOE_TIER = TierSortingRegistry.registerTier(new ForgeTier(2, 191, 5.0F, 2.0F, 9, ModTags.Blocks.NEEDS_BRONZE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_BRONZE)), new ResourceLocation(BetterBronze.MOD_ID, "bronze_hoe"), List.of(Tiers.STONE), List.of(Tiers.IRON));
}
