package com.github.shomus.extendedutils;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExtendedUtils.MODID)
public class ExtendedUtils
{
    public static final String MODID = "examplemod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ExtendedUtils(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
    }
}
