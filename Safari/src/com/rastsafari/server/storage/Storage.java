package com.rastsafari.server.storage;

import java.time.LocalDate;
import java.util.ArrayList;

import com.rastsafari.server.model.Booking;
import com.rastsafari.server.model.Customer;
import com.rastsafari.server.model.CustomerCategory;
import com.rastsafari.server.model.Gear;
import com.rastsafari.server.model.Guide;
import com.rastsafari.server.model.GuideSalary;
import com.rastsafari.server.model.Safari;
import com.rastsafari.server.model.SafariLocation;

import javafx.collections.ObservableList;

public interface Storage {

	public void addSafariLocation(SafariLocation location);

	public void addCustomer(Customer c);

	public void addCustomerCategory(CustomerCategory category);

	public void addSafari(Safari s);

	public void addBooking(Booking b);

	public void addGear(Gear g);

	public void addGuide(Guide g);
	
	public void addGearReq(Gear g, SafariLocation sl);

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
	
	public void removeGearReq(Gear g, SafariLocation sl);

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

	public ObservableList<Safari> getUpNextSafariFromStorage(LocalDate date);

	public ObservableList<Booking> getBookingsFromStorage();

	public ObservableList<CustomerCategory> getCategoriesFromStorage();

	public ObservableList<Guide> getGuidesFromStorage();

	public ObservableList<Booking> getSafariBookingsFromStorage(int id);
	
	public ArrayList<GuideSalary> getGuideSalaryFromStorage(int id,String startDate,String endDate);

}
