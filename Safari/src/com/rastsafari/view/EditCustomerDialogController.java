package com.rastsafari.view;

import com.rastsafari.model.Customer;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
	private TextField emailField;
	@FXML
	private TextField phoneDayField;
	@FXML
	private TextField phoneNightField;
	@FXML
	private ComboBox<Integer> categoryBox;
	
	//Reference owner stage
	private Stage customerRegisterStage;
	
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
		phoneDayField.setText(customer.getDNumber());
		phoneNightField.setText(customer.getNNumber());
		categoryBox.getItems().addAll(1,2,3,4);
		categoryBox.setValue(customer.getCategory());
		
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
			customer.setPNumber(pNumberField.getText());
			customer.setEMail(emailField.getText());
			customer.setDNumber(phoneDayField.getText());
			customer.setNNumber(phoneNightField.getText());
			customer.setCategory(categoryBox.getValue());
			
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
			errorMessage += "Förnamn är inte ifyllt!\n";
		}
		if (familyNameField.getText() == null || familyNameField.getText().length() == 0) {
			errorMessage += "Efternamn är inte ifyllt!\n";
		}
		if (pNumberField.getText() == null || pNumberField.getText().length() == 0) {
			errorMessage += "Personnummer är inte ifyllt!\n";
		}
		if (emailField.getText() == null || emailField.getText().length() == 0) {
			errorMessage += "Email är inte ifyllt!\n";
		}
		if (phoneDayField.getText() == null || phoneDayField.getText().length() == 0) {
			errorMessage += "Telefonnummer dagtid är inte ifyllt!\n";
		}
		if (phoneNightField.getText() == null || phoneNightField.getText().length() == 0) {
			errorMessage += "Telefonnummer kvällstid är inte ifyllt!\n";
		}
		if (errorMessage.length() == 0) {
			return true;
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(customerRegisterStage);
			alert.setTitle("Felaktig inmatning");
			alert.setHeaderText("Vänligen fyll i fälten");
			alert.setContentText(errorMessage);
			
			alert.showAndWait();
			
			return false;
		}
	}
}
