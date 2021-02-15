package fr.xmanu.dourne;

import fr.xmanu.dourne.Commands.Spawn;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        importCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void importCommands () {
        getCommand("spawn").setExecutor(new Spawn());
    }

}
