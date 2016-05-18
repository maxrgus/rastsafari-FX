package com.rastsafari.client.controller;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.Booking;
import com.rastsafari.server.model.Safari;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.paint.Color;

public class MainFrameController {
	@FXML
	private TableView<Safari> safariTable;
	@FXML
	private TableColumn<Safari, String> dateColumn;
	@FXML
	private TableColumn<Safari, String> locationColumn;
	@FXML
	private TableColumn<Safari, String> descriptionColumn;
	@FXML
	private TableColumn<Safari, String> startTimeColumn;
	@FXML
	private TableColumn<Safari, String> endTimeColumn;
	@FXML
	private TableColumn<Safari, Integer> takenSlotsColumn;
	
	@FXML
	private LineChart<String, Number> chart;
	@FXML
	private CategoryAxis chartCategories;
	@FXML
	private NumberAxis chartNumbers;

	// Reference the main app
	private MainApp mainApp;

	private Storage storage = StorageFactory.getStorageDB();

	/**
	 * The constructor The constructor is called before the initialize() method.
	 */
	public MainFrameController() {

	}

	@FXML
	private void initialize() {
		dateColumn.setCellValueFactory(cellData -> cellData.getValue().getDateProperty());
		locationColumn.setCellValueFactory(cellData -> cellData.getValue().getLocation().locationNameProperty());
		descriptionColumn.setCellValueFactory(cellData -> cellData.getValue().getLocation().descriptionProperty());
		startTimeColumn.setCellValueFactory(cellData -> cellData.getValue().getStartTimeProperty());
		endTimeColumn.setCellValueFactory(cellData -> cellData.getValue().getEndTimeProperty());
		takenSlotsColumn.setCellValueFactory(cellData -> cellData.getValue().getTakenSlotsProperty().asObject());
		
		// Set cell color to red if the booked slots is less than minimum.
		takenSlotsColumn.setCellFactory(column -> {
			return new TableCell <Safari, Integer>() {
				@Override
				protected void updateItem(Integer item, boolean empty) {
					super.updateItem(item, empty);
					Safari s = (Safari) getTableRow().getItem();
					
					if (item == null || empty) {
						setText(null);
						setStyle("");
					} else {
						if (item < s.getMinParticipants()) {
							setTextFill(Color.WHITE);
							setStyle("");
							getStyleClass().add("table-cell-alert");
							setText(Integer.toString(item));
						} 
							else {
							setTextFill(Color.WHITE);
							setStyle("-fx-background-color: #2b2b2b");
							setText(Integer.toString(item));
						}
					}
				}
			};
		});
		setLineGraph();
		
	}
	private void setLineGraph() {
		chartCategories.setLabel("Månad");
		chart.setTitle("Bokningsstatistik");
		chart.setCreateSymbols(false);
		
		XYChart.Series<String, Number> lake1 = new XYChart.Series<String, Number>();
		lake1.setName("Storsjön");
		lake1.getData().add(new XYChart.Data<String, Number>("Jan", 4));
		lake1.getData().add(new XYChart.Data<String, Number>("Feb", 5));
		lake1.getData().add(new XYChart.Data<String, Number>("Mars", 3));
		lake1.getData().add(new XYChart.Data<String, Number>("April", 12));
		lake1.getData().add(new XYChart.Data<String, Number>("Maj", 18));
		lake1.getData().add(new XYChart.Data<String, Number>("Juni", 22));
		
		XYChart.Series<String, Number> lake2 = new XYChart.Series<String, Number>();
		lake2.setName("Byasjön");
		lake2.getData().add(new XYChart.Data<String, Number>("Jan", 0));
		lake2.getData().add(new XYChart.Data<String, Number>("Feb", 2));
		lake2.getData().add(new XYChart.Data<String, Number>("Mars", 4));
		lake2.getData().add(new XYChart.Data<String, Number>("April", 6));
		lake2.getData().add(new XYChart.Data<String, Number>("Maj", 12));
		lake2.getData().add(new XYChart.Data<String, Number>("Juni", 16));
		
		XYChart.Series<String, Number> lake3 = new XYChart.Series<String, Number>();
		lake3.setName("Lokasjön");
		lake3.getData().add(new XYChart.Data<String, Number>("Jan", 3));
		lake3.getData().add(new XYChart.Data<String, Number>("Feb", 4));
		lake3.getData().add(new XYChart.Data<String, Number>("Mars", 2));
		lake3.getData().add(new XYChart.Data<String, Number>("April", 11));
		lake3.getData().add(new XYChart.Data<String, Number>("Maj", 17));
		lake3.getData().add(new XYChart.Data<String, Number>("Juni", 21));
		
		XYChart.Series<String, Number> lake4 = new XYChart.Series<String, Number>();
		lake4.setName("Helge å");
		lake4.getData().add(new XYChart.Data<String, Number>("Jan", 6));
		lake4.getData().add(new XYChart.Data<String, Number>("Feb", 8));
		lake4.getData().add(new XYChart.Data<String, Number>("Mars", 5));
		lake4.getData().add(new XYChart.Data<String, Number>("April", 20));
		lake4.getData().add(new XYChart.Data<String, Number>("Maj", 20));
		lake4.getData().add(new XYChart.Data<String, Number>("Juni", 32));
		
		chart.getData().addAll(lake1,lake2,lake3,lake4);
		
	}
	/**
	 * is called by the main application to give a reference back to itself.
	 * 
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		safariTable.setItems(mainApp.getUpNextSafariList());
		for (Safari s : mainApp.getUpNextSafariList()) {
			s.initBookedCustomers();
			s.setBookedCustomers(storage.getSafariBookingsFromStorage(s.getId()));
			s.setAvalibleSlots(s.getBookedCustomers());
			s.setTakenSlots(s.getBookedCustomers());
		}
		safariTable.getSortOrder().add(dateColumn);

	}
	public TableView<Safari> getUpNextTable() {
		return safariTable;
	}

	/**
	 * Called when the users clicks the SafariLocation button
	 */
	@FXML
	private void handleSafariLocationView() {
		mainApp.showSafariLocationView();
	}

	@FXML
	private void handleBookingView() {
		mainApp.showBookingView();
	}

	@FXML
	private void handleApplicationExit() {
		Platform.exit();
	}

	@FXML
	private void handleSafariView() {
		mainApp.showSafariView();
	}
}
