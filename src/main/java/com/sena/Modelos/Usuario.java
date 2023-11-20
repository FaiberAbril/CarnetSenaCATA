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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	
	@Column(name = "nombre_usuario")
	private String nombresUsuario;
	
	@Column(name = "apellido_usuario")
	private String apellidosUsuario;
	
	@Column(name = "tipo_documento")
	private String tipoDocumento;
	
	@Column(name = "numero_documento")
	private String numeroDocumento;
	
	@Column(name = "tipo_sangre")
	private String tipoSangre;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "perfil_id")
	private Perfil perfil;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "centro_id")
	private Centro centro;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public Usuario(int idUsuario, String nombresUsuario, String apellidosUsuario, String tipoDocumento, String numeroDocumento,
			String tipoSangre, Perfil perfil, Centro centro) {
		this.idUsuario = idUsuario;
		this.nombresUsuario = nombresUsuario;
		this.apellidosUsuario = apellidosUsuario;
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



	public String getNombresUsuario() {
		return nombresUsuario;
	}



	public void setNombresUsuario(String nombresUsuario) {
		this.nombresUsuario = nombresUsuario;
	}



	public String getApellidosUsuario() {
		return apellidosUsuario;
	}



	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
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



	public Perfil getPerfil() {
		return perfil;
	}



	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}



	public Centro getCentro() {
		return centro;
	}



	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	
}
