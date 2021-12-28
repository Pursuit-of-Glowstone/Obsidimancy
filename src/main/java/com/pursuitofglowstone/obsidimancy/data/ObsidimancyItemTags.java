package com.pursuitofglowstone.obsidimancy.data;

import com.pursuitofglowstone.obsidimancy.Obsidimancy;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ObsidimancyItemTags extends ItemTagsProvider {

    public ObsidimancyItemTags(DataGenerator generator, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, Obsidimancy.MOD_ID, existingFileHelper);
    }

    @Override
    public void addTags() {
//        tag(ObsidimancyTags.BODY).add(ObsidimancyItems.SKYDIVERS_HOOD.get());
    }
}