
package com.pruebaSofka.demo.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Respuesta {
    @Id
    int id;
    int idPregunta;
    int idUsuario;
    int respuesta;
    int resultado;

    public Respuesta(int idPregunta, int idUsuario, int respuesta, int resultado) {
        this.idPregunta = idPregunta;
        this.idUsuario = idUsuario;
        this.respuesta = respuesta;
        this.resultado = resultado;
    }
    
    public Respuesta(){}

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public int getResultado() {
        return resultado;
    }
    
    
}
