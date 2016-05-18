package com.rastsafari.client.controller;

import java.time.LocalDate;
import java.util.Optional;

import com.rastsafari.MainApp;
import com.rastsafari.server.mail.RastsafariMail;
import com.rastsafari.server.model.Booking;
import com.rastsafari.server.model.Safari;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.paint.Color;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

/**
 * Controller for the safari view
 * @author Team14
 *
 */
public class SafariViewController {
	@FXML
	private TableView<Safari> safariTable;
	@FXML
	private TableView<Booking> bookingsTable;

	@FXML
	private TableColumn<Safari, String> dateColumn;
	@FXML
	private TableColumn<Safari, String> locationColumn;
	@FXML
	private TableColumn<Safari, String> startTimeColumn;
	@FXML
	private TableColumn<Safari, String> endTimeColumn;
	@FXML
	private TableColumn<Safari, Integer> takenSlotsColumn;
	@FXML
	private TableColumn<Safari, Integer> avalibleSlotsColumn;

	@FXML
	private TableColumn<Booking, Integer> idColumn;
	@FXML
	private TableColumn<Booking, String> customerColumn;

	@FXML
	private Label idLabel;
	@FXML
	private Label dateLabel;
	@FXML
	private Label startTimeLabel;
	@FXML
	private Label endTimeLabel;
	@FXML
	private Label takenSlotsLabel;
	@FXML
	private Label avalibleSlotsLabel;
	@FXML
	private Label priceLabel;
	@FXML
	private Label guideLabel;
	
	@FXML
	private Label mailStatusLabel;
	@FXML
	private ProgressIndicator progress;

	// Reference MainApp
	private MainApp mainApp;

	private Storage storage = StorageFactory.getStorageDB();
	private RastsafariMail mail = new RastsafariMail();

	public SafariViewController() {

	}

	@FXML
	private void initialize() {
		dateColumn.setCellValueFactory(cellData -> cellData.getValue().getDateProperty());
		locationColumn.setCellValueFactory(cellData -> cellData.getValue().getLocation().locationNameProperty());
		startTimeColumn.setCellValueFactory(cellData -> cellData.getValue().getStartTimeProperty());
		endTimeColumn.setCellValueFactory(cellData -> cellData.getValue().getEndTimeProperty());
		takenSlotsColumn.setCellValueFactory(cellData -> cellData.getValue().getTakenSlotsProperty().asObject());
		avalibleSlotsColumn.setCellValueFactory(cellData -> cellData.getValue().getAvalibleSlotsProperty().asObject());

		idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
		customerColumn.setCellValueFactory(cellData -> cellData.getValue().getCustomer().fullNameProperty());

		// Clear
		showSafariDetails(null);

		safariTable.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> showSafariDetails(newValue));
		progress.setVisible(false);
		mailStatusLabel.setVisible(false);
		
		bookingsTable.setRowFactory(tv -> {
			TableRow<Booking> row = new TableRow<>();
			row.setOnMouseClicked(event -> {
				if (event.getClickCount() == 2 && (!row.isEmpty())) {
					mainApp.showEditBookingDialog(row.getItem(), "Visa bokning", true);
				}
			});
			return row;
		});
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		safariTable.setItems(mainApp.getSafariList());
		for (Safari s : mainApp.getSafariList()) {
			s.initBookedCustomers();
			s.setBookedCustomers(storage.getSafariBookingsFromStorage(s.getId()));
			s.setAvalibleSlots(s.getBookedCustomers());
			s.setTakenSlots(s.getBookedCustomers());
		}
		safariTable.getSortOrder().add(dateColumn);

	}
