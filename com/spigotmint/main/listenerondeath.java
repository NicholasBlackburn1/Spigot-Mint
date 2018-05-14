package com.spigotmint.main;

import org.bukkit.Bukkit;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;


public class listenerondeath  implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
event.setDeathMessage("§4You died at the hands of the Server admin\n");


event.setKeepInventory(true);

        }

    }