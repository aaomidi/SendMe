package me.shawshark.sendme;

import lilypad.client.connect.api.request.RequestException;
import lilypad.client.connect.api.request.impl.RedirectRequest;

import org.bukkit.entity.Player;

public class send {
    public main m;
    
	public send(main m) {
		this.m = m;
	}
	
	public void sendplayer(Player p, String server) {
		try { 
			m.connect.request(new RedirectRequest(server, p.getName()));
		} catch (IndexOutOfBoundsException | RequestException e) {
			e.printStackTrace();
		}
	 } 	
}
