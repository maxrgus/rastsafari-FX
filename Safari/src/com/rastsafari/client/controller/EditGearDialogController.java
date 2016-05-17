package com.rastsafari.client.controller;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.Gear;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * Controller for editing gear
 * <p>
 * 
 * @author Team14
 * 
 * 
 * 
 *
 */
public class EditGearDialogController {
	@FXML
	private Label headerLabel;
	@FXML
	private TextField nameField;
	@FXML
	private TextField descriptionField;
	@FXML
	private ComboBox<Integer> inStoreBox;

	Integer[] boxNrs = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

	// Reference owner stage and MainApp
	private Stage gearStage;
	private MainApp mainApp;

	private Gear gear;

	private Storage storage = StorageFactory.getStorageDB();
	private boolean okClicked = false;

	public EditGearDialogController() {
	}

	@FXML
	private void initialize() {
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	public void setGearStage(Stage gearStage) {
		this.gearStage = gearStage;
	}

	public void setGear(Gear gear) {
		this.gear = gear;

		nameField.setText(gear.getGearName());
		descriptionField.setText(gear.getDescription());
		inStoreBox.getItems().addAll(boxNrs);
		inStoreBox.setValue(gear.getInStock());
		;
	}

	public void setHeaderLabel(String label) {
		headerLabel.setText(label);
	}

	public boolean isOkClicked() {
		return okClicked;
	}

	@FXML
	private void handleOk() {
		if (isInputValid()) {
			gear.setGearName(nameField.getText());
			gear.setDescription(descriptionField.getText());
			gear.setInStock(inStoreBox.getValue());

			okClicked = true;
			gearStage.close();
		}
	}

	@FXML
	private void handleCancel() {
		gearStage.close();
	}

	/**
	 * Method if the user has inputed correctly, if not errormessage appears.
	 * @return
	 */
	private boolean isInputValid() {
		String errorMessage = "";
		if (nameField.getText() == null || nameField.getText().length() == 0) {
			errorMessage += "Namn �r inte ifyllt!\n";
		} // Validering för siffra måste tilläggas
		if (descriptionField.getText() == null || descriptionField.getText().length() == 0) {
			errorMessage += "Beskrivning �r inte ifyllt!\n";
		}

		if (errorMessage.length() == 0) {
			return true;
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(gearStage);
			alert.setTitle("Felaktig inmatning");
			alert.setHeaderText("V�nligen fyll i f�lten");
			alert.setContentText(errorMessage);

			alert.showAndWait();
			return false;
		}
	}

}
