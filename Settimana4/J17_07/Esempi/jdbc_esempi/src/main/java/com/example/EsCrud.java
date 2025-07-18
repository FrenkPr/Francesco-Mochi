package com.example;

import java.sql.*;

public class EsCrud
{
    static final String URL = "jdbc:mysql://localhost:3306/users_crud";
    static final String USER = "root";
    static String password = "tiPiacerebbeSaperla";

    public static void main(String[] args)
    {
        password = PasswordField.readPassword("Insert password: ");

        // CREATE
        insertUtente("Mario Rossi", "mario@example.com");

        // READ
        readUtenti();

        // UPDATE
        updateUtente(1, "Mario Bianchi");

        // DELETE
        deleteUtente(1);
    }

    // CREATE
    public static void insertUtente(String username, String email) {
        String sql = "INSERT INTO users (username, email) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, email);
            stmt.executeUpdate();
            System.out.println("Utente inserito.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    public static void readUtenti() {
        String sql = "SELECT * FROM users";
        try (Connection conn = DriverManager.getConnection(URL, USER, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Nome: " + rs.getString("username") +
                                   ", Email: " + rs.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public static void updateUtente(int id, String nuovoNome) {
        String sql = "UPDATE users SET username = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nuovoNome);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Utente aggiornato.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public static void deleteUtente(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Utente eliminato.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}