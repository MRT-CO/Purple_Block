package com.ManiacRobert.purpleblock.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class modItems {
    public static final RegistryObject<Item> PURPLE_INGOT = Registration.ITEMS.register("purple_ingot", () ->
         new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));


    static void register() {}
}
