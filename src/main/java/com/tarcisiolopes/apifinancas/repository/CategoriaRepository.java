package com.tarcisiolopes.apifinancas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarcisiolopes.apifinancas.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
}
