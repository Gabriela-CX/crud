package co.edu.iudigital;

import co.edu.iudigital.db.DbConfig;
import co.edu.iudigital.db.DbMigrations;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws SQLException {

            DbConfig connection = new DbConfig();
            Scanner entrada = new Scanner(System.in);
            DbMigrations cliente = new DbMigrations();

            Connection conn = connection.connect();
            int opcion = 0;
            do {

                System.out.println("Bienvenidad al gestor de clientes " +
                        "\n¿Que desea hacer?" +
                        "\n1.Agregar Un cliente" +
                        "\n2.Cambiar un cliente"+
                        "\n3. Borrar cliente"+
                        "\n4.Salir");
                opcion = Integer.parseInt( entrada.nextLine() );


                switch (opcion){

                    case 1:
                        try {
                            cliente.insertDataIntoTableClient();
                        }catch (Exception e)
                        {
                            System.out.println("ERROR! " + e.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            cliente.updateDataIntoTableClient();
                            System.out.println("Cambio Aceptado!!");
                        }catch (Exception e)
                        {
                            System.out.println("Peticion Denegada");
                            System.out.println("ERROR! " + e.getMessage());
                        }
                        break;

                    case 3:
                        try {
                            cliente.deleteDataIntoTableClient();
                        }catch (Exception e)
                        {
                            System.out.println("ERROR! " + e.getMessage());
                        }
                        break;
                }


            }while(opcion != 4);

            conn.close();
        }
    }


