package com.pursuitofglowstone.obsidimancy.blocks;

import com.pursuitofglowstone.obsidimancy.Obsidimancy;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ObsidimancyBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Obsidimancy.MOD_ID);

    public static final RegistryObject<AttunementAltar> ATTUNEMENT_ALTAR = BLOCKS.register("attunement_altar", AttunementAltar::new);
    public static final RegistryObject<FragileObsidian> FRAGILE_OBSIDIAN = BLOCKS.register("fragile_obsidian", FragileObsidian::new);

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }


}
