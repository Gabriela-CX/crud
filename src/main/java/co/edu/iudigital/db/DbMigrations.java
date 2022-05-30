package co.edu.iudigital.db;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DbMigrations {

    private DbConfig dbConfig;
    private Connection connection;
    private PreparedStatement pst;


    public DbMigrations(){
        this.dbConfig = new DbConfig();
        this.connection = dbConfig.connect();
    }

    public void insertDataIntoTableClient(){
        try{
            Statement statement = connection.createStatement();
            String query = "INSERT INTO clientes" +
                    "(cedulacliente, nombre, direccion, telefono) VALUES(1087435, 'Sandra', 'Mordor', '2324')";
            System.out.println("Cliente guardado");
            statement.execute(query);
            statement.close();
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updateDataIntoTableClient(){
        try{
            Statement statement = connection.createStatement();
            String query = "UPDATE clientes SET nombre = 'Gabriela' WHERE cedula = 123424";
            statement.execute(query);
            statement.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void deleteDataIntoTableClient(){
        try{
            Statement statement = connection.createStatement();
            String query = "DELETE FROM clientes WHERE nombre = 'ewrgsdfg'";
            statement.execute(query);
            statement.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}