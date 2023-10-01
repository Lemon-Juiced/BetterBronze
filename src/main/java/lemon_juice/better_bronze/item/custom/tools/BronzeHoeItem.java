package lemon_juice.better_bronze.item.custom.tools;

import lemon_juice.better_bronze.item.custom.tiers.ModTiers;
import net.minecraft.world.item.HoeItem;

public class BronzeHoeItem extends HoeItem {
    public BronzeHoeItem(Properties properties) {
        super(ModTiers.BRONZE_HOE_TIER, -2, -1.5F, properties);
    }
}
