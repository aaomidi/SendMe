package me.shawshark.sendme;

import lilypad.client.connect.api.Connect;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	public send s = new send(this);
	
	Connect connect;
	
	@Override
	public void onEnable() {
        connect = Bukkit.getServer().getServicesManager().getRegistration(Connect.class).getProvider();
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {  
		if(!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "Error: Commands can only be run from in-game!");
		} else {
			 if(cmd.getName().equalsIgnoreCase("server")) {
				 Player p = (Player)sender;
				 if(args.length < 1) {
					if(!p.hasPermission("sendme.use")) {
						p.sendMessage(ChatColor.RED + "Error: You don't have permissions for this command.");
					} else {
						p.sendMessage(ChatColor.GOLD + "Correct Usage: " + ChatColor.RED + "/server [servername]");
					}
				 } else {
					 s.sendplayer(p, args[0]);
				 } 
			 }
		 }
		return false;
	}
}
