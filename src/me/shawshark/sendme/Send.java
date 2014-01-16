package me.shawshark.sendme;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import lilypad.client.connect.api.request.RequestException;
import lilypad.client.connect.api.request.impl.RedirectRequest;

public class Send {
	
    public main m;
    
	public Send(main m) {
		this.m = m;
	}
	
	public void sendplayer(String p, String server) {
			try {
				m.connect.request(new RedirectRequest(server, p));
			} catch (RequestException e) {
				Bukkit.getPlayer(p).sendMessage(ChatColor.GOLD + "Error: Couldn't sent you to " + ChatColor.RED + server);
				e.printStackTrace();
			}
	 }
}
