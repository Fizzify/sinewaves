package me.fizzify.sinewaves.frontend.module.hud.impl;

import me.fizzify.sinewaves.frontend.module.hud.RenderModule;
import net.minecraft.client.Minecraft;

public class FPSModule extends RenderModule {

    public FPSModule() {
        super("FPS", "Shows your frames!", 5, 5);
    }

    @Override
    public void render() {
        this.fr.drawStringWithShadow(Minecraft.getDebugFPS() + " FPS", this.getX(), this.getY(), -1);
    }
}
