package com.rastsafari.view;

import com.rastsafari.MainApp;
import com.rastsafari.model.Gear;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class GearViewController {
	@FXML
	private TableView<Gear> gearTable;
	@FXML
	private TableColumn<Gear, Integer> idColumn;
	@FXML
	private TableColumn<Gear, String> nameColumn;
	@FXML
	private TableColumn<Gear, String> descriptionColumn;
	@FXML
	private TableColumn<Gear, Integer> inStockColumn;
	
	// Reference main app
	private MainApp mainApp;
	
	public GearViewController() {}
	
	@FXML
	private void initialize() {
		idColumn.setCellValueFactory(cellData -> cellData.getValue().getIdProperty().asObject());
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().getGearNameProperty());
		descriptionColumn.setCellValueFactory(cellData -> cellData.getValue().getDescriptionProperty());
		inStockColumn.setCellValueFactory(cellData -> cellData.getValue().getInStockProperty().asObject());
	}
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		gearTable.setItems(mainApp.getGearList());

	}

	
	

}

















