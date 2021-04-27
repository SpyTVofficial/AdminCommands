package me.Spy.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Spy.Main.Utils;

public class GiveAdminItems implements CommandExecutor {
		  
	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    Player p = (Player)sender;
	    if (p.hasPermission("Commands.GiveItems") || p.isOp()) {
	      if (args.length == 0) {
	    	  p.getInventory().setItem(7, Utils.createItem(Material.NETHER_STAR, 1, 0, "§cAdminCommands"));
	      } else {
	    	  p.sendMessage("§cUsage: /giveadminitems");
	      }
	    } else {
	      p.sendMessage("§cKeine Rechte!");
	    } 
	    return false;
	  }

}
