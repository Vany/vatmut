package com.vany.vatmut;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
            VatmutMod.MOD_ID);

    public static final RegistryObject<Block> ALCHEMICAL_BLOCK = BLOCKS.register("alchemical_block", () -> new Block(
            Block.Properties.create(Material.IRON).hardnessAndResistance(1f, 20.0f).sound(SoundType.METAL)));

}
