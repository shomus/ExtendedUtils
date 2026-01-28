package com.github.shomus.extendedutils.common.block;

import com.github.shomus.extendedutils.ExtendedUtils;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedUtils.MODID);

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
