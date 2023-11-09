package com.sena.Servicios;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Modelos.perfil;
import com.sena.Repositorios.perfilrepositorio;


@Service
public class PerfilServicio {
  
	@Autowired
	private perfilrepositorio perfilRepositorio;
	
	public void Crear(perfil perfil) {
		perfilRepositorio.save(perfil);
	}
	
	public List<perfil> listaRegionales(){
		return perfilRepositorio.findAll();
	}
	
	public void eliminar(perfil perfil) {
		perfilRepositorio.deleteById(perfil.getIdPerfil());
	}
	
	
	public void actualizar(perfil perfil) {
		perfilRepositorio.save(perfil);
	}

}
