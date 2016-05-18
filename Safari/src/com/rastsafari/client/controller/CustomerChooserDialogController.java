package com.rastsafari.client.controller;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

/**
 * 
 * @author Team14
 * <p>
 * Dialog for choosing customer controller
 * <p>
 */
public class CustomerChooserDialogController {
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
	@FXML
	private TextField filterField;

	// Reference the main app
	private MainApp mainApp;

	private SortedList<Customer> customersSorted;
	private ObservableList<Customer> customerList = FXCollections.observableArrayList();
	private Customer customer;

	private boolean isFiltered;
	private boolean okClicked;

	public CustomerChooserDialogController() {

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
		customerList.addAll(mainApp.getCustomerList());
		customerTable.setItems(customerList);
	}

	public Customer getCustomer() {
		return customer;
	}

	public boolean isOkClicked() {
		return okClicked;
	}
	
	/**
	 * Handles ok button. If customer no choosen. Alert
	 */

	@FXML
	private void handleOk() {
		int selectedIndex = customerTable.getSelectionModel().getSelectedIndex();
		if (selectedIndex >= 0) {
			customer = customerTable.getSelectionModel().getSelectedItem();
			okClicked = true;
			mainApp.getCustomerRegisterStage().close();
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getCustomerRegisterStage());
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Ingen kund markerad");
			alert.setContentText("Vänligen markera en kund som du vill boka");

			alert.showAndWait();
		}
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

	@FXML
	private void handleBackButton() {
		mainApp.getCustomerRegisterStage().close();
	}

}
