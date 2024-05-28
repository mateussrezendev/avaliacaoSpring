package com.mapeamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mapeamento.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	//Query Methods
	List<Aluno> findByCidade(String cidade);
	Aluno findByRa(String ra);
	List<Aluno> findByNomeAndRenda(String nome, Double renda);
	List<Aluno> findByNome(String nome);
	List<Aluno> findByCidadeAndRenda(String cidade, Double renda);
	List<Aluno> findByNomeLike(String nomeCompleto);
	List<Aluno> findByTurmaId(Long turmaId);
	Aluno salvar(Aluno aluno);

}