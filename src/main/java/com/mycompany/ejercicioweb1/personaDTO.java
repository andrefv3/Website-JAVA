/* @author Andrés */

package com.mycompany.ejercicioweb1;

public class personaDTO {
    private String Nombre;
    private int Telefono;
    private String Email;
    private String Password;

    public personaDTO() {
        Nombre = "";
        Telefono = 0;
        Email = "";
        Password = "";
    }

    public personaDTO(String Nombre, int Telefono, String Email, String Password) {
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Password = Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
