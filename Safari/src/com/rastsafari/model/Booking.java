package com.rastsafari.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Booking {
	
	private IntegerProperty id;
	private Customer customer;
	private Safari safari;
	private IntegerProperty priceIndex;

	
	public Booking(){
		this(0,null,null,0);
	}
	
	public Booking(int id,Customer customer, Safari safari, int priceIndex){
		this.id= 			new SimpleIntegerProperty(id);
		this.customer= 		customer;
		this.safari= 		safari;
		this.priceIndex=	new SimpleIntegerProperty(priceIndex);

	}
	
	public int getId(){
		return id.get();
	}
	
	public void setId(int id){
		this.id.set(id);
	}
	
	public IntegerProperty idProperty(){
		return id;
	}
	public Customer getCustomer(){
		return customer;
	}
	
	public Safari getSafari(){
		return safari;
	}
	public int getPriceIndex(){
		return priceIndex.get();
	}
	public void setPriceIndex(int priceIndex){
		this.priceIndex.set(priceIndex);
	}
	public IntegerProperty priceIndexProperty(){
		return priceIndex;
	}
}
