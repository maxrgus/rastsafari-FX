package com.rastsafari.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CustomerCategoryList {
	private ObservableList<CustomerCategory> categories;

	public CustomerCategoryList(){
		categories = FXCollections.observableArrayList();
		getCategoriesFromDatabase();
	}
	
	private void getCategoriesFromDatabase(){
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
	}
	public ObservableList<CustomerCategory> getCustomerCategoryList(){
		return categories;
	}
}
