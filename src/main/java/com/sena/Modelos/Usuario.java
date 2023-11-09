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
@Table(name = "Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUsuario;
	
	@Column(name = "nombre_usuario")
	private String nombres;
	
	@Column(name = "apellido_usuario")
	private String ApellidosUsuario;
	
	@Column(name = "tipo_documento")
	private String tipoDocumento;
	
	@Column(name = "numero_documento")
	private String numeroDocumento;
	
	@Column(name = "tipo_sangre")
	private String tipoSangre;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "perfil")
	private perfil perfil;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "centro")
	private Centro centro;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public Usuario(int idUsuario, String nombres, String apellidosUsuario, String tipoDocumento, String numeroDocumento,
			String tipoSangre, perfil perfil, Centro centro) {
		this.idUsuario = idUsuario;
		this.nombres = nombres;
		ApellidosUsuario = apellidosUsuario;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.tipoSangre = tipoSangre;
		this.perfil = perfil;
		this.centro = centro;
	}


	public int getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidosUsuario() {
		return ApellidosUsuario;
	}



	public void setApellidosUsuario(String apellidosUsuario) {
		ApellidosUsuario = apellidosUsuario;
	}



	public String getTipoDocumento() {
		return tipoDocumento;
	}



	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}



	public String getNumeroDocumento() {
		return numeroDocumento;
	}



	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}



	public String getTipoSangre() {
		return tipoSangre;
	}



	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}



	public perfil getPerfil() {
		return perfil;
	}



	public void setPerfil(perfil perfil) {
		this.perfil = perfil;
	}



	public Centro getCentro() {
		return centro;
	}



	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	
}
