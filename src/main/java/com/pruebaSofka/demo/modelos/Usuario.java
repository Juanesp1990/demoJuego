
package com.pruebaSofka.demo.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    int id;
    Long cc;
    String nombre;
    int nivel;
    int puntaje;

    public Usuario(Long cc, String nombre, int nivel, int puntaje) {
        this.cc = cc;
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntaje = puntaje;
    }
    public Usuario(){}

    public int getId() {
        return id;
    }

    public Long getCc() {
        return cc;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setCc(Long cc) {
        this.cc = cc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
}
