package com.spigotmint.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class main extends JavaPlugin

    {
        @Override
        public void onEnable(){
            getServer().getPluginManager().registerEvents(new listeneron(), this );
            getServer().getPluginManager().registerEvents(new listenerontp(), this);
        getServer().getPluginManager().registerEvents(new listener(), this);
        getServer().getPluginManager().registerEvents(new listenerondeath(), this);
            this.getCommand("kit").setExecutor(new command());
            Logger log = Bukkit.getLogger();
            log.info("============================\n");
            log.info("======= Spigot-mint ========\n");
            log.info("============================\n");
            log.info("== By Nicholas Blackburn ===\n");
            log.info("============================\n");
        }

        @Override
        public void onDisable(){

    }
    }


