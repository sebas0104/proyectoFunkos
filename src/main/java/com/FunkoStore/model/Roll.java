package com.FunkoStore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_rol")
public class Roll {
	@Id
	private String cod_rol;
	private String nom_rol ;
	private String desc_rol;

	public String getCod_rol() {
		return cod_rol;
	}
	public void setCod_rol(String cod_rol) {
		this.cod_rol = cod_rol;
	}
	public String getNom_rol() {
		return nom_rol;
	}
	public void setNom_rol(String nom_rol) {
		this.nom_rol = nom_rol;
	}
	public String getDesc_rol() {
		return desc_rol;
	}
	public void setDesc_rol(String desc_rol) {
		this.desc_rol = desc_rol;
	}
	

}
