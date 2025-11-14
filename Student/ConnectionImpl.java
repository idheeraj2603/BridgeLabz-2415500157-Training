package Student;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionImpl implements iConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASS = "Dheeraj@2006";

    @Override
    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return conn;
    }
}//return connection
