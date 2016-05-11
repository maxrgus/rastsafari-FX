package com.rastsafari.client.controller;

import java.util.Optional;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.Guide;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
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

	private Storage storage = StorageFactory.getStorageDB();

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

	@FXML
	private void handleEditGuide() {
		Guide selectedGuide = guideTable.getSelectionModel().getSelectedItem();
		if (selectedGuide != null) {
			boolean okClicked = mainApp.showEditGuideDialog(selectedGuide, "Redigera guide");
			if (okClicked) {
				storage.updateGuide(selectedGuide);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setHeaderText("Inget markerat");
			alert.setContentText("V�nligen v�l en guide som ska redigeras");

			alert.showAndWait();
		}
	}

	@FXML
	private void handleNewGuide() {
		Guide tempGuide = new Guide();
		boolean okClicked = mainApp.showEditGuideDialog(tempGuide, "Ny guide");
		if (okClicked) {
			tempGuide.setId(storage.generateGuideId());
			mainApp.getGuideList().add(tempGuide);
			storage.addGuide(tempGuide);
		}
	}

	@FXML
	private void handleDeleteGuide() {
		int selectedIndex = guideTable.getSelectionModel().getSelectedIndex();
		Guide guide = guideTable.getSelectionModel().getSelectedItem();
		if (selectedIndex >= 0) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Bekr�fta");
			alert.setHeaderText("Bekr�fta borttagning");
			alert.setContentText("Vill du verkligen ta bort " + guide.getGivenName() + " " + guide.getFamilyName());

			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == ButtonType.OK) {
				guideTable.getItems().remove(selectedIndex);
				storage.removeGuide(guide);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Ingen guide markerad");
			alert.setContentText("V�nligen markera en guide som du vill radera");

			alert.showAndWait();
		}
	}

	@FXML
	private void handleDispose() {
		mainApp.getGuideStage().close();
	}

}
