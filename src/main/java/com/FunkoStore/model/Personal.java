package com.FunkoStore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_personal")

public class Personal {
	@Id
	private String cod_per;
	private String nom_per;
	private String ape_per;
	private String fec_nac_per;
	private String email_per;
	private String dni_per;
	private String tel_per;
	private String dir_per;
	private String cod_rol;
	public String getCod_per() {
		return cod_per;
	}
	public void setCod_per(String cod_per) {
		this.cod_per = cod_per;
	}
	public String getNom_per() {
		return nom_per;
	}
	public void setNom_per(String nom_per) {
		this.nom_per = nom_per;
	}
	public String getApe_per() {
		return ape_per;
	}
	public void setApe_per(String ape_per) {
		this.ape_per = ape_per;
	}
	public String getFec_nac_per() {
		return fec_nac_per;
	}
	public void setFec_nac_per(String fec_nac_per) {
		this.fec_nac_per = fec_nac_per;
	}
	public String getEmail_per() {
		return email_per;
	}
	public void setEmail_per(String email_per) {
		this.email_per = email_per;
	}
	public String getDni_per() {
		return dni_per;
	}
	public void setDni_per(String dni_per) {
		this.dni_per = dni_per;
	}
	public String getTel_per() {
		return tel_per;
	}
	public void setTel_per(String tel_per) {
		this.tel_per = tel_per;
	}
	public String getDir_per() {
		return dir_per;
	}
	public void setDir_per(String dir_per) {
		this.dir_per = dir_per;
	}
	public String getCod_rol() {
		return cod_rol;
	}
	public void setCod_rol(String cod_rol) {
		this.cod_rol = cod_rol;
	}
	@Override
	public String toString() {
		return "Personal [cod_per=" + cod_per + ", nom_per=" + nom_per + ", ape_per=" + ape_per + ", fec_nac_per="
				+ fec_nac_per + ", email_per=" + email_per + ", dni_per=" + dni_per + ", tel_per=" + tel_per
				+ ", dir_per=" + dir_per + ", cod_rol=" + cod_rol + "]";
	}
	
	
}
