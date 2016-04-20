package com.rastsafari.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Safari Location.
 * @author Maximilian Gustafsson
 *
 */
public class SafariLocation {
	private IntegerProperty id;
    private StringProperty locationName;
    private StringProperty description;
    private StringProperty location;
    private IntegerProperty minParticipant;
    private IntegerProperty maxParticipant;
    private IntegerProperty isActive;
    
    /**
     * Default constructor
     */
    public SafariLocation() {
    	this(0,null,null,null,0,0,0);
    }
    
    /**
     * Constructor
     * @param id
     * @param locationName
     * @param description
     * @param location
     * @param minParticipant
     * @param maxParticipant
     * @param isActive
     */
    public SafariLocation(int id, String locationName, String description,
    						String location, int minParticipant,
    						int maxParticipant, int isActive) {
    	this.id = new SimpleIntegerProperty(id);
    	this.locationName = new SimpleStringProperty(locationName);
    	this.description = new SimpleStringProperty(description);
    	this.location = new SimpleStringProperty(location);
    	this.minParticipant = new SimpleIntegerProperty(minParticipant);
    	this.maxParticipant = new SimpleIntegerProperty(maxParticipant);
    	this.isActive = new SimpleIntegerProperty(isActive);
    }
    
    /**
     * Getters and setters
     */
    public int getId() {
    	return id.get();
    }
    public void setId(int id) {
    	this.id.set(id);
    }
    public IntegerProperty idProperty() {
    	return id;
    }
    public String getLocationName() {
    	return locationName.get();
    }
    public void setLocationName(String locationName) {
    	this.locationName.set(locationName);
    }
    public StringProperty locationNameProperty() {
    	return locationName;
    }
    public String getDescription() {
    	return description.get();
    }
    public void setDescription(String description) {
    	this.description.set(description);
    }
    public StringProperty descriptionProperty() {
    	return description;
    }
    public String getLocation() {
    	return location.get();
    }
    public void setLocation(String location) {
    	this.location.set(location);
    }
    public StringProperty locationProperty() {
    	return location;
    }
    public int getMinParticipant() {
    	return minParticipant.get();
    }
    public void setMinParticipant(int minParticipant) {
    	this.minParticipant.set(minParticipant);
    }
    public IntegerProperty minParticipantProperty() {
    	return minParticipant;
    }
    public int getMaxParticipant() {
    	return maxParticipant.get();
    }
    public void setMaxParticipant(int maxParticipant) {
    	this.maxParticipant.set(maxParticipant);
    }
    public IntegerProperty maxParticipantProperty() {
    	return maxParticipant;
    }
    public int getIsActive() {
    	return isActive.get();
    }
    public void setIsActive(int isActive) {
    	this.isActive.set(isActive);
    }
    public IntegerProperty isActiveProperty() {
    	return isActive;
    }
     

}
