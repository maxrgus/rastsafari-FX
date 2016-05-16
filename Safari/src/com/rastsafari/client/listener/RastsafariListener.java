package com.rastsafari.client.listener;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.SafariLocation;

/**
 * Listener class for the update function.
 * <p>
 * Server should distribute objects to all clients
 * through this class.
 * @author maxrg
 *
 */

public class RastsafariListener {
	private MainApp mainApp;
	
	public RastsafariListener(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	public void addSafariLocation(SafariLocation sl) {
		mainApp.getLocationList().add(sl);
	}

}
