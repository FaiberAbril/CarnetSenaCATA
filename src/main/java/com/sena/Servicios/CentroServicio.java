package com.sena.Servicios;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.Modelos.Centro;
import com.sena.Repositorios.CentroRepositorio;

@Service
public class CentroServicio {
  
  @Autowired
  private CentroRepositorio centroRepositorio;

  public void crear(Centro centro) {
		centroRepositorio.save(centro);
	}
	
	public List<Centro> listaCentros(){
		return centroRepositorio.findAll();
	}
	
	public void eliminar(int idCentro) {
		centroRepositorio.deleteById(idCentro);
	}
	
	
	public void actualizar(Centro centro) {
		centroRepositorio.save(centro);
	}

	public Centro buscarPorId(int idCentro) {
		return centroRepositorio.findById(idCentro).get();
	}

}
