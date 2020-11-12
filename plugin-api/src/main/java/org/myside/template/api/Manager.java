package org.myside.template.api;

public interface Manager {
    /**
     * Called when this module is loaded
     */
    default void onLoad() {

    }

    /**
     * Called when this module is enabled
     */
    default void onEnable() {

    }

    /**
     * Called when this module is reloaded
     */
    default void onReload() {

    }

    /**
     * Called when this module is disabled
     */
    default void onDisable() {

    }
}
