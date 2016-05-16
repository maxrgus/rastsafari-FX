package com.rastsafari.server.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * Booking model
 * @author maxrg
 *
 */
public class Booking {

	private IntegerProperty id;
	private Customer customer;
	private Safari safari;
	/**
	 * Null constructor
	 */
	public Booking() {
		this(0, null, null);
	}
	/**
	 * Default constructor
	 * @param id
	 * @param customer
	 * @param safari
	 */
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
