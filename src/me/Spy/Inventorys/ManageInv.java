package me.Spy.Inventorys;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

import me.Spy.Main.Utils;

public class ManageInv implements Listener {

	@EventHandler
	public void ifInInv(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (p.getItemInHand().getItemMeta().getDisplayName().equals("§cAdminCommands")) {
			Inventory manager = Bukkit.createInventory(p, 27, "§cAdminCommands");
			manager.setItem(12, Utils.createItem(Material.REDSTONE, 1, 0, "§cManager"));
			manager.setItem(14, Utils.createItem(Material.COMPASS, 1, 0, "§aAdminWarps"));
			p.openInventory(manager);
		}
	}

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = null;
		if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§cManager")) {
			Inventory manage = Bukkit.createInventory(p, 27, "§cManager");
			manage.setItem(12, Utils.createItem(Material.REDSTONE, 1, 0, "§cSerers"));
			manage.setItem(14, Utils.createItem(Material.SKULL, 1, 1, "§aUser"));
			manage.setItem(4, Utils.createItem(Material.COOKIE, 1, 0, "§6BitCoin-Manager"));
			manage.setItem(13, Utils.createItem(Material.IRON_FENCE, 1, 0, "§cPunishments"));
			p.openInventory(manage);
		} else if(e.getCurrentItem().getItemMeta().equals("§aAdminWarp")) {
			Inventory adminwarp = Bukkit.createInventory(p, 27, "AdminWarp");
	    	adminwarp.setItem(12, Utils.createItem(Material.GRASS, 1, 0, "§aBuild-Server"));
	    	adminwarp.setItem(14, Utils.createItem(Material.REDSTONE, 1, 0, "§cDevelopment-Server"));
			p.openInventory(adminwarp);
		}
	}
}
