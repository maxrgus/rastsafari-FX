package com.rastsafari.view;

import com.rastsafari.model.SafariLocation;
import com.rastsafari.storage.Storage;
import com.rastsafari.storage.StorageFactory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Dialog to edit details or add a new object of SafariLocation
 * @author maxrg
 *
 */
public class LocationEditDialogController {
	@FXML
	private TextField locationNameField;
	@FXML
	private TextField descriptionField;
	@FXML
	private TextField locationField;
	@FXML
	private ComboBox<Integer> minParticipantBox;
	@FXML
	private ComboBox<Integer> maxParticipantBox;
	@FXML
	private ComboBox<String> isActiveBox;
	
	private Stage dialogStage;
	private SafariLocation location;
	private Storage storage = StorageFactory.getStorageDB();
	private boolean okClicked = false;
	private ObservableList<Integer> participantOptions = FXCollections.observableArrayList();
	private ObservableList<String> isActiveOptions = FXCollections.observableArrayList();
	
	/**
	 * Initializes the controller class. This method is automatically called
	 * after the FXML file has been loaded.
	 */
	@FXML
	private void initialize() {
		for (int i=0; i < 16; i++) {
			participantOptions.add(i);
		}
		minParticipantBox.getItems().addAll(participantOptions);
		maxParticipantBox.getItems().addAll(participantOptions);
		isActiveBox.getItems().addAll("Aktiv", "Inaktiv");
	}
	/**
	 * Sets the stage of this dialog.
	 * @param dialogStage
	 */
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	/**
	 * Sets the SafariLocation to be edited.
	 * @param location
	 */
	public void setSafariLocation(SafariLocation location) {
		this.location = location;
		
		locationNameField.setText(location.getLocationName());
		descriptionField.setText(location.getDescription());
		locationField.setText(location.getLocation());
		minParticipantBox.setValue(location.getMinParticipant());
		maxParticipantBox.setValue(location.getMaxParticipant());
		if (location.getIsActive() == 1) {
			isActiveBox.setValue("Aktiv");
		} else {
			isActiveBox.setValue("Inaktiv");
		}
	}
	/**
	 * Returns true if user clicked ok, false otherwise
	 * @return
	 */
	public boolean isOkClicked() {
		return okClicked;
	}
	/**
	 * Called when the user clicks ok.
	 */
	@FXML
	private void handleOk() {
		if (isInputValid()) {
			location.setLocationName(locationNameField.getText());
			location.setDescription(descriptionField.getText());
			location.setLocation(locationField.getText());
			location.setMinParticipant(minParticipantBox.getValue());
			location.setMaxParticipant(maxParticipantBox.getValue());
			if (isActiveBox.getValue() == "Aktiv") {
				location.setIsActive(1);
			} else {
				location.setIsActive(0);
			}
			okClicked = true;
			storage.updateSafariLocation(location);
			dialogStage.close();
		}
	}
	/**
	 * Called when the user clicks cancel
	 */
	@FXML
	private void handleCancel() {
		dialogStage.close();
	}
	/**
	 * Validates the user input in the text fields.
	 * @return true if the input is valid.
	 */
	private boolean isInputValid() {
		String errorMessage = "";
		if (locationNameField.getText() == null || locationNameField.getText().length() == 0) {
			errorMessage += "Sjö är inte ifyllt!\n";
		}
		if (descriptionField.getText() == null || descriptionField.getText().length() == 0) {
			errorMessage += "Beskrivning är inte ifyllt \n";
		}
		if (locationField.getText() == null || locationField.getText().length() == 0) {
			errorMessage += "Plats är inte ifyllt \n";
		}
		if (minParticipantBox.getValue() > maxParticipantBox.getValue()){
			errorMessage += "Minimum antal deltagare är fler än max antal \n";
		}
		if (errorMessage.length() == 0) {
			return true;
		} else {
			//Show error message
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(dialogStage);
			alert.setTitle("Felaktig inmatning");
			alert.setHeaderText("Vänligen fyll i fälten");
			alert.setContentText(errorMessage);
			
			alert.showAndWait();
			
			return false;
		}
		
	}
}
