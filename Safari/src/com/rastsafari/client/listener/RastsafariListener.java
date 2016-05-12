package com.rastsafari.client.listener;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.SafariLocation;

public class RastsafariListener {
	private MainApp mainApp;
	
	public RastsafariListener(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	public void addSafariLocation(SafariLocation sl) {
		mainApp.getLocationList().add(sl);
	}

}
