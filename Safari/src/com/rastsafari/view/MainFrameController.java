package com.rastsafari.view;

import com.rastsafari.MainApp;

import javafx.fxml.FXML;

public class MainFrameController {
	//Reference the main app
	private MainApp mainApp;
	
	/**
     * The constructor
     * The constructor is called before the initialize() method.
     */
	public MainFrameController() {
		
	}
	
	@FXML
	private void initialize() {
		
	}
	
	/**
     * is called by the main application to give a reference back to itself.
     * @param mainApp
     */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		
	}
	
	/**
	 * Called when the users clicks the SafariLocation button
	 */
	@FXML
	private void handleSafariLocationView() {
		mainApp.showSafariLocationView();
	}
}
