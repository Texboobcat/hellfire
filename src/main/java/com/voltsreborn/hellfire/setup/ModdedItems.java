package com.voltsreborn.hellfire.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import com.voltsreborn.hellfire.Hellfire;

public class ModdedItems {
    public static final RegistryObject<Item> MISSILE_ONE = Registration.ITEMS.register("missile_one", () ->
            new Item(new Item.Properties().group(Hellfire.CREATIVE_TAB)));
    public static final RegistryObject<Item> MISSILE_TWO = Registration.ITEMS.register("missile_two", () ->
            new Item(new Item.Properties().group(Hellfire.CREATIVE_TAB)));
    public static final RegistryObject<Item> MISSILE_THREE = Registration.ITEMS.register("missile_three", () ->
            new Item(new Item.Properties().group(Hellfire.CREATIVE_TAB)));


    static void register() {}
}
