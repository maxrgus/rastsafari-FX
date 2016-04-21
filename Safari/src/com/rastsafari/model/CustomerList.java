package com.rastsafari.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.*;

public class CustomerList {
	private ObservableList<Customer> customers;
	
	
	public CustomerList() {
		customers = FXCollections.observableArrayList();
		getCustomersFromDb();
	}
	private void getCustomersFromDb() {
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
	}
	public ObservableList<Customer> getCustomerList() {
		return customers;
	}
}
