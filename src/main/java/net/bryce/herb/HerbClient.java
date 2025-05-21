package net.bryce.herb;

import net.bryce.herb.strains.Strains;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
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

        Herb.LOGGER.info("Done initializing client!");

    }
}
