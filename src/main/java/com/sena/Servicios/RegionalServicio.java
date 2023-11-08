package com.sena.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.Modelos.Regional;
import com.sena.Repositorios.RegionalRepositorio;

@Service
public class RegionalServicio {
	
	@Autowired
	private RegionalRepositorio regionalRepositorio;
	
	public void Crear(Regional regional) {
		regionalRepositorio.save(regional);
	}
	
	public List<Regional> listaRegionales(){
		return regionalRepositorio.findAll();
	}
	
	public void eliminar(Regional regional) {
		regionalRepositorio.deleteById(regional.getIdRegional());
	}
	
	
	public void actualizar(Regional regional) {
		regionalRepositorio.save(regional);
	}
	

}
