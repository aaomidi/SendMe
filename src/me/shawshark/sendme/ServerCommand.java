package me.shawshark.sendme;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class ServerCommand implements CommandExecutor {
	
	public main m;
	
	public ServerCommand(main m) {
		this.m = m;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, final String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "Error: This command can only be run from in-game!");
		} else {
			final Player p = (Player) sender;
				 if(args.length < 1) {
					if(!p.hasPermission("sendme.use")) {
						p.sendMessage(ChatColor.RED + "Error: You don't have permissions for this command.");
					} else {
						p.sendMessage(ChatColor.GOLD + "Correct Usage: " + ChatColor.RED + "/server [servername]");
					}
				 } else {
					 if(m.timer < 1) {
						 m.s.sendplayer(p.getName(), args[0]);
					 } else {
						 p.sendMessage(ChatColor.GOLD + "Teleportation will commence in " + m.timer + " seconds.");
						 new BukkitRunnable() {
							@Override
							public void run() {
								if(p.isOnline()) {
									m.s.sendplayer(p.getName(), args[0]);
								}
							}
						}.runTaskLater(m, m.timer * 20);
					 }	
			} 
		 }
		return false;
	}
}
