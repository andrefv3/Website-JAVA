/* @author Andrés */

package com.mycompany.ejercicioweb1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class personaDAO {
    
    private static final String SQL_READALL = "SELECT * FROM tb_persona ";
    private static final Conexion con = new Conexion();

    public personaDAO() {
        con.conectar();
    }
    
    public List<personaDTO> readAll(){
        List<personaDTO> lista = null;
        PreparedStatement ps;
        try{
            ps = con.getConectar().prepareStatement(SQL_READALL);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while(rs.next()){
                personaDTO obj = new personaDTO(
                    rs.getString("Nombre"),
                    rs.getInt("Telefono"),
                    rs.getString("Email"),
                    rs.getString("Password")
                );  lista.add(obj);
            }
        }catch(SQLException ex){
            System.out.println("Error al conectar: " + ex);
        }
        return lista;
    }
    
    public boolean insertar(personaDTO objP) {
        boolean verificar = false;
        String sql = "INSERT INTO tb_persona (Nombre, Telefono, Email, Password) VALUES('" + objP.getNombre()
                + "','" + objP.getTelefono() + "','" + objP.getEmail() + "','" + objP.getPassword() + "')";

        try {
            Statement ps;
            ps = con.getConectar().createStatement();
            ps.executeUpdate(sql);

            verificar = true;

        } catch(SQLException ex) {
            System.out.println("Error al conectar: " + ex);
            verificar = false;
        }
        
       return verificar;
    }

    public personaDTO consultar(String nombre, String pass) {
        personaDTO objpersona = new personaDTO();
        String sql = "SELECT * FROM tb_persona WHERE Nombre='" + nombre + "' AND Password='" + pass + "'";
        PreparedStatement ps;
        try {
            ps = con.getConectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("Nombre").equals(nombre) && rs.getString("Password").equals(pass)) {
                    objpersona.setNombre(rs.getString("Nombre"));
                    objpersona.setTelefono(rs.getInt("Telefono"));
                    objpersona.setEmail(rs.getString("Email"));
                    objpersona.setPassword(rs.getString("Password"));
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error al conectar: " + ex);
        }
        
        return objpersona;
    }
}
