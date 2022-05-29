package co.edu.iudigital;

import co.edu.iudigital.db.DbConfig;
import co.edu.iudigital.db.DbMigrations;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DbMigrations migrations = new DbMigrations();
        //migrations.init();
        //migrations.insertDataIntoTableProducts();
        //migrations.updateDataIntoTableProducts();
        migrations.deleteDataIntoTableProducts();

    }
}

