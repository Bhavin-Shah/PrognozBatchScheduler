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

    public static void main(String[] args) {
        Test t = new Test();
        BatchModel bm = new BatchModel("dsad", "dsad", "dsd", "dsds", "dsd", "sdsd");
        Test.saveBatches(bm);
    }
}
