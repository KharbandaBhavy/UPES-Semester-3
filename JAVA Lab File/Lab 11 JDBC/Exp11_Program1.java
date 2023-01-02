// 1. Create a database table to store the records of employee in a company. Use getConnection function to connect the database. 
// The statement object uses executeUpdate function to create a table.
// Code by Bhavy Kharbanda
// Sap Id: 500082531


import java.lang.ClassNotFoundException;
import java.sql.*;

public class Exp11_Program1 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "bhavy1610");

            System.out.println("Connection Successful");
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE DATABASE COMPANY");
            stmt.executeUpdate("USE COMPANY");
            stmt.executeUpdate("CREATE TABLE EMPLOYEE(EMP_ID INTEGER,NAME VARCHAR(50),AGE INTEGER)");

            System.out.println("Table Created");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


