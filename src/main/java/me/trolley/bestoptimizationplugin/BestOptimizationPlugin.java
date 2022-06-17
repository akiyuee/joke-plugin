//          THIS PLUGIN IS A JOKE. IT WON'T OPTIMIZE YOUR SERVER!

package me.trolley.bestoptimizationplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class BestOptimizationPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        String command = "/kill @e[type=!player,type=!item,type=!item_frame]";
        Bukkit.getScheduler().runTask(this, () -> {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), command);
        });
        getLogger().info(ChatColor.GREEN + "Optimized entities!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
