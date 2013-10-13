package com.prognoz.models;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kavita
 */
public class Test {

    public boolean validateUser(String userName, String password) {
        try {
            Connection c = DatabaseConnection.getConnection();
            java.sql.PreparedStatement s = c.prepareStatement("select password from users where name = ?");
            s.setString(1, userName);
            ResultSet rs = s.executeQuery();
            while (rs.next()) {
//            System.out.println(rs.getString(1));
//            System.out.println(rs.getString(2));
                if (rs.getString(1).equals(password)) {
                    return true;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.validateUser("Bhavin", "Bhavin"));
    }
}
