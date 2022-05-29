package co.edu.iudigital.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConfig {
    private static final String host = "127.0.0.1";
    private static final String port = "5432";
    private static final String dbName = "mercafacil";
    private static final String user = "postgres";
    private static final String password = "admin";

    public Connection connect(){
        Connection connection = null;
        System.out.println("Connecting to database...");
        try{
            Class.forName("org.postgresql.Driver");
            String connString = String.format("jdbc:postgresql://%s:%s/%s",host,port, dbName);
            connection = DriverManager.getConnection(connString, user, password);
            System.out.println("Successful Connection");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
        return connection;
    }
}
