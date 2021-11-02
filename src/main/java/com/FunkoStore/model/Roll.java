package com.FunkoStore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_rol")
public class Roll {
	@Id
	@Column(name = "cod_rol")
	private String idrol;
	
	@Column(name = "nom_rol")
	private String nombrerol ;
	
	@Column(name = "desc_rol")
	private String descricionrol;

	public String getIdrol() {
		return idrol;
	}

	
	public void setIdrol(String idrol) {
		this.idrol = idrol;
	}

	public String getNombrerol() {
		return nombrerol;
	}

	public void setNombrerol(String nombrerol) {
		this.nombrerol = nombrerol;
	}

	public String getDescricionrol() {
		return descricionrol;
	}

	public void setDescricionrol(String descricionrol) {
		this.descricionrol = descricionrol;
	}


	@Override
	public String toString() {
		return "Roll [idrol=" + idrol + ", nombrerol=" + nombrerol + ", descricionrol=" + descricionrol + "]";
	}
	
	

}
