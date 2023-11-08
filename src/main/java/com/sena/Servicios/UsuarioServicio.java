package com.sena.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Modelos.Usuario;
import com.sena.Repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicio {
  @Autowired
  private UsuarioRepositorio usuarioRepositorio;

  public void crear(Usuario usuario) {
    usuarioRepositorio.save(usuario);
  }

  public List<Usuario> listaUsuarios() {
    return usuarioRepositorio.findAll();
  }

  public void eliminar(Usuario usuario){
    usuarioRepositorio.deleteById(usuario.getIdUsuario());
  }

  public void actualizar(Usuario usuario) {
    usuarioRepositorio.save(usuario);
  }
  

}
