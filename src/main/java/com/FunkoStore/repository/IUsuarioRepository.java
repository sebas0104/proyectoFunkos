package com.FunkoStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FunkoStore.model.Usuario;
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	Usuario findByuserAndpass(String user, String pass);
}
