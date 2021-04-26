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
		    	Inv.setItem(14, Utils.createItem(Material.SKULL, 1, 1, "§aUser"));
		    	Inv.setItem(13, Utils.createItem(Material.IRON_FENCE, 1, 0, "§cPunishments"));
		    	p.openInventory(Inv);
		    } else {
		    	p.sendMessage("§cKeine Rechte!");
		    }
		    return false;
	  }
	
}
