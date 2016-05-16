package com.rastsafari.server.listener;

import java.util.ArrayList;

import com.rastsafari.client.listener.RastsafariListener;
import com.rastsafari.server.model.SafariLocation;

/**
 * Server side distributor, should distribute objects to all 
 * subscribed clients
 * Not finished.
 * @author maxrg
 *
 */

public class Distributor {
	// List of client listeners
	private ArrayList<RastsafariListener> listeners;
	
	public Distributor() {
		listeners = new ArrayList<RastsafariListener>();
	}
	
	public void subscribeToList(RastsafariListener rl) {
		listeners.add(rl);
	}
	
	// New SafariLocation
	public void newSafariLocation(SafariLocation sl) {
		for (RastsafariListener rl : listeners) {
			rl.addSafariLocation(sl);
		}
	}
}
