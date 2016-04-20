package com.rastsafari.model;

import com.rastsafari.model.SafariDatabase;

import java.sql.*;

public class SafariMaintenance{
  public SafariMaintenance() {}

    public int generateId() {
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
    public void removeFromDB(int id){
        String idNr = Integer.toString(id);
        Statement s = null;
        SafariDatabase sd = new SafariDatabase();
        Connection c = sd.createConnection();
        try{
            s = c.createStatement();
        }
        catch(SQLException se){
            System.out.println("We got an exception while creating a statement.");
            System.out.println(se.getMessage());
        }
        try{
            //Behöver lägga till validering så att man inte kan ta bort ett safari som är bokat
            String remove = "DELETE FROM safariLocation where id = +'"+idNr+"'";
            s.execute(remove);

        } catch(SQLException se){
            System.out.println("We got an exception while executing our query: " + "that probably means our SQL is invalid.");
            System.out.println(se.getMessage());
        }


    }
    public void updateLocationInDb(SafariLocation location){
        Statement s = null;
        SafariDatabase sd = new SafariDatabase();
        Connection c = sd.createConnection();
        try{
            s = c.createStatement();
        }
        catch(SQLException se){
            System.out.println("We got an exception while creating a statement.");
            System.out.println(se.getMessage());
        }
        try{
            //Behöver lägga till validering så att man inte kan ta bort ett safari som är bokat
            String update = "UPDATE safariLocation SET locationName = '"+location.getLocationName()+
                    "', description = '"+location.getDescription()+
                    "', location = '"+location.getLocation()+
                    "', minParticipants = '"+location.getMinParticipant()+
                    "', maxParticipants = '"+location.getMaxParticipant()+
                    "', isActive = '"+location.getIsActive()+
                    "'  where id = +"+location.getId();
            s.executeUpdate(update);
            
            

        } catch(SQLException se){
            System.out.println("We got an exception while executing our query: " + "that probably means our SQL is invalid.");
            System.out.println(se.getMessage());
        }
    }
  public void insertLocationInDb(SafariLocation location){
        
        Statement s = null;
        SafariDatabase sd = new SafariDatabase();
        Connection c = sd.createConnection();
        try{
            s = c.createStatement();
        }
        catch(SQLException se){
            System.out.println("We got an exception while creating a statement.");
            System.out.println(se.getMessage());
        }
        try{
            s.executeUpdate("INSERT INTO safariLocation (locationName,description,location,minParticipants,maxParticipants, isActive) VALUES ('"+location.getLocationName()+
            		"','"+location.getDescription()+"','"+location.getLocation()+"',"+location.getMinParticipant()+
                    ","+location.getMaxParticipant()+","+location.getIsActive()+")");
            

        } catch(SQLException se){
            System.out.println("We got an exception while executing our query: " + "that probably means our SQL is invalid.");
            System.out.println(se.getMessage());
        }

    }
}
