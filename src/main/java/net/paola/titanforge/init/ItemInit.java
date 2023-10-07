package net.paola.titanforge.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.paola.titanforge.TitanForge;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TitanForge.MODID);
    public static final RegistryObject<Item> CELESTIUM_INGOT = ITEMS.register("celestium_ingot",
        () -> new Item(new Item.Properties()));
}
