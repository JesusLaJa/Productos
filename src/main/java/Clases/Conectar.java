/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class Conectar {
    
    Connection con;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost/prueba2", "root","");

            System.out.println("Conectado a la base de datos!");

        } catch (ClassNotFoundException | SQLException e) {

            System.err.println(e.getMessage());
        }

        return con;
    }
    
}
