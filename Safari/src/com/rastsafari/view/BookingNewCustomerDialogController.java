package com.rastsafari.view;

import com.rastsafari.model.Customer;
import com.rastsafari.storage.Storage;
import com.rastsafari.storage.StorageFactory;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class BookingNewCustomerDialogController {

	@FXML
	private Label headerLabel;
	@FXML
	private TextField givenNameField;
	@FXML
	private TextField familyNameField;
	@FXML
	private TextField pNumberField;
	@FXML
	private TextField emailField;
	@FXML
	private TextField phoneDayField;
	@FXML
	private TextField phoneNightField;
	@FXML
	private ComboBox<Integer> categoryBox;

	// Reference owner stage
	private Stage customerRegisterStage;

	private Customer customer;
	private boolean okClicked;
	private Storage storage = StorageFactory.getStorageDB();

	public BookingNewCustomerDialogController() {

	}

	@FXML
	private void initialize() {
		categoryBox.getItems().addAll(1, 2, 3, 4);

	}

	public void setHeaderLabel(String label) {
		headerLabel.setText(label);
	}

	public boolean isOkClicked() {
		return okClicked;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setStage(Stage customerRegisterStage) {
		this.customerRegisterStage = customerRegisterStage;
	}

	@FXML
	private void handleOk() {
		if (isInputValid()) {
			customer = new Customer();
			customer.setId(0);
			customer.setFName(givenNameField.getText());
			customer.setLName(familyNameField.getText());
			customer.setPNumber(pNumberField.getText());
			customer.setDNumber(phoneDayField.getText());
			customer.setNNumber(phoneNightField.getText());
			customer.setEMail(emailField.getText());
			customer.setCategory(categoryBox.getValue());
			customer.setAllNumber();
			customer.setFullName();
			okClicked = true;
			customerRegisterStage.close();

		}
	}

	@FXML
	private void handleCancel() {
		customerRegisterStage.close();
	}

	private boolean isInputValid() {
		String errorMessage = "";
		if (givenNameField.getText() == null || givenNameField.getText().length() == 0) {
			errorMessage += "F�rnamn �r inte ifyllt!\n";
		}
		if (familyNameField.getText() == null || familyNameField.getText().length() == 0) {
			errorMessage += "Efternamn �r inte ifyllt!\n";
		}
		if (pNumberField.getText() == null || pNumberField.getText().length() == 0) {
			errorMessage += "Personnummer �r inte ifyllt!\n";
		}
		if (emailField.getText() == null || emailField.getText().length() == 0) {
			errorMessage += "Email �r inte ifyllt!\n";
		}
		if (phoneDayField.getText() == null || phoneDayField.getText().length() == 0) {
			errorMessage += "Telefonnummer dagtid �r inte ifyllt!\n";
		}
		if (phoneNightField.getText() == null || phoneNightField.getText().length() == 0) {
			errorMessage += "Telefonnummer kv�llstid �r inte ifyllt!\n";
		}
		if (errorMessage.length() == 0) {
			return true;
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(customerRegisterStage);
			alert.setTitle("Felaktig inmatning");
			alert.setHeaderText("V�nligen fyll i f�lten");
			alert.setContentText(errorMessage);

			alert.showAndWait();

			return false;
		}
	}
}
