package com.rastsafari;

import java.io.IOException;

import com.rastsafari.model.SafariLocation;
import com.rastsafari.view.CustomerCategoryController;
import com.rastsafari.view.LocationEditDialogController;
import com.rastsafari.view.LocationMapController;
import com.rastsafari.view.MainFrameController;
import com.rastsafari.view.SafariLocationViewController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private Stage primaryStage;
	private Stage dialogStage;
	private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Rastsafari");
		
		// Set app icon
		this.primaryStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
		
		initRootLayout();
		showMainFrame();
		showCustomerCategoryView();
				
	}
	/**
	 * Init the root layout
	 * 
	 */
	public void initRootLayout() {
		try {
			//Load root layout from fxml file.
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) uiLoader.load();
			
			// Show the scene
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Show the main frame.
	 * 
	 */
	public void showMainFrame() {
		try {
			//Load main frame
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/MainFrame.fxml"));
			AnchorPane mainFrame = (AnchorPane) uiLoader.load();
			
			// Acess to controller
			MainFrameController controller = uiLoader.getController();
			controller.setMainApp(this);
			
			// Set to center
			rootLayout.setCenter(mainFrame);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showSafariLocationView() {
		try {
			//Load SafariLocationView.fxml
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/SafariLocationView.fxml"));
			AnchorPane safariLocationView = (AnchorPane) uiLoader.load();
			
			//Create dialog stage
			dialogStage = new Stage();
			dialogStage.setTitle("Safarimål");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initOwner(primaryStage);
			Scene scene = new Scene(safariLocationView);
			dialogStage.setScene(scene);
			
			// Set the location into the controller.
			SafariLocationViewController controller = uiLoader.getController();
			controller.setDialogStage(dialogStage,this);
			
			// Show the dialog and wait until user closes it
			dialogStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showLocationMapDialog(String location) {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/LocationMapDialog.fxml"));
			AnchorPane mapDialog = (AnchorPane) uiLoader.load();
			
			Stage mapStage = new Stage();
			mapStage.setTitle("Karta");
			mapStage.initModality(Modality.WINDOW_MODAL);
			mapStage.initOwner(dialogStage);
			Scene scene = new Scene(mapDialog);
			mapStage.setScene(scene);
			
			LocationMapController controller = uiLoader.getController();
			controller.setUrl(location);
			controller.setDialogStage(mapStage);
			
			
			mapStage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public boolean showLocationEditDialog(SafariLocation location) {
		try {
			//Load LocationEditDialogController.fxml
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/LocationEditDialog.fxml"));
			AnchorPane editDialog = (AnchorPane) uiLoader.load();
			
			//Create dialog stage
			Stage editStage = new Stage();
			editStage.setTitle("Redigera Safarimål");
			editStage.initModality(Modality.WINDOW_MODAL);
			editStage.initOwner(dialogStage);
			Scene scene = new Scene(editDialog);
			editStage.setScene(scene);
			
			//Load the controller
			LocationEditDialogController controller = uiLoader.getController();
			controller.setDialogStage(editStage);
			controller.setSafariLocation(location);
			
			//Show the dialog and wait until close.
			editStage.showAndWait();
			
			return controller.isOkClicked();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	public void showCustomerCategoryView() {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/CustomerCategoryView.fxml"));
			AnchorPane categoryView = (AnchorPane) uiLoader.load();
			
			Stage categoryStage = new Stage();
			categoryStage.setTitle("Kundkategorier");
			categoryStage.initModality(Modality.WINDOW_MODAL);
			categoryStage.initOwner(dialogStage);
			Scene scene = new Scene(categoryView);
			categoryStage.setScene(scene);
			
			CustomerCategoryController controller = uiLoader.getController();
			controller.setMainApp(this);
			
			categoryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * Returns the main stage.
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
