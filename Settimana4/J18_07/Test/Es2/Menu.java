import java.sql.*;

public class Menu
{
    //static variables declaration & init
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "root";
    private static String password = "tiPiacerebbeSaperla";
    private static Connection dbConnection = null;

    //returns the object connected to the DB
    public static Connection getDbConnection()
    {
        return dbConnection;
    }

    //init method
    public static void init()
    {
        //password input
        password = PasswordField.readPassword("Insert password: ");

        //tries to establish a db connection
        try
        {
            dbConnection = DriverManager.getConnection(URL, USER, password);
        }

        //if connection failed
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    //run method
    public static void run()
    {
        //variables declaration & init
        SchoolTable schoolTable = new SchoolTable("school");

        schoolTable.insertStudente("Carlo", "carlo.boh@gmail.com");
        schoolTable.selectStudente();

        //tries to close db connection
        try
        {
            dbConnection.close();
        }
        
        //if db connection close failed
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
