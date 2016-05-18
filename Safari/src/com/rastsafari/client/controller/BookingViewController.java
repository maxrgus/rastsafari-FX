package com.rastsafari.client.controller;

import java.util.Optional;


import com.rastsafari.MainApp;
import com.rastsafari.server.mail.RastsafariMail;
import com.rastsafari.server.model.Booking;
import com.rastsafari.server.model.Safari;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * Controller for Booking view.
 * <p>
 * Its either for creating a new bookig, editing or deleting
 * <p>
 * @author Team14
 *
 */

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
	private RastsafariMail mail = new RastsafariMail();
	// Reference the main app
	private MainApp mainApp;
	private Stage bookingStage;

	public BookingViewController() {

	}

	@FXML
	private void initialize() {
		idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
		customerColumn.setCellValueFactory(cellData -> cellData.getValue().getCustomer().fullNameProperty());
		safariColumn
				.setCellValueFactory(cellData -> cellData.getValue().getSafari().getLocation().locationNameProperty());
		dateColumn.setCellValueFactory(cellData -> cellData.getValue().getSafari().getDateProperty());

	}
/**
 * Sets stage, mainapp and the table items
 * @param bookingStage
 * @param mainApp
 */
	public void setBookingStage(Stage bookingStage, MainApp mainApp) {
		this.bookingStage = bookingStage;
		this.mainApp = mainApp;
		bookingTable.setItems(mainApp.getBookingList());

	}

/**
 * Handles the editing of booking. If no booking is marked then ask user to choose
 */
	@FXML
	private void handleEditBooking() {
		Booking selectedBooking = bookingTable.getSelectionModel().getSelectedItem();
		int selectedIndex = bookingTable.getSelectionModel().getSelectedIndex();
		if (selectedBooking != null) {
			boolean okClicked = mainApp.showEditBookingDialog(selectedBooking, "Redigera bokning", false);
			if (okClicked) {
				storage.updateBooking(selectedBooking);
				bookingTable.getColumns().get(0).setVisible(false);
				bookingTable.getColumns().get(0).setVisible(true);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setHeaderText("Inget markerat");
			alert.setContentText("Vänligen välj en bokning som ska redigeras");

			alert.showAndWait();
		}
	}
	
	/**
	 * Handle new booking button
	 */

	@FXML
	private void handleNewBooking() {
		Booking tempBooking = new Booking();
		boolean okClicked = mainApp.showEditBookingDialog(tempBooking, "Ny bokning", false);
		if (okClicked) {
			tempBooking.setId(storage.generateBookingId());
			mainApp.getBookingList().add(tempBooking);
			storage.addBooking(tempBooking);
			mail.sendBookingConfirmation(tempBooking);
			for (Safari s : mainApp.getUpNextSafariList()) {
				if (s.getId() == tempBooking.getSafari().getId()) {
					s.addBookingToList(tempBooking);
					s.setAvalibleSlots(s.getBookedCustomers());
					s.setTakenSlots(s.getBookedCustomers());
				}
			}
		}
	}
	
	/**
	 * Handles delete button
	 */

	@FXML
	private void handleDeleteBooking() {
		int selectedIndex = bookingTable.getSelectionModel().getSelectedIndex();
		Booking booking = bookingTable.getSelectionModel().getSelectedItem();
		if (selectedIndex >= 0) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Bekräfta");
			alert.setHeaderText("Bekräfta borttagning");
			alert.setContentText("Vill du verkligen ta bort bokningen");

			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == ButtonType.OK) {
				bookingTable.getItems().remove(selectedIndex);
				storage.removeBooking(booking);
				for (Safari s : mainApp.getUpNextSafariList()) {
					if (s.getId() == booking.getSafari().getId()) {
						s.removeBookingFromList(booking);
					}
				}
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

	/**
	 *Closing booking stage
	 */
	@FXML
	private void handleDispose() {
		bookingStage.close();
	}
}
