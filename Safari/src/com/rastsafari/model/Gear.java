package com.rastsafari.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Gear {
	
	private IntegerProperty id;
	private StringProperty gearName;
	private StringProperty description;
	private IntegerProperty inStock;
	
	public Gear() {
		this(0,null,null,0);
	}
	public Gear(int id, String gearName, String description, int inStock) {
		this.id 		 = new SimpleIntegerProperty(id);
		this.gearName 	 = new SimpleStringProperty(gearName);
		this.description = new SimpleStringProperty(description);
		this.inStock	 = new SimpleIntegerProperty(inStock);
	}
	
	/* Getters and setters */
	public int getId() {
		return id.get();
	}
	public void setId(int id) {
		this.id.set(id);
	}
	public IntegerProperty getIdProperty() {
		return id;
	}
	
	public String getGearName() {
		return gearName.get();
	}
	public void setGearName(String gearName) {
		this.gearName.set(gearName);
	}
	public StringProperty getGearNameProperty() {
		return gearName;
	}
	
	public String getDescription() {
		return description.get();
	}
	public void setDescription(String description) {
		this.description.set(description);
	}
	public StringProperty getDescriptionProperty() {
		return description;
	}
	
	public int getInStock() {
		return inStock.get();
	}
	public void setInStock(int inStock) {
		this.inStock.set(inStock);
	}
	public IntegerProperty getInStockProperty() {
		return inStock;
	}
	
}


















