package com.FunkoStore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	@Id
	private int cod_per;
	private String user;
	private String pass;
	private String cod_recu;
	private String flg_recu;
	private String estado;
	private String fecha_reg;
	
	public int getCod_per() {
		return cod_per;
	}
	public void setCod_per(int cod_per) {
		this.cod_per = cod_per;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCod_recu() {
		return cod_recu;
	}
	public void setCod_recu(String cod_recu) {
		this.cod_recu = cod_recu;
	}
	public String getFlg_recu() {
		return flg_recu;
	}
	public void setFlg_recu(String flg_recu) {
		this.flg_recu = flg_recu;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFecha_reg() {
		return fecha_reg;
	}
	public void setFecha_reg(String fecha_reg) {
		this.fecha_reg = fecha_reg;
	}
	@Override
	public String toString() {
		return "Usuario [cod_per=" + cod_per + ", user=" + user + ", pass=" + pass + ", cod_recu=" + cod_recu
				+ ", flg_recu=" + flg_recu + ", estado=" + estado + ", fecha_reg=" + fecha_reg + "]";
	}

	
}
