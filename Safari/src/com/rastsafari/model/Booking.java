package com.rastsafari.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Booking {
	
	private IntegerProperty id;
	private	IntegerProperty bookingNr;
	private IntegerProperty paymentNr;
	private IntegerProperty invoiceNr;
	private IntegerProperty ocrNr;
	private IntegerProperty safariId;
	private StringProperty date;
	private StringProperty hour;
	private StringProperty endHour;
	
	public Booking(){
		this(0,0,0,0,0,0,null,null,null);
	}
	
public Booking(int id, int bookingNr, int paymentNr, int invoiceNr,int ocrNr, int safariId, String date,
	String hour, String endHour){
		this.id= 			new SimpleIntegerProperty(id);
		this.bookingNr= 	new SimpleIntegerProperty(bookingNr);
		this.paymentNr= 	new SimpleIntegerProperty(paymentNr); 
		this.invoiceNr= 	new SimpleIntegerProperty(invoiceNr);
		this.ocrNr=			new SimpleIntegerProperty(ocrNr);
		this.safariId= 		new SimpleIntegerProperty(safariId);
		this.date= 			new SimpleStringProperty(date);
		this.hour= 			new SimpleStringProperty(hour);
		this.endHour= 		new SimpleStringProperty(endHour);
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
	
	public int getBookingNr(){
		return bookingNr.get();
	}
	
	public void setBookingNr(int bookingNr){
		this.bookingNr.set(bookingNr);
	}
	
	public IntegerProperty bookingNrProperty(){
		return bookingNr;
	}
	
	public int getPaymentNr(){
		return paymentNr.get();
	}
	
	public void setPaymentNr(int paymentNr){
		this.paymentNr.set(paymentNr);
	}
	
	public IntegerProperty paymentNrProperty(){
		return paymentNr;
	}
	
	public int getInvoiceNr(){
		return invoiceNr.get();
	}
	
	public void setInvoiceNr(int invoiceNr){
		this.invoiceNr.set(invoiceNr);
	}
	
	public IntegerProperty invoiceNrProperty(){
		return invoiceNr;
	}
	
	public int getOcrNr(){
		return ocrNr.get();
	}
	
	public void setOcrNr(int ocrNr){
		this.ocrNr.set(ocrNr);
	}
	
	public IntegerProperty ocrNrProperty(){
		return ocrNr;
	}
	
	public int getSafarId(){
		return safariId.get();
	}
	
	public void setSafariId(int safariId){
		this.safariId.set(safariId);
	}
	
	public IntegerProperty safariIdPropert(){
		return safariId;
	}
	
	public String getDate(){
		return date.get();
	}
	
	public void setDate(String date){
		this.date.set(date);
	}
	
	public StringProperty dateProperty(){
		return date;
	}
	
	public String getHour(){
		return hour.get();
	}
	
	public void setHour(String hour){
		this.hour.set(hour);
	}
	
	public StringProperty hourProperty(){
		return hour;
	}
	
	public String getEndHour(){
		return endHour.get();
	}
	
	public void setEndHour(String endHour){
		this.endHour.set(endHour);
	}
	
	public StringProperty endHourProperty(){
		return endHour;
	}
	
}
