package com.sena.Modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "centro")
public class Centro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCentro;
	
	@Column
	private String nombreCentro;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "regional")
	private Regional regional;
	
	
	public Centro() {
		// TODO Auto-generated constructor stub
	}

	public Centro(int idCentro, String nombreCentro, Regional regional) {
		this.idCentro = idCentro;
		this.nombreCentro = nombreCentro;
		this.regional = regional;
	}

	public int getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(int idCentro) {
		this.idCentro = idCentro;
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}
	
	

}
