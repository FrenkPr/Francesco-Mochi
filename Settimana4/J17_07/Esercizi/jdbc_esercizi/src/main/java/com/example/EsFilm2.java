package com.example;

import java.sql.*;

public class EsFilm2
{
    public static void main(String[] args)
    {
        GlobalScanner.InitScannerInputs();

        String url = "jdbc:mysql://localhost:3306/sakila"; // sostituire con il nome del DB
        String user = "root";       // utente del DB
        String password = "tiPiacerebbeSaperla";       // password del DB
    
        user = GlobalScanner.readStringInput("Insert your username:", true);
        password = PasswordField.readPassword("Insert password: ");

        try
        {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            //query 1
            // String query = "SELECT * " +
            //                "FROM customer " +
            //                "WHERE first_name LIKE 'A%';";

            String query = "SELECT * " +
                           "FROM customer " +
                           "WHERE first_name LIKE 'A%' " +
                           "LIMIT 30;";

            ResultSet rs = stmt.executeQuery(query);
            
            System.out.println("QUERY 1:");
            while (rs.next())
            {
                System.out.println("Customer names starting with 'A' letter: " + rs.getString("first_name"));
            }
            System.out.println();

            //query 2
            // query = "SELECT city, COUNT(city) AS 'Num clients per city' " +
            //         "FROM city " +
            //         "INNER JOIN customer ON city.city_id = customer.address_id " +
            //         "GROUP BY city;";

            query = "SELECT city, COUNT(city) AS 'Num clients per city' " +
                    "FROM city " +
                    "INNER JOIN customer ON city.city_id = customer.address_id " +
                    "GROUP BY city " +
                    "LIMIT 30;";

            rs = stmt.executeQuery(query);

            System.out.println("QUERY 2:");
            while (rs.next())
            {
                System.out.println("City: " + rs.getString("city"));
                System.out.println("Number of clients per city: " + rs.getString("Num clients per city"));
            }
            System.out.println();

            //query 3
            query = "SELECT * " +
                    "FROM customer " +
                    "ORDER BY create_date DESC " +
                    "LIMIT 5;";

            rs = stmt.executeQuery(query);

            System.out.println("QUERY 3:");
            while (rs.next())
            {
                System.out.println("5 most recent customers added: " + rs.getString("first_name"));
                System.out.println("Added date: " + rs.getTimestamp("create_date"));
            }
            System.out.println();

            //query 4
            // query = "SELECT first_name, create_date " +
            //         "FROM customer " +
            //         "ORDER BY create_date DESC;";

            query = "SELECT first_name, create_date " +
                    "FROM customer " +
                    "ORDER BY create_date DESC " +
                    "LIMIT 30;";

            rs = stmt.executeQuery(query);

            System.out.println("QUERY 4:");
            while (rs.next())
            {
                System.out.println("All most recent customers added: " + rs.getString("first_name"));
                System.out.println("Added date: " + rs.getTimestamp("create_date"));
            }
        }
        
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
