package com.rastsafari.view;

import com.rastsafari.MainApp;
import com.rastsafari.model.Booking;
import com.rastsafari.model.Customer;
import com.rastsafari.model.Safari;

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
	
	private Booking booking;
	private boolean okClicked;
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
					return s.getDate() + " " + s.getLocation().getLocationName() + " " + s.getLocation().getDescription();
				}
			}
			@Override
			public Safari fromString(String string) {
				return null;
			}
		});
		if (booking.getCustomer() != null) {
			customerField.setText(Integer.toString(booking.getCustomer().getid()) + " " + booking.getCustomer().getFName() + 
							  " " + booking.getCustomer().getLName());
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
		booking.setSafari(safariBox.getValue());
		booking.setCustomer(customer);
		
		okClicked = true;
		bookingStage.close();
	}
	@FXML
	private void handleCancel() {
		bookingStage.close();
	}
	@FXML
	private void handleSearchCustomer() {
	}
	@FXML
	private void handleNewCustomer() {
		
	}

}
