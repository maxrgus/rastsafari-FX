package com.rastsafari.view;

import com.rastsafari.MainApp;
import com.rastsafari.model.CustomerCategory;
import com.rastsafari.model.CustomerCategoryList;

import javafx.fxml.FXML;
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
	private CustomerCategoryList list;
	
	public CustomerCategoryController() {
		list = new CustomerCategoryList();
	}
	@FXML
	private void initialize() {
		categoryName.setCellValueFactory(cellData -> cellData.getValue().categoryNameProperty());
		priceIndex.setCellValueFactory(cellData -> cellData.getValue().priceIndexProperty().asObject());
		 
	}
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		categoryTable.setItems(list.getCustomerCategoryList());
	}
	
}
