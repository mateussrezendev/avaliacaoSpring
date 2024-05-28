package com.mateus.prjAvaliacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.prjAvaliacao.entities.Livros;

public interface LivrosRepository extends JpaRepository<Livros, Long> {
	
}