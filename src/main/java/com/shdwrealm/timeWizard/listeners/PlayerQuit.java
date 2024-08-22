package com.shdwrealm.timeWizard.listeners;

import com.shdwrealm.timeWizard.TimeWizard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import org.bukkit.GameRule;
import org.bukkit.World;

public class PlayerQuit implements Listener {
    TimeWizard plugin;

    public PlayerQuit(TimeWizard main) {
        this.plugin = main;
    }

    public void onPlayerQuit(PlayerQuitEvent e) {
        int playerCount = Bukkit.getServer().getOnlinePlayers().size();

        if (playerCount == 0) {
            World world = Bukkit.getServer().getWorld("world");
            world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, Boolean.FALSE);
            System.out.println("[TimeWizard] Froze time!");
        }
    }
}
