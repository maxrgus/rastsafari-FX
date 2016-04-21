package com.rastsafari.view;


import com.rastsafari.model.CustomerCategory;
import com.rastsafari.model.CustomerMaintenance;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditCustomerCategoryDialogController {
	@FXML
	private TextField categoryNameField;
	@FXML
	private TextField priceIndexField;
	
	private Stage categoryStage;
	private CustomerCategory category;
	private CustomerMaintenance maintenance = new CustomerMaintenance();
	private boolean okClicked = false;
	
	@FXML
	private void initialize(){} 
	
	public void setCategoryStage(Stage categoryStage){
		this.categoryStage = categoryStage;
	}
	
	public void setCategory(CustomerCategory category){
		this.category = category; 
		
		categoryNameField.setText(category.getCategoryName());
		priceIndexField.setText(String.valueOf(category.getPriceIndex()));
			
	} 
	
	public boolean isOkClicked(){
		return okClicked;
	}

	@FXML
	private void handleOK(){
		if(isInputValid()){
			category.setCategoryName(categoryNameField.getText());
			category.setPriceIndex(Double.parseDouble(priceIndexField.getText()));	
			
			okClicked = true;
			maintenance.updateCategoryInDb(category);
			categoryStage.close();
			}
	}
	
	@FXML
	private void handleCancel(){
		categoryStage.close();
	}
	
	private boolean isInputValid(){
		String errorMessage = "";
		if(categoryNameField.getText() == null || categoryNameField.getText().length() == 0) {
			errorMessage += "Kategori är inte ifyllt!\n"; 
		} // Validering för siffra måste tilläggas
		if(priceIndexField.getText() == null || priceIndexField.getText().length() == 0 ) {
			errorMessage += "PrisIndex är inte ifyllt!\n";
		}
		
		if(errorMessage.length() == 0){
			return true;
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(categoryStage);
			alert.setTitle("Felaktig inmatning");
			alert.setHeaderText("Vänligen fyll i fälten");
			alert.setContentText(errorMessage);
			
			alert.showAndWait();
			return false;
		}
	}
	
	

}
