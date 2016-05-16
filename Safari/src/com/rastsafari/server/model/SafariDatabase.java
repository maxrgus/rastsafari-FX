package com.rastsafari.server.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.NoSuchFileException;
import java.sql.*;

import javax.swing.JOptionPane;

import org.sqlite.SQLiteConfig;

import com.rastsafari.MainApp;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class SafariDatabase {

	public Connection createConnection() {
		Connection localConn = null;
		try {
			Class.forName(org.sqlite.JDBC.class.getCanonicalName()); // Sqlite-drivrutin

		} catch (ClassNotFoundException cnfe) {
			System.err.println("Couldn't find driver class:");
			System.out.println(cnfe.getMessage());

		}
		try {
			String url = "jdbc:sqlite:db/rastsafari.db";
			SQLiteConfig config = new SQLiteConfig();
			config.setEncoding(SQLiteConfig.Encoding.UTF8);
			localConn = DriverManager.getConnection(url, config.toProperties());
		} catch (SQLException se) {
			System.out.println("Couldn't connect to database");
			System.out.println(se.getMessage());
		}

		return localConn;
	}
}
