package org.myside.template;

import org.bukkit.plugin.java.JavaPlugin;
import org.myside.template.api.Template;

public class TemplatePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        Template.test();
    }
}
