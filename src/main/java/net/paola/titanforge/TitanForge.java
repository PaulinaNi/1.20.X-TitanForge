package net.paola.titanforge;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.paola.titanforge.init.BlockInit;
import net.paola.titanforge.init.ItemInit;

@Mod(TitanForge.MODID)
public class TitanForge {
    public static final String MODID = "titanforge";
    public  TitanForge(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
    }
}
