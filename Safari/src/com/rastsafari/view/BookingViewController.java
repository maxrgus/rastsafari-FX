package com.rastsafari.view;

import com.rastsafari.MainApp;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class BookingViewController {
	  //Reference the main app
    private MainApp mainApp;
    private Stage bookingStage;
    
    public BookingViewController(){
    	
    }
    @FXML
    private void initialize(){
    	
    }
    
    public void setBookingStage(Stage bookingStage, MainApp mainApp) {
    	this.bookingStage = bookingStage;
    	this.mainApp = mainApp;
    }
}
