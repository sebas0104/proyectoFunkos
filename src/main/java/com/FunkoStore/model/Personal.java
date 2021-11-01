package com.FunkoStore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_personal")
public class Personal {
	@Id
	
	private String cod_per;
	
	@Column(name = "nom_per")
	private String nombreper;
	
	@Column(name = "ape_per")
	private String apellidoper;
	
	@Column(name = "fec_nac_per")
	private String fechaper;
	
	@Column(name = "email_per")
	private String correoper;
	
	@Column(name = "cod_per")
	private String dniper;
	
	@Column(name = "tel_per")
	private String telfonoper;
	
	@Column(name = "dir_per")
	private String direcionper;
	
	@Column(name = "cod_rol")
	private String idrol;

	public String getCod_per() {
		return cod_per;
	}

	public void setCod_per(String cod_per) {
		this.cod_per = cod_per;
	}

	public String getNombreper() {
		return nombreper;
	}

	public void setNombreper(String nombreper) {
		this.nombreper = nombreper;
	}

	public String getApellidoper() {
		return apellidoper;
	}

	public void setApellidoper(String apellidoper) {
		this.apellidoper = apellidoper;
	}

	public String getFechaper() {
		return fechaper;
	}

	public void setFechaper(String fechaper) {
		this.fechaper = fechaper;
	}

	public String getCorreoper() {
		return correoper;
	}

	public void setCorreoper(String correoper) {
		this.correoper = correoper;
	}

	public String getDniper() {
		return dniper;
	}

	public void setDniper(String dniper) {
		this.dniper = dniper;
	}

	public String getTelfonoper() {
		return telfonoper;
	}

	public void setTelfonoper(String telfonoper) {
		this.telfonoper = telfonoper;
	}

	public String getDirecionper() {
		return direcionper;
	}

	public void setDirecionper(String direcionper) {
		this.direcionper = direcionper;
	}

	public String getIdrol() {
		return idrol;
	}

	public void setIdrol(String idrol) {
		this.idrol = idrol;
	}

	@Override
	public String toString() {
		return "Personal [cod_per=" + cod_per + ", nombreper=" + nombreper + ", apellidoper=" + apellidoper
				+ ", fechaper=" + fechaper + ", correoper=" + correoper + ", dniper=" + dniper + ", telfonoper="
				+ telfonoper + ", direcionper=" + direcionper + ", idrol=" + idrol + "]";
	}

	
	
	
	
}
