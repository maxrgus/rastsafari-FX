package com.rastsafari.server.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Guide model
 * @author maxrg
 *
 */

public class Guide {

	private IntegerProperty anstId;
	private StringProperty givenName;
	private StringProperty familyName;
	private StringProperty email;
	/**
	 * Default constructor
	 * @param id
	 * @param givenName
	 * @param familyName
	 * @param email
	 */
	public Guide(int id, String givenName, String familyName, String email) {
		this.anstId = new SimpleIntegerProperty(id);
		this.givenName = new SimpleStringProperty(givenName);
		this.familyName = new SimpleStringProperty(familyName);
		this.email = new SimpleStringProperty(email);
	}
	/**
	 * Null constructor
	 */
	public Guide() {
		this(0, null, null, null);
	}

	public int getId() {
		return anstId.get();
	}

	public void setId(int id) {
		this.anstId.set(id);
	}

	public IntegerProperty getIdProperty() {
		return anstId;
	}

	public String getGivenName() {
		return givenName.get();
	}

	public void setGivenName(String givenName) {
		this.givenName.set(givenName);
	}

	public StringProperty getGivenNameProperty() {
		return givenName;
	}

	public String getFamilyName() {
		return familyName.get();
	}

	public void setFamilyName(String familyName) {
		this.familyName.set(familyName);
	}

	public StringProperty getFamilyNameProperty() {
		return familyName;
	}

	public String getEmail() {
		return email.get();
	}

	public void setEmail(String email) {
		this.email.set(email);
	}

	public StringProperty getEmailProperty() {
		return email;
	}
}
