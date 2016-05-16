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

/**
 * Controller for the Booking dialog. 
 * <p>
 * It is either for creating a new booking
 * or editing an existing one
 * <p>
 * FXML : BookingDialogView.fxml
 * @author Team14
 *
 */

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
	/**
	 * Sets the fields to the provided booking
	 * if new, sets to null.
	 * @param booking
	 */
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
	/**
	 * Sets the stage for ownership
	 * @param bookingStage
	 */
	public void setStage(Stage bookingStage) {
		this.bookingStage = bookingStage;
	}
	/**
	 * Sets the Main app for reference
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	/**
	 * Sets the headerlabel, new or edit.
	 * @param label
	 */
	public void setHeaderLabel(String label) {
		headerLabel.setText(label);
	}
	/**
	 * Returns true if user clicked "OK"
	 * @return
	 */
	public boolean isOkClicked() {
		return okClicked;
	}
	/**
	 * Handle if users clicks ok. 
	 */
	@FXML
	private void handleOk() {
		if (safariBox.getValue() != null && customer != null) {
			booking.setSafari(safariBox.getValue());
			booking.setCustomer(customer);
			if (!customerExists) {
				storage.addCustomer(customer);
				mainApp.getCustomerList().add(customer);
			}
			okClicked = true;
			bookingStage.close();
		} else {
			System.out.println("logg");
		}

	}
	/**
	 * Handle if user clicks cancel
	 */
	@FXML
	private void handleCancel() {
		bookingStage.close();
	}
	/**
	 * Handle the if the users wants to search for a customer.
	 */
	@FXML
	private void handleSearchCustomer() {
		this.customer = mainApp.showCustomerChooserDialog();
		if (customer != null) {
			customerField.setText(
					Integer.toString(customer.getid()) + " " + customer.getFName() + " " + customer.getLName());
			customerExists = true;
		}
	}
	/**
	 * Handle if the users wants to add a new customer
	 */
	@FXML
	private void handleNewCustomer() {
		this.customer = mainApp.showBookingNewCustomerDialog("Ny kund");
		if (customer != null) {
			customerField.setText(
					Integer.toString(customer.getid()) + " " + customer.getFName() + " " + customer.getLName());
			customerExists = false;
		}

	}

}
