package com.rastsafari.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Safari {
	private IntegerProperty id;
	private SafariLocation location;
	private StringProperty date;
	private StringProperty startTime;
	private StringProperty endTime;
	private IntegerProperty minParticipants;
	private IntegerProperty maxParticipants;
	
	private ObservableList<Booking> bookedCustomers;
	
	public Safari(int id, SafariLocation location, String date, String startTime,
				  String endTime) {
		this.id = new SimpleIntegerProperty(id);
		this.location = location;
		this.date = new SimpleStringProperty(date);
		this.startTime = new SimpleStringProperty(startTime);
		this.endTime = new SimpleStringProperty(endTime);
		this.minParticipants = new SimpleIntegerProperty(location.getMinParticipant());
		this.maxParticipants = new SimpleIntegerProperty(location.getMaxParticipant());
		this.bookedCustomers = FXCollections.observableArrayList();
		
	}
	public Safari() {
		this(0,null,null,null,null);
	}
	
	public int getId() {
		return id.get();
	}
	public void setId(int id) {
		this.id.set(id);
	}
	public IntegerProperty getidProperty() {
		return id;
	}
	public SafariLocation getLocation() {
		return location;
	}
	public void setLocation(SafariLocation location) {
		this.location = location;
	}
	public String getDate() {
		return date.get();
	}
	public void setDate(String date) {
		this.date.set(date);
	}
	public StringProperty getDateProperty() {
		return date;
	}
	public String getStartTime() {
		return startTime.get();
	}
	public void setStartTime(String startTime) {
		this.startTime.set(startTime);
	}
	public StringProperty getStartTimeProperty() {
		return startTime;
	}
	public String getEndTime() {
		return endTime.get();
	}
	public void setEndTime(String endTime) {
		this.endTime.set(endTime);
	}
	public StringProperty getEndTimeProperty() {
		return endTime;
	}
	public int getMinParticipants() {
		return minParticipants.get();
	}
	public void setMinParticipants(int minParticipants) {
		this.minParticipants.set(minParticipants);
	}
	public IntegerProperty getMinParticipantsProperty() {
		return minParticipants;
	}
	public int getMaxParticipants() {
		return maxParticipants.get();
	}
	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants.set(maxParticipants);
	}
	public IntegerProperty getMaxParticipantsProperty() {
		return maxParticipants;
	}
	public void addBookingToList(Booking b) {
		bookedCustomers.add(b);
	}
	
}













