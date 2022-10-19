/* @author Andrés */

package com.mycompany.ejercicioweb1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
