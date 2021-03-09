package com.voltsreborn.hellfire.data.client;


import com.voltsreborn.hellfire.Hellfire;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModel extends ItemModelProvider {
    public ItemModel(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Hellfire.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels(){
        withExistingParent("silo_block", modLoc("block/silo_block"));
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        ItemModelBuilder texture = getBuilder("missile_one").parent(itemGenerated).texture("layer0", "item/missile_one");

        builder(itemGenerated, "missile_one");
    }
    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", name);
    }
}
