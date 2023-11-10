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
	
	public void crear(Regional regional) {
		regionalRepositorio.save(regional);
	}
	
	public List<Regional> listaRegionales(){
		return regionalRepositorio.findAll();
	}
	
	public void eliminar(int idRegional) {
		regionalRepositorio.deleteById(idRegional);
	}
	
	
	public void actualizar(Regional regional) {
		regionalRepositorio.save(regional);
	}
	
	public Regional buscarPorId(int idRegional) {
		return regionalRepositorio.findById(idRegional).get();
	}

}
