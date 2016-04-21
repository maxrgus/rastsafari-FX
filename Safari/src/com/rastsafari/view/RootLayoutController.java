package com.rastsafari.view;

import com.rastsafari.MainApp;

import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

public class RootLayoutController {
	
	@FXML
	private MenuBar topMenu;
	@FXML
	private Menu file;
	@FXML
	private Menu customer;
	@FXML
	private Menu help;
	
	//Reference the main app
	private MainApp mainApp;
	
	public RootLayoutController(){
		
		
	}
	@FXML
	private void initialize(){
		
	}
	
	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
		
	}
	@FXML
	private void handleFileExit(){
		System.exit(1);
	}
	@FXML
	private void handleCustomerRegister(){
		mainApp.showCustomerRegisterView();
	}
	@FXML
	private void handleCustomerCategory(){
		mainApp.showCustomerCategoryView();
	}
	
	

}
