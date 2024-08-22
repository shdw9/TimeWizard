package com.shdwrealm.timeWizard.listeners;

import com.shdwrealm.timeWizard.TimeWizard;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import org.bukkit.GameRule;
import org.bukkit.World;

public class PlayerJoin implements Listener {
    TimeWizard plugin;

    public PlayerJoin(TimeWizard main) {
        this.plugin = main;
    }

    public void onPlayerJoin(PlayerJoinEvent e) {
        // enable daylight cycle
        World world = Bukkit.getServer().getWorld("world");

        if (!world.getGameRuleValue(GameRule.DO_DAYLIGHT_CYCLE)) {
            System.out.println("Resuming time ...");
            world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, Boolean.TRUE);
        }

    }
}
