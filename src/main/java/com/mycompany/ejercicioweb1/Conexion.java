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
        this.BD = "jdbc:postgresql://ec2-3-225-110-188.compute-1.amazonaws.com:5432/decco43vde7cpm";
        this.usuario = "qcwmjonhdhvcgf";
        this.contra = "7ddbb41cf60fd05b075880d08f13907e5e7861e15191ee30565b6289918a52b3";
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
            this.BD = "jdbc:postgresql://ec2-3-225-110-188.compute-1.amazonaws.com:5432/decco43vde7cpm";
            this.usuario = "qcwmjonhdhvcgf";
            this.contra = "7ddbb41cf60fd05b075880d08f13907e5e7861e15191ee30565b6289918a52b3";
            this.conectar = (Connection) DriverManager.getConnection(BD, usuario, contra);
        }catch(ClassNotFoundException | HeadlessException | SQLException e ){
            System.out.println("Error al conectar: " + e);
        }
    }

    public Connection getConectar() {
        return conectar;
    }    
}
