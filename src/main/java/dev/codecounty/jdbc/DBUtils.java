package dev.codecounty.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
    private static final Properties props = new Properties();

    // Static block runs once when the class is loaded into memory


    static {
        // ClassLoader.getSystemResourceAsStream is a shorter way to get the file from the classpath
        try (InputStream in = ClassLoader.getSystemResourceAsStream("db.properties")) {
            if (in == null) throw new RuntimeException("db.properties not found!");
            props.load(in);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load DB config", e);
        }
    }

    public static Connection getConnection() throws SQLException {
//    	try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
        Connection con = DriverManager.getConnection(
                props.getProperty("db.url"),
                props.getProperty("db.user"),
                props.getProperty("db.password")
        );

        return con;
    }
}