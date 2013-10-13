package com.prognoz.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhavin
 */
public class Users {

    public boolean validateUser(String userName, String password) {
        try {
            Connection c = DatabaseConnection.getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select name, password from users");
            while (rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
            }
            if (rs.getString(1).equals(userName) && rs.getString(2).equals(password)) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
