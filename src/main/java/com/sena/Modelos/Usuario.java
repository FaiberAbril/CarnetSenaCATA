package com.sena.Modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
	private int idusuario;
	
	@Column
	private String nombres;
	
	@Column
	private String ApellidosUsuario;
	
	@Column
	private String tipodocumento;
	
	@Column
	private String numerodocumento;
	
	@Column
	private String tipodesangre;
	
	@ManyToOne
	@JoinColumn(name = "perfil")
	private perfil perfil;
	
	@ManyToOne
	@JoinColumn(name = "centro")
	private Centro centro;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idusuario, String nombres, String apellidosUsuario, String tipodocumento, String numerodocumento,
			String tipodesangre, com.sena.Modelos.perfil perfil, Centro centro) {
		super();
		this.idusuario = idusuario;
		this.nombres = nombres;
		ApellidosUsuario = apellidosUsuario;
		this.tipodocumento = tipodocumento;
		this.numerodocumento = numerodocumento;
		this.tipodesangre = tipodesangre;
		this.perfil = perfil;
		this.centro = centro;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
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

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public String getTipodesangre() {
		return tipodesangre;
	}

	public void setTipodesangre(String tipodesangre) {
		this.tipodesangre = tipodesangre;
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
