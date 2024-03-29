package com.pursuitofglowstone.obsidimancy.data;

import com.pursuitofglowstone.obsidimancy.Obsidimancy;
import com.pursuitofglowstone.obsidimancy.items.ObsidimancyItems;
import com.pursuitofglowstone.obsidimancy.items.enchantment.ObsidimancyEnchantments;
import com.pursuitofglowstone.obsidimancy.loot.AutoSmeltModifier;
import com.pursuitofglowstone.obsidimancy.loot.ObsidianShardsModifier;
import com.pursuitofglowstone.obsidimancy.loot.ObsidimancyLootModifiers;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ObsidimancyGLMs extends GlobalLootModifierProvider {
    public ObsidimancyGLMs(DataGenerator gen) {
        super(gen, Obsidimancy.MOD_ID);
    }

    @Override
    protected void start() {
        add("shatter_obsidian", new ObsidianShardsModifier(new LootItemCondition[]{
                MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(ObsidimancyEnchantments.SHATTERING.get(), MinMaxBounds.Ints.ANY))).build(),
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.OBSIDIAN).build()
        }, 2, 4, Items.OBSIDIAN, ObsidimancyItems.OBSIDIAN_SHARD.get(),  1, 4));

        add("nether_pickaxe_auto_smelt", new AutoSmeltModifier(
                new LootItemCondition[]{MatchTool.toolMatches(ItemPredicate.Builder.item().of(ObsidimancyItems.NETHER_PRECURSOR_PICKAXE.get())).build()})
        );
    }
}
