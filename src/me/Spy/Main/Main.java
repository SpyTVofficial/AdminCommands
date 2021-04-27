package me.Spy.Main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.Spy.Commands.GiveAdminItems;
import me.Spy.Inventorys.ManageInv;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§aPlugin Erfolgreich aktiviert");
		init();
	}
	
	public void onDisable() {
		
	}
	
	private void init() {
		Bukkit.getPluginManager().registerEvents(new ManageInv(), this);
		getCommand("giveadminitems").setExecutor(new GiveAdminItems());
	}

}
