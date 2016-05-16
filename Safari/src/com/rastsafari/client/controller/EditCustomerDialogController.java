package com.rastsafari.client.controller;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.Customer;
import com.rastsafari.server.model.CustomerCategory;
import com.rastsafari.server.model.Safari;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class EditCustomerDialogController {

	@FXML
	private Label headerLabel;
	@FXML
	private TextField givenNameField;
	@FXML
	private TextField familyNameField;
	@FXML
	private TextField pNumberField;
	@FXML
	private TextField adressField;
	@FXML
	private TextField emailField;
	@FXML
	private TextField phoneDayField;
	@FXML
	private TextField phoneNightField;
	@FXML
	private ComboBox<CustomerCategory> categoryBox;

	// Reference owner stage
	private MainApp mainApp;
	private Stage customerRegisterStage;
	private Storage storage = StorageFactory.getStorageDB();

	private Customer customer;
	private boolean okClicked;

	public EditCustomerDialogController() {

	}

	@FXML
	private void initialize() {

	}

	public void setCustomer(Customer customer) {
		this.customer = customer;

		givenNameField.setText(customer.getFName());
		familyNameField.setText(customer.getLName());
		pNumberField.setText(customer.getPNumber());
		emailField.setText(customer.getEMail());
		adressField.setText(customer.getAdress());
		phoneDayField.setText(customer.getDNumber());
		phoneNightField.setText(customer.getNNumber());
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
		for (CustomerCategory cc : mainApp.getCategoryList()) {
			if (customer.getCategory() == cc.getId()) {
				categoryBox.setValue(cc);
			}
		}
		

	}
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	public void setStage(Stage customerRegisterStage) {
		this.customerRegisterStage = customerRegisterStage;
	}

	public void setHeaderLabel(String label) {
		headerLabel.setText(label);
	}

	public boolean isOkClicked() {
		return okClicked;
	}

	@FXML
	private void handleOk() {
		if (isInputValid()) {
			customer.setFName(givenNameField.getText());
			customer.setLName(familyNameField.getText());
			customer.setFullName();
			customer.setPNumber(pNumberField.getText());
			customer.setEMail(emailField.getText());
			customer.setAdress(adressField.getText());
			customer.setDNumber(phoneDayField.getText());
			customer.setNNumber(phoneNightField.getText());
			customer.setAllNumber();
			customer.setCategory(categoryBox.getValue().getId());

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
		boolean emailFilled = true;
		boolean emailMatch = true;
		if (givenNameField.getText() == null || givenNameField.getText().length() == 0) {
			errorMessage += "Fï¿½rnamn ï¿½r inte ifyllt!\n";
		}
		if (familyNameField.getText() == null || familyNameField.getText().length() == 0) {
			errorMessage += "Efternamn ï¿½r inte ifyllt!\n";
		}
		if (pNumberField.getText() == null || pNumberField.getText().length() == 0) {
			errorMessage += "Personnummer ï¿½r inte ifyllt!\n";
		}
		if (adressField.getText() == null || adressField.getText().length() == 0) {
			errorMessage += "Adress är inte ifyllt\n";
		}
		if (emailField.getText() == null || emailField.getText().length() == 0) {
			errorMessage += "Email ï¿½r inte ifyllt!\n";
			emailFilled = false;
		}
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\" + "@([\\w]+\\.)+[\\w]+[\\w]$";
		if (emailFilled) {
			emailMatch = emailField.getText().matches(EMAIL_REGEX);
		}
		if (!emailMatch) {
			errorMessage += "Email ï¿½r inte i rï¿½tt format";
		}
		if (phoneDayField.getText() == null || phoneDayField.getText().length() == 0) {
			errorMessage += "Telefonnummer dagtid ï¿½r inte ifyllt!\n";
		}
		if (phoneNightField.getText() == null || phoneNightField.getText().length() == 0) {
			errorMessage += "Telefonnummer kvï¿½llstid ï¿½r inte ifyllt!\n";
		}
		if (errorMessage.length() == 0) {
			return true;
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(customerRegisterStage);
			alert.setTitle("Felaktig inmatning");
			alert.setHeaderText("Vï¿½nligen fyll i fï¿½lten");
			alert.setContentText(errorMessage);

			alert.showAndWait();

			return false;
		}
	}
}
