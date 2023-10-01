package lemon_juice.better_bronze.item.custom.tools;

import lemon_juice.better_bronze.item.custom.tiers.ModTiers;
import net.minecraft.world.item.SwordItem;

public class BronzeSwordItem extends SwordItem {
    public BronzeSwordItem(Properties properties) {
        super(ModTiers.BRONZE_TIER, 3, -2.4F, properties);
    }
}
