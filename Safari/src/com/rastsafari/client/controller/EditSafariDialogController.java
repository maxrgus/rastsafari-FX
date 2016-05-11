package com.rastsafari.client.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.rastsafari.MainApp;
import com.rastsafari.server.model.Guide;
import com.rastsafari.server.model.Safari;
import com.rastsafari.server.model.SafariLocation;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;

public class EditSafariDialogController {

	@FXML
	private Label headerLabel;
	@FXML
	private ComboBox<SafariLocation> locationBox;
	@FXML
	private DatePicker datePicker;
	@FXML
	private ComboBox<String> startTimeBox;
	@FXML
	private ComboBox<String> endTimeBox;
	@FXML
	private TextField priceField;
	@FXML
	private ComboBox<Guide> guideBox;

	// reference owner stage and mainApp
	private Stage safariStage;
	private MainApp mainApp;

	private Safari safari;
	private boolean okClicked;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	private String[] timeOptions = { "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00",
			"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00",
			"21:00", "22:00", "23:00", "24:00" };

	public EditSafariDialogController() {

	}

	@FXML
	private void initialize() {

	}

	public void setSafari(Safari safari) {
		this.safari = safari;

		locationBox.getItems().addAll(mainApp.getLocationList());
		locationBox.setValue(safari.getLocation());
		locationBox.setCellFactory(new Callback<ListView<SafariLocation>, ListCell<SafariLocation>>() {
			@Override
			public ListCell<SafariLocation> call(ListView<SafariLocation> s) {
				ListCell<SafariLocation> cell = new ListCell<SafariLocation>() {
					@Override
					protected void updateItem(SafariLocation item, boolean empty) {
						super.updateItem(item, empty);
						if (empty) {
							setText("");
						} else {
							setText(item.getLocationName() + " " + item.getDescription());
						}
					}
				};
				return cell;
			}
		});
		locationBox.setConverter(new StringConverter<SafariLocation>() {
			@Override
			public String toString(SafariLocation s) {
				if (s == null) {
					return "";
				} else {
					return s.getLocationName() + " " + s.getDescription();
				}
			}

			@Override
			public SafariLocation fromString(String string) {
				// TODO Auto-generated method stub
				return null;
			}

		});
		if (safari.getDate() != null) {
			LocalDate date = LocalDate.parse(safari.getDate(), formatter);
			datePicker.setValue(date);
		} else {
			LocalDate todaysDate = LocalDate.now();
			datePicker.setValue(todaysDate);
		}

		startTimeBox.getItems().addAll(timeOptions);
		startTimeBox.setValue(safari.getStartTime());
		endTimeBox.getItems().addAll(timeOptions);
		endTimeBox.setValue(safari.getEndTime());
		priceField.setText(Double.toString(safari.getPrice()));
		guideBox.getItems().addAll(mainApp.getGuideList());
		guideBox.setValue(safari.getGuide());
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

	public void setStage(Stage safariStage) {
		this.safariStage = safariStage;
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	public void setHeaderLabel(String label) {
		headerLabel.setText(label);
	}

	public boolean isOkClicked() {
		return okClicked;
	}

	@FXML
	private void handleOk() {
		if (isInputValid()) {
			safari.setLocation(locationBox.getValue());
			safari.setDate(datePicker.getValue().toString());
			safari.setStartTime(startTimeBox.getValue());
			safari.setEndTime(endTimeBox.getValue());
			safari.setPrice(Double.parseDouble(priceField.getText()));
			safari.setGuide(guideBox.getValue());
			if (safari.getBookedCustomers() == null) {
				safari.initBookedCustomers();
			}
			safari.setMinParticipants(safari.getLocation().getMinParticipant());
			safari.setMaxParticipants(safari.getLocation().getMaxParticipant());
			safari.setTakenSlots(safari.getBookedCustomers());
			safari.setAvalibleSlots(safari.getBookedCustomers());

			okClicked = true;
			safariStage.close();
		}
	}

	@FXML
	private void handleCancel() {
		safariStage.close();
	}

	private boolean isInputValid() {
		String errorMessage = "";
		if (priceField.getText() == null || priceField.getText().length() == 0) {
			errorMessage += "Pris �r inte ifyllt\n";
		}
		LocalDate today = LocalDate.now();
		if (today.isAfter(datePicker.getValue()) && !today.equals(datePicker.getValue())) {
			errorMessage += "Datum m�ste vara idag eller i framtiden, Marty\n";
		}
		if (errorMessage.length() == 0) {
			return true;
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(safariStage);
			alert.setTitle("Felaktig inmatning");
			alert.setHeaderText("V�nligen kontrollera nedan:");
			alert.setContentText(errorMessage);

			alert.showAndWait();

			return false;
		}
	}

}
