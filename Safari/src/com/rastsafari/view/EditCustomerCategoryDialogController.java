package com.rastsafari.view;

import java.awt.TextField;

import com.rastsafari.model.CustomerCategory;
import com.rastsafari.model.CustomerMaintenance;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
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
	

	@FXML
	private void handleOK(){
		
	}
	
	/*private boolean isInputValid(){
		String errorMessage = "";
		if(categoryNameField.get)
	}**/
	
	

}
