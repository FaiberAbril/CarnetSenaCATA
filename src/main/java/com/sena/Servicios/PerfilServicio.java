package com.sena.Servicios;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.Modelos.Perfil;
import com.sena.Repositorios.PerfilRepositorio;


@Service
public class PerfilServicio {
  
	@Autowired
	private PerfilRepositorio perfilRepositorio;
	
	public void Crear(Perfil perfil) {
		perfilRepositorio.save(perfil);
	}
	
	public List<Perfil> listaRegionales(){
		return perfilRepositorio.findAll();
	}
	
	public void eliminar(Perfil perfil) {
		perfilRepositorio.deleteById(perfil.getIdPerfil());
	}
	
	
	public void actualizar(Perfil perfil) {
		perfilRepositorio.save(perfil);
	}

}
