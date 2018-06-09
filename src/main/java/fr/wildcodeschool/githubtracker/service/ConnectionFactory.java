package fr.wildcodeschool.githubtracker.service;

import javax.enterprise.inject.Produces;
import javax.xml.ws.ServiceMode;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

@ServiceMode
public class ConnectionFactory {

    public static final String URL = "jdbc:mysql://localhost:3306/githuber";
    public static final String USER = "root";
    public static final String PASS = "SeB64100";

    /**
     * Get a connection to database
     * @return Connection object
     */
    @Produces
    public static Connection getConnection()

    {
        try {
            Class<?> driverClass = null;
            driverClass = Class.forName("com.mysql.jdbc.Driver");
            //DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
