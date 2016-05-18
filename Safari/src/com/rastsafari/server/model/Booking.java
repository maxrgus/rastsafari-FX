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
	private boolean isPayed;
	private double price;
	/**
	 * Null constructor
	 */
	public Booking() {
		this(0, null, null,0);
		this.price = 0;
	}
	/**
	 * Default constructor
	 * @param id
	 * @param customer
	 * @param safari
	 */
	public Booking(int id, Customer customer, Safari safari, int payed) {
		this.id = new SimpleIntegerProperty(id);
		this.customer = customer;
		this.safari = safari;
		if (payed == 0) {
			this.isPayed = false; 
		} else {
			this.isPayed = true;
		}
		if(safari != null) {
			this.price = safari.getPrice();
		} else {
			this.price = 0;
		}
		

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
	public boolean getIsPayed() {
		return isPayed;
	}
	public void setIsPayed(boolean isPayed) {
		this.isPayed = isPayed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
