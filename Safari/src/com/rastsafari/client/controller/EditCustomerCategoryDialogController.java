package com.rastsafari.client.controller;

import com.rastsafari.server.model.CustomerCategory;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controller for editing customer category
 * <p>
 * 
 * @author Team14
 *
 *
 *
 */

public class EditCustomerCategoryDialogController {
	@FXML
	private TextField categoryNameField;
	@FXML
	private TextField priceIndexField;

	private Stage categoryStage;
	private CustomerCategory category;
	private Storage storage = StorageFactory.getStorageDB();
	private boolean okClicked = false;

	@FXML
	private void initialize() {
	}

	public void setCategoryStage(Stage categoryStage) {
		this.categoryStage = categoryStage;
	}

	public void setCategory(CustomerCategory category) {
		this.category = category;

		categoryNameField.setText(category.getCategoryName());
		priceIndexField.setText(String.valueOf(category.getPriceIndex()));

	}

	public boolean isOkClicked() {
		return okClicked;
	}

	@FXML
	private void handleOK() {
		if (isInputValid()) {
			category.setCategoryName(categoryNameField.getText());
			category.setPriceIndex(Double.parseDouble(priceIndexField.getText()));

			okClicked = true;
			storage.updateCustomerCategory(category);
			categoryStage.close();
		}
	}

	@FXML
	private void handleCancel() {
		categoryStage.close();
	}
/**
 * 
 * Method if the input is valid. If everyting is not filled, errormessage appears. 
 * @return
 */
	private boolean isInputValid() {
		String errorMessage = "";
		if (categoryNameField.getText() == null || categoryNameField.getText().length() == 0) {
			errorMessage += "Kategori ‰r inte ifyllt!\n";
		} // Validering f√∂r siffra m√•ste till√§ggas
		if (priceIndexField.getText() == null || priceIndexField.getText().length() == 0) {
			errorMessage += "PrisIndex ‰r inte ifyllt!\n";
		}

		if (errorMessage.length() == 0) {
			return true;
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(categoryStage);
			alert.setTitle("Felaktig inmatning");
			alert.setHeaderText("V‰nligen fyll i f‰lten");
			alert.setContentText(errorMessage);

			alert.showAndWait();
			return false;
		}
	}

}
