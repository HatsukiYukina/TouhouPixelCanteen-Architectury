package net.nyauru.gensokyoizakaya.fabric;

import net.nyauru.gensokyoizakaya.GensokyoIzakaya;
import net.fabricmc.api.ModInitializer;

public final class GensokyoIzakayaFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        GensokyoIzakaya.init();
    }
}
