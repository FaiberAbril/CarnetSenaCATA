package com.sena.Modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "perfil")
public class perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPerfil;
	
	@Column
	private String nombrePerfil;
	
	public perfil() {
		
	}

		
	public perfil(int idPerfil, String nombrePerfil) {
		super();
		this.idPerfil = idPerfil;
		this.nombrePerfil = nombrePerfil;
	}


	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNombrePerfil() {
		return nombrePerfil;
	}

	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}
	
	


}
