package src.Static_Non_Static.API;
import java.sql.*;
public class MetaData {
    public static void main(String[] args) {
        try {
// Load MySQL driver
            Class.forName("com.mysql.jdbc.Driver");

// Establish connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "root");

// Get database metadata
            DatabaseMetaData metaData = connection.getMetaData();

// Display metadata
            System.out.println("Driver Name: " + metaData.getDriverName());
            System.out.println("Driver Version: " + metaData.getDriverVersion());
            System.out.println("Database Product Name: " + metaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + metaData.getDatabaseProductVersion());

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}