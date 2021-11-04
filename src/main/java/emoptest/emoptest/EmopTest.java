package emoptest.emoptest;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class EmopTest extends JavaPlugin {

    Logger logger = getLogger();

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("TEST START");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("TEST END");
    }
}
