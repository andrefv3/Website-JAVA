/* @author Andrés */

package com.mycompany.ejercicioweb1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Conexion conex;
    
    private Connection conectar;
    private String BD;
    private String usuario;
    private String contra;

    public Conexion(Connection conectar, String BD, String usuario, String contra) {
        this.conectar = conectar;
        this.BD = BD;
        this.usuario = usuario;
        this.contra = contra;
    }

    public Conexion() {
        this.conectar = null;
        this.BD = "bd_vega";
        this.usuario = "postgres";
        this.contra = "123456";
    }
    
    public synchronized static Conexion getConexion() {
        if (conex == null) {
           conex = new Conexion();
        }
       return conex;
    }
    
    public void conectar(){
        try{
            Class.forName("org.postgresql.Driver");
            this.BD = ""; 
            this.usuario = "";
            this.contra = "";
            this.conectar = (Connection) DriverManager.getConnection(BD, usuario, contra);
        }catch(ClassNotFoundException | HeadlessException | SQLException e ){
            System.out.println("Error al conectar: " + e);
        }
    }

    public Connection getConectar() {
        return conectar;
    }    
}
