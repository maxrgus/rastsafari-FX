package com.rastsafari.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer {

private IntegerProperty id;
private StringProperty  fName;
private StringProperty  lName;
private StringProperty pNumber;
private StringProperty  eMail;
private StringProperty dNumber;
private StringProperty nNumber;
private StringProperty allNumber;
private IntegerProperty  category;

public Customer(){
	this(0,null,null,null,null,null,null,0);
}

public Customer(int id, String fName, String lName,String pNumber, String eMail, String dNumber, String nNumber, int category){
	this.id=       new SimpleIntegerProperty(id);
	this.fName=    new SimpleStringProperty(fName);
	this.lName=    new SimpleStringProperty(lName);
	this.pNumber=  new SimpleStringProperty(pNumber);
	this.eMail=    new SimpleStringProperty(eMail);
	this.dNumber=  new SimpleStringProperty(dNumber);
	this.nNumber=  new SimpleStringProperty(nNumber);
	this.category= new SimpleIntegerProperty(category);
	this.allNumber = new SimpleStringProperty(dNumber + "/" + nNumber);
}

public int getid(){
	
	return id.get();
}

public void setId(int id){
	this.id.set(id);
	
}

public IntegerProperty idProperty(){
	return id;
	
}

public String getFName(){
	
	return fName.get();
}

public void setFName(String fName){
	this.fName.set(fName);
	
}

public StringProperty fNameProperty(){
	
	return fName;
}

public String getLName(){
	
	return lName.get();
}

public void setLName(String lName){
	this.lName.set(lName);
	
}

public StringProperty lNameProperty(){
	
	return lName;
	
}
public String getPNumber(){
	
	return pNumber.get();
}

public void setPNumber(String pNumber){
	this.pNumber.set(pNumber);
	
}

public StringProperty pNumberProperty(){
	return pNumber;
}


public String getEMail(){
	
	return eMail.get();

}

public void setEMail(String eMail){
	
	this.eMail.set(eMail);
}

public StringProperty eMailProperty(){
	return eMail;
	
}
public StringProperty allNumberProperty() {
	return allNumber;
}
public String getAllNumber() {
	return allNumber.get();
}
public void setAllNumber() {
	this.allNumber.set(this.dNumber.get() + "/" + this.nNumber.get());
}

public String getDNumber(){
	
	return dNumber.get();
}

public void setDNumber(String dNumber){
	this.dNumber.set(dNumber);
	
}

public StringProperty dNumberProperty(){
	
	return dNumber;
}


public String getNNumber(){
	
	return nNumber.get();
}

public void setNNumber(String nNumber){
	this.nNumber.set(nNumber);
}

public StringProperty nNumberProperty(){
	return nNumber;
}


public int getCategory(){
	
	return category.get();
}

public void setCategory(int category){
	this.category.set(category);
}

public IntegerProperty categoryProperty(){
	return category;
}

	
}
