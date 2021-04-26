package me.Spy.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import me.Spy.Main.Utils;

public class Manage implements CommandExecutor{

	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		    Player p = (Player)sender;
		    if(p.hasPermission("Command.Manage")) {
		    	Inventory Inv = Bukkit.createInventory(p, 27, "§cManager");
		    	Inv.setItem(12, Utils.createItem(Material.REDSTONE, 1, 0, "§cSerers"));
		    	p.openInventory(Inv);
		    } else {
		    	p.sendMessage("§cKeine Rechte!");
		    }
		    return false;
	  }
	
}
