package me.Spy.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class AdminWarp implements CommandExecutor{
	
	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		    Player p = (Player)sender;
		    if (p.hasPermission("Command.AdminWarp")) {
		    	Inventory Inv = Bukkit.createInventory(p, 27, "§bAdminWarp");
		    	
		    	p.openInventory(Inv);
		    } else {
		      p.sendMessage("§cKeine Rechte!");
		    } 
		    return false;
		  }

}
