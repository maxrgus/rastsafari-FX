package com.rastsafari.client.controller;

import java.util.Optional;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.CustomerCategory;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * Controller for Customer Category
 * <p>
 * 
 * @author Team14
 * 
 * 
 *<p>
 */

public class CustomerCategoryController {
	@FXML
	private TableView<CustomerCategory> categoryTable;

	@FXML
	private TableColumn<CustomerCategory, String> categoryName;
	@FXML
	private TableColumn<CustomerCategory, Integer> nrCustomers;
	@FXML
	private TableColumn<CustomerCategory, Double> priceIndex;

	// Reference main app
	private MainApp mainApp;

	private Storage storage = StorageFactory.getStorageDB();

	public CustomerCategoryController() {
	}

	@FXML
	private void initialize() {
		categoryName.setCellValueFactory(cellData -> cellData.getValue().categoryNameProperty());
		priceIndex.setCellValueFactory(cellData -> cellData.getValue().priceIndexProperty().asObject());

	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		categoryTable.setItems(mainApp.getCategoryList());
	}
/**
 * Handles editting customer category. If no customer selected, Alert
 */
	@FXML
	private void handleEditCategory() {
		CustomerCategory selectedCategory = categoryTable.getSelectionModel().getSelectedItem();
		if (selectedCategory != null) {
			boolean okClicked = mainApp.showCategoryEditDialog(selectedCategory);
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("Inget Markerat");
			alert.setHeaderText("Ingen kategori vald");
			alert.setContentText("Vänligen välj en kategori som ska redigeras");

			alert.showAndWait();

		}
	}

	/**
	 * Handles new customer category
	 */
	
	@FXML
	private void handleNewCategory() {
		CustomerCategory tempCategory = new CustomerCategory();
		boolean okClicked = mainApp.showCategoryEditDialog(tempCategory);
		if (okClicked) {
			tempCategory.setId(storage.generateCategoryId());
			mainApp.getCategoryList().add(tempCategory);
			storage.addCustomerCategory(tempCategory);

		}
	}

	/**
	 * Handles deleting customer category. If customer not chosen, Alert
	 */
	@FXML
	private void handleDeleteCategory() {
		int selectedIndex = categoryTable.getSelectionModel().getSelectedIndex();
		CustomerCategory category = categoryTable.getSelectionModel().getSelectedItem();
		if (selectedIndex >= 0) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Bekräfta");
			alert.setHeaderText("Bekräfta borttagning");
			alert.setContentText("Vill du verkligen ta bort denna kategori?");

			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == ButtonType.OK) {
				categoryTable.getItems().remove(selectedIndex);
				storage.removeCustomerCategory(category);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Ingen kategori markerad");
			alert.setContentText("Vänligen markera kategorin du vill raderad");
			alert.showAndWait();
		}
	}

}
