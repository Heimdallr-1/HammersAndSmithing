package net.fryc.hammersandtables;

import net.fabricmc.api.ClientModInitializer;
import net.fryc.hammersandtables.screen.screenNew.ModScreenHandlers;
import net.fryc.hammersandtables.screen.screenNew.ModSmithingScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class HammersAndTablesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.MOD_SMITHING_SCREEN_HANDLER, ModSmithingScreen::new);
    }
}
