package com.sena.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.Modelos.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}
