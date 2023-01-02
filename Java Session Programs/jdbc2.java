//1-Load the Library
import java.sql.*;
class jdbc2{
    public static void main(String[] args) {
        try {
            // Database credentials
            final String DB_URL="jdbc:mysql://localhost:3306/";
            final String USER="root";
            final String PASS="bhavy1610";

            //2-Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //3- Make the Connection
            Connection con=DriverManager.getConnection(DB_URL, USER, PASS);

            //4- Prepare Statements
            Statement smt=con.createStatement();

            //5-Execute the Statement
            //String dbName="AIMLB1";
         String sql = "CREATE DATABASE AIML1";
         smt.executeUpdate(sql);
         System.out.println("Database created successfully...");  
        } catch (Exception e) {
            
            System.out.println(e);
        }
    }
}

