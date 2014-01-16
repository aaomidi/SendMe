package me.shawshark.sendme;

import lilypad.client.connect.api.request.RequestException;
import lilypad.client.connect.api.request.impl.RedirectRequest;

public class Send {
	
    public main m;
    
	public Send(main m) {
		this.m = m;
	}
	
	public void sendplayer(String p, String server) throws RequestException {
			m.connect.request(new RedirectRequest(server, p));
	 } 	
}
