package com.FunkoStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FunkoStore.model.Personal;

public interface IpersonalRepository  extends JpaRepository<Personal, String>{

	
}
