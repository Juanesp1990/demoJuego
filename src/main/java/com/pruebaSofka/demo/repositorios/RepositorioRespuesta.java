
package com.pruebaSofka.demo.repositorios;

import com.pruebaSofka.demo.modelos.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioRespuesta extends JpaRepository <Respuesta,Integer>{
    
}
