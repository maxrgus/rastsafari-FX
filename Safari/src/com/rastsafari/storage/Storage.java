package com.rastsafari.storage;

import com.rastsafari.model.Booking;
import com.rastsafari.model.Customer;
import com.rastsafari.model.CustomerCategory;
import com.rastsafari.model.Gear;
import com.rastsafari.model.Guide;
import com.rastsafari.model.Safari;
import com.rastsafari.model.SafariLocation;

import javafx.collections.ObservableList;

public interface Storage {
	
	public void addSafariLocation(SafariLocation location);
	public void addCustomer(Customer c);
	public void addCustomerCategory(CustomerCategory category);
	public void addSafari(Safari s);
	public void addBooking(Booking b);
	public void addGear(Gear g);
	public void addGuide(Guide g);
	
	public void updateSafariLocation(SafariLocation location);
	public void updateCustomer(Customer c);
	public void updateCustomerCategory(CustomerCategory category);
	public void updateSafari(Safari s);
	public void updateBooking(Booking b);
	public void updateGear(Gear g);
	public void updateGuide(Guide g);
	
	public void removeSafariLocation(SafariLocation location);
	public void removeCustomer(Customer c);
	public void removeCustomerCategory(CustomerCategory category);
	public void removeSafari(Safari s);
	public void removeBooking(Booking b);
	public void removeGear(Gear g);
	public void removeGuide(Guide g);
	
	public int generateCategoryId();
	public int generateCustomerId();
	public int generateLocationId();
	public int generateSafariId();
	public int generateGearId();
	public int generateGuideId();
	public int generateBookingId();

	
	public ObservableList<SafariLocation> getLocationsFromStorage();
	public ObservableList<Customer> getCustomersFromStorage();
	public ObservableList<Gear> getGearFromStorage();
	public ObservableList<Safari> getSafarisFromStorage();
	public ObservableList<Booking> getBookingsFromStorage();
	public ObservableList<CustomerCategory> getCategoriesFromStorage();
	public ObservableList<Guide> getGuidesFromStorage();
	public ObservableList<Booking> getSafariBookingsFromStorage(int id);
		
}
