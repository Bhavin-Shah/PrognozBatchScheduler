package com.prognoz.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhavin
 */
public class Batches {

    public static java.util.List getBatches() {
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

    public static void saveBatches(BatchModel bm) {
        try {
            Connection c = DatabaseConnection.getConnection();
            java.sql.PreparedStatement s = c.prepareStatement("INSERT INTO `prognozdatabase`.`batches` (`batch_name`, `trainer_name`, `batch_size`, `technology`, `start_date`, `end_date`) VALUES (?, ?, ?, ?, ?, ?);");
            s.setString(1, bm.getBatchName());
            s.setString(2, bm.getTrainerName());
            s.setString(3, bm.getBatchSize());
            s.setString(4, bm.getTechnology());
            s.setString(5, bm.getStartDate());
            s.setString(6, bm.getEndDate());
            int a = s.executeUpdate();


        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
