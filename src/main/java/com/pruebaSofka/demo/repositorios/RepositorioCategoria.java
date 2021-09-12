package com.pruebaSofka.demo.repositorios;

import com.pruebaSofka.demo.modelos.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCategoria extends JpaRepository <Categoria,Integer>{
    
}
