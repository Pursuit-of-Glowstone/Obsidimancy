package com.pursuitofglowstone.obsidimancy.data;

import com.pursuitofglowstone.obsidimancy.Obsidimancy;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Obsidimancy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GatherDataHandler {
    @SubscribeEvent
    public static void gatherData (final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(new ObsidimancyItemModels(generator, Obsidimancy.MOD_ID, event.getExistingFileHelper()));
        generator.addProvider(new EnglishLocalization(generator));
        ObsidimancyBlockTags blockTags = new ObsidimancyBlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(blockTags);
        generator.addProvider(new ObsidimancyItemTags(generator, blockTags, event.getExistingFileHelper()));
        generator.addProvider(new ObsidimancyLootTables(generator));
        generator.addProvider(new ObsidimancyGLMs(generator));
        generator.addProvider(new ObsidimancyRecipeProvider(generator));
    }
}