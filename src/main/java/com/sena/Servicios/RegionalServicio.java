package com.sena.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sena.Modelos.perfil;
import com.sena.Repositorios.perfilrepositorio;

public class RegionalServicio {
	
	@Autowired
	private perfilrepositorio perfilrepositorio;
	
	public void Crear(perfil objperfil) {
		perfilrepositorio.save(objperfil);
	}
	
	public List<perfil> listaperfiles(){
		return perfilrepositorio.findAll();
	}
	
	public void eliminar(perfil objidperfil) {
		perfilrepositorio.deleteById(objidperfil.getIdperfil());
	}
	
	
	public void actualizar(perfil objPerfil) {
		perfilrepositorio.save(objPerfil);
	}
	
	

}
