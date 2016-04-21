package com.rastsafari.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerMaintenance {
	public CustomerMaintenance(){
		
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
	public void removeCategoryFromDB(int id){
		String idNr = Integer.toString(id);
		Statement s = null;
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try{
			s = c.createStatement();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		try{
			String remove = "DELETE FROM customerCategory where id = '"+idNr+"';";
			s.execute(remove);
		}catch(SQLException se){
			se.printStackTrace();
		}
	}
		
	public void removeCustomerFromDB(int id){
			String idNr = Integer.toString(id);
			Statement s = null;
			SafariDatabase sd = new SafariDatabase();
			Connection c = sd.createConnection();
			try{
				s = c.createStatement();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				String remove = "DELETE FROM customer where id = '"+idNr+"';";
				s.execute(remove);
			}catch(SQLException se){
				se.printStackTrace();
			}
		
	}
	public void updateCategoryInDb(CustomerCategory category){
		Statement s = null;
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			s = c.createStatement();
		} catch(SQLException se){
			se.printStackTrace();
				
		}try{
			String update = "UPDATE customerCategory SET categoryName = '"+category.getCategoryName()+
					"', priceIndex = "+category.getPriceIndex();
			s.executeUpdate(update);
		}catch(SQLException se){
			se.printStackTrace();
		}
	}
	public void updateCategoryInDb(Customer customer){
		Statement s = null;
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try {
			s = c.createStatement();
		} catch(SQLException se){
			se.printStackTrace();
				
		}try{
			String update = "UPDATE customer SET customerCatID = "+customer.getid()+
					"', SSID = '"+customer.getPNumber()+
					"', givenName = '"+customer.getFName()+
					"', familyName = '"+customer.getLName()+
					"', email = '"+customer.getEMail()+
					"', phoneDay = '"+customer.getDNumber()+
					"', phoneNight = '"+customer.getNNumber();
			s.executeUpdate(update);
			
		}catch(SQLException se){
			se.printStackTrace();
		}
	}
	public void insertCategoryInDb(CustomerCategory category){
		Statement s = null;
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try{
			s = c.createStatement();
		}catch(SQLException se){
			se.printStackTrace();
			
		}try{
			String sql = "INSERT INTO customerCategory (categoryName, priceIndex)"
					+ "VALUES ('"+category.getCategoryName()+"',"+category.getPriceIndex()+")";
			s.executeUpdate(sql);
		}catch(SQLException se){
			se.printStackTrace();
		}
	}
	public void insertCustomerInDb(Customer customer){
		Statement s = null;
		SafariDatabase sd = new SafariDatabase();
		Connection c = sd.createConnection();
		try{
			s = c.createStatement();
		}catch(SQLException se){
			se.printStackTrace();
			
		}try{
			String sql = "INSERT INTO customer (customerCatID,SSID,givenName,familyName,email"
					+ ",phoneDay,phoneNight)"
					+ "VALUES ("+customer.getid()+",'"+customer.getPNumber()+
					"','"+customer.getFName()+
					"','"+customer.getLName()+
					"','"+customer.getEMail()+
					"','"+customer.getDNumber()+
					"','"+customer.getNNumber()+"')";
			s.executeUpdate(sql);
		}catch(SQLException se){
			se.printStackTrace();
		}
	}
	

}
