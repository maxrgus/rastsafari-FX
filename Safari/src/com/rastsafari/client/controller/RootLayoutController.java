package com.rastsafari.client.controller;

import com.rastsafari.MainApp;

import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
/**
 * Controller for the root layout
 * <p>
 * @author Team14
 * 
 *
 */
public class RootLayoutController {

	@FXML
	private MenuBar topMenu;
	@FXML
	private Menu file;
	@FXML
	private Menu customer;
	@FXML
	private Menu help;

	// Reference the main app
	private MainApp mainApp;

	public RootLayoutController() {

	}

	@FXML
	private void initialize() {

	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

	}

	@FXML
	private void handleFileExit() {
		System.exit(1);
	}
/**
 * When button is pressed. It takes the user to customer register
 */
	@FXML
	private void handleCustomerRegister() {
		mainApp.showCustomerRegisterView();
	}
/**
 * When the button is pressed. It takes the user to the customer category
 */
	@FXML
	private void handleCustomerCategory() {
		mainApp.showCustomerCategoryView();
	}
/**
 * When the button is pressed. It takes the user to the report generate
 */
	@FXML
	private void handleGenerateReport() {
		mainApp.showGenereateReportView();
	}
/**
 * When the button is pressed. It takes the user to the gear view
 */
	@FXML
	private void handleGearView() {
		mainApp.showGearListView();
	}
	/**
	 * When the button is pressed. It takes the user to the guide view
	 */

	@FXML
	private void handleGuideView() {
		mainApp.showGuideView();
	}

}
