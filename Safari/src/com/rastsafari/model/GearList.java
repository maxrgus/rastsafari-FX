package com.rastsafari.model;

import java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class GearList {
	
	private ObservableList<Gear> gearList;
	
	public GearList() {
		gearList = FXCollections.observableArrayList();
		getGearFromDB();
	}
	
	private void getGearFromDB() {
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
	}
	public ObservableList<Gear> getGearList() {
		return gearList;
	}

}
