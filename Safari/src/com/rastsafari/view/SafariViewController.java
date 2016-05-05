package com.rastsafari.view;

import java.util.Optional;

import com.rastsafari.MainApp;
import com.rastsafari.model.Booking;
import com.rastsafari.model.Safari;
import com.rastsafari.storage.Storage;
import com.rastsafari.storage.StorageFactory;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class SafariViewController {
	@FXML
	private TableView<Safari> safariTable;
	@FXML
	private TableView<Booking> bookingsTable;
	
	@FXML
	private TableColumn<Safari, String> dateColumn;
	@FXML
	private TableColumn<Safari, String> locationColumn;
	@FXML
	private TableColumn<Safari, String> startTimeColumn;
	@FXML
	private TableColumn<Safari, String> endTimeColumn;
	@FXML
	private TableColumn<Safari, Integer> takenSlotsColumn;
	@FXML
	private TableColumn<Safari, Integer> avalibleSlotsColumn;
	
	@FXML
	private TableColumn<Booking, Integer> idColumn;
	@FXML
	private TableColumn<Booking, String> customerColumn;
	
	@FXML
	private Label idLabel;
	@FXML
	private Label dateLabel;
	@FXML
	private Label startTimeLabel;
	@FXML
	private Label endTimeLabel;
	@FXML
	private Label takenSlotsLabel;
	@FXML
	private Label avalibleSlotsLabel;
	@FXML
	private Label priceLabel;
	@FXML
	private Label guideLabel;
	
	
	//Reference MainApp
	private MainApp mainApp;
	
	private Storage storage = StorageFactory.getStorageDB();
	
	public SafariViewController() {
		
	}
	@FXML
	private void initialize() {
		dateColumn.setCellValueFactory(cellData -> cellData.getValue().getDateProperty());
		locationColumn.setCellValueFactory(cellData -> cellData.getValue().getLocation().locationNameProperty());
		startTimeColumn.setCellValueFactory(cellData -> cellData.getValue().getStartTimeProperty());
		endTimeColumn.setCellValueFactory(cellData -> cellData.getValue().getEndTimeProperty());
		takenSlotsColumn.setCellValueFactory(cellData -> cellData.getValue().getTakenSlotsProperty().asObject());
		avalibleSlotsColumn.setCellValueFactory(cellData -> cellData.getValue().getAvalibleSlotsProperty().asObject());
		
		idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
		customerColumn.setCellValueFactory(cellData -> cellData.getValue().getCustomer().fullNameProperty());
		
		
		//Clear
		showSafariDetails(null);
		
		safariTable.getSelectionModel().selectedItemProperty().addListener(
					(observable, oldValue, newValue) -> showSafariDetails(newValue));
		
		
	}
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		safariTable.setItems(mainApp.getSafariList());
		for (Safari s : mainApp.getSafariList()) {
			s.initBookedCustomers();
			s.setBookedCustomers(storage.getSafariBookingsFromStorage(s.getId()));
			s.setAvalibleSlots(s.getBookedCustomers());
			s.setTakenSlots(s.getBookedCustomers());
		}
		safariTable.getSortOrder().add(dateColumn);

	}
	
	private void showSafariDetails(Safari safari) {
		if (safari != null) {
			idLabel.setText(Integer.toString(safari.getId()));
			dateLabel.setText(safari.getDate());
			startTimeLabel.setText(safari.getStartTime());
			endTimeLabel.setText(safari.getEndTime());
			takenSlotsLabel.setText(Integer.toString(safari.getTakenSlots()));
			avalibleSlotsLabel.setText(Integer.toString(safari.getAvalibleSlots()));
			priceLabel.setText(Double.toString(safari.getPrice()));
			guideLabel.setText(safari.getGuide().getGivenName() + " " + safari.getGuide().getFamilyName());
			
			bookingsTable.setItems(safari.getBookedCustomers());
			
		} else {
			idLabel.setText("");
			dateLabel.setText("");
			startTimeLabel.setText("");
			endTimeLabel.setText("");
			takenSlotsLabel.setText("");
			avalibleSlotsLabel.setText("");
			priceLabel.setText("");
			guideLabel.setText("");
			
			bookingsTable.setItems(null);
		}
	}
	@FXML
	private void handleEditSafari() {
		Safari selectedSafari = safariTable.getSelectionModel().getSelectedItem();
		if (selectedSafari != null) {
			boolean okClicked = mainApp.showEditSafariDialog(selectedSafari, "Redigera safari");
			if (okClicked) {
				storage.updateSafari(selectedSafari);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setHeaderText("Inget markerat");
			alert.setContentText("Vänligen välj ett safari som ska redigeras");
			
			alert.showAndWait();
		}
	}
	@FXML
	private void handleNewSafari() {
		Safari tempSafari = new Safari();
		boolean okClicked = mainApp.showEditSafariDialog(tempSafari, "Nytt safari");
		if (okClicked) {
			tempSafari.setId(storage.generateSafariId());
			mainApp.getSafariList().add(tempSafari);
			storage.addSafari(tempSafari);
		}
	}
	@FXML
	private void handleDeleteSafari() {
		int selectedIndex = safariTable.getSelectionModel().getSelectedIndex();
		Safari safari = safariTable.getSelectionModel().getSelectedItem();
		if (selectedIndex >= 0) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Bekräfta");
			alert.setHeaderText("Bekräfta borttagning");
			alert.setContentText("Vill du verkligen ta bort " + safari.getLocation().getLocationName() +
								" den " + safari.getDate());
			
			Optional<ButtonType> result = alert.showAndWait();
			if(result.get() == ButtonType.OK) {
				safariTable.getItems().remove(selectedIndex);
				storage.removeSafari(safari);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Inget safari markerad");
			alert.setContentText("Vänligen markera ett safari som du vill radera");
			
			alert.showAndWait();
		}
	}
	@FXML
	private void handleDispose() {
		mainApp.getSafariViewStage().close();
	}
}

























