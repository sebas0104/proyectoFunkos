package com.FunkoStore.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.FunkoStore.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

	//CRUD
	
	
	//proceso para validar(busqueda) segun correo y clave --> devuel la informacion de un usuario
	
	Usuario findByCorreoAndClave(String correo, String clave);
}
