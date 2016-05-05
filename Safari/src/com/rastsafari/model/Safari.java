package com.rastsafari.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
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
	private DoubleProperty price;
	private Guide safariGuide;
	
	
	private IntegerProperty takenSlots;
	private IntegerProperty avalibleSlots;
	private ObservableList<Booking> bookedCustomers;
	
	public Safari(int id, SafariLocation location, String date, String startTime,
				  String endTime, int price,Guide guide) {
		this.id = new SimpleIntegerProperty(id);
		this.location = location;
		this.date = new SimpleStringProperty(date);
		this.startTime = new SimpleStringProperty(startTime);
		this.endTime = new SimpleStringProperty(endTime);
		this.price = new SimpleDoubleProperty(price);
		this.safariGuide = guide;
		this.bookedCustomers = FXCollections.observableArrayList();
		if (location != null) {
			this.minParticipants = new SimpleIntegerProperty(location.getMinParticipant());
			this.maxParticipants = new SimpleIntegerProperty(location.getMaxParticipant());
			this.takenSlots = new SimpleIntegerProperty(bookedCustomers.size());
			this.avalibleSlots = new SimpleIntegerProperty(location.getMaxParticipant() - bookedCustomers.size());
		} else {
			this.minParticipants = new SimpleIntegerProperty();
			this.maxParticipants = new SimpleIntegerProperty();
			this.takenSlots = new SimpleIntegerProperty();
			this.avalibleSlots = new SimpleIntegerProperty();
		}
		
		
	}
	public Safari() {
		this(0,null,null,null,null,0,null);
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
	public void setMinParticipants(int min) {
		this.minParticipants.set(min);
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
	public double getPrice() {
		return price.get();
	}
	public void setPrice(double price) {
		this.price.set(price);
	}
	public Guide getGuide() {
		return safariGuide;
	}
	public void setGuide(Guide g) {
		this.safariGuide = g;
	}
	public DoubleProperty getPriceProperty() {
		return price;
	}
	public void addBookingToList(Booking b) {
		bookedCustomers.add(b);
	}
	public IntegerProperty getTakenSlotsProperty() {
		return takenSlots;
	}
	public int getTakenSlots() {
		return takenSlots.get();
	}
	public void setTakenSlots(ObservableList<Booking> bookings) {
		this.takenSlots.set(bookings.size());
	}
	public IntegerProperty getAvalibleSlotsProperty() {
		return avalibleSlots;
	}
	public int getAvalibleSlots() {
		return avalibleSlots.get();
	}
	public void setAvalibleSlots(ObservableList<Booking> bookings) {
		this.avalibleSlots.set(this.getMaxParticipants() - bookings.size());
	}
	public void initBookedCustomers() {
		this.bookedCustomers = FXCollections.observableArrayList();
	}
	public void setBookedCustomers(ObservableList<Booking> b) {
		this.bookedCustomers = b;
	}
	public ObservableList<Booking> getBookedCustomers() {
		return bookedCustomers;
	}

}













