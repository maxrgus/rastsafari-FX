package com.rastsafari.view;

import com.rastsafari.MainApp;
import com.rastsafari.model.Booking;
import com.rastsafari.storage.Storage;
import com.rastsafari.storage.StorageFactory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class BookingViewController {
	@FXML
	private TableView<Booking> bookingTable;
	@FXML
	private TableColumn<Booking, Integer> idColumn;
	@FXML
	private TableColumn<Booking, String> customerColumn;
	@FXML
	private TableColumn<Booking, String> safariColumn;
	@FXML
	private TableColumn<Booking, String> dateColumn;
	
	private Storage storage = StorageFactory.getStorageDB();
	private ObservableList<Booking> bookingList = FXCollections.observableArrayList();

	  //Reference the main app
    private MainApp mainApp;
    private Stage bookingStage;
    
    public BookingViewController(){
    	
    }
    @FXML
    private void initialize(){
    	idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
    	customerColumn.setCellValueFactory(cellData -> cellData.getValue().getCustomer().fullNameProperty());
    	safariColumn.setCellValueFactory(cellData -> cellData.getValue().getSafari().getLocation().locationNameProperty());
    	dateColumn.setCellValueFactory(cellData -> cellData.getValue().getSafari().getDateProperty());
    	
    }
    
    public void setBookingStage(Stage bookingStage, MainApp mainApp) {
    	this.bookingStage = bookingStage;
    	this.mainApp = mainApp;
    	bookingTable.setItems(mainApp.getBookingList());
    	
    }
}
