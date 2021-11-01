package com.FunkoStore.model;

import javax.persistence.Column;
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
	@Column(name = "cod_per")
	private String iduser;
	
	@Column(name = "user")
	private String user;
	
	@Column(name = "pass")
	private String pass;
	
	@Column(name = "cod_recu")
	private String cod_recu;
	
	@Column(name = "flg_recu")
	private String flg_recu;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "fecha_reg")
	private String fecha_reg;

	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
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
		return "Usuario [iduser=" + iduser + ", user=" + user + ", pass=" + pass + ", cod_recu=" + cod_recu
				+ ", flg_recu=" + flg_recu + ", estado=" + estado + ", fecha_reg=" + fecha_reg + "]";
	}
	

	

	
}
