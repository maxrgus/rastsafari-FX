package com.rastsafari.client.controller;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.Customer;
import com.rastsafari.server.model.CustomerCategory;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.util.StringConverter;

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
	private TextField adressField;
	@FXML
	private TextField phoneDayField;
	@FXML
	private TextField phoneNightField;
	@FXML
	private ComboBox<CustomerCategory> categoryBox;

	// Reference owner stage
	private Stage customerRegisterStage;
	
	private MainApp mainApp;
	private Customer customer;
	private boolean okClicked;
	private Storage storage = StorageFactory.getStorageDB();

	public BookingNewCustomerDialogController() {
	}

	@FXML
	private void initialize() {

	}
	public void setCategoryBox() {
		categoryBox.getItems().addAll(mainApp.getCategoryList());
		categoryBox.setConverter(new StringConverter<CustomerCategory>() {
			@Override
			public String toString(CustomerCategory cc) {
				if (cc == null) {
					return "";
				} else {
					return cc.getCategoryName();
				}
			}

			@Override
			public CustomerCategory fromString(String string) {
				return null;
			}
		});
	}

	public void setHeaderLabel(String label) {
		headerLabel.setText(label);
	}
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
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
			customer.setAdress(adressField.getText());
			customer.setCategory(categoryBox.getValue().getId());
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
		if (adressField.getText() == null || adressField.getText().length() == 0) {
			errorMessage += "Adress �r inte ifyllt!\n";
		}
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\" + "@([\\w]+\\.)+[\\w]+[\\w]$";
		boolean emailMatch = emailField.getText().matches(EMAIL_REGEX);
		if (!emailMatch) {
			errorMessage += "Email �r inte i r�tt format";
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
