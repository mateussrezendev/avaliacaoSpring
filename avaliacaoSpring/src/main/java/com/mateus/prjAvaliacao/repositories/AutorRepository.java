package com.mateus.prjAvaliacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.prjAvaliacao.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
	
}