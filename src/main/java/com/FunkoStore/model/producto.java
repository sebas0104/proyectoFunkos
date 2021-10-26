package com.FunkoStore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_producto")
public class producto {
    @Id
	private int  cod_prod;
	private String nom_prod;
	private String desc_prod;
	private int cod_cat;
	private int stock;
	private double precio;
	
	public int getCod_prod() {
		return cod_prod;
	}
	public void setCod_prod(int cod_prod) {
		this.cod_prod = cod_prod;
	}
	public String getNom_prod() {
		return nom_prod;
	}
	public void setNom_prod(String nom_prod) {
		this.nom_prod = nom_prod;
	}
	public String getDesc_prod() {
		return desc_prod;
	}
	public void setDesc_prod(String desc_prod) {
		this.desc_prod = desc_prod;
	}
	public int getCod_cat() {
		return cod_cat;
	}
	public void setCod_cat(int cod_cat) {
		this.cod_cat = cod_cat;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "producto [cod_prod=" + cod_prod + ", nom_prod=" + nom_prod + ", desc_prod=" + desc_prod + ", cod_cat="
				+ cod_cat + ", stock=" + stock + ", precio=" + precio + "]";
	}
	
	

}
