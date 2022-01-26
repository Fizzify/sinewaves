package me.fizzify.sinewaves;

import me.fizzify.sinewaves.frontend.module.ModuleManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {

    public static Client instance = new Client();
    private static final Logger logger = LogManager.getLogger();

    public void onStartup() {
        logger.info("Starting the client...");

        ModuleManager.getInstance().onStartup();
    }

    public void onShutdown() {
        logger.info("Shutting the client...");
    }

    public static Client getInstance() {
        return instance;
    }

}
