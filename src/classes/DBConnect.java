package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {

    //generate singleton instance of DBConnect
    private static DBConnect instance = new DBConnect();
    private static Connection connection = null;

    //private constructor
    private DBConnect() {
    }

    //get instance of DBConnect
    public static DBConnect getInstance() {
        return instance;
    }

    //connect to sqlite database
    public void Connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:src\\storage\\zoo.db");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

    public void Disconnect() {
        try {
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Closed database successfully");
    }

    public void printDatabaseUsers() {
        if (connection == null) {
            System.out.println("No connection to database");
            return;
        }

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Username: " + resultSet.getString("username"));
                System.out.println("Password: " + resultSet.getString("password"));
                System.out.println("Email: " + resultSet.getString("email"));
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
