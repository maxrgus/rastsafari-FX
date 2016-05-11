package com.rastsafari.server.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Invoice {

	private IntegerProperty id;
	private Booking b;
	private Customer c;

	public Invoice() {
		this(0, null, null);
	}

	public Invoice(int id, Booking b, Customer c) {
		this.id = new SimpleIntegerProperty(id);
		this.b = b;
		this.c = c;
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

	public Booking getBooking() {
		return b;
	}

	public Customer getCustomer() {
		return c;
	}

}
