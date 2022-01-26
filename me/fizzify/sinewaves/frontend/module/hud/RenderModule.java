package me.fizzify.sinewaves.frontend.module.hud;

import me.fizzify.sinewaves.frontend.module.AbstractModule;

public abstract class RenderModule extends AbstractModule {

    public int x, y, width, height;

    public RenderModule(String name, String description) {
        super(name, description);
    }

    public RenderModule(String name, String description, int x, int y) {
        super(name, description);
        this.x = x;
        this.y = y;
    }

    public abstract void render();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
