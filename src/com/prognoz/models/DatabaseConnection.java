package com.prognoz.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhavin
 */
public class DatabaseConnection {

    public static Connection getConnection() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/prognozdatabase";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(url, "root", "admin");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from users");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1));
//                System.out.println(rs.getString(2));
//            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;

    }

    public static void main(String[] args) {
        DatabaseConnection dc = new DatabaseConnection();
        dc.getConnection();
    }
}
