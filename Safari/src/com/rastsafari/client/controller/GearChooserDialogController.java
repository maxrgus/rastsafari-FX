package com.rastsafari.client.controller;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.Gear;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
/**
 * Controller for choosing gear
 * <p>
 * 
 * @author Team14
 * 
 *
 */
public class GearChooserDialogController {
	@FXML
	private TableView<Gear> gearTable;
	@FXML
	private TableColumn<Gear, Integer> gidColumn;
	@FXML
	private TableColumn<Gear, String> gearNameColumn;
	@FXML
	private TableColumn<Gear, String> gearDescriptionColumn;
	
	
	// Reference mainApp
	private MainApp mainApp;
	
	private Stage dialogStage;
	
	private Gear tempGear;
	private boolean okClicked;
	
	public GearChooserDialogController() {
		
	}
	@FXML
	private void initialize() {
		gidColumn.setCellValueFactory(cellData -> cellData.getValue().getIdProperty().asObject());
		gearNameColumn.setCellValueFactory(cellData -> cellData.getValue().getGearNameProperty());
		gearDescriptionColumn.setCellValueFactory(cellData -> cellData.getValue().getDescriptionProperty());
		
	}
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		gearTable.setItems(mainApp.getGearList());
	}
	public void setStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	public Gear getGear() {
		return tempGear;
	}
	public boolean isOkClicked() {
		return okClicked;
	}
	
	/**
	 * Method that handles the ok button. If the input is missing or is wrong. Errormessage
	 */
	@FXML
	private void handleOk() {
		int selectedIndex = gearTable.getSelectionModel().getSelectedIndex();
		if (selectedIndex >= 0) {
			tempGear = gearTable.getSelectionModel().getSelectedItem();
			okClicked = true;
			dialogStage.close();
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(dialogStage);
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Ingen utrustning markerad");
			alert.setContentText("V�nligen markera utrustningen du vill l�gga till");

			alert.showAndWait();
		}
	}
	@FXML
	private void handleBackButton() {
		dialogStage.close();
	}
}



















