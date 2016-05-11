package com.rastsafari.client.controller;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.Booking;
import com.rastsafari.server.model.Customer;
import com.rastsafari.server.model.Safari;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class BookingDialogController {
	@FXML
	private Label headerLabel;
	@FXML
	private ComboBox<Safari> safariBox;
	@FXML
	private TextField customerField;

	// Reference main app and stage
	private MainApp mainApp;
	private Stage bookingStage;
	private Storage storage = StorageFactory.getStorageDB();

	private Booking booking;
	private boolean okClicked;
	private boolean customerExists;
	private Customer customer;

	public BookingDialogController() {

	}

	@FXML
	private void initialize() {

	}

	public void setBooking(Booking booking) {
		this.booking = booking;
		this.customer = booking.getCustomer();

		safariBox.getItems().addAll(mainApp.getSafariList());
		safariBox.setValue(booking.getSafari());
		safariBox.setConverter(new StringConverter<Safari>() {
			@Override
			public String toString(Safari s) {
				if (s == null) {
					return "";
				} else {
					return s.getDate() + " " + s.getLocation().getLocationName() + " "
							+ s.getLocation().getDescription();
				}
			}

			@Override
			public Safari fromString(String string) {
				return null;
			}
		});
		if (booking.getCustomer() != null) {
			customerField.setText(Integer.toString(booking.getCustomer().getid()) + " "
					+ booking.getCustomer().getFName() + " " + booking.getCustomer().getLName());
		}

	}

	public void setStage(Stage bookingStage) {
		this.bookingStage = bookingStage;
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	public void setHeaderLabel(String label) {
		headerLabel.setText(label);
	}

	public boolean isOkClicked() {
		return okClicked;
	}

	@FXML
	private void handleOk() {
		if (safariBox.getValue() != null && customer != null) {
			booking.setSafari(safariBox.getValue());
			booking.setCustomer(customer);
			if (!customerExists) {
				storage.addCustomer(customer);
			}
			okClicked = true;
			bookingStage.close();
		} else {
			System.out.println("logg");
		}

	}

	@FXML
	private void handleCancel() {
		bookingStage.close();
	}

	@FXML
	private void handleSearchCustomer() {
		this.customer = mainApp.showCustomerChooserDialog();
		if (customer != null) {
			customerField.setText(
					Integer.toString(customer.getid()) + " " + customer.getFName() + " " + customer.getLName());
			customerExists = true;
		}
	}

	@FXML
	private void handleNewCustomer() {
		this.customer = mainApp.showBookingNewCustomerDialog("Ny kund");
		if (customer != null) {
			customer.setId(storage.generateCustomerId());
			customerField.setText(
					Integer.toString(customer.getid()) + " " + customer.getFName() + " " + customer.getLName());
			customerExists = false;
		}

	}

}
