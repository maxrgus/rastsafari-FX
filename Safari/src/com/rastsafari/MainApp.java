package com.rastsafari;

import java.io.IOException;
import java.time.LocalDate;

import com.rastsafari.client.controller.BookingDialogController;
import com.rastsafari.client.controller.BookingNewCustomerDialogController;
import com.rastsafari.client.controller.BookingViewController;
import com.rastsafari.client.controller.CustomerCategoryController;
import com.rastsafari.client.controller.CustomerChooserDialogController;
import com.rastsafari.client.controller.CustomerRegisterViewController;
import com.rastsafari.client.controller.EditCustomerCategoryDialogController;
import com.rastsafari.client.controller.EditCustomerDialogController;
import com.rastsafari.client.controller.EditGearDialogController;
import com.rastsafari.client.controller.EditGuideDialogController;
import com.rastsafari.client.controller.EditSafariDialogController;
import com.rastsafari.client.controller.GearChooserDialogController;
import com.rastsafari.client.controller.GearViewController;
import com.rastsafari.client.controller.GenerateReportViewController;
import com.rastsafari.client.controller.GuideViewController;
import com.rastsafari.client.controller.LocationEditDialogController;
import com.rastsafari.client.controller.LocationMapController;
import com.rastsafari.client.controller.MainFrameController;
import com.rastsafari.client.controller.RootLayoutController;
import com.rastsafari.client.controller.SafariLocationViewController;
import com.rastsafari.client.controller.SafariViewController;
import com.rastsafari.client.listener.RastsafariListener;
import com.rastsafari.server.listener.Distributor;
import com.rastsafari.server.model.Booking;
import com.rastsafari.server.model.Customer;
import com.rastsafari.server.model.CustomerCategory;
import com.rastsafari.server.model.Gear;
import com.rastsafari.server.model.Guide;
import com.rastsafari.server.model.Safari;
import com.rastsafari.server.model.SafariLocation;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.application.Application;
import javafx.beans.Observable;
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
	private Stage safariStage;
	private Stage customerRegisterStage;
	private Stage gearStage;
	private Stage guideStage;
	private Stage editBookingStage;
	private Stage editStage;
	private BorderPane rootLayout;
	
	private MainFrameController mainController;

	private ObservableList<Customer> customerList = FXCollections.observableArrayList();
	private ObservableList<CustomerCategory> categoryList = FXCollections.observableArrayList();
	private ObservableList<SafariLocation> locationList = FXCollections.observableArrayList();
	private ObservableList<Gear> gearList = FXCollections.observableArrayList();
	private ObservableList<Safari> safariList = FXCollections.observableArrayList();
	private ObservableList<Safari> upNextSafariList = FXCollections.observableArrayList((Safari p) -> new Observable[]{p.getTakenSlotsProperty()});
	private ObservableList<Booking> bookingList = FXCollections.observableArrayList();
	private ObservableList<Guide> guideList = FXCollections.observableArrayList();

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
			uiLoader.setLocation(MainApp.class.getResource("client/view/BootView.fxml"));
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
					guideList.addAll(s.getGuidesFromStorage());
					customerList.addAll(s.getCustomersFromStorage());
					categoryList.addAll(s.getCategoriesFromStorage());
					locationList.addAll(s.getLocationsFromStorage());
					gearList.addAll(s.getGearFromStorage());
					safariList.addAll(s.getSafarisFromStorage());
					bookingList.addAll(s.getBookingsFromStorage());
					LocalDate date = LocalDate.now();
					upNextSafariList.addAll(s.getUpNextSafariFromStorage(date));
					// Init a listener and subscribe to the distributor.
					RastsafariListener listener = new RastsafariListener(MainApp.this);
					Distributor dist = new Distributor();
					dist.subscribeToList(listener);
					
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
			// Load root layout from fxml file.
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/RootLayout.fxml"));
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
			// Load main frame
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/MainFrame.fxml"));
			AnchorPane mainFrame = (AnchorPane) uiLoader.load();

			// Acess to controller
			mainController = uiLoader.getController();
			mainController.setMainApp(this);

			// Set to center
			rootLayout.setCenter(mainFrame);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showSafariLocationView() {
		try {
			// Load SafariLocationView.fxml
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/SafariLocationView.fxml"));
			AnchorPane safariLocationView = (AnchorPane) uiLoader.load();

			// Create dialog stage
			dialogStage = new Stage();
			dialogStage.setTitle("Safarimï¿½l");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initOwner(primaryStage);
			Scene scene = new Scene(safariLocationView);
			dialogStage.setScene(scene);

			// Set the location into the controller.
			SafariLocationViewController controller = uiLoader.getController();
			controller.setDialogStage(dialogStage, this);

			// Show the dialog and wait until user closes it
			dialogStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			dialogStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showBookingView() {
		try {
			// Load BookingView.fxml
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/BookingView.fxml"));
			AnchorPane bookingView = (AnchorPane) uiLoader.load();

			// Create dialog stage
			bookingStage = new Stage();
			bookingStage.setTitle("Bokning");
			bookingStage.initModality(Modality.WINDOW_MODAL);
			bookingStage.initOwner(primaryStage);
			Scene scene = new Scene(bookingView);
			bookingStage.setScene(scene);

			// Set the location into the controller.
			BookingViewController controller = uiLoader.getController();
			controller.setBookingStage(bookingStage, this);

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
			uiLoader.setLocation(MainApp.class.getResource("client/view/LocationMapDialog.fxml"));
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
			// Load LocationEditDialogController.fxml
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/LocationEditDialog.fxml"));
			AnchorPane editDialog = (AnchorPane) uiLoader.load();

			// Create dialog stage
			editStage = new Stage();
			editStage.setTitle("Redigera Safarimï¿½l");
			editStage.initModality(Modality.WINDOW_MODAL);
			editStage.initOwner(dialogStage);
			Scene scene = new Scene(editDialog);
			editStage.setScene(scene);

			// Load the controller
			LocationEditDialogController controller = uiLoader.getController();
			controller.setMainApp(this);
			controller.setDialogStage(editStage);
			controller.setSafariLocation(location);

			// Show the dialog and wait until close.
			editStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			editStage.showAndWait();

			return controller.isOkClicked();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean showEditBookingDialog(Booking booking, String label) {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/BookingDialogView.fxml"));
			AnchorPane editDialog = (AnchorPane) uiLoader.load();

			editBookingStage = new Stage();
			editBookingStage.setTitle(label);
			editBookingStage.initModality(Modality.WINDOW_MODAL);
			editBookingStage.initOwner(bookingStage);
			Scene scene = new Scene(editDialog);
			editBookingStage.setScene(scene);

			BookingDialogController controller = uiLoader.getController();
			controller.setMainApp(this);
			controller.setHeaderLabel(label);
			controller.setStage(editBookingStage);
			controller.setBooking(booking);

			editBookingStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			editBookingStage.showAndWait();

			return controller.isOkClicked();

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public void showCustomerCategoryView() {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/CustomerCategoryView.fxml"));
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

	public void showGuideView() {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/GuideView.fxml"));
			BorderPane guideView = (BorderPane) uiLoader.load();

			guideStage = new Stage();
			guideStage.setTitle("Guider");
			guideStage.initModality(Modality.WINDOW_MODAL);
			guideStage.initOwner(dialogStage);
			Scene scene = new Scene(guideView);
			guideStage.setScene(scene);

			GuideViewController controller = uiLoader.getController();
			controller.setMainApp(this);

			guideStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			guideStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean showCategoryEditDialog(CustomerCategory category) {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/EditCustomerCategoryDialog.fxml"));
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
		} catch (IOException se) {
			se.printStackTrace();
			return false;

		}

	}

	public void showCustomerRegisterView() {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/CustomerRegisterView.fxml"));
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

	public Customer showCustomerChooserDialog() {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/CustomerChooserDialog.fxml"));
			BorderPane customerChooserDialog = (BorderPane) uiLoader.load();

			customerRegisterStage = new Stage();
			customerRegisterStage.setTitle("Vï¿½lj kund");
			customerRegisterStage.initModality(Modality.WINDOW_MODAL);
			customerRegisterStage.initOwner(bookingStage);
			Scene scene = new Scene(customerChooserDialog);
			customerRegisterStage.setScene(scene);

			CustomerChooserDialogController controller = uiLoader.getController();
			controller.setMainApp(this);
			customerRegisterStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			customerRegisterStage.showAndWait();
			if (controller.isOkClicked()) {
				return controller.getCustomer();
			} else {
				return null;
			}

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	public Gear showGearChooserDialog() {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/GearChooserDialog.fxml"));
			BorderPane gearChooserDialog = (BorderPane) uiLoader.load();
			
			Stage gearChooserStage = new Stage();
			gearChooserStage.setTitle("Välj utrustning");
			gearChooserStage.initModality(Modality.WINDOW_MODAL);
			gearChooserStage.initOwner(editStage);
			Scene scene = new Scene(gearChooserDialog);
			gearChooserStage.setScene(scene);
			
			GearChooserDialogController controller = uiLoader.getController();
			controller.setMainApp(this);
			controller.setStage(gearChooserStage);
			
			gearChooserStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			gearChooserStage.showAndWait();
			if (controller.isOkClicked()) {
				return controller.getGear();
			} else {
				return null;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean showEditCustomerDialog(Customer customer, String editOrNew) {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/EditCustomerDialog.fxml"));
			AnchorPane editDialog = (AnchorPane) uiLoader.load();

			Stage editStage = new Stage();
			editStage.setTitle(editOrNew);
			editStage.initModality(Modality.WINDOW_MODAL);
			editStage.initOwner(customerRegisterStage);
			Scene scene = new Scene(editDialog);
			editStage.setScene(scene);

			EditCustomerDialogController controller = uiLoader.getController();
			controller.setMainApp(this);
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

	public Customer showBookingNewCustomerDialog(String label) {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/BookingNewCustomerDialog.fxml"));
			AnchorPane editDialog = (AnchorPane) uiLoader.load();

			Stage editStage = new Stage();
			editStage.setTitle(label);
			editStage.initModality(Modality.WINDOW_MODAL);
			editStage.initOwner(bookingStage);
			Scene scene = new Scene(editDialog);
			editStage.setScene(scene);

			
			BookingNewCustomerDialogController controller = uiLoader.getController();
			controller.setMainApp(this);
			controller.setCategoryBox();
			controller.setHeaderLabel(label);
			controller.setStage(editStage);
			

			editStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			editStage.showAndWait();

			if (controller.isOkClicked()) {
				return controller.getCustomer();
			} else {
				return controller.getCustomer();
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean showEditSafariDialog(Safari safari, String label) {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/EditSafariDialog.fxml"));
			AnchorPane editDialog = (AnchorPane) uiLoader.load();

			Stage editStage = new Stage();
			editStage.setTitle(label);
			editStage.initModality(Modality.WINDOW_MODAL);
			editStage.initOwner(safariStage);

			Scene scene = new Scene(editDialog);
			editStage.setScene(scene);

			EditSafariDialogController controller = uiLoader.getController();
			controller.setMainApp(this);
			controller.setStage(editStage);
			controller.setSafari(safari);
			controller.setHeaderLabel(label);
			editStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			editStage.showAndWait();

			return controller.isOkClicked();

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean showEditGearDialog(Gear gear, String editOrNew) {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/GearDialogView.fxml"));
			AnchorPane editGear = (AnchorPane) uiLoader.load();

			Stage editStage = new Stage();
			editStage.setTitle(editOrNew);
			editStage.initModality(Modality.WINDOW_MODAL);
			editStage.initOwner(gearStage);
			Scene scene = new Scene(editGear);
			editStage.setScene(scene);

			EditGearDialogController controller = uiLoader.getController();
			controller.setMainApp(this);
			controller.setGearStage(editStage);
			controller.setGear(gear);
			controller.setHeaderLabel(editOrNew);
			editStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			editStage.showAndWait();

			return controller.isOkClicked();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean showEditGuideDialog(Guide guide, String label) {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/EditGuideDialog.fxml"));
			AnchorPane editDialog = (AnchorPane) uiLoader.load();

			Stage editStage = new Stage();
			editStage.setTitle(label);
			editStage.initModality(Modality.WINDOW_MODAL);
			editStage.initOwner(guideStage);

			Scene scene = new Scene(editDialog);
			editStage.setScene(scene);

			EditGuideDialogController controller = uiLoader.getController();
			controller.setMainApp(this);
			controller.setStage(editStage);
			controller.setGuide(guide);
			controller.setHeaderLabel(label);
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
			uiLoader.setLocation(MainApp.class.getResource("client/view/GenerateReportView.fxml"));
			BorderPane reportView = (BorderPane) uiLoader.load();

			Stage reportStage = new Stage();
			reportStage.setTitle("Generera rapport");
			reportStage.initModality(Modality.WINDOW_MODAL);
			reportStage.initOwner(primaryStage);
			Scene scene = new Scene(reportView);
			reportStage.setScene(scene);

			GenerateReportViewController controller = uiLoader.getController();
			controller.setMainApp(this);
			controller.setGuideBox();
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
			uiLoader.setLocation(MainApp.class.getResource("client/view/GearView.fxml"));
			BorderPane gearView = (BorderPane) uiLoader.load();

			gearStage = new Stage();
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

	public void showSafariView() {
		try {
			FXMLLoader uiLoader = new FXMLLoader();
			uiLoader.setLocation(MainApp.class.getResource("client/view/SafariView.fxml"));
			BorderPane safariView = (BorderPane) uiLoader.load();

			safariStage = new Stage();
			safariStage.setTitle("Safarier");
			safariStage.initModality(Modality.WINDOW_MODAL);
			safariStage.initOwner(dialogStage);
			Scene scene = new Scene(safariView);
			safariStage.setScene(scene);

			SafariViewController controller = uiLoader.getController();
			controller.setMainApp(this);

			safariStage.getIcons().add(new Image("file:resources/images/1460788635_fishing.png"));
			safariStage.showAndWait();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Returns the main stage.
	 * 
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public Stage getCustomerRegisterStage() {
		return customerRegisterStage;
	}

	public Stage getSafariViewStage() {
		return safariStage;
	}

	public Stage getGearStage() {
		return gearStage;
	}

	public Stage getGuideStage() {
		return guideStage;
	}

	public Stage getBookingStage() {
		return editBookingStage;
	}
	
	public MainFrameController getMainFrameController() {
		return mainController;
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

	public ObservableList<Safari> getSafariList() {
		return safariList;
	}

	public ObservableList<Safari> getUpNextSafariList() {
		return upNextSafariList;
	}

	public ObservableList<Booking> getBookingList() {
		return bookingList;
	}

	public ObservableList<Guide> getGuideList() {
		return guideList;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
