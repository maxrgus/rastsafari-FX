package com.rastsafari.client.controller;

import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

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
