package com.vany.vatmut;

import com.vany.vatmut.items.AlchemicalFuel;
import com.vany.vatmut.VatmutMod.VatmutItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, VatmutMod.MOD_ID);

    public static final RegistryObject<Item> ALCHEMICAL_FUEL = ITEMS.register("alchemical_fuel",
            () -> new AlchemicalFuel(new Item.Properties().group(VatmutItemGroup.instance), 1000));
}