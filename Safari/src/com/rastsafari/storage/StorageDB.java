package com.rastsafari.storage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.rastsafari.model.Booking;
import com.rastsafari.model.Customer;
import com.rastsafari.model.CustomerCategory;
import com.rastsafari.model.Gear;
import com.rastsafari.model.Safari;
import com.rastsafari.model.SafariDatabase;
import com.rastsafari.model.SafariLocation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StorageDB implements Storage {

	
	public void addSafariLocation(SafariLocation location) {
        SafariDatabase sd = new SafariDatabase();
        Connection c = sd.createConnection();
        try{
            Statement s = c.createStatement();
            s.executeUpdate("INSERT INTO safariLocation (locationName,description,location,minParticipants,maxParticipants, isActive) VALUES ('"+location.getLocationName()+
            		"','"+location.getDescription()+"','"+location.getLocation()+"',"+location.getMinParticipant()+
                    ","+location.getMaxParticipant()+","+location.getIsActive()+")");
            

        } catch(SQLException se){
        	se.printStackTrace();
        }

    }

	public void addCustomer(Customer customer) {
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try{
			Statement s = c.createStatement();
			String sql = "INSERT INTO customer (customerCatID,SSID,givenName,familyName,email"
					+ ",phoneDay,phoneNight)"
					+ "VALUES ("+customer.getid()+",'"+customer.getPNumber()+
					"','"+customer.getFName()+
					"','"+customer.getLName()+
					"','"+customer.getEMail()+
					"','"+customer.getDNumber()+
					"','"+customer.getNNumber()+"')";
			s.executeUpdate(sql);
		} catch(SQLException se){
			se.printStackTrace();
		}
	}

	
	public void addCustomerCategory(CustomerCategory category) {
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try{
			Statement s = c.createStatement();
			String sql = "INSERT INTO customerCategory (categoryName, priceIndex)"
					+ "VALUES ('"+category.getCategoryName()+"',"+category.getPriceIndex()+")";
			s.executeUpdate(sql);
		}catch(SQLException se){
			se.printStackTrace();
		}
		
	}

	public void addSafari(Safari s) {
		// TODO Auto-generated method stub
		
	}

	
	public void addBooking(Booking b) {
		// TODO Auto-generated method stub
		
	}

	
	public void addGear(Gear g) {
		// TODO Auto-generated method stub
		
	}
	public void updateSafariLocation(SafariLocation location) {
        SafariDatabase sd = new SafariDatabase();
        Connection c = sd.createConnection();
        try{
            Statement s = c.createStatement();
            String update = "UPDATE safariLocation SET locationName = '"+location.getLocationName()+
                    "', description = '"+location.getDescription()+
                    "', location = '"+location.getLocation()+
                    "', minParticipants = '"+location.getMinParticipant()+
                    "', maxParticipants = '"+location.getMaxParticipant()+
                    "', isActive = '"+location.getIsActive()+
                    "'  where id = +"+location.getId();
            s.executeUpdate(update);
            
            

        } catch(SQLException se){
        	se.printStackTrace();
        }
		
	}

	public void updateCustomer(Customer customer) {
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			Statement s = c.createStatement();
			String update = "UPDATE customer SET customerCatID = "+customer.getid()+
					", SSID = '"+customer.getPNumber()+
					"', givenName = '"+customer.getFName()+
					"', familyName = '"+customer.getLName()+
					"', email = '"+customer.getEMail()+
					"', phoneDay = '"+customer.getDNumber()+
					"', phoneNight = '"+customer.getNNumber()+
					"' WHERE id == "+customer.getid()+";";
			s.executeUpdate(update);
			
		}catch(SQLException se){
			se.printStackTrace();
		}
	}

	
	public void updateCustomerCategory(CustomerCategory category) {
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			Statement s = c.createStatement();
			String update = "UPDATE customerCategory SET categoryName = '"+category.getCategoryName()+
					"', priceIndex = "+category.getPriceIndex()+
					" WHERE id = "+category.getId();
			s.executeUpdate(update);
		}catch(SQLException se){
			se.printStackTrace();
		}
	}

	
	public void updateSafari(Safari s) {
		// TODO Auto-generated method stub
		
	}

	
	public void updateBooking(Booking b) {
		// TODO Auto-generated method stub
		
	}

	
	public void updateGear(Gear g) {
		// TODO Auto-generated method stub
		
	}

	
	public void removeSafariLocation(SafariLocation location) {
		String idNr = Integer.toString(location.getId());
        SafariDatabase sd = new SafariDatabase();
        Connection c = sd.createConnection();
        try{
            Statement s = c.createStatement();
            //TODO Validering så en location som är bokad inte går att ta bort.(Ska inte ligga i denna metoden!)
            String remove = "DELETE FROM safariLocation where id = +'"+idNr+"'";
            s.execute(remove);

        } catch(SQLException se){
            se.printStackTrace();
        }
		
	}

	
	public void removeCustomer(Customer customer) {
		int id = customer.getid();
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try{
			Statement s = c.createStatement();
			String remove = "DELETE FROM customer where id == "+id+";";
			s.executeUpdate(remove);
		}catch(SQLException se){
			se.printStackTrace();
		}		
	}

	
	public void removeCustomerCategory(CustomerCategory category) {
		String idNr = Integer.toString(category.getId());
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try{
			Statement s = c.createStatement();
			String remove = "DELETE FROM customerCategory where id = '"+idNr+"';";
			s.execute(remove);
		}catch(SQLException se){
			se.printStackTrace();
		}
	}

	
	public void removeSafari(Safari s) {
		// TODO Auto-generated method stub
		
	}

	
	public void removeBooking(Booking b) {
		// TODO Auto-generated method stub
		
	}

	
	public void removeGear(Gear g) {
		// TODO Auto-generated method stub
		
	}

	public ObservableList<SafariLocation> getLocationsFromStorage() {
		ObservableList<SafariLocation> locations = FXCollections.observableArrayList();
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
	      try {
	        Statement statement = c.createStatement();
	        String sql = "SELECT * FROM safariLocation;";

	        ResultSet rs = statement.executeQuery(sql);

	        while (rs.next()) {
	          locations.add(new SafariLocation(
	            rs.getInt("id"),
	            rs.getString("locationName"),
	            rs.getString("description"),
	            rs.getString("location"),
	            rs.getInt("minParticipants"),
	            rs.getInt("maxParticipants"),
	            rs.getInt("isActive")));
	        }
	        rs.close();

	      } catch (Exception e) {
	        System.out.println(e);
	      }
	      return locations;
	}
	public ObservableList<Customer> getCustomersFromStorage() {
		ObservableList<Customer> customers = FXCollections.observableArrayList();
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		
		try {
			Statement statement = c.createStatement();
			String sql = "SELECT * FROM customer;";
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				customers.add(new Customer(
						rs.getInt("id"),
						rs.getString("givenName"),
						rs.getString("familyName"),
						rs.getString("SSID"),
						rs.getString("email"),
						rs.getString("phoneDay"),
						rs.getString("phoneNight"),
						rs.getInt("customerCatId")));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customers;
	}
	public ObservableList<Gear> getGearFromStorage() {
		ObservableList<Gear> gearList = FXCollections.observableArrayList();
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		
		try {
			Statement statement = c.createStatement();
			String sql = "SELECT gear.*, gearStock.amount FROM gear,gearStock "+
						 "WHERE gear.id == gearStock.gid;";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				gearList.add(new Gear (
						rs.getInt("id"),
						rs.getString("gearName"),
						rs.getString("description"),
						rs.getInt("amount")));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gearList;
	}

	public ObservableList<Safari> getSafarisFromStorage() {
		ObservableList<Safari> safaris = FXCollections.observableArrayList();
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			Statement statement = c.createStatement();
			String sql = "SELECT safari.id,safariLocation.*,safari.date,safari.hour,safari.endhour FROM safari,safariLocation WHERE safariLocation.id == safari.safariLocationId";
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				safaris.add(new Safari(
						rs.getInt(1),
						new SafariLocation(rs.getInt(2),
										   rs.getString(3),
										   rs.getString(4),
										   rs.getString(5),
										   rs.getInt(6),
										   rs.getInt(7),
										   rs.getInt(8)),
					   rs.getString(9),
					   rs.getString(10),
					   rs.getString(11),
					   500));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return safaris;
		
		
	}

	
	public ObservableList<Booking> getBookingsFromStorage() {
		ObservableList<Booking> bookings = FXCollections.observableArrayList();
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		
		try{
			Statement statement = c.createStatement();
			String sql = "SELECT * FROM Booking;";
			
			ResultSet rs = statement.executeQuery(sql);
			Statement statement2 = c.createStatement();
			ResultSet rs2;
			
			while(rs.next()){
				rs2 = statement2.executeQuery("SELECT * FROM Customer where id = "+rs.getInt(2));
				System.out.println(rs2);

				
			}
			rs.close();
		} catch (Exception e){
			e.printStackTrace();
		}
		return bookings;
	}

	@Override
	public ObservableList<CustomerCategory> getCategoriesFromStorage() {
		ObservableList<CustomerCategory> categories = FXCollections.observableArrayList();
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		
		try{
			Statement statement = c.createStatement();
			String sql = "SELECT * FROM customerCategory;";
			
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()){
				categories.add(new CustomerCategory(
						rs.getInt("id"),
						rs.getString("categoryName"),
						rs.getDouble("priceIndex")));
			}
			rs.close();
		} catch (Exception e){
			e.printStackTrace();
		}
		return categories;
	}
	public int generateCategoryId(){
		int id = 0;
		Statement s = null;
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			s = c.createStatement();
			String sql = "SELECT MAX(id) FROM customerCategory;";
			ResultSet rs = s.executeQuery(sql);
			id = rs.getInt(1);
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		id++;
		return id;
	}
	public int generateCustomerId(){
		int id = 0;
		Statement s = null;
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			s = c.createStatement();
			String sql = "SELECT MAX(id) FROM customer;";
			ResultSet rs = s.executeQuery(sql);
			id = rs.getInt(1);
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		id++;
		return id;
	}
	public int generateLocationId() {
	      int id = 0;
	      Statement s = null;
	      SafariDatabase sd = new SafariDatabase();
	      Connection c = sd.createConnection();
	      try {
	        s = c.createStatement();
	        String sql = "SELECT MAX(id) FROM safariLocation;";
	        ResultSet rs = s.executeQuery(sql);
	        id = rs.getInt(1);
	        rs.close();
	      } catch(Exception e) {
	        System.out.println(e);
	      }
	      id++;
	      return id;
	    }

}
