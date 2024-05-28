package com.mateus.prjAvaliacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.prjAvaliacao.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
}