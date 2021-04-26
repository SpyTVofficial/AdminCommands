package me.Spy.Main;

import org.bukkit.plugin.java.JavaPlugin;

import me.Spy.Commands.AdminWarp;
import me.Spy.Commands.Manage;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		init();
	}
	
	public void onDisable() {
		
	}
	
	private void init() {
		getCommand("adminwarp").setExecutor(new AdminWarp());
		getCommand("manage").setExecutor(new Manage());
	}

}
