package net.zarto.modtest.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.zarto.modtest.ModTest;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModTest.MODID);

    public static final DeferredItem<Item> COPPER_COIN = ITEMS.register(
            "copper_coin",
            () -> new Item(new Item.Properties().stacksTo(16).fireResistant())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
