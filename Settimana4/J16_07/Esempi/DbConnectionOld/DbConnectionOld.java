import java.sql.*;

public class DbConnectionOld
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/nomedb"; // sostituire con il nome del DB
        String user = "root";       // utente del DB
        String password = "";       // password del DB
    
        try (Connection conn = DriverManager.getConnection(url, user, password))
        {
            System.out.println("Connessione riuscita");
        }
        
        catch (SQLException e)
        {
            System.out.println("Errore nella connessione");
            e.printStackTrace();
        }
    }
}
