package com.rastsafari.server.storage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import com.rastsafari.MainApp;
import com.rastsafari.server.model.Booking;
import com.rastsafari.server.model.Customer;
import com.rastsafari.server.model.CustomerCategory;
import com.rastsafari.server.model.Gear;
import com.rastsafari.server.model.Guide;
import com.rastsafari.server.model.GuideSalary;
import com.rastsafari.server.model.Safari;
import com.rastsafari.server.model.SafariLocation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Class that implements storage interface
 * <p>
 * contains methods for working with a SQLite DB.
 * 
 * @author maxrg
 *
 */
public class StorageDB implements Storage {
	private SafariDatabase sd = new SafariDatabase();
	

	@Override
	public void addSafariLocation(SafariLocation location) {
		
		Connection c = sd.createConnection();
		try {
			Statement s = c.createStatement();
			s.executeUpdate(
					"INSERT INTO safariLocation (locationName,description,location,minParticipants,maxParticipants, isActive) VALUES ('"
							+ location.getLocationName() + "','" + location.getDescription() + "','"
							+ location.getLocation() + "'," + location.getMinParticipant() + ","
							+ location.getMaxParticipant() + "," + location.getIsActive() + ")");
			for (Gear gear : location.getGearReq()) {
				s.executeUpdate(
						"INSERT INTO gearReq VALUES ("+location.getId()+","+gear.getId()+");");
			}

		} catch (SQLException se) {
			se.printStackTrace();
		}

	}

