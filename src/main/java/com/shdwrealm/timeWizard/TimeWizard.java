package com.shdwrealm.timeWizard;

import com.shdwrealm.timeWizard.listeners.PlayerJoin;
import com.shdwrealm.timeWizard.listeners.PlayerQuit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public final class TimeWizard extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents((Listener)new PlayerJoin(this), (Plugin)this);
        getServer().getPluginManager().registerEvents((Listener)new PlayerQuit(this), (Plugin)this);
        System.out.println("[TimeWizard] Registered events!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
