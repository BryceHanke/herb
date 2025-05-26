package net.bryce.herb;

import net.bryce.herb.item.ModItems;
import net.bryce.herb.strains.Strains;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class HerbClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        for (Identifier strain : Strains.strains)
        {
            BlockRenderLayerMap.INSTANCE.putBlock(Registries.BLOCK.get(new Identifier("herb", String.valueOf(strain.getPath())+"_female_cannabis_plant")), RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(Registries.BLOCK.get(new Identifier("herb", String.valueOf(strain.getPath())+"_male_cannabis_plant")), RenderLayer.getCutout());
        }

        registerModelPredicateProviders();

        Herb.LOGGER.info("Done initializing client!");

    }

    public static void registerModelPredicateProviders()
    {
        ModelPredicateProviderRegistry.register(ModItems.LIGHTER, new Identifier("light"), (itemStack, clientWorld, livingEntity, seed) -> {
            if (livingEntity == null) {
                return 0.0F;
            }
            return livingEntity.getActiveItem() != itemStack ? 0.0F : (itemStack.getMaxUseTime() - livingEntity.getItemUseTimeLeft()) / 20.0F;
        });
        ModelPredicateProviderRegistry.register(ModItems.LIGHTER, new Identifier("lighting"), (itemStack, clientWorld, livingEntity, seed) -> {
            if (livingEntity == null) {
                return 0.0F;
            }
            return livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack ? 1.0F : 0.0F;
        });
    }
}
