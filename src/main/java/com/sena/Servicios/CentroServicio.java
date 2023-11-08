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

  public void Crear(Centro centro) {
		centroRepositorio.save(centro);
	}
	
	public List<Centro> listaCentros(){
		return centroRepositorio.findAll();
	}
	
	public void eliminar(Centro centro) {
		centroRepositorio.deleteById(centro.getIdCentro());
	}
	
	
	public void actualizar(Centro centro) {
		centroRepositorio.save(centro);
	}

}