	@Override
	public void addCustomer(Customer customer) {
		
		Connection c = sd.createConnection();
		try {
			Statement s = c.createStatement();
			String sql = "INSERT INTO customer (customerCatID,SSID,givenName,familyName,email,adress" + ",phoneDay,phoneNight)"
					+ "VALUES (" + customer.getCategory() + ",'" + customer.getPNumber() + "','" + customer.getFName() + "','"
					+ customer.getLName() + "','" + customer.getEMail() + "','" +customer.getAdress()+"','"+ customer.getDNumber() + "','"
					+ customer.getNNumber() + "')";
			s.executeUpdate(sql);
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	@Override
	public void addCustomerCategory(CustomerCategory category) {
		
		Connection c = sd.createConnection();
		try {
			Statement s = c.createStatement();
			String sql = "INSERT INTO customerCategory (categoryName, priceIndex)" + "VALUES ('"
					+ category.getCategoryName() + "'," + category.getPriceIndex() + ")";
			s.executeUpdate(sql);
		} catch (SQLException se) {
			se.printStackTrace();
		}

	}

	@Override
	public void addSafari(Safari s) {
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "INSERT INTO safari (safariLocationId,date,hour,endHour,minParticipants,maxParticipants,price,guideId) "
					+ "VALUES (" + s.getLocation().getId() + ",'" + s.getDate() + "','" + s.getStartTime() + "','"
					+ s.getEndTime() + "'," + s.getMinParticipants() + "," + s.getMaxParticipants() + "," + s.getPrice()
					+ ","+s.getGuide().getId()+");";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addGuide(Guide g) {
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "INSERT INTO guide (familyName,givenName,email) " + "VALUES ('" + g.getGivenName() + "','"
					+ g.getFamilyName() + "','" + g.getEmail() + "');";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addBooking(Booking b) {
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "INSERT INTO Booking (customerId,safariId,priceIndex) " + "VALUES (" + b.getCustomer().getid()
					+ "," + b.getSafari().getId() + ",0);";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addGear(Gear g) {
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "INSERT INTO gear (gearName,description) " + "VALUES ('" + g.getGearName() + "','"
					+ g.getDescription() + "');";
			String sql2 = "INSERT INTO gearStock (amount) " + "VALUES (" + g.getInStock() + ");";
			st.executeUpdate(sql + sql2);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	@Override
	public void addGearReq(Gear g,SafariLocation sl) {
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "INSERT INTO gearReq VALUES ("+sl.getId()+","+g.getId()+");";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateSafariLocation(SafariLocation location) {
		
		Connection c = sd.createConnection();
		try {
			Statement s = c.createStatement();
			String update = "UPDATE safariLocation SET locationName = '" + location.getLocationName()
					+ "', description = '" + location.getDescription() + "', location = '" + location.getLocation()
					+ "', minParticipants = '" + location.getMinParticipant() + "', maxParticipants = '"
					+ location.getMaxParticipant() + "', isActive = '" + location.getIsActive() + "'  where id = +"
					+ location.getId();
			s.executeUpdate(update);

		} catch (SQLException se) {
			se.printStackTrace();
		}

	}

	@Override
	public void updateCustomer(Customer customer) {
		
		Connection c = sd.createConnection();
		try {
			Statement s = c.createStatement();
			String update = "UPDATE customer SET customerCatID = " + customer.getid() + ", SSID = '"
					+ customer.getPNumber() + "', givenName = '" + customer.getFName() + "', familyName = '"
					+ customer.getLName() + "', email = '" + customer.getEMail() + "', phoneDay = '"
					+ customer.getDNumber() + "', phoneNight = '" + customer.getNNumber() + "' WHERE id == "
					+ customer.getid() + ";";
			s.executeUpdate(update);

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	@Override
	public void updateCustomerCategory(CustomerCategory category) {
		
		Connection c = sd.createConnection();
		try {
			Statement s = c.createStatement();
			String update = "UPDATE customerCategory SET categoryName = '" + category.getCategoryName()
					+ "', priceIndex = " + category.getPriceIndex() + " WHERE id = " + category.getId();
			s.executeUpdate(update);
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	@Override
	public void updateSafari(Safari s) {
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "UPDATE safari SET safariLocationId = '" + s.getLocation().getId() + "'" + ", date = '"
					+ s.getDate() + "', hour = '" + s.getStartTime() + ", endHour = '" + s.getEndTime()
					+ "', minParticipants = " + s.getMinParticipants() + ", maxParticpants = " + s.getMaxParticipants()
					+ ", price = " + s.getPrice() + " WHERE id = " + s.getId() + ";";
			st.executeUpdate(sql);
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	@Override
	public void updateGuide(Guide g) {
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "UPDATE guide SET givenName = '" + g.getGivenName() + "', familyName = '" + g.getFamilyName()
					+ "', " + "email = '" + g.getEmail() + "' WHERE id == " + g.getId() + ";";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateBooking(Booking b) {
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "UPDATE Booking SET customerId = " + b.getCustomer().getid() + ", safariId = "
					+ b.getSafari().getId() + " " + "WHERE bookingNr == " + b.getId() + ";";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateGear(Gear g) {
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "UPDATE gear SET gearName = '" + g.getGearName() + "'" + ", description = '"
					+ g.getDescription() + "' " + "WHERE id = " + g.getId() + ";";
			String sql2 = "UPDATE gearStock SET amount = " + g.getInStock() + " " + "WHERE gid = " + g.getId() + ";";
			st.executeUpdate(sql + sql2);
		} catch (SQLException se) {
			se.printStackTrace();
		}

	}

	@Override
	public void removeSafariLocation(SafariLocation location) {
		String idNr = Integer.toString(location.getId());
		
		Connection c = sd.createConnection();
		try {
			Statement s = c.createStatement();
			// TODO Validering s� en location som �r bokad inte g�r att ta
			// bort.(Ska inte ligga i denna metoden!)
			String remove = "DELETE FROM safariLocation where id = +'" + idNr + "'";
			s.execute(remove);

		} catch (SQLException se) {
			se.printStackTrace();
		}

	}

	@Override
	public void removeCustomer(Customer customer) {
		int id = customer.getid();
		
		Connection c = sd.createConnection();
		try {
			Statement s = c.createStatement();
			String remove = "DELETE FROM customer where id == " + id + ";";
			s.execute(remove);
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	@Override
	public void removeCustomerCategory(CustomerCategory category) {
		String idNr = Integer.toString(category.getId());
		
		Connection c = sd.createConnection();
		try {
			Statement s = c.createStatement();
			String remove = "DELETE FROM customerCategory where id = '" + idNr + "';";
			s.execute(remove);
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	@Override
	public void removeSafari(Safari s) {
		int id = s.getId();
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "DELETE FROM safari WHERE id==" + id + ";";
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removeGuide(Guide g) {
		int id = g.getId();
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "DELETE FROM guide WHERE id==" + id + ";";
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeBooking(Booking b) {
		int id = b.getId();
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "DELETE FROM Booking WHERE bookingNr==" + id + ";";
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeGear(Gear g) {
		int id = g.getId();
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "DELETE FROM gear WHERE id==" + id + ";";
			String sql2 = "DELETE FROM gearStock WHERE id==" + id + ";";
			st.execute(sql + sql2);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	@Override
	public void removeGearReq(Gear g, SafariLocation sl) {
		int gid = g.getId();
		int sid = sl.getId();
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "DELETE FROM gearReq WHERE sid==" + sid + " AND gid == "+gid+";";
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ObservableList<SafariLocation> getLocationsFromStorage() {
		ObservableList<SafariLocation> locations = FXCollections.observableArrayList();
		ObservableList<Gear> gearReq;
		String sqlGear;
		
		Connection c = sd.createConnection();
		try {
			Statement statement = c.createStatement();
			Statement gearStatement = c.createStatement();
			String sql = "SELECT * FROM safariLocation;";

			ResultSet rs = statement.executeQuery(sql);
			ResultSet gs;

			while (rs.next()) {
				int id = rs.getInt("id");
				gearReq = FXCollections.observableArrayList();
				sqlGear = "SELECT DISTINCT gear.*,gearStock.amount from gear,safariLocation,gearReq,gearStock " +
								 "WHERE gear.id == gearReq.gid AND gearStock.gid == gear.id AND gearReq.sid == "+id+";";
				gs = gearStatement.executeQuery(sqlGear);
				while(gs.next()) {
					gearReq.add(new Gear(
								gs.getInt("id"),
								gs.getString("gearName"),
								gs.getString("description"),
								gs.getInt("amount")));
				}
				gs.close();
				locations.add(new SafariLocation(id, rs.getString("locationName"),
						rs.getString("description"), rs.getString("location"), rs.getInt("minParticipants"),
						rs.getInt("maxParticipants"), rs.getInt("isActive"),gearReq));
			}
			rs.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return locations;
	}

	@Override
	public ObservableList<Customer> getCustomersFromStorage() {
		ObservableList<Customer> customers = FXCollections.observableArrayList();
		
		Connection c = sd.createConnection();

		try {
			Statement statement = c.createStatement();
			String sql = "SELECT * FROM customer;";

			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				customers.add(new Customer(rs.getInt("id"), rs.getString("givenName"), rs.getString("familyName"),
						rs.getString("SSID"), rs.getString("email"), rs.getString("adress"), rs.getString("phoneDay"),
						rs.getString("phoneNight"), rs.getInt("customerCatId")));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customers;
	}

	@Override
	public ObservableList<Gear> getGearFromStorage() {
		ObservableList<Gear> gearList = FXCollections.observableArrayList();
		
		Connection c = sd.createConnection();

		try {
			Statement statement = c.createStatement();
			String sql = "SELECT gear.*, gearStock.amount FROM gear,gearStock " + "WHERE gear.id == gearStock.gid;";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				gearList.add(new Gear(rs.getInt("id"), rs.getString("gearName"), rs.getString("description"),
						rs.getInt("amount")));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gearList;
	}

	@Override
	public ObservableList<Safari> getSafarisFromStorage() {
		ObservableList<Safari> safaris = FXCollections.observableArrayList();
		
		Connection c = sd.createConnection();
		try {
			Statement statement = c.createStatement();
			String sql = "SELECT safari.id,safariLocation.*,safari.date,safari.hour,safari.endhour,safari.price,guide.* "
					+ "FROM safari,safariLocation,guide " + "WHERE safariLocation.id == safari.safariLocationId "
					+ "AND safari.guideId == guide.id;";
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				safaris.add(new Safari(rs.getInt(1),
						new SafariLocation(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
								rs.getInt(6), rs.getInt(7), rs.getInt(8)),
						rs.getString(9), rs.getString(10), rs.getString(11), rs.getInt(12),
						new Guide(rs.getInt(13), rs.getString(14), rs.getString(15), rs.getString(16))));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return safaris;

	}

	@Override
	public ObservableList<Safari> getUpNextSafariFromStorage(LocalDate date) {
		ObservableList<Safari> upNextSafariList = FXCollections.observableArrayList();
		
		Connection c = sd.createConnection();
		LocalDate twoWeeks = date.plusDays(14);
		try {
			Statement st = c.createStatement();
			String sql = "SELECT safari.id,safariLocation.*,safari.date,safari.hour,safari.endhour,safari.price,guide.* "
					+ "FROM safari,safariLocation,guide " + "WHERE safariLocation.id == safari.safariLocationId "
					+ "AND safari.guideId == guide.id " + "AND safari.date <= '" + twoWeeks.toString() + "';";
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				upNextSafariList.add(new Safari(rs.getInt(1),
						new SafariLocation(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
								rs.getInt(6), rs.getInt(7), rs.getInt(8)),
						rs.getString(9), rs.getString(10), rs.getString(11), rs.getInt(12),
						new Guide(rs.getInt(13), rs.getString(14), rs.getString(15), rs.getString(16))));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return upNextSafariList;
	}

	@Override
	public ObservableList<Booking> getBookingsFromStorage() {
		ObservableList<Booking> bookings = FXCollections.observableArrayList();
		
		Connection c = sd.createConnection();

		try {
			Statement statement = c.createStatement();
			String sql = "SELECT Booking.bookingNr,customer.id, customer.customerCatID, customer.SSID, "
					+ "customer.givenName, customer.familyName,"
					+ "customer.email, customer.adress, customer.phoneDay, customer.phoneNight,safari.id,safariLocation.*,"
					+ "safari.date,safari.hour,safari.endHour,safari.price,guide.* "
					+ "FROM Booking,customer,safari,safariLocation,guide " + "WHERE Booking.customerId == customer.id "
					+ "AND Booking.safariId == safari.id " + "AND safari.safariLocationId == safariLocation.id "
					+ "AND safari.guideId == guide.id;";

			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				bookings.add(new Booking(rs.getInt(1),
						new Customer(rs.getInt(2), rs.getString(5), rs.getString(6), rs.getString(4), rs.getString(7),
								rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(3)),
						new Safari(rs.getInt(11),
								new SafariLocation(rs.getInt(12), rs.getString(13), rs.getString(14), rs.getString(15),
										rs.getInt(16), rs.getInt(17), rs.getInt(18)),
								rs.getString(19), rs.getString(20), rs.getString(21), rs.getInt(22),
								new Guide(rs.getInt(23), rs.getString(24), rs.getString(25), rs.getString(26)))));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookings;
	}

	@Override
	public ObservableList<CustomerCategory> getCategoriesFromStorage() {
		ObservableList<CustomerCategory> categories = FXCollections.observableArrayList();
		
		Connection c = sd.createConnection();

		try {
			Statement statement = c.createStatement();
			String sql = "SELECT * FROM customerCategory;";

			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				categories.add(new CustomerCategory(rs.getInt("id"), rs.getString("categoryName"),
						rs.getDouble("priceIndex")));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return categories;
	}

	@Override
	public ObservableList<Guide> getGuidesFromStorage() {
		ObservableList<Guide> guides = FXCollections.observableArrayList();
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "SELECT * FROM guide;";
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				guides.add(new Guide(rs.getInt("id"), rs.getString("givenName"), rs.getString("familyName"),
						rs.getString("email")));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return guides;
	}

	@Override
	public ObservableList<Booking> getSafariBookingsFromStorage(int safariId) {
		ObservableList<Booking> safariBookings = FXCollections.observableArrayList();
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "SELECT Booking.bookingNr,customer.id, customer.customerCatID, customer.SSID, "
					+ "customer.givenName, customer.familyName,"
					+ "customer.email, customer.adress, customer.phoneDay, customer.phoneNight,safari.id,safariLocation.*,"
					+ "safari.date,safari.hour,safari.endHour,safari.price,guide.* "
					+ "FROM Booking,customer,safari,safariLocation,guide " + "WHERE Booking.customerId == customer.id "
					+ "AND Booking.safariId == safari.id " + "AND safari.safariLocationId == safariLocation.id "
					+ "AND safari.guideId == guide.id " + "AND Booking.safariId == " + safariId + ";";
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				safariBookings.add(new Booking(rs.getInt(1),
						new Customer(rs.getInt(2), rs.getString(5), rs.getString(6), rs.getString(4), rs.getString(7),
								rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(3)),
						new Safari(rs.getInt(11),
								new SafariLocation(rs.getInt(12), rs.getString(13), rs.getString(14), rs.getString(15),
										rs.getInt(16), rs.getInt(17), rs.getInt(18)),
								rs.getString(19), rs.getString(20), rs.getString(21), rs.getInt(22),
								new Guide(rs.getInt(23), rs.getString(24), rs.getString(25), rs.getString(26)))));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return safariBookings;
	}
	@Override
	public ArrayList<GuideSalary> getGuideSalaryFromStorage(int id,String startDate,String endDate) {
		ArrayList<GuideSalary> salaryObjects = new ArrayList<GuideSalary>();
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "SELECT safari.date,safariLocation.locationName,safariLocation.description,safari.price FROM safari,safariLocation "
					+ "WHERE safari.safariLocationId == safariLocation.id "
					+ "AND safari.guideId == "+id+" "
					+ "AND safari.date >= '"+startDate+"' "
					+ "AND safari.date <= '"+endDate+"';";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				salaryObjects.add(new GuideSalary(rs.getString(1),
												  rs.getString(2) + " " + rs.getString(3),
												  rs.getInt(4)));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return salaryObjects;
	}

	@Override
	public int generateBookingId() {
		int id = 0;
		Statement s = null;
		
		Connection c = sd.createConnection();
		try {
			s = c.createStatement();
			String sql = "SELECT MAX(seq) FROM sqlite_sequence WHERE name == 'Booking';";
			ResultSet rs = s.executeQuery(sql);
			id = rs.getInt(1);
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		id++;
		return id;
	}

	@Override
	public int generateCategoryId() {
		int id = 0;
		Statement s = null;
		
		Connection c = sd.createConnection();
		try {
			s = c.createStatement();
			String sql = "SELECT MAX(seq) FROM sqlite_sequence WHERE name == 'customerCategory';";
			ResultSet rs = s.executeQuery(sql);
			id = rs.getInt(1);
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		id++;
		return id;
	}

	@Override
	public int generateCustomerId() {
		int id = 0;
		Statement s = null;
		
		Connection c = sd.createConnection();
		try {
			s = c.createStatement();
			String sql = "SELECT MAX(seq) FROM sqlite_sequence WHERE name == 'customer';";
			ResultSet rs = s.executeQuery(sql);
			id = rs.getInt(1);
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		id++;
		return id;
	}

	@Override
	public int generateLocationId() {
		int id = 0;
		Statement s = null;
		
		Connection c = sd.createConnection();
		try {
			s = c.createStatement();
			String sql = "SELECT MAX(seq) FROM sqlite_sequence WHERE name == 'safariLocation';";
			ResultSet rs = s.executeQuery(sql);
			id = rs.getInt(1);
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		id++;
		return id;
	}

	@Override
	public int generateSafariId() {
		int id = 0;
		Statement s = null;
		
		Connection c = sd.createConnection();
		try {
			s = c.createStatement();
			String sql = "SELECT MAX(seq) FROM sqlite_sequence WHERE name == 'Safari';";
			ResultSet rs = s.executeQuery(sql);
			id = rs.getInt(1);
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		id++;
		return id;
	}

	@Override
	public int generateGearId() {
		int id = 0;
		Statement s = null;
		
		Connection c = sd.createConnection();
		try {
			s = c.createStatement();
			String sql = "SELECT MAX(seq) FROM sqlite_sequence WHERE name == 'gear';";
			ResultSet rs = s.executeQuery(sql);
			id = rs.getInt(1);
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		id++;
		return id;
	}

	@Override
	public int generateGuideId() {
		int id = 0;
		
		Connection c = sd.createConnection();
		try {
			Statement st = c.createStatement();
			String sql = "SELECT MAX(seq) FROM sqlite_sequence WHERE name == 'guide';";
			ResultSet rs = st.executeQuery(sql);
			id = rs.getInt(1);
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		id++;
		return id;
	}

}
