package me.arian.itemsplus.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class GUICommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender.hasPermission("items.plus.inv")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;

                ItemStack greenBook = new ItemStack(Material.KNOWLEDGE_BOOK);
                ItemStack cmdBlock = new ItemStack(Material.COMMAND_BLOCK);
                ItemStack chainCmdBlock = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
                ItemStack repCmdBlock = new ItemStack(Material.REPEATING_COMMAND_BLOCK);
                ItemStack cmdMine = new ItemStack(Material.COMMAND_BLOCK_MINECART);
                ItemStack debugStick = new ItemStack(Material.DEBUG_STICK);
                ItemStack barrier = new ItemStack(Material.BARRIER);
                ItemStack strVoid = new ItemStack(Material.STRUCTURE_VOID);
                ItemStack strBlock = new ItemStack(Material.STRUCTURE_BLOCK);
                ItemStack jig = new ItemStack(Material.JIGSAW);
                ItemStack light = new ItemStack(Material.LIGHT);

                Inventory gui = Bukkit.createInventory(p, 36, ChatColor.WHITE + "" + ChatColor.BOLD + "Items" + ChatColor.GREEN + "" + ChatColor.BOLD + "+");
                ItemStack[] guiItems = {greenBook, cmdBlock, chainCmdBlock, repCmdBlock, cmdMine, debugStick, barrier, strVoid, strBlock, jig, light};
                gui.setContents(guiItems);
                p.openInventory(gui);

                return true;
            } else {
                sender.sendMessage(ChatColor.RED + "Only a Player can do that!");
            }
        } else {
            sender.sendMessage(ChatColor.WHITE + "Unknown command. Type /help for help.");
        }
        return false;
    }
}
