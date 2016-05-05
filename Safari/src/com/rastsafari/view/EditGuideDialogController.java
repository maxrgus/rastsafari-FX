package com.rastsafari.view;

import com.rastsafari.MainApp;
import com.rastsafari.model.Guide;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class EditGuideDialogController {
	@FXML
	private Label headerLabel;
	@FXML
	private TextField givenNameField;
	@FXML
	private TextField familyNameField;
	@FXML
	private TextField emailField;

	// reference stage and mainApp
	private Stage guideStage;
	private MainApp mainApp;

	private Guide guide;
	private boolean okClicked;

	public EditGuideDialogController() {

	}

	@FXML
	private void initialize() {

	}

	public void setGuide(Guide guide) {
		this.guide = guide;

		givenNameField.setText(guide.getGivenName());
		familyNameField.setText(guide.getFamilyName());
		emailField.setText(guide.getEmail());
	}

	public void setStage(Stage guideStage) {
		this.guideStage = guideStage;
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
			guide.setGivenName(givenNameField.getText());
			guide.setFamilyName(familyNameField.getText());
			guide.setEmail(emailField.getText());

			okClicked = true;
			guideStage.close();
		}
	}

	@FXML
	private void handleCancel() {
		guideStage.close();
	}

	private boolean isInputValid() {
		String errorMessage = "";
		if (givenNameField.getText() == null || givenNameField.getText().length() == 0) {
			errorMessage += "F�rnamn �r inte ifyllt\n";
		}
		if (familyNameField.getText() == null || familyNameField.getText().length() == 0) {
			errorMessage += "Efternamn �r inte ifyllt\n";
		}
		if (emailField.getText() == null || emailField.getText().length() == 0) {
			errorMessage += "Email �r inte ifyllt\n";
		}
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\" + "@([\\w]+\\.)+[\\w]+[\\w]$";
		boolean emailMatch = emailField.getText().matches(EMAIL_REGEX);
		if (!emailMatch) {
			errorMessage += "Email �r inte i r�tt format";
		}
		if (errorMessage.length() == 0) {
			return true;
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(guideStage);
			alert.setTitle("Felaktig inmatning");
			alert.setHeaderText("V�nligen kontrollera nedan");
			alert.setContentText(errorMessage);

			alert.showAndWait();

			return false;
		}

	}
}
