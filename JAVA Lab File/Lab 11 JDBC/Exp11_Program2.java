// 2. Create a database of employee of company in mysql and then use java program to access the database for inserting information of employees in database. 
// The SQL statement can be used to view the details of the data of employees in the database.
// Code by Bhavy Kharbanda
// Sap Id: 500082531

import java.sql.*;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class Exp11_Program2 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "bhavy1610");
            System.out.println("Connection Successful");
            Statement stmt = conn.createStatement();
            stmt.execute("USE COMPANY");
            stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES(1,'Bhavy',20)");
            stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES(2,'Desh',19)");
            stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES(3,'Divyam',19)");
            System.out.println("Value Inserted");
            ResultSet rs = stmt.executeQuery("Select * from employee");
            while (rs.next()) {
                int emp_id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                System.out.println(emp_id + " " + name + " " + age);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
