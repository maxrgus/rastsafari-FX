package com.rastsafari.view;

import com.rastsafari.MainApp;
import com.rastsafari.model.Booking;
import com.rastsafari.model.Safari;
import com.rastsafari.storage.Storage;
import com.rastsafari.storage.StorageFactory;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
		endTimeColumn.setCellValueFactory(cellData -> cellData.getValue().getStartTimeProperty());
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
			
			bookingsTable.setItems(safari.getBookedCustomers());
			
		} else {
			idLabel.setText("");
			dateLabel.setText("");
			startTimeLabel.setText("");
			endTimeLabel.setText("");
			takenSlotsLabel.setText("");
			avalibleSlotsLabel.setText("");
			priceLabel.setText("");
			
			bookingsTable.setItems(null);
		}
	}
}

























