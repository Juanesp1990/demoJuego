package com.pruebaSofka.demo.repositorios;

import com.pruebaSofka.demo.modelos.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPregunta extends JpaRepository <Pregunta,Integer>{
    
}
