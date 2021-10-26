package com.FunkoStore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	@Id
	private int  cod_cli;
	private String nom_cli;
	private String ape_cli;
	private String fec_nac_cli;
	private String email_cli;
	private String dni_cli;
	private String tel_cli;
	private String dir_cli;
	private String distrito;
	
	public int getCod_cli() {
		return cod_cli;
	}
	public void setCod_cli( int cod_cli) {
		this.cod_cli = cod_cli;
	}
	public String getNom_cli() {
		return nom_cli;
	}
	public void setNom_cli(String nom_cli) {
		this.nom_cli = nom_cli;
	}
	public String getApe_cli() {
		return ape_cli;
	}
	public void setApe_cli(String ape_cli) {
		this.ape_cli = ape_cli;
	}
	public String getFec_nac_cli() {
		return fec_nac_cli;
	}
	public void setFec_nac_cli(String fec_nac_cli) {
		this.fec_nac_cli = fec_nac_cli;
	}
	public String getEmail_cli() {
		return email_cli;
	}
	public void setEmail_cli(String email_cli) {
		this.email_cli = email_cli;
	}
	public String getDni_cli() {
		return dni_cli;
	}
	public void setDni_cli(String dni_cli) {
		this.dni_cli = dni_cli;
	}
	public String getTel_cli() {
		return tel_cli;
	}
	public void setTel_cli(String tel_cli) {
		this.tel_cli = tel_cli;
	}
	public String getDir_cli() {
		return dir_cli;
	}
	public void setDir_cli(String dir_cli) {
		this.dir_cli = dir_cli;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	@Override
	public String toString() {
		return "Cliente [cod_cli=" + cod_cli + ", nom_cli=" + nom_cli + ", ape_cli=" + ape_cli + ", fec_nac_cli="
				+ fec_nac_cli + ", email_cli=" + email_cli + ", dni_cli=" + dni_cli + ", tel_cli=" + tel_cli
				+ ", dir_cli=" + dir_cli + ", distrito=" + distrito + "]";
	}
	
	
}
