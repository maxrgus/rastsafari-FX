package com.rastsafari.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Booking {

	private IntegerProperty id;
	private Customer customer;
	private Safari safari;

	public Booking() {
		this(0, null, null);
	}

	public Booking(int id, Customer customer, Safari safari) {
		this.id = new SimpleIntegerProperty(id);
		this.customer = customer;
		this.safari = safari;

	}

	public int getId() {
		return id.get();
	}

	public void setId(int id) {
		this.id.set(id);
	}

	public IntegerProperty idProperty() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer c) {
		this.customer = c;
	}

	public Safari getSafari() {
		return safari;
	}

	public void setSafari(Safari s) {
		this.safari = s;
	}
}
