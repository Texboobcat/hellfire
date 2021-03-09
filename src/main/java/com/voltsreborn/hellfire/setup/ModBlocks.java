package com.voltsreborn.hellfire.setup;
import com.voltsreborn.hellfire.Hellfire;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.TNTBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> SILO_BLOCK = register("silo_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> OBSIDIAN_TNT = register("obsidian_tnt", () ->
            new TNTBlock(Block.Properties.create(Material.TNT).hardnessAndResistance(2).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> NUCLEAR_BOMB = register("nuclear_bomb", () ->
            new TNTBlock(Block.Properties.create(Material.TNT).hardnessAndResistance(2).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> THERMOBARIC_BOMB = register("thermobaric_bomb", () ->
            new TNTBlock(Block.Properties.create(Material.TNT).hardnessAndResistance(2).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> REPULSIVE_BOMB = register("repulsive_bomb", () ->
            new TNTBlock(Block.Properties.create(Material.TNT).hardnessAndResistance(2).sound(SoundType.PLANT)));

    static void register(){}


    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block){
        return Registration.BLOCKS.register(name, block);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(Hellfire.CREATIVE_TAB)));
        return ret;
    }
}
