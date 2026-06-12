package com.example.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/PROJECTBD";

    private static final String USER = "postgres";
    private static final String PASSWORD = "password";
//    sesuaiin

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println("Database Connected!");
            return conn;

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL Driver Not Found!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }

        return null;
    }
}