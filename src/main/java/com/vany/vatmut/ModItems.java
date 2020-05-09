package com.vany.vatmut;

import com.vany.vatmut.items.AlchemicalFuel;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static AlchemicalFuel AlchemicalFuel;

    public static void registerAll(RegistryEvent.Register<Item> event) {
        AlchemicalFuel = register("alchemical_fuel", new AlchemicalFuel(new Item.Properties(), 111111));
    }

    private static <T extends Item> T register(String name, T item) {
        ResourceLocation id = VatmutMod.getId(name);
        item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}