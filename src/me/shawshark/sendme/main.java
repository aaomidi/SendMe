package me.shawshark.sendme;

import lilypad.client.connect.api.Connect;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	public Send s = new Send(this);
	Connect connect;
	
	@Override
	public void onEnable() {
        connect = Bukkit.getServer().getServicesManager().getRegistration(Connect.class).getProvider();
        registercommands();
	}
	
	public void registercommands() {
		getCommand("server").setExecutor(new ServerCommand(this));
		getCommand("lilysend").setExecutor(new LilySendCommand(this));
		System.out.print("[SendMe] Commands Registered!");
	}
}
