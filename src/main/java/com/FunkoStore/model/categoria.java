package com.FunkoStore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_categoria")
public class categoria {
	
	@Id
	private String cod_cat;
	private String nom_cat;
	private String desc_cat;
	
	public String getCod_cat() {
		return cod_cat;
	}
	public void setCod_cat(String cod_cat) {
		this.cod_cat = cod_cat;
	}
	public String getNom_cat() {
		return nom_cat;
	}
	public void setNom_cat(String nom_cat) {
		this.nom_cat = nom_cat;
	}
	public String getDesc_cat() {
		return desc_cat;
	}
	public void setDesc_cat(String desc_cat) {
		this.desc_cat = desc_cat;
	}
	@Override
	public String toString() {
		return "categoria [cod_cat=" + cod_cat + ", nom_cat=" + nom_cat + ", desc_cat=" + desc_cat + "]";
	}
	
	
}
