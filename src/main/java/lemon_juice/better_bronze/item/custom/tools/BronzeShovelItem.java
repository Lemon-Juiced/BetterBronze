package lemon_juice.better_bronze.item.custom.tools;

import lemon_juice.better_bronze.item.custom.tiers.ModTiers;
import net.minecraft.world.item.ShovelItem;

public class BronzeShovelItem extends ShovelItem {
    public BronzeShovelItem(Properties properties) {
        super(ModTiers.BRONZE_TIER, 1.5F, -3.0F, properties);
    }
}
