package com.rastsafari.model;

import java.sql.*;

public class SafariDatabase {
    public Connection createConnection() {
        Connection localConn = null;

        try {
            Class.forName("org.sqlite.JDBC"); //Sqlite-drivrutin
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Couldn't find driver class:");
            System.out.println(cnfe.getMessage());
            System.exit(1);
        }
        System.out.println("Allt OK");

        //TA INTE BORT! Alexander behöver för netbeans
        /*try {
            localConn = DriverManager.getConnection("jdbc:sqlite:rastsafari.db");
        } catch (SQLException se) {
            System.out.println("Couldn't connect: print out a stack trace and exit.");
            System.out.println(se.getMessage());
            System.exit(1);
        }*/

        try {
            localConn = DriverManager.getConnection("jdbc:sqlite:db/rastsafari.db");
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
