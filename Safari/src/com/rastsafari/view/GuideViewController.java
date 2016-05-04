package com.rastsafari.view;

import com.rastsafari.MainApp;
import com.rastsafari.model.Guide;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class GuideViewController {
	@FXML
	private TableView<Guide> guideTable;
	@FXML
	private TableColumn<Guide, Integer> idColumn;
	@FXML
	private TableColumn<Guide, String> givenNameColumn;
	@FXML
	private TableColumn<Guide, String> familyNameColumn;
	@FXML
	private TableColumn<Guide, String> emailColumn;
	
	// Reference MainApp.
	private MainApp mainApp;
	
	// Reference stage.
	private Stage guideStage;
	
	public GuideViewController() {
		
	}
	@FXML
	private void initialize() {
		idColumn.setCellValueFactory(cellData -> cellData.getValue().getIdProperty().asObject());
		givenNameColumn.setCellValueFactory(cellData -> cellData.getValue().getGivenNameProperty());
		familyNameColumn.setCellValueFactory(cellData -> cellData.getValue().getFamilyNameProperty());
		emailColumn.setCellValueFactory(cellData -> cellData.getValue().getEmailProperty());
	}
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		guideTable.setItems(mainApp.getGuideList());
	}

}
