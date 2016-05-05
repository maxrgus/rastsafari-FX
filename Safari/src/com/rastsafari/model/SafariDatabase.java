package com.rastsafari.model;

import java.sql.*;

import org.sqlite.SQLiteConfig;

public class SafariDatabase {
	public Connection createConnection() {
		Connection localConn = null;

		try {
			Class.forName(org.sqlite.JDBC.class.getCanonicalName()); // Sqlite-drivrutin

		} catch (ClassNotFoundException cnfe) {
			System.err.println("Couldn't find driver class:");
			System.out.println(cnfe.getMessage());
			System.exit(1);
		}
		System.out.println("Allt OK");
		try {
			String url = "jdbc:sqlite:db/rastsafari.db";
			SQLiteConfig config = new SQLiteConfig();
			config.setEncoding(SQLiteConfig.Encoding.UTF8);
			localConn = DriverManager.getConnection(url, config.toProperties());
		} catch (SQLException se) {
			System.out.println("Couldn't connect: print out a stack trace and exit.");
			System.out.println(se.getMessage());
			System.exit(1);
		}

		if (localConn != null)
			System.out.println("Hooray! We connected to the database!");
		else
			System.out.println("We should never get here.");

		return localConn;
	}
}
