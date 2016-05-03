package com.rastsafari;

import java.io.IOException;

import com.rastsafari.model.Customer;
import com.rastsafari.model.CustomerCategory;
import com.rastsafari.model.Gear;
import com.rastsafari.model.SafariLocation;
import com.rastsafari.storage.Storage;
import com.rastsafari.storage.StorageFactory;
import com.rastsafari.view.BookingViewController;
import com.rastsafari.view.CustomerCategoryController;
import com.rastsafari.view.CustomerRegisterViewController;
import com.rastsafari.view.EditCustomerCategoryDialogController;
import com.rastsafari.view.EditCustomerDialogController;
import com.rastsafari.view.GearViewController;
import com.rastsafari.view.GenerateReportViewController;
import com.rastsafari.view.LocationEditDialogController;
import com.rastsafari.view.LocationMapController;
import com.rastsafari.view.MainFrameController;
import com.rastsafari.view.RootLayoutController;
import com.rastsafari.view.SafariLocationViewController;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainApp extends Application {
	
	private Stage primaryStage;
	private Stage bootStage;
	private Stage dialogStage;
	private Stage bookingStage;
	private Stage categoryStage;
	private Stage customerRegisterStage;
	private BorderPane rootLayout;
	
	private ObservableList<Customer> customerList = FXCollections.observableArrayList();
	private ObservableList<CustomerCategory> categoryList = FXCollections.observableArrayList();
	private ObservableList<SafariLocation> locationList = FXCollections.observableArrayList();
	private ObservableList<Gear> gearList = FXCollections.observableArrayList();
	
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Rastsafari");
		
		// Set app icon
		this.primaryStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
		
		initSystem();
		initRootLayout();
		showMainFrame();
		
				
	}
	private void initSystem() {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/BootView.fxml"));
			AnchorPane bootLayout = (AnchorPane) uiLoader.load();
			Scene scene = new Scene(bootLayout);
			bootStage = new Stage();
			bootStage.setScene(scene);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Task<Void> sleeper = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				try {
					Storage s = StorageFactory.getStorageDB();
					customerList.addAll(s.getCustomersFromStorage());
					categoryList.addAll(s.getCategoriesFromStorage());
					locationList.addAll(s.getLocationsFromStorage());
					gearList.addAll(s.getGearFromStorage());
					Thread.sleep(2500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return null;
			}
		};
		sleeper.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
			@Override
			public void handle(WorkerStateEvent event) {
				bootStage.hide();
				
			}
		});
		new Thread(sleeper).start();
		bootStage.initStyle(StageStyle.UNDECORATED);
		bootStage.showAndWait();
		
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
			
			RootLayoutController controller = uiLoader.getController();
			controller.setMainApp(this);
			
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
			dialogStage.setTitle("Safarim�l");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initOwner(primaryStage);
			Scene scene = new Scene(safariLocationView);
			dialogStage.setScene(scene);
			
			// Set the location into the controller.
			SafariLocationViewController controller = uiLoader.getController();
			controller.setDialogStage(dialogStage,this);
			
			// Show the dialog and wait until user closes it
			dialogStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			dialogStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showBookingView(){
		try {
			//Load BookingView.fxml
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/BookingView.fxml"));
			AnchorPane bookingView = (AnchorPane) uiLoader.load();
			
			//Create dialog stage
			bookingStage = new Stage();
			bookingStage.setTitle("Bokning");
			bookingStage.initModality(Modality.WINDOW_MODAL);
			bookingStage.initOwner(primaryStage);
			Scene scene = new Scene(bookingView);
			bookingStage.setScene(scene);
			
			// Set the location into the controller.
			BookingViewController controller = uiLoader.getController();
			controller.setBookingStage(bookingStage,this);
			
			// Show the dialog and wait until user closes it
			bookingStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			bookingStage.show();
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
			
			mapStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
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
			editStage.setTitle("Redigera Safarim�l");
			editStage.initModality(Modality.WINDOW_MODAL);
			editStage.initOwner(dialogStage);
			Scene scene = new Scene(editDialog);
			editStage.setScene(scene);
			
			//Load the controller
			LocationEditDialogController controller = uiLoader.getController();
			controller.setDialogStage(editStage);
			controller.setSafariLocation(location);
			
			//Show the dialog and wait until close.
			editStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
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
			
			categoryStage = new Stage();
			categoryStage.setTitle("Kundkategorier");
			categoryStage.initModality(Modality.WINDOW_MODAL);
			categoryStage.initOwner(dialogStage);
			Scene scene = new Scene(categoryView);
			categoryStage.setScene(scene);
			
			CustomerCategoryController controller = uiLoader.getController();
			controller.setMainApp(this);
			
			categoryStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			categoryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public boolean showCategoryEditDialog(CustomerCategory category){
		try{
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/EditCustomerCategoryDialog.fxml"));
			AnchorPane editCategory = (AnchorPane) uiLoader.load();
			
			Stage editStage = new Stage();
			editStage.setTitle("Redigera kategori");
			editStage.initModality(Modality.WINDOW_MODAL);
			editStage.initOwner(categoryStage);
			Scene scene = new Scene(editCategory);
			editStage.setScene(scene);
			
			EditCustomerCategoryDialogController controller = uiLoader.getController();
			controller.setCategoryStage(editStage); 
			controller.setCategory(category);
			
			editStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			editStage.showAndWait();
			
			return controller.isOkClicked();
		}catch(IOException se){
			se.printStackTrace();
			return false;		
			
		}
		
	}
	public void showCustomerRegisterView() {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/CustomerRegisterView.fxml"));
			BorderPane customerRegisterView = (BorderPane) uiLoader.load();
			
			customerRegisterStage = new Stage();
			customerRegisterStage.setTitle("Kundregister");
			customerRegisterStage.initModality(Modality.WINDOW_MODAL);
			customerRegisterStage.initOwner(dialogStage);
			Scene scene = new Scene(customerRegisterView);
			customerRegisterStage.setScene(scene);
			
			CustomerRegisterViewController controller = uiLoader.getController();
			controller.setMainApp(this);
			customerRegisterStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			customerRegisterStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public boolean showEditCustomerDialog(Customer customer, String editOrNew) {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/EditCustomerDialog.fxml"));
			AnchorPane editDialog = (AnchorPane) uiLoader.load();
			
			Stage editStage = new Stage();
			editStage.setTitle(editOrNew);
			editStage.initModality(Modality.WINDOW_MODAL);
			editStage.initOwner(customerRegisterStage);
			Scene scene = new Scene(editDialog);
			editStage.setScene(scene);
			
			EditCustomerDialogController controller = uiLoader.getController();
			controller.setStage(editStage);
			controller.setCustomer(customer);
			controller.setHeaderLabel(editOrNew);
			editStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			editStage.showAndWait();
			
			return controller.isOkClicked();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	public void showGenereateReportView() {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/GenerateReportView.fxml"));
			BorderPane reportView = (BorderPane) uiLoader.load();
			
			Stage reportStage = new Stage();
			reportStage.setTitle("Generera rapport");
			reportStage.initModality(Modality.WINDOW_MODAL);
			reportStage.initOwner(primaryStage);
			Scene scene = new Scene(reportView);
			reportStage.setScene(scene);
			
			GenerateReportViewController controller = uiLoader.getController();
			controller.setStage(reportStage);
			
			reportStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			reportStage.showAndWait();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showGearListView() {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("view/GearView.fxml"));
			BorderPane gearView = (BorderPane) uiLoader.load();
			
			Stage gearStage = new Stage();
			gearStage.setTitle("Utrustning");
			gearStage.initModality(Modality.WINDOW_MODAL);
			gearStage.initOwner(primaryStage);
			Scene scene = new Scene(gearView);
			gearStage.setScene(scene);
			
			GearViewController controller = uiLoader.getController();
			controller.setMainApp(this);
			
			gearStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			gearStage.showAndWait();

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
	public Stage getCustomerRegisterStage() {
		return customerRegisterStage;
	}
	public ObservableList<Customer> getCustomerList() {
		return customerList;
	}
	public ObservableList<CustomerCategory> getCategoryList() {
		return categoryList;
	}
	public ObservableList<SafariLocation> getLocationList() {
		return locationList;
	}
	public ObservableList<Gear> getGearList() {
		return gearList;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
