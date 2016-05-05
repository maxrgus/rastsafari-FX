package com.rastsafari.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CustomerCategory {
	private IntegerProperty id;
	private StringProperty categoryName;
	private DoubleProperty priceIndex;

	public CustomerCategory() {
		this(0, null, 0);
	}

	public CustomerCategory(int id, String categoryName, double priceIndex) {
		this.id = new SimpleIntegerProperty(id);
		this.categoryName = new SimpleStringProperty(categoryName);
		this.priceIndex = new SimpleDoubleProperty(priceIndex);
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

	public String getCategoryName() {
		return categoryName.get();
	}

	public void setCategoryName(String categoryName) {
		this.categoryName.set(categoryName);
	}

	public StringProperty categoryNameProperty() {
		return categoryName;
	}

	public Double getPriceIndex() {
		return priceIndex.get();
	}

	public void setPriceIndex(double priceIndex) {
		this.priceIndex.set(priceIndex);
	}

	public DoubleProperty priceIndexProperty() {
		return priceIndex;
	}

}
