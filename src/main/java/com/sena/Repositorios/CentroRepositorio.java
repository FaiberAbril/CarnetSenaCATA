package com.sena.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sena.Modelos.Centro;


@Repository
public interface CentroRepositorio extends JpaRepository<Centro, Integer>{

}
