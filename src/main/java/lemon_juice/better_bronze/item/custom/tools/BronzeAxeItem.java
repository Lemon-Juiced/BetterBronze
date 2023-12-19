package lemon_juice.better_bronze.item.custom.tools;

import lemon_juice.better_bronze.item.custom.tiers.BetterBronzeTiers;
import net.minecraft.world.item.AxeItem;

public class BronzeAxeItem extends AxeItem {
    public BronzeAxeItem(Properties properties) {
        super(BetterBronzeTiers.BRONZE_TIER, 6.5F, -3.1F, properties);
    }
}
