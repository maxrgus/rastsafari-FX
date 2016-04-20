package com.rastsafari.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import com.rastsafari.MainApp;
import com.rastsafari.model.SafariLocation;
import com.rastsafari.model.SafariLocationList;
import com.rastsafari.model.SafariMaintenance;

public class SafariLocationViewController {
	@FXML
    private TableView<SafariLocation> safariLocationTable;
    @FXML
    private TableColumn<SafariLocation, Integer> idColumn;
    @FXML
    private TableColumn<SafariLocation, String> locationNameColumn;
    @FXML
    private TableColumn<SafariLocation, String> descriptionColumn;

    @FXML
    private Label locationNameLabel;
    @FXML
    private Label descriptionLabel;
    @FXML
    private Label locationLabel;
    @FXML
    private Label minParticipantsLabel;
    @FXML
    private Label maxParticipantsLabel;
    @FXML
    private Label isActiveLabel;
    
    //Reference the main app
    private MainApp mainApp;
    private Stage dialogStage;
    
    private SafariLocationList list = new SafariLocationList();
    private SafariMaintenance maintenance = new SafariMaintenance();
    
    
    /**
     * The constructor
     * The constructor is called before the initialize() method.
     */
    public SafariLocationViewController() {

    }
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	//Initialize the locationtable with the three columns.
    	idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
    	locationNameColumn.setCellValueFactory(cellData -> cellData.getValue().locationNameProperty());
    	descriptionColumn.setCellValueFactory(cellData -> cellData.getValue().descriptionProperty());
    	
    	// Clear details.
    	showSafariLocationDetails(null);
    	
    	// Listen for selection changes and show selected object.
    	safariLocationTable.getSelectionModel().selectedItemProperty().addListener(
    				(observable, oldValue, newValue) -> showSafariLocationDetails(newValue));
    }
    /**
     * Sets the stage
     * @param dialogStage
     */
    public void setDialogStage(Stage dialogStage, MainApp mainApp) {
    	this.dialogStage = dialogStage;
    	this.mainApp = mainApp;

    	safariLocationTable.setItems(list.getSafariLocationList());
    }
    private void showSafariLocationDetails(SafariLocation sl) {
    	if (sl != null) {
    		//Fill the labels with info from the object.
    		locationNameLabel.setText(sl.getLocationName());
    		descriptionLabel.setText(sl.getDescription());
    		locationLabel.setText(sl.getLocation());
    		minParticipantsLabel.setText(Integer.toString(sl.getMinParticipant()));
    		maxParticipantsLabel.setText(Integer.toString(sl.getMaxParticipant()));
    		if (sl.getIsActive() == 1) {
    			isActiveLabel.setText("Aktiv");
    		} else {
    			isActiveLabel.setText("Inaktiv");
    		}
    	} else {
    		locationNameLabel.setText("");
    		descriptionLabel.setText("");
    		locationLabel.setText("");
    		minParticipantsLabel.setText("");
    		maxParticipantsLabel.setText("");
    		isActiveLabel.setText("");
    	}
    }
    /**
     * Called when the user clicks on the delete button.
     */
    @FXML
    private void handleDeleteLocation() {
    	int selectedIndex = safariLocationTable.getSelectionModel().getSelectedIndex();
    	SafariLocation location = safariLocationTable.getSelectionModel().getSelectedItem();
    	if (selectedIndex >= 0) {
    		safariLocationTable.getItems().remove(selectedIndex);
    		maintenance.removeFromDB(location.getId());
    	} else {
    		//Nothing selected
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.initOwner(mainApp.getPrimaryStage());
    		alert.setTitle("Inget markerat");
    		alert.setHeaderText("Inget safarimål markerat");
    		alert.setContentText("Vänligen markera safarimålet du vill radera");
    		
    		alert.showAndWait();
    	}
    	
    }
    /**
     * Called when the user clicks the new button. Opens a dialog to edit
     * details for a new location.
     */
    @FXML
    private void handleNewSafariLocation() {
    	SafariLocation tempLocation = new SafariLocation();
    	boolean okClicked = mainApp.showLocationEditDialog(tempLocation);
    	if (okClicked) {
    		tempLocation.setId(maintenance.generateId());
    		list.getSafariLocationList().add(tempLocation);
    		maintenance.insertLocationInDb(tempLocation);
    	}
    }
    /**
     * Called when users clicks edit button. Opens a dialog to edit details for
     * selected location.
     */
    @FXML
    private void handleEditSafariLocation() {
    	SafariLocation selectedLocation = safariLocationTable.getSelectionModel().getSelectedItem();
    	if (selectedLocation != null) {
    		boolean okClicked = mainApp.showLocationEditDialog(selectedLocation);
    		if (okClicked) {
    			showSafariLocationDetails(selectedLocation);
    			maintenance.updateLocationInDb(selectedLocation);
    		}
    	} else {
    		//Nothing selected.
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.initOwner(mainApp.getPrimaryStage());
    		alert.setTitle("Inget markerat");
    		alert.setHeaderText("Inget safarimål valt");
    		alert.setContentText("Vänligen välj ett safarimål som ska redigeras");
    		
    		alert.showAndWait();
    		
    	}
    }
    @FXML
    private void handleShowMap() {
    	SafariLocation selectedLocation = safariLocationTable.getSelectionModel().getSelectedItem();
    	if (selectedLocation != null) {
    		mainApp.showLocationMapDialog(selectedLocation.getLocation());
    	} else {
    		//Nothing selected.
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.initOwner(mainApp.getPrimaryStage());
    		alert.setTitle("Inget markerat");
    		alert.setHeaderText("Inget safarimål valt");
    		alert.setContentText("Vänligen välj ett safarimål som ska redigeras");
    		
    		alert.showAndWait();
    		
    	}
    }

}
