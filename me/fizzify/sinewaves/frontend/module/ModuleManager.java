package me.fizzify.sinewaves.frontend.module;

import me.fizzify.sinewaves.frontend.module.hud.RenderModule;
import me.fizzify.sinewaves.frontend.module.hud.impl.FPSModule;

import java.util.ArrayList;

public class ModuleManager {

    public static ModuleManager instance = new ModuleManager();

    public ArrayList<AbstractModule> modules = new ArrayList<>();
    public ArrayList<RenderModule> renderModules = new ArrayList<>();

    public FPSModule fpsModule = new FPSModule();

    public void onStartup() {
        this.renderModules.add(fpsModule);
    }

    public void renderMods() {
        for (RenderModule m : this.renderModules) {
            m.render();
        }
    }

    public static ModuleManager getInstance() {
        return instance;
    }

}
