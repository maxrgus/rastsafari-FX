package com.rastsafari.client.controller;

import java.util.Optional;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.Customer;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * 
 * @author Team14
 * <p>
 * View for Customer registration
 * <p>
 * 
 * 
 */
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
	private TableColumn<Customer, String> adressColumn;
	@FXML
	private TableColumn<Customer, String> emailColumn;
	@FXML
	private TableColumn<Customer, String> phoneColumn;
	@FXML
	private TextField filterField;

	// Reference the main app
	private MainApp mainApp;

	private Storage storage = StorageFactory.getStorageDB();
	private SortedList<Customer> customersSorted;
	private ObservableList<Customer> customerList = FXCollections.observableArrayList();

	private boolean isFiltered;

	public CustomerRegisterViewController() {
	}

	@FXML
	private void initialize() {
		idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
		ssIdColumn.setCellValueFactory(cellData -> cellData.getValue().pNumberProperty());
		givenNameColumn.setCellValueFactory(cellData -> cellData.getValue().fNameProperty());
		familyNameColumn.setCellValueFactory(cellData -> cellData.getValue().lNameProperty());
		adressColumn.setCellValueFactory(cellData -> cellData.getValue().adressProperty());
		emailColumn.setCellValueFactory(cellData -> cellData.getValue().eMailProperty());
		phoneColumn.setCellValueFactory(cellData -> cellData.getValue().allNumberProperty());

	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		customerList.addAll(mainApp.getCustomerList());
		customerTable.setItems(customerList);
	}
	/**
	 * Handles searchbar
	 */

	@FXML
	private void handleSearch() {
		// Wrap in a filtered list for filtering.
		FilteredList<Customer> customersFiltered = new FilteredList<>(customerList, p -> true);

		// add listener to filterField
		filterField.textProperty().addListener((observable, oldValue, newValue) -> {
			customersFiltered.setPredicate(customer -> {
				// If filter text is empty, display all customers.
				if (newValue == null || newValue.isEmpty()) {
					isFiltered = true;
					return true;
				}

				String lowerCaseFilter = newValue.toLowerCase();

				if (customer.getFName().toLowerCase().contains(lowerCaseFilter)) {
					isFiltered = true;
					return true;
				} else if (customer.getLName().toLowerCase().contains(lowerCaseFilter)) {
					isFiltered = true;
					return true;
				} else if (customer.getPNumber().toLowerCase().contains(lowerCaseFilter)) {
					isFiltered = true;
					return true;
				} else if (customer.getEMail().toLowerCase().contains(lowerCaseFilter)) {
					isFiltered = true;
					return true;
				}
				isFiltered = true;
				return false; // Does not match
			});
		});
		customersSorted = new SortedList<>(customersFiltered);
		customersSorted.comparatorProperty().bind(customerTable.comparatorProperty());

		customerTable.setItems(customersSorted);
	}
/**
 * Handles edit customer. If no customer chosen. Alert
 */
	@FXML
	private void handleEditCustomer() {
		Customer selectedCustomer = customerTable.getSelectionModel().getSelectedItem();
		if (selectedCustomer != null) {
			boolean okClicked = mainApp.showEditCustomerDialog(selectedCustomer, "Redigera Kund");
			if (okClicked) {
				selectedCustomer.setAllNumber();
				storage.updateCustomer(selectedCustomer);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getCustomerRegisterStage());
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Ingen kund markerad");
			alert.setContentText("V�nligen v�lj en kund som ska redigeras");

			alert.showAndWait();
		}
	}
/**
 * Handles new customer 
 */
	@FXML
	private void handleNewCustomer() {
		Customer tempCustomer = new Customer();
		boolean okClicked = mainApp.showEditCustomerDialog(tempCustomer, "Ny kund");
		if (okClicked) {
//			
//			tempCustomer.setAllNumber();
//			tempCustomer.setFullName();
			tempCustomer.setId(storage.generateCustomerId());
			mainApp.getCustomerList().add(tempCustomer);
			storage.addCustomer(tempCustomer);
			customerTable.setItems(mainApp.getCustomerList());
		}
	}

	/**
	 * Handles delete customer. If no customer chosen. Alert
	 */
	@FXML
	private void handleDeleteCustomer() {
		int selectedIndex = customerTable.getSelectionModel().getSelectedIndex();
		Customer customer = customerTable.getSelectionModel().getSelectedItem();
		if (selectedIndex >= 0) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Bekr�fta");
			alert.setHeaderText("Bekr�fta borttagning");
			alert.setContentText("Vill du verkligen ta bort " + customer.getFName() + " " + customer.getLName() + "?");
			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == ButtonType.OK) {
				// customerTable.getItems().remove(selectedIndex);
				if (isFiltered) {
					int sourceIndex = customersSorted.getSourceIndexFor(customerList, selectedIndex);
					customerList.remove(sourceIndex);
				} else {
					customerTable.getItems().remove(selectedIndex);
				}
				storage.removeCustomer(customer);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getCustomerRegisterStage());
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Ingen kund markerad");
			alert.setContentText("V�nligen markera en kund som du vill radera");

			alert.showAndWait();
		}
	}

	@FXML
	private void handleBackButton() {
		mainApp.getCustomerRegisterStage().close();
	}

}
