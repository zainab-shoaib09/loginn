/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package LOGIN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/carmanagmnetsystem"; // Replace with your database URL
    private static final String USERNAME = "root"; // Replace with your database username
    private static final String PASSWORD = "cocomo786"; // Replace with your database password

    public static Connection getConnection() throws SQLException {
        try {
            // Register the JDBC driver (optional with new drivers, but kept for compatibility)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish and return the database connection
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Database driver not found: " + e.getMessage());
            throw new SQLException("Database driver error.");
        }
    }
}
*/
package LOGIN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Static variable to hold the single instance of the class
    private static DatabaseConnection instance;
    
    private static final String URL = "jdbc:mysql://localhost:3306/carmanagmnetsystem"; // Replace with your database URL
    private static final String USERNAME = "root"; // Replace with your database username
    private static final String PASSWORD = "cocomo786"; // Replace with your database password

    // Private constructor to prevent instantiation from other classes
    private DatabaseConnection() {}

    // Public static method to provide access to the instance
    public static DatabaseConnection getInstance() {
        // Check if instance is null, if so, create a new instance
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Method to get the database connection
    public Connection getConnection() throws SQLException {
        try {
            // Register the JDBC driver (optional with new drivers, but kept for compatibility)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish and return the database connection
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Database driver not found: " + e.getMessage());
            throw new SQLException("Database driver error.");
            
        }
        
    }
}