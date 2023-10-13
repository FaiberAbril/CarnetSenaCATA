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
	private int idperfil;
	
	@Column
	private String perfil;
	
	public perfil() {
		// TODO Auto-generated constructor stub
	}

		
	public perfil(int idperfil, String perfil) {
		super();
		this.idperfil = idperfil;
		this.perfil = perfil;
	}


	public int getIdperfil() {
		return idperfil;
	}

	public void setIdperfil(int idperfil) {
		this.idperfil = idperfil;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	


}
