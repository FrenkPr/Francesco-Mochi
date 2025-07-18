package com.example;

import java.sql.*;

public class ProvaFilm
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
            String query = "SELECT title " +
                           "FROM film " +
                           "LIMIT 5;";

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next())
            {
                System.out.println("Film: " + rs.getString("title"));
            }

        }
        
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
