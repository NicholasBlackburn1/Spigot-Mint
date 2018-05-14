package com.spigotmint.main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class command implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            String command1 = "kill @p";
            Player player = (Player) sender;
            Bukkit.broadcastMessage("§9YOU ALL ARE STUPID");

            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender(); Bukkit.broadcastMessage("§6 So you all loose your item's ");
           Bukkit.dispatchCommand(console,command1);

        }
        return true;
    }
}

