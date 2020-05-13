package com.vany.vatmut.items;

import com.vany.vatmut.VatmutMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AlchemicalFuel extends Item {
    private final int fuel;

    private static final Logger LOGGER = LogManager.getLogger();

    public AlchemicalFuel(Properties properties, int fuel) {
        super(properties.group(VatmutMod.VatmutItemGroup.instance));
        this.fuel = fuel;
        LOGGER.info("[[[XXX]]] Fuel constructed");
    }

    @Override
    public int getBurnTime(ItemStack stack) {
        return this.fuel;
    }
}
