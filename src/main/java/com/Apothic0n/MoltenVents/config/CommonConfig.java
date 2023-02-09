package com.Apothic0n.MoltenVents.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
    public static ForgeConfigSpec.BooleanValue useSource;
    public static ForgeConfigSpec.ConfigValue<? extends String> modName;
    public static ForgeConfigSpec.ConfigValue<? extends Integer> ventRarity;
    public static ForgeConfigSpec.ConfigValue<? extends Integer> ventDepth;
    public static ForgeConfigSpec.BooleanValue generateUnderwater;
    public static ForgeConfigSpec.ConfigValue<? extends String> requiredLiquid;
    public static void registerCommonConfig(ForgeConfigSpec.Builder COMMON_BUILDER) {
        COMMON_BUILDER.comment("General settings for Molten Vents").push("common");

        useSource = COMMON_BUILDER
                .comment("When true, orestone blocks will only replace liquid source blocks. This means that you will require a constant supply of liquid to generate orestones. Default: true")
                .define("useLiquid", true);

        modName = COMMON_BUILDER
                .comment("The name of a mod whom's biomes you wish for the geodes to generate in. Important: You must have the mod's technical id such as 'tconstruct' instead of 'Tinkers Construct'. Default: 'modIDHere'")
                .define("modName", "modIDHere");

        ventRarity = COMMON_BUILDER
                .comment("The rarity of vents. The higher the number the rarer the vents. Default: 690")
                .define("ventRarity", 690);

        ventDepth = COMMON_BUILDER
                .comment("The depth of vents. When set below 10 the vents will stop generating immediately below the molten ore block, which is useful for specific cases such as when using the Stratospheric Expansion mod to prevent the vents from sticking through the bottom of the islands. Default: 100")
                .define("ventDepth", 100);

        generateUnderwater = COMMON_BUILDER
                .comment("When true, vents will only generate underwater. Strongly recommended to halve the config value for vent rarity when this option is enabled. Vent depth is limited to a maximum of 80 when this setting is enabled. Default: false")
                .define("generateUnderwater", false);

        requiredLiquid = COMMON_BUILDER
                .comment("The name of a mod whom's biomes you wish for the geodes to generate in. Important: You must have the mod's technical id such as 'tconstruct' instead of 'Tinkers Construct'. Default: 'minecraft:lava'")
                .define("requiredLiquid", "minecraft:lava");

        COMMON_BUILDER.pop();
    }
}