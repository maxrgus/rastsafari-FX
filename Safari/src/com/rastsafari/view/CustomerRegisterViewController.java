package com.rastsafari.view;

import com.rastsafari.MainApp;
import com.rastsafari.model.Customer;
import com.rastsafari.model.CustomerList;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CustomerRegisterViewController {
	@FXML
	private TableView<Customer> customerTable;
	@FXML
	private TableColumn<Customer, Integer> idColumn;
	@FXML
	private TableColumn<Customer, String> ssIdColumn;
	@FXML
	private TableColumn<Customer, String> givenNameColumn;
	@FXML
	private TableColumn<Customer, String> familyNameColumn;
	@FXML
	private TableColumn<Customer, String> emailColumn;
	@FXML
	private TableColumn<Customer, String> phoneColumn;
	
	//Reference the main app
	private MainApp mainApp;
	private CustomerList list;
	
	public CustomerRegisterViewController() {
		list = new CustomerList();
	}
	@FXML
	private void initialize() {
		idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
		ssIdColumn.setCellValueFactory(cellData -> cellData.getValue().pNumberProperty());
		givenNameColumn.setCellValueFactory(cellData -> cellData.getValue().fNameProperty());
		familyNameColumn.setCellValueFactory(cellData -> cellData.getValue().lNameProperty());
		emailColumn.setCellValueFactory(cellData -> cellData.getValue().eMailProperty());
		phoneColumn.setCellValueFactory(cellData -> cellData.getValue().allNumberProperty());
		
	}
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		customerTable.setItems(list.getCustomerList());
	}
	
}
