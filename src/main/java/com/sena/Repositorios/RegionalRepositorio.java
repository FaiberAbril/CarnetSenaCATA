package com.sena.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sena.Modelos.Regional;

@Repository
public interface RegionalRepositorio extends JpaRepository<Regional, Integer> {

}
