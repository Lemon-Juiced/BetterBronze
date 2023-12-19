package lemon_juice.better_bronze.item.custom.tools;

import lemon_juice.better_bronze.item.custom.tiers.BetterBronzeTiers;
import net.minecraft.world.item.HoeItem;

public class BronzeHoeItem extends HoeItem {
    public BronzeHoeItem(Properties properties) {
        super(BetterBronzeTiers.BRONZE_HOE_TIER, -2, -1.5F, properties);
    }
}
