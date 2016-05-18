package com.rastsafari.client.controller;

import java.io.File;
import java.util.ArrayList;

import com.itextpdf.text.DocumentException;
import com.rastsafari.MainApp;
import com.rastsafari.server.model.Guide;
import com.rastsafari.server.model.GuideSalary;
import com.rastsafari.server.report.RastsafariReport;
import com.rastsafari.server.storage.Storage;
import com.rastsafari.server.storage.StorageFactory;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.StringConverter;
/**
 * Controller for generating report 
 * <p>
 * 
 * @author Team14
 * 
 *
 */
public class GenerateReportViewController {
	private FileChooser fileChooser;

	private Stage primaryStage;
	private RastsafariReport report = new RastsafariReport();
	private Storage storage = StorageFactory.getStorageDB();
	
	@FXML
	private DatePicker startDate;
	@FXML
	private DatePicker endDate;
	@FXML
	private ComboBox<Guide> guideBox;
	
	private MainApp mainApp;

	public GenerateReportViewController() {

	}

	@FXML
	private void initialize() {
		
	}
	
	/**
	 * Method when selecting guide from the combobox 
	 */
	public void setGuideBox() {
		guideBox.getItems().addAll(mainApp.getGuideList());
		guideBox.setConverter(new StringConverter<Guide>() {
			@Override
			public String toString(Guide g) {
				if (g == null) {
					return "";
				} else {
					return g.getGivenName() + " " + g.getFamilyName();
				}
			}

			@Override
			public Guide fromString(String string) {
				return null;
			}
		});
	}
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	public void setStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
/**
 * Method that handles the generating report to a PDF file
 * 
 */
	@FXML
	public void handleGenerate() {
		ArrayList<GuideSalary> salaryObjects = null;
		Guide tempGuide = null;
		try {
			salaryObjects = storage.getGuideSalaryFromStorage(guideBox.getValue().getId(), startDate.getValue().toString(), endDate.getValue().toString());
			tempGuide = guideBox.getValue();
		} catch (NullPointerException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(primaryStage);
			alert.setHeaderText("Ogiltlig f�rfr�gan");
			alert.setContentText("Allt �r inte ifyllt");
			alert.showAndWait();
		}
		fileChooser = new FileChooser();
		fileChooser.setTitle("Spara rapport");
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PDF", "*.pdf"));
		fileChooser.setInitialFileName(Integer.toString(tempGuide.getId()) + "." + tempGuide.getFamilyName() +
									   "." + Character.toString(tempGuide.getGivenName().charAt(0)) +
									   "." + startDate.getValue().toString() + "-" + endDate.getValue().toString());
		File file = fileChooser.showSaveDialog(primaryStage);
		String path = file.getPath();
		
		try {
			report.generateSalaryReport(path,tempGuide,salaryObjects);
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.initOwner(primaryStage);
			alert.setHeaderText("Allt gick bra!");
			alert.setContentText("Rapport genererad");
			alert.showAndWait();
		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}
	@FXML
	public void handleDispose() {
		primaryStage.close();
	}

}
