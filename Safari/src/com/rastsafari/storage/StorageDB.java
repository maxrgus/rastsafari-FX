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
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "INSERT INTO safari (safariLocationId,date,hour,endHour,minParticipants,maxParticipants,price) " +
						 "VALUES ("+s.getLocation().getId()+",'"+s.getDate()+"','"+s.getStartTime()+"','"+s.getEndTime()+
						 "',"+s.getMinParticipants()+","+s.getMaxParticipants()+","+s.getPrice()+");";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void addBooking(Booking b) {
		// TODO Auto-generated method stub
		
	}

	
	public void addGear(Gear g) {
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "INSERT INTO gear (gearName,description) " +
						 "VALUES ('"+g.getGearName()+"','"+g.getDescription()+"');";
			String sql2= "INSERT INTO gearStock (amount) "+
						 "VALUES ("+g.getInStock()+");";
			st.executeUpdate(sql+sql2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
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
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "UPDATE safari SET safariLocationId = '"+s.getLocation().getId()+"'" +
						 ", date = '"+s.getDate()+"', hour = '"+s.getStartTime()+", endHour = '" +
						 s.getEndTime()+"', minParticipants = "+s.getMinParticipants()+", maxParticpants = " +
						 s.getMaxParticipants()+", price = "+s.getPrice()+" WHERE id = "+s.getId()+";";
			st.executeUpdate(sql);
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	
	public void updateBooking(Booking b) {
		// TODO Auto-generated method stub
		
	}

	
	public void updateGear(Gear g) {
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "UPDATE gear SET gearName = '"+g.getGearName()+"'" +
						 ", description = '"+g.getDescription()+"' "+
						 "WHERE id = "+g.getId()+";";
			String sql2 = "UPDATE gearStock SET amount = "+g.getInStock()+" "+
					 "WHERE gid = "+g.getId()+";";
			st.executeUpdate(sql+sql2);
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
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
			s.execute(remove);
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
		int id = s.getId();
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "DELETE FROM safari WHERE id=="+id+";";
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	public void removeBooking(Booking b) {
		// TODO Auto-generated method stub
		
	}

	
	public void removeGear(Gear g) {
		int id = g.getId();
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "DELETE FROM gear WHERE id=="+id+";";
			String sql2= "DELETE FROM gearStock WHERE id=="+id+";";
			st.execute(sql+sql2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
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
			String sql = "SELECT Booking.bookingNr,customer.id, customer.customerCatID, customer.SSID, "
					+ "customer.givenName, customer.familyName,"
					+ "customer.email, customer.phoneDay, customer.phoneNight,safari.id,safariLocation.*,"
					+ "safari.date,safari.hour,safari.endHour,safari.price "
					+ "FROM Booking,customer,safari,safariLocation " +
						 "WHERE Booking.customerId == customer.id AND Booking.safariId == safari.id "
						 + "AND safari.safariLocationId == safariLocation.id;";
			
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				bookings.add(new Booking(
						rs.getInt(1),
						new Customer(rs.getInt(2),
									 rs.getString(5),
									 rs.getString(6),
									 rs.getString(4),
									 rs.getString(7),
									 rs.getString(8),
									 rs.getString(9),
									 rs.getInt(3)),
						new Safari(rs.getInt(10),
								   new SafariLocation(rs.getInt(11),
										   			  rs.getString(12),
										   			  rs.getString(13),
										   			  rs.getString(14),
										   			  rs.getInt(15),
										   			  rs.getInt(16),
										   			  rs.getInt(17)),
								   rs.getString(18),
								   rs.getString(19),
								   rs.getString(20),
								   rs.getInt(21))));
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
	public int generateSafariId() {
		int id = 0;
		Statement s = null;
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
	        s = c.createStatement();
	        String sql = "SELECT MAX(id) FROM safari;";
	        ResultSet rs = s.executeQuery(sql);
	        id = rs.getInt(1);
	        rs.close();
	      } catch(Exception e) {
	    	  System.out.println(e);
	      }
	      id++;
	      return id;
	}
	public int generateGearId() {
		int id = 0;
		Statement s = null;
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
	        s = c.createStatement();
	        String sql = "SELECT MAX(id) FROM gear;";
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
