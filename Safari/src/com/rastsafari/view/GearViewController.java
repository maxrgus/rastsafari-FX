package com.rastsafari.view;

import java.util.Optional;

import com.rastsafari.MainApp;
import com.rastsafari.model.CustomerCategory;
import com.rastsafari.model.Gear;
import com.rastsafari.storage.Storage;
import com.rastsafari.storage.StorageFactory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
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
	
	private Storage storage = StorageFactory.getStorageDB();
	private boolean isFiltered;
	private SortedList<Gear> gearSorted;
	private ObservableList<Gear> gearList = FXCollections.observableArrayList();
	
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
	@FXML
	private void handleNewGear(){
		Gear tempGear = new Gear();
		boolean okClicked = mainApp.showEditGearDialog(tempGear, "Ny utrustning");
		if(okClicked) {
			tempGear.setId(storage.generateGearId());
			mainApp.getGearList().add(tempGear); 
			storage.addGear(tempGear);
			
		}
	}
	@FXML
	private void handleEditGear(){
		Gear selectedGear = gearTable.getSelectionModel().getSelectedItem();
		if(selectedGear != null){
			boolean okClicked = mainApp.showEditGearDialog(selectedGear, "Redigera utrustning");
			if(okClicked){
				storage.updateGear(selectedGear);
			}
		}else{
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getGearStage());
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Ingen utrustning markerad");
			alert.setContentText("Vänligen välj en utrustning som ska redigeras");
			
			alert.showAndWait();
		}
	}
	@FXML
	private void handleDeleteGear(){
		int selectedIndex = gearTable.getSelectionModel().getSelectedIndex();
		Gear gear = gearTable.getSelectionModel().getSelectedItem();
		if(selectedIndex >= 0){
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Bekräfta");
			alert.setHeaderText("Bekräfta borttagning");
			alert.setContentText("Vill du verkligen ta bort " + gear.getGearName() +
					" " + gear.getDescription() + "?");
			Optional<ButtonType> result = alert.showAndWait();
			if(result.get() == ButtonType.OK) {
				
				if (isFiltered) {
					int sourceIndex = gearSorted.getSourceIndexFor(gearList, selectedIndex);
					gearList.remove(sourceIndex);
				} else {
					gearTable.getItems().remove(selectedIndex);
				}
				storage.removeGear(gear);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getCustomerRegisterStage());
			alert.setTitle("Inget markerat");
			alert.setHeaderText("Ingen utrustning markerad");
			alert.setContentText("Vänligen markera en utrustning som du vill radera");
			
			alert.showAndWait();
		}
	}
	@FXML
	private void handleBackButton(){
		mainApp.getGearStage().close();
	}	
	

}

















