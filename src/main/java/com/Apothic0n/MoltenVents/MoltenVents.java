package com.Apothic0n.MoltenVents;

import com.Apothic0n.MoltenVents.api.biome.features.MoltenVentsFeatureRegistry;
import com.Apothic0n.MoltenVents.config.Configs;
import com.Apothic0n.MoltenVents.core.objects.MoltenBlockEntities;
import com.Apothic0n.MoltenVents.core.objects.MoltenBlocks;
import com.Apothic0n.MoltenVents.core.objects.MoltenItems;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.Apothic0n.MoltenVents.api.biome.features.MoltenVentsFeatures.*;

// The value here should match an entry in the META-INF/mods.toml file.
@Mod("molten_vents")
public class MoltenVents
{
    public static final String MODID = "molten_vents";

    public MoltenVents()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);

        Configs.register();
        MoltenVentsFeatureRegistry.register(eventBus);
        MoltenBlockEntities.register(eventBus);
        MoltenBlocks.register(eventBus);
        MoltenItems.register(eventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            final Holder<PlacedFeature> initializeAsurine = ASURINE_VENT_PLACED;
            final Holder<PlacedFeature> initializeVeridium = VERIDIUM_VENT_PLACED;
            final Holder<PlacedFeature> initializeCrimsite = CRIMSITE_VENT_PLACED;
            final Holder<PlacedFeature> initializeOchrum = OCHRUM_VENT_PLACED;
            final Holder<PlacedFeature> initializeAquaticAsurine = AQUATIC_ASURINE_VENT_PLACED;
            final Holder<PlacedFeature> initializeAquaticVeridium = AQUATIC_VERIDIUM_VENT_PLACED;
            final Holder<PlacedFeature> initializeAquaticCrimsite = AQUATIC_CRIMSITE_VENT_PLACED;
            final Holder<PlacedFeature> initializeAquaticOchrum = AQUATIC_OCHRUM_VENT_PLACED;
        });
    }
}
