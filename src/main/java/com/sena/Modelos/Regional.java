package com.sena.Modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Regional")
public class Regional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRegional;
	
	@Column
	private String nombreRegional;
	
	public Regional() {
		// TODO Auto-generated constructor stub
	}

	public Regional(int idRegional, String nombreRegional) {
		super();
		this.idRegional = idRegional;
		this.nombreRegional = nombreRegional;
	}

	public int getIdRegional() {
		return idRegional;
	}

	public void setIdRegional(int idRegional) {
		this.idRegional = idRegional;
	}

	public String getNombreRegional() {
		return nombreRegional;
	}

	public void setNombreRegional(String nombreRegional) {
		this.nombreRegional = nombreRegional;
	}
	
	

}
