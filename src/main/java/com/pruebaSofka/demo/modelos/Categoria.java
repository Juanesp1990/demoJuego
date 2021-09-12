
package com.pruebaSofka.demo.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria {
    @Id
    int id;
    int premio;
    String nombre;

    public Categoria(int premio, String nombre) {
        this.premio = premio;
        this.nombre = nombre;
    }
    
    public Categoria() {}

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }
    
    
}
