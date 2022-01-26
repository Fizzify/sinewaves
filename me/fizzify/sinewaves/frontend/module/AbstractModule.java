package me.fizzify.sinewaves.frontend.module;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;

public abstract class AbstractModule {

    public Minecraft mc = Minecraft.getMinecraft();
    public FontRenderer fr = mc.fontRendererObj;

    public String name, description;
    public boolean enabled;

    public AbstractModule(String name, String description) {
        this.name = name;
        this.description = description;

        this.enabled = true;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
