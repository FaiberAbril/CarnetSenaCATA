package com.sena.Servicios;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Modelos.Perfil;
import com.sena.Repositorios.perfilrepositorio;


@Service
public class PerfilServicio {
  
	@Autowired
	private perfilrepositorio perfilRepositorio;
	
	public void crear(Perfil perfil) {
		perfilRepositorio.save(perfil);
	}
	
	public List<Perfil> listaPerfiles(){
		return perfilRepositorio.findAll();
	}
	
	public void eliminar(int idPerfil) {
		perfilRepositorio.deleteById(idPerfil);
	}
	
	
	public void actualizar(Perfil perfil) {
		perfilRepositorio.save(perfil);
	}

	public Perfil buscarPorId(int idPerfil) {
		return perfilRepositorio.findById(idPerfil).get();
	}

}
