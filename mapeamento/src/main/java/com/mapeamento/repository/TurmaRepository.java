package com.mapeamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapeamento.entities.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {

	Turma salvar(Turma turma);
}