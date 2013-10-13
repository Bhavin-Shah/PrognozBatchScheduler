package com.prognoz.models;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kavita
 */
public class Test {

    public java.util.List getBatches() {
        java.util.List<String> batchesName = new ArrayList<String>();
        try {
            Connection c = DatabaseConnection.getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select batch_name from batches");
            while (rs.next()) {
                batchesName.add(rs.getString(1));

            }
            return batchesName;
        } catch (SQLException ex) {
            Logger.getLogger(Batches.class.getName()).log(Level.SEVERE, null, ex);
        }
        return batchesName;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.getBatches());
    }
}