/**
 * Method which shows the safari details
 * @param safari
 */
	private void showSafariDetails(Safari safari) {
		if (safari != null) {
			idLabel.setText(Integer.toString(safari.getId()));
			dateLabel.setText(safari.getDate());
			startTimeLabel.setText(safari.getStartTime());
			endTimeLabel.setText(safari.getEndTime());
			takenSlotsLabel.setText(Integer.toString(safari.getTakenSlots()));
			avalibleSlotsLabel.setText(Integer.toString(safari.getAvalibleSlots()));
			priceLabel.setText(Double.toString(safari.getPrice()));
			guideLabel.setText(safari.getGuide().getGivenName() + " " + safari.getGuide().getFamilyName());

			bookingsTable.setItems(safari.getBookedCustomers());
			customerColumn.setCellFactory(column -> {
				return new TableCell <Booking, String>() {
					@Override
					protected void updateItem(String item, boolean empty) {
						super.updateItem(item, empty);
						Booking b = (Booking) getTableRow().getItem();
						boolean isPayed = false;
						try {
							isPayed = b.getIsPayed();
						} catch (NullPointerException e) {
						
						}
						if (item == null || empty) {
							setStyle("");
							setText(null);
						} else {
							if (!isPayed) {
								setTextFill(Color.WHITE);
								setStyle("");
								getStyleClass().add("table-cell-warning");
								setText(item);
							} else {
								setTextFill(Color.WHITE);
								getStyleClass().add(".table-row-cell");
								setText(item);
							}
						}
					}
				};
			});

		} else {
			idLabel.setText("");
			dateLabel.setText("");
			startTimeLabel.setText("");
			endTimeLabel.setText("");
			takenSlotsLabel.setText("");
			avalibleSlotsLabel.setText("");
			priceLabel.setText("");
			guideLabel.setText("");

			bookingsTable.setItems(null);
		}
	}
/**
 * Method that handles editing of the safari. User needs to first choose which safari to edit
 */
	@FXML
	private void handleEditSafari() {
		Safari selectedSafari = safariTable.getSelectionModel().getSelectedItem();
		if (selectedSafari != null) {
			boolean okClicked = mainApp.showEditSafariDialog(selectedSafari, "Redigera safari");
			if (okClicked) {
				storage.updateSafari(selectedSafari);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setHeaderText("Inget markerat");
			alert.setContentText("V�nligen v�lj ett safari som ska redigeras");

			alert.showAndWait();
		}
	}
/**
 * Method which creates a new safari
 */
	@FXML
	private void handleNewSafari() {
		Safari tempSafari = new Safari();
		boolean okClicked = mainApp.showEditSafariDialog(tempSafari, "Nytt safari");
		if (okClicked) {
			tempSafari.setId(storage.generateSafariId());
			mainApp.getSafariList().add(tempSafari);			
			storage.addSafari(tempSafari);
		}
	}
/**
 * Method which deletes safari when called. User needs to choose which safari to delete
 */
	@FXML
	private void handleDeleteSafari() {
		int selectedIndex = safariTable.getSelectionModel().getSelectedIndex();
		Safari safari = safariTable.getSelectionModel().getSelectedItem();
		if (selectedIndex >= 0) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Bekr�fta");
			alert.setHeaderText("Bekr�fta borttagning");
			alert.setContentText(
					"Vill du verkligen ta bort " + safari.getLocation().getLocationName() + " den " + safari.getDate());

			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == ButtonType.OK) {
				safariTable.getItems().remove(selectedIndex);
				storage.removeSafari(safari);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Inget safari markerad");
			alert.setContentText("V�nligen markera ett safari som du vill radera");

			alert.showAndWait();
		}
	}
	/**
	 * Method that handles the briefeing to the guides about safari
	 */
	@FXML
	private void handleSendGuideBriefing() {
		Safari selectedSafari = safariTable.getSelectionModel().getSelectedItem();
		if (selectedSafari != null) {
			progress.setVisible(true);
			mailStatusLabel.setVisible(true);
			mailStatusLabel.setText("Skickar");
			Task<Void> sendEmail = new Task<Void>() {
				@Override
				protected Void call() throws Exception {
						mail.sendGuideBriefing(selectedSafari);
						return null;
				}
			};
			sendEmail.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
				@Override
				public void handle(WorkerStateEvent event) {
					progress.setVisible(false);
					mailStatusLabel.setVisible(false);
				}
			});
			new Thread(sendEmail).start();
			
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Inget safari markerad");
			alert.setContentText("V�nligen markera ett safari som du vill skicka");

			alert.showAndWait();
		}
	}

	@FXML
	private void handleDispose() {
		mainApp.getSafariViewStage().close();
	}
}
