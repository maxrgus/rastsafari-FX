package com.rastsafari.view;

import java.util.Optional;

import com.rastsafari.MainApp;
import com.rastsafari.model.CustomerCategory;
import com.rastsafari.model.CustomerCategoryList;
import com.rastsafari.model.CustomerMaintenance;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CustomerCategoryController {
	@FXML
	private TableView<CustomerCategory> categoryTable;

	@FXML
	private TableColumn<CustomerCategory, String> categoryName;
	@FXML
	private TableColumn<CustomerCategory, Integer> nrCustomers;
	@FXML
	private TableColumn<CustomerCategory, Double> priceIndex;
	
	//Reference main app
	private MainApp mainApp; 
	
	// Reference CustomerMaintenance
	private CustomerMaintenance maintenance = new CustomerMaintenance();
	
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
	@FXML
	private void handleEditCategory(){
		CustomerCategory selectedCategory = categoryTable.getSelectionModel().getSelectedItem();
		if(selectedCategory != null){
			boolean okClicked = mainApp.showCategoryEditDialog(selectedCategory);
		}else{ 
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("Inget Markerat");
			alert.setHeaderText("Ingen kategori vald");
			alert.setContentText("Vänligen välj en kategori som sak redigeras");
			
			alert.showAndWait();
				
			}
		}
	@FXML
	private void handleNewCategory(){
		CustomerCategory tempCategory = new CustomerCategory();
		boolean okClicked = mainApp.showCategoryEditDialog(tempCategory);
		if(okClicked) {
			tempCategory.setId(maintenance.generateCategoryId());
			mainApp.getCategoryList().add(tempCategory); 
			maintenance.insertCategoryInDb(tempCategory);
			
		}
	}
	
	@FXML
	private void handleDeleteCategory(){
		int selectedIndex = categoryTable.getSelectionModel().getSelectedIndex();
		CustomerCategory category = categoryTable.getSelectionModel().getSelectedItem();
		if(selectedIndex >= 0) {
			Alert alert = new Alert(AlertType.CONFIRMATION); 
			alert.setTitle("Bekräfta");
			alert.setHeaderText("Bekräfta borttagning");
			alert.setContentText("Vill du verkligen ta bort denna kategori?");
			
			Optional<ButtonType> result = alert.showAndWait();
			if(result.get() == ButtonType.OK){
				categoryTable.getItems().remove(selectedIndex); 
				maintenance.removeCategoryFromDB(category.getId());
			}
		} else{
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Ingen kategori markerad");
			alert.setContentText("Vänligen markera kategorin du vill raderad");
			alert.showAndWait();
		}
	}
	
	
	}
	

