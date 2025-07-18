package com.example;

import java.sql.*;

public class DbConnection
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
            // Connection conn = DriverManager.getConnection(url, user, password);
            DriverManager.getConnection(url, user, password);
            System.out.println("Connessione riuscita");
        }
        
        catch (SQLException e)
        {
            System.out.println("Errore nella connessione");
            e.printStackTrace();
        }

        GlobalScanner.CloseScannerInputs();
    }
}
