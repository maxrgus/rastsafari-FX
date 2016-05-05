package com.rastsafari.view;

import java.io.File;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class GenerateReportViewController {
	private FileChooser fileChooser;

	private Stage primaryStage;

	public GenerateReportViewController() {

	}

	@FXML
	private void initialize() {

	}

	public void setStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	@FXML
	public void handleGenerate() {
		fileChooser = new FileChooser();
		fileChooser.setTitle("Spara rapport");
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PDF", "*.pdf"));
		File file = fileChooser.showSaveDialog(primaryStage);

	}

}
