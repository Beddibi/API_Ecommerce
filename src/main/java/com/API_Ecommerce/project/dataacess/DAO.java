package com.API_Ecommerce.project.dataacess;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    public Connection Connect_to_database(String dbName, String user, String password){
        Connection con =null;
        try {
            Class.forName("org.postgresql.Driver");
            con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName,user,password);
            if(con!=null){
                System.out.println("DATABASE CONNECTED");
            }else {
                System.out.println("CONNECTION IMPOSSIBLE");
            }

        }
        catch (Exception ex){

            System.out.println(ex);

        }

        return con;
    }
}
