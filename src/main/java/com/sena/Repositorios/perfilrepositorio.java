package com.sena.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Modelos.perfil;

@Repository
public interface perfilrepositorio extends JpaRepository<perfil, Integer> {
	

}
