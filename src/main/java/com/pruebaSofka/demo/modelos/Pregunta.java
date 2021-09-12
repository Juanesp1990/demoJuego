
package com.pruebaSofka.demo.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pregunta {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    String enunciado;
    String opcion_1;
    String opcion_2;
    String opcion_3;
    String opcion_4;
    int respuesta;
    @ManyToOne  
    @JoinColumn (name = "id_categoria")
    Categoria categoria;

    public Pregunta(String enunciado, String opcion1, String opcion2, String opcion3, String opcion4, int respuesta, Categoria categoria) {
        this.enunciado = enunciado;
        this.opcion_1 = opcion1;
        this.opcion_2 = opcion2;
        this.opcion_3 = opcion3;
        this.opcion_4 = opcion4;
        this.respuesta = respuesta;
        this.categoria = categoria;
    }
    public Pregunta(){
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getOpcion1() {
        return opcion_1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion_1 = opcion1;
    }

    public String getOpcion2() {
        return opcion_2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion_2 = opcion2;
    }

    public String getOpcion3() {
        return opcion_3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion_3 = opcion3;
    }

    public String getOpcion4() {
        return opcion_4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion_4 = opcion4;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }



    public int getId() {
        return id;
    }
    
        
    
}
