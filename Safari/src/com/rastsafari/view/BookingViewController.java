package com.rastsafari.view;

import java.util.Optional;

import com.rastsafari.MainApp;
import com.rastsafari.model.Booking;
import com.rastsafari.storage.Storage;
import com.rastsafari.storage.StorageFactory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
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
    @FXML
    private void handleEditBooking() {
    	Booking selectedBooking = bookingTable.getSelectionModel().getSelectedItem();
    	int selectedIndex = bookingTable.getSelectionModel().getSelectedIndex();
    	if (selectedBooking != null) {
    		boolean okClicked = mainApp.showEditBookingDialog(selectedBooking, "Redigera bokning");
    		if (okClicked) {
    			storage.updateBooking(selectedBooking);
    			bookingTable.getColumns().get(0).setVisible(false);
    			bookingTable.getColumns().get(0).setVisible(true);
    		}
    	} else {
    		Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setHeaderText("Inget markerat");
			alert.setContentText("V�nligen v�lj en bokning som ska redigeras");
			
			alert.showAndWait();
    	}
    }
    @FXML
    private void handleNewBooking() {
    	Booking tempBooking = new Booking();
    	boolean okClicked = mainApp.showEditBookingDialog(tempBooking, "Ny bokning");
    	if (okClicked) {
    		tempBooking.setId(storage.generateBookingId());
    		mainApp.getBookingList().add(tempBooking);
    		storage.addBooking(tempBooking);
    	}
    }
    @FXML
    private void handleDeleteBooking() {
    	int selectedIndex = bookingTable.getSelectionModel().getSelectedIndex();
    	Booking booking = bookingTable.getSelectionModel().getSelectedItem();
    	if (selectedIndex >= 0) {
    		Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Bekr�fta");
			alert.setHeaderText("Bekr�fta borttagning");
			alert.setContentText("Vill du verkligen ta bort bokningen");
			
			
			Optional<ButtonType> result = alert.showAndWait();
			if(result.get() == ButtonType.OK) {
				bookingTable.getItems().remove(selectedIndex);
				storage.removeBooking(booking);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Inget safari markerad");
			alert.setContentText("V�nligen markera ett safari som du vill radera");
			
			alert.showAndWait();
		}
    }
    @FXML
    private void handleDispose() {
    	bookingStage.close();
    }
}
