package com.rastsafari.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer {

private IntegerProperty id;
private StringProperty fName;
private StringProperty lName;
private IntegerProperty pNumber;
private StringProperty eMail;
private IntegerProperty dNumber;
private IntegerProperty nNumber;
private StringProperty category;

public Customer(){
	this(0,null,null,0,null,0,0,null);
}

public Customer(int id, String fName, String lName,int pNumber, String eMail, int dNumber, int nNumber, String category){
	this.id=new SimpleIntegerProperty(id);
	this.fName= new SimpleStringProperty(fName);
	this.lName= new SimpleStringProperty(lName);
	this.pNumber= new SimpleIntegerProperty(pNumber);
	this.eMail= new SimpleStringProperty(eMail);
	this.dNumber= new SimpleIntegerProperty(dNumber);
	this.nNumber= new SimpleIntegerProperty(nNumber);
	this.category= new SimpleStringProperty(category);
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
public int getPNumber(){
	
	return pNumber.get();
}

public void setPNumber(int pNumber){
	this.pNumber.set(pNumber);
	
}

public IntegerProperty pNumberProperty(){
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


public int getDNumber(){
	
	return dNumber.get();
}

public void setDNumber(int dNumber){
	this.dNumber.set(dNumber);
	
}

public IntegerProperty dNumberProperty(){
	
	return dNumber;
}


public int getNNumber(){
	
	return nNumber.get();
}

public void setNNumber(int nNumber){
	this.nNumber.set(nNumber);
}

public IntegerProperty nNumberProperty(){
	return nNumber;
}


public String getCategory(){
	
	return category.get();
}

public void setCategory(String category){
	this.category.set(category);
}

public StringProperty categoryProperty(){
	return category;
}

	
}
