package com.rastsafari.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Class that stores SafariLocation objects in an observable list.
 * @author maxrg
 *
 */
public class SafariLocationList {
	ObservableList<SafariLocation> locations;
	
	public SafariLocationList() {
		locations = FXCollections.observableArrayList();
		getLocationsFromDatabase();
	}
	private void getLocationsFromDatabase() {
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
	    }
	public ObservableList<SafariLocation> getSafariLocationList() {
		return locations;
	}
	

}
