package me.arian.itemsplus.util;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class CommandUtil implements Listener {

    @EventHandler
    public void onClick(@NotNull InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getSize() == 36) {
            e.setCancelled(true);
            switch (Objects.requireNonNull(e.getCurrentItem()).getType()) {
                case KNOWLEDGE_BOOK: {
                    p.getInventory().addItem(new ItemStack(Material.KNOWLEDGE_BOOK));
                    break;
                }
                case COMMAND_BLOCK: {
                    p.getInventory().addItem(new ItemStack(Material.COMMAND_BLOCK));
                    break;
                }
                case CHAIN_COMMAND_BLOCK: {
                    p.getInventory().addItem(new ItemStack(Material.CHAIN_COMMAND_BLOCK));
                    break;
                }
                case REPEATING_COMMAND_BLOCK: {
                    p.getInventory().addItem(new ItemStack(Material.REPEATING_COMMAND_BLOCK));
                    break;
                }
                case COMMAND_BLOCK_MINECART: {
                    p.getInventory().addItem(new ItemStack(Material.COMMAND_BLOCK_MINECART));
                    break;
                }
                case DEBUG_STICK: {
                    p.getInventory().addItem(new ItemStack(Material.DEBUG_STICK));
                    break;
                }
                case BARRIER: {
                    p.getInventory().addItem(new ItemStack(Material.BARRIER));
                    break;
                }
                case STRUCTURE_VOID: {
                    p.getInventory().addItem(new ItemStack(Material.STRUCTURE_VOID));
                    break;
                }
                case STRUCTURE_BLOCK: {
                    p.getInventory().addItem(new ItemStack(Material.STRUCTURE_BLOCK));
                    break;
                }
                case JIGSAW: {
                    p.getInventory().addItem(new ItemStack(Material.JIGSAW));
                    break;
                }
                case LIGHT: {
                    p.getInventory().addItem(new ItemStack(Material.LIGHT));
                    break;
                }
            }
        }
    }
}
