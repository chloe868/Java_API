/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

import java.sql.*;

/**
 *
 * @author herrerach_sd2082
 */
public class TestDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/chloe", "root", "");
//here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();
            //insert into the table users
            String sqlString = "insert inot users(username, password,role) values('jose','rizal','student')";
            stmt.executeUpdate(sqlString);
            
            //retrieve data from table users
            ResultSet rs=stmt.executeQuery("Select * from lista");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
