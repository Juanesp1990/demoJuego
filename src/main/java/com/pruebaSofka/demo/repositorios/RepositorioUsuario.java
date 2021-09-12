
package com.pruebaSofka.demo.repositorios;

import com.pruebaSofka.demo.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository <Usuario,Integer>{
    
}
