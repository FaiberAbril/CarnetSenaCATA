package com.sena.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sena.Modelos.Perfil;

@Repository
public interface PerfilRepositorio extends JpaRepository<Perfil, Integer> {
	

}
