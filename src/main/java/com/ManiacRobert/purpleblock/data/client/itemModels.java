package com.ManiacRobert.purpleblock.data.client;


import com.ManiacRobert.purpleblock.PurpleBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class itemModels  extends ItemModelProvider {
    public itemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, PurpleBlock.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //withExistingParent("purple_block", modLoc("block/purple_block"));
        //withExistingParent("purple_ore", modLoc("block/purple_ore"));

       ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
       //createTexture(itemGenerated, "purple_ingot");

        getBuilder("purple_ingot").parent(itemGenerated).texture("layer0", "item/purple_ingot");

    }

    private void createTexture(ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);

    }
}
