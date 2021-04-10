package me.configz1.essentialz;

import Commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class EssentialZ extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("god").setExecutor(new god());
        getCommand("UnGod").setExecutor(new UnGod());
        getCommand("Feed").setExecutor(new Feed());
        getCommand("Heal").setExecutor(new Heal());
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gms").setExecutor(new gms());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
