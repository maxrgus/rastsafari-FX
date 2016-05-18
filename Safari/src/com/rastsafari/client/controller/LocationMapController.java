package com.rastsafari.client.controller;

import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
/**
 * Controller for the map (Google maps)
 * 
 * @author Team14
 *
 */
public class LocationMapController {
	@FXML
	private WebView map;

	Stage dialogStage;
	private String url;

	@FXML
	private void initialize() {
	}

	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
	/**
	 * The google maps engine. Based of the URL
	 * @param location
	 */

	public void setUrl(String location) {
		this.url = "http://maps.google.se/maps/@" + location;
		WebEngine engine = map.getEngine();
		engine.load(url);
	}

	@FXML
	public void handleOk() {
		dialogStage.close();
	}

}
