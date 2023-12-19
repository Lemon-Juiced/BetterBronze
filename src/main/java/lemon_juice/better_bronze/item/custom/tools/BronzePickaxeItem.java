package lemon_juice.better_bronze.item.custom.tools;

import lemon_juice.better_bronze.item.custom.tiers.BetterBronzeTiers;
import net.minecraft.world.item.PickaxeItem;

public class BronzePickaxeItem extends PickaxeItem {
    public BronzePickaxeItem(Properties properties) {
        super(BetterBronzeTiers.BRONZE_TIER, 1, -2.8F, properties);
    }
}
