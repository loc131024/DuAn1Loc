
package banquanao.untility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DB {

    private static String USENAME = "sa";
    private static String PASSWORD = "090909999";
    private static String URL = "jdbc:sqlserver://localhost:1433;databaseName=SQL_BAN_AO;trustServerCertificate=true";

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public static Connection getConnection() {
        Connection c = null;
        try {
            c = DriverManager.getConnection(URL, USENAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;

    }

    public static void main(String[] args) {
        Connection c = getConnection();
        if (c != null) {
            System.out.println("thanh cong");
        } else {
            System.out.println("loi");
        }
    }

}
