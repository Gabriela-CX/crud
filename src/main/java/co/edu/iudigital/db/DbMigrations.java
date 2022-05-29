package co.edu.iudigital.db;

import java.sql.Connection;
import java.sql.Statement;

public class DbMigrations {

    private DbConfig dbConfig;
    private Connection connection;

    public DbMigrations(){
        this.dbConfig = new DbConfig();
        this.connection = dbConfig.connect();
    }

    public void init(){
        this.tableProducts();
    }
    public void tableProducts(){
        try{
            Statement statement = connection.createStatement();
            String query = "CREATE TABLE products" +
                    "(id INT NOT NULL PRIMARY KEY, name varchar(15), price float)";
            statement.execute(query);
            statement.close();
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void insertDataIntoTableProducts(){
        try{
            Statement statement = connection.createStatement();
            String query = "INSERT INTO products" +
                    "(id, name, price) VALUES(1, 'Monitor', 2500000)";
            statement.execute(query);
            statement.close();
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updateDataIntoTableProducts(){
        try{
            Statement statement = connection.createStatement();
            String query = "UPDATE products SET name = 'Laptop' WHERE id = 1";
            statement.execute(query);
            statement.close();
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void deleteDataIntoTableProducts(){
        try{
            Statement statement = connection.createStatement();
            String query = "DELETE FROM products WHERE name = 'Laptop'";
            statement.execute(query);
            statement.close();
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
