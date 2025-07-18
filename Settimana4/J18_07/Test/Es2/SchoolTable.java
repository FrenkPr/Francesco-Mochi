// package com.example;

import java.sql.*;

public class SchoolTable
{
    private String tableName;

    public SchoolTable(String tableName)
    {
        this.tableName = tableName;
    }

    // Metodo statico che esegue l'inserimento (CREATE) di un utente nel database
    public void insertStudente(String nome, String email) {

        // Query SQL con parametri da sostituire con PreparedStatement 
        String sql = "INSERT INTO ? (nome, email) VALUES (?, ?)";

        // Apertura del blocco try-with-resources che chiude automaticamente connessione e statement
        try (

            // Apertura della connessione al database
            Connection conn = Menu.getDbConnection();

            // Preparazione della query SQL da eseguire con parametri
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            // Sostituzione del primo parametro (?) con il nome della tabella
            stmt.setString(1, tableName);

            // Sostituzione del secondo parametro (?) con il nome ricevuto in input
            stmt.setString(2, nome);

            // Sostituzione del terzo parametro (?) con l'email ricevuta in input
            stmt.setString(3, email);

            // Esecuzione dell'istruzione SQL (INSERT)
            stmt.executeUpdate();

            System.out.println("Lo studente " + nome + " con email " + email + " è stato inserito correttamente nel DB");

        // Gestione degli eventuali errori SQL 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // stampa studente
    public void selectStudente() {
        String query = "SELECT * FROM ?";
        try (
                Connection conn = Menu.getDbConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, tableName);
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next())
            {
                System.out.println("Nome studente: " + rs.getString("nome"));
                System.out.println("Email studente: " + rs.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
