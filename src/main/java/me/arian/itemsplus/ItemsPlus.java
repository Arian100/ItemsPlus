package me.arian.itemsplus;

import me.arian.itemsplus.command.GUICommand;
import me.arian.itemsplus.util.CommandUtil;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class ItemsPlus extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("[-------------------]");
        getLogger().info("Items+");
        getLogger().info("version 1.0.0");
        getLogger().info("[-------------------]");

        Objects.requireNonNull(getCommand("itemsplus")).setExecutor(new GUICommand());

        getServer().getPluginManager().registerEvents(new CommandUtil(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabled Items+");
    }
}
