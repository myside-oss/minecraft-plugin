package org.myside.template;

import org.bukkit.plugin.java.JavaPlugin;
import org.myside.template.inject.Inject;

import java.util.logging.Logger;

public class TemplatePlugin extends JavaPlugin {
    private final Logger logger = getLogger();

//    private TemplateManager templateManager;

    @Override
    public void onLoad() {
//        templateManager = new CraftTemplateManager();
//        templateManager.onLoad();
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();

        try {
            Inject.suppressIllegalAccess();

            logger.info("Initializing " + getName() + " API");

            Inject.inject("templateManager", null);
        } catch (Exception e) {
            throw new RuntimeException("Failed to inject static " + getName() + " fields", e);
        }

//        templateManager.onEnable();
    }

    @Override
    public void onDisable() {
//        templateManager.onDisable();
    }
}
