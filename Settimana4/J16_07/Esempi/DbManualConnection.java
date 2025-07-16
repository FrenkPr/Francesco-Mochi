public class DbManualConnection {
    public static void main(String[] args) {

        String DB_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/world";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "root";
        Connection conn = null;
        
        try {
            // Register the JDBC driver
            Class.forName(DB_DRIVER);
            // Open the connection
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            if (conn != null)
                System.out.println("Successfully connected.");
            else
                System.out.println("Failed to connect.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}