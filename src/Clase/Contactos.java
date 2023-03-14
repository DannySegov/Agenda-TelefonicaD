/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author carol
 */
public class Contactos {
    
    String Nombre;
    String Dirección;
    int Edad;
    String Sexo;
    int Teléfono;
    int CP;
    
    public Contactos(String Nombre, String Dirección, int Edad, String Sexo, int Teléfono, int CP){
        this.Nombre = Nombre;
        this.Dirección = Dirección;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Sexo = Sexo;
        this.Teléfono = Teléfono;
        this.CP = CP;
        
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(int Teléfono) {
        this.Teléfono = Teléfono;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }
}
